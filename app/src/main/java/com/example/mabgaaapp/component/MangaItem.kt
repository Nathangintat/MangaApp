package com.example.mabgaaapp.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.mabgaaapp.model.Manga
import com.example.mabgaaapp.model.dummyManga
import com.example.mabgaaapp.ui.theme.MabgaaAppTheme

@OptIn(ExperimentalCoilApi::class, ExperimentalMaterialApi::class)
@Composable
fun MangaItem(
    modifier: Modifier = Modifier,
    manga: Manga,
    onClick: () -> Unit
) {
    val configuration = LocalConfiguration.current
    val width = configuration.screenWidthDp / 2 - (24*2) - 8
    val height = width*1.5

    Card(
        modifier = modifier
            .width(width.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 0.dp,
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = rememberImagePainter(data = manga.imageUrl),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Text(
                text = manga.name,
                style = MaterialTheme.typography.subtitle2
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "Chapter: ${manga.chapter}",
                    style = MaterialTheme.typography.caption
                )

                Text(
                    text = "•",
                    style = MaterialTheme.typography.body1
                )

                Row(
                    modifier = Modifier,
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .size(20.dp),
                        imageVector = Icons.Rounded.Star,
                        contentDescription = "Rating",
                        tint = Color.Yellow
                    )

                    Text(
                        text = manga.rating.toString(),
                        style = MaterialTheme.typography.caption
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun MangaItemPreview() {
    MabgaaAppTheme {
        MangaItem(manga = dummyManga[0]) {

        }
    }
}