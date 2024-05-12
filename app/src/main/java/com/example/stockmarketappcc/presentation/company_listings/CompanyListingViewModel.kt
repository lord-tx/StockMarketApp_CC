package com.example.stockmarketappcc.presentation.company_listings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.stockmarketappcc.domain.model.CompanyListing
import com.example.stockmarketappcc.domain.repository.StockRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CompanyListingViewModel @Inject constructor (
    private val repository: StockRepository
): ViewModel() {

    var state by mutableStateOf(CompanyListingState())

    companion object DummyData {
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
    }

    init {
        getCompanyListings()
    }

    private fun getCompanyListings() {
        state = state.copy(
            companies = companyListings
        )
    }
}