package com.example.stockmarketappcc.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CompanyListingScreen(
    modifier: Modifier
){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        OutlinedTextField(value = "Search", onValueChange = {})
        LazyColumn (
            modifier = Modifier.fillMaxSize()
        ){
            items(20) {itemNumber ->
                CompanyItem(modifier = modifier, itemNumber = itemNumber)
                if (itemNumber < 20) {
                    Divider(modifier = Modifier.padding(horizontal = 16.dp))
                }
            }
        }
    }
}