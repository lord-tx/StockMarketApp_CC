package com.example.stockmarketappcc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stockmarketappcc.presentation.CompanyListingScreen
import com.example.stockmarketappcc.ui.theme.StockMarketAppCCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StockMarketAppCCTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CompanyListingScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StockMarketAppCCTheme {
        CompanyListingScreen(modifier = Modifier)
    }
}