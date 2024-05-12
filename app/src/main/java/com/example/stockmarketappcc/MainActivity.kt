package com.example.stockmarketappcc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stockmarketappcc.presentation.company_listings.CompanyListingScreen
import com.example.stockmarketappcc.presentation.company_listings.CompanyListingViewModel
import com.example.stockmarketappcc.ui.theme.StockMarketAppCCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StockMarketAppCCTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    CompanyListingScreen(
                        viewModel = CompanyListingViewModel()
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StockMarketAppCCTheme {
        CompanyListingScreen(
            viewModel = CompanyListingViewModel()
        )
    }
}