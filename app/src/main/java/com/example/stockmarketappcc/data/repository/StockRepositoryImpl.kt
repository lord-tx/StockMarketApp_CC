package com.example.stockmarketappcc.data.repository

import com.example.stockmarketappcc.data.remote.StockApi
import com.example.stockmarketappcc.domain.model.CompanyListing
import com.example.stockmarketappcc.domain.repository.StockRepository
import com.example.stockmarketappcc.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class StockRepositoryImpl(
    private val api: StockApi
): StockRepository {
    override suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>> {
        return flow {
            emit(Resource.Loading(isLoading = true))

            val remoteListings = try {
                api.getStockListings()
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
                emit(Resource.Success(data = listOf()))
                emit(Resource.Loading(isLoading = false))
            }
        }
    }

}