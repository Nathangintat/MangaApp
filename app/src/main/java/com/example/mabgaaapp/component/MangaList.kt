package com.example.mabgaaapp.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mabgaaapp.model.Manga
import com.example.mabgaaapp.model.dummyManga

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MangaList(
    modifier: Modifier = Modifier,
    items: List<Manga> = dummyManga,
    onClick: (String) -> Unit
) {
    LazyVerticalGrid(
        modifier = modifier
            .fillMaxSize(),
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(
            24.dp
        ),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            items = items
        ) { manga ->
            MangaItem(
                manga = manga,
                onClick = {
                    onClick(manga.id)
                }
            )
        }
    }
}