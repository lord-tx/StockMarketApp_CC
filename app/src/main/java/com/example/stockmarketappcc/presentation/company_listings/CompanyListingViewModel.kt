package com.example.stockmarketappcc.presentation.company_listings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.setValue
import com.example.stockmarketappcc.domain.model.CompanyListing

class CompanyListingViewModel: ViewModel() {

    var state by mutableStateOf(CompanyListingState())

    val companyListings = listOf(
        CompanyListing(
            name = "Company A",
            symbol = "SYMA",
            exchange = "NASDAQ"
        ),
        CompanyListing(
            name = "Company B",
            symbol = "SYMB",
            exchange = "NYSE"
        ),
        CompanyListing(
            name = "Company C",
            symbol = "SYMC",
            exchange = "TSX"
        ),
        CompanyListing(
            name = "Company D",
            symbol = "SYMD",
            exchange = "LSE"
        ),
        CompanyListing(
            name = "Company E",
            symbol = "SYME",
            exchange = "Euronext"
        ),
        CompanyListing(
            name = "Company F",
            symbol = "SYMF",
            exchange = "SSE"
        ),
        CompanyListing(
            name = "Company G",
            symbol = "SYMG",
            exchange = "HKEX"
        ),
        CompanyListing(
            name = "Company H",
            symbol = "SYMH",
            exchange = "ASX"
        ),
        CompanyListing(
            name = "Company I",
            symbol = "SYMI",
            exchange = "TMX"
        ),
        CompanyListing(
            name = "Company J",
            symbol = "SYMJ",
            exchange = "BSE"
        ),
        CompanyListing(
            name = "Company K",
            symbol = "SYMK",
            exchange = "CBOE"
        )
    )

    init {
        getCompanyListings()
    }

    private fun getCompanyListings() {
        state = state.copy(
            companies = companyListings
        )
    }
}