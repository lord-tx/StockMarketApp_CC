package com.example.stockmarketappcc.presentation.company_listings

import com.example.stockmarketappcc.domain.model.CompanyListing

data class CompanyListingState(
    val isLoading: Boolean = false,
    val isRefreshing: Boolean = false,
    val companies: List<CompanyListing> = emptyList(),
    val searchQuery: String = ""
)
