package com.example.mabgaaapp.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mabgaaapp.model.dummyManga
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    private val _state = mutableStateOf(HomeState())
    val state: State<HomeState>
        get() = _state

    init {
        viewModelScope.launch {
            _state.value = state.value.copy(
                isLoading = true
            )

//            delay(3000L)

            _state.value = state.value.copy(
                listOfManga = dummyManga,
                isLoading = false
            )
        }
    }
}