package com.example.mabgaaapp.home

import com.example.mabgaaapp.model.Manga

data class HomeState(
    val listOfManga: List<Manga> = emptyList(),
    val isLoading: Boolean = false,
    val isError: String? = null
)