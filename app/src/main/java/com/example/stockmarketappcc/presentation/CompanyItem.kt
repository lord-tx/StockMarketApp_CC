package com.example.stockmarketappcc.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CompanyItem(
    modifier: Modifier,
    itemNumber: Int,
){
    Row(
        modifier = Modifier,
    ){
        Column(
            modifier = Modifier.weight(1f),
        ) {
            Row {
                Text(
                    text = "Example Company Name",
                    modifier = Modifier
                        .weight(1f)
                )
            }
        }
    }
}