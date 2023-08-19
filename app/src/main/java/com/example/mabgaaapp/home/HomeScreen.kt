package com.example.mabgaaapp.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mabgaaapp.component.MangaList

@Composable
fun HomeScreen(
    onClick: (String) -> Unit
) {
    val viewModel = HomeViewModel()
    val state by viewModel.state

    Scaffold(
        topBar = {
            TopAppBar(
                contentPadding = PaddingValues(
                    horizontal = 24.dp
                )
            ) {
                Text(
                    text = "Manga Application"
                )
            }
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            if (state.isLoading) {
                CircularProgressIndicator()
            }

            MangaList(
                items = state.listOfManga,
                onClick = { id ->
                    onClick(id)
                }
            )
        }
    }

}