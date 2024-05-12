package com.example.stockmarketappcc.domain.repository

import com.example.stockmarketappcc.domain.model.CompanyListing
import com.example.stockmarketappcc.utils.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {
    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ) : Flow<Resource<List<CompanyListing>>>

}