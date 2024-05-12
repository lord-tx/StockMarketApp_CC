package com.example.stockmarketappcc.data.remote

import io.github.cdimascio.dotenv.dotenv
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {

    companion object {
        val env = dotenv {
            directory = "/assets"
            filename = "env" // instead of '.env', use 'env'
        }

        private val API_KEY = env["API_KEY"]
        private const val BASE_URL = "https://www.alphavantage.co/"
    }

    @GET("query?function=LISTING_STATUS")
    fun getStockListings(
        @Query("apikey") apiKey: String = API_KEY
    ): ResponseBody
}