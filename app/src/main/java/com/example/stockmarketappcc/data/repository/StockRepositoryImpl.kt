package com.example.stockmarketappcc.data.repository

import com.example.stockmarketappcc.data.csv.CSVParser
import com.example.stockmarketappcc.data.remote.StockApi
import com.example.stockmarketappcc.domain.model.CompanyListing
import com.example.stockmarketappcc.domain.repository.StockRepository
import com.example.stockmarketappcc.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StockRepositoryImpl @Inject constructor(
    private val api: StockApi,
    private val companyListingsParser: CSVParser<CompanyListing>
): StockRepository {
    override suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>> {
        return flow {
            emit(Resource.Loading(isLoading = true))

            val remoteListings = try {
                val response = api.getStockListings()
                companyListingsParser.parse(response.byteStream())
            } catch(e: IOException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                null
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                null
            }
            remoteListings?.let {
                emit(Resource.Success(data = remoteListings))
                emit(Resource.Loading(isLoading = false))
            }
        }
    }

}