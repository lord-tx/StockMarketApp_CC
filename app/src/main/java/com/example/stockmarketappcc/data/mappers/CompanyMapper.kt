package com.example.stockmarketappcc.data.mappers

import com.example.stockmarketappcc.data.entity.CompanyListingEntity
import com.example.stockmarketappcc.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing{
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity{
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    );
}