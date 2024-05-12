package com.example.stockmarketappcc.data.entity

/**
 * Representation of the CompanyListing object retrievable from either a remote or local
 * data source. For more complex apps, the entities for remote and local may be different
 * and mappers used for their loss-ful conversion
 * **/
data class CompanyListingEntity(
    val id: Int? = null,
    val name: String,
    val symbol: String,
    val exchange: String
)
