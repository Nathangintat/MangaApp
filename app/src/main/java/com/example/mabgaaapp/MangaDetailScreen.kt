package com.example.mabgaaapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.mabgaaapp.ui.theme.MabgaaAppTheme

@OptIn(ExperimentalCoilApi::class)
@Composable
fun MangaDetailScreen(
    manga: Manga,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),

            ) {
                IconButton(
                    modifier = Modifier.align(Alignment.CenterStart) ,
                    onClick = {
                        onBack()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = "Back"
                    )
                }

                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = "Manga Detail"
                )
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(24.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(
                            min = 100.dp
                        ),
                    painter = rememberImagePainter(data = manga.imageUrl) ,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }

            item {
                Text(
                    text = manga.name,
                    style = MaterialTheme.typography.h5
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text(
                        text = "Chapter: ${manga.chapter}",
                        style = MaterialTheme.typography.body1
                    )

                    Text(
                        text = "•",
                        style = MaterialTheme.typography.body1
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = Modifier.size(20.dp),
                            imageVector = Icons.Rounded.Star ,
                            contentDescription = "Rating",
                            tint = Color.Yellow
                        )
                        Text(
                            text = manga.rating.toString(),
                            style = MaterialTheme.typography.body1
                        )
                    }
                }
            }

            item {
                Text(
                    text = manga.description,
                    style = MaterialTheme.typography.caption
                )
            }
        }
    }
}

@Preview
@Composable
private fun MangaDetailScreenPreview() {
    MabgaaAppTheme {
        MangaDetailScreen(
            manga = dummyManga[0]
        ) {

        }
    }
}