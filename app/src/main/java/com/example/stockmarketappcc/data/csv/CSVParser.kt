package com.example.stockmarketappcc.data.csv

import java.io.InputStream

interface CSVParser<T> {
    suspend fun parse(csv: InputStream): List<T>
}