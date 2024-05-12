package com.example.stockmarketappcc.presentation.company_listings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination<RootGraph>(start = true)
@Composable
fun CompanyListingScreen(
    navigator: DestinationsNavigator,
    viewModel: CompanyListingViewModel = hiltViewModel()
){

    val state = viewModel.state

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = "Search...",
            onValueChange = {
//                viewModel.onEvent(
//                    CompanyListingsEvent.OnSearchQueryChange(it)
//                )
            },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            placeholder = {
                Text(text = "Search...")
            },
            maxLines = 1,
            singleLine = true
        )
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items( state.companies.size) { i ->
                val company = state.companies[i]
                CompanyItem(
                    company = company,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
//                                navigator.navigate(
//                                    CompanyInfoScreenDestination(company.symbol)
//                                )
                        }
                        .padding(16.dp)
                )
                if(i < 100) {
                    Divider(modifier = Modifier.padding(
                        horizontal = 16.dp
                    ))
                }
            }
        }
    }
}