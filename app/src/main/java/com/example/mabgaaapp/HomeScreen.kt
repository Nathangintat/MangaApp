package com.example.mabgaaapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onClick: (String) -> Unit
) {
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
        MangaList(
            onClick = { id ->
                onClick(id)
            }
        )
    }

}