package com.example.stockmarketappcc.di

import com.example.stockmarketappcc.data.csv.CSVParser
import com.example.stockmarketappcc.data.csv.CompanyListingParser
import com.example.stockmarketappcc.data.repository.StockRepositoryImpl
import com.example.stockmarketappcc.domain.model.CompanyListing
import com.example.stockmarketappcc.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindStockRepository(stockRepositoryImpl: StockRepositoryImpl): StockRepository

    @Binds
    @Singleton
    abstract fun bindCompanyListingParser(companyListingParser: CompanyListingParser): CSVParser<CompanyListing>
}