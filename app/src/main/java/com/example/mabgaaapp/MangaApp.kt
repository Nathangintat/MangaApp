package com.example.mabgaaapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mabgaaapp.home.HomeScreen
import com.example.mabgaaapp.model.dummyManga

@Composable
fun MangaApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MangaRoute.Home.name
    ) {
        composable(
            route = MangaRoute.Home.name
        ) {
            HomeScreen(
                onClick = {
                    navController.navigate(MangaRoute.Detail.name + "/$it")
                }
            )
        }

        composable(
            route = MangaRoute.Detail.name + "/{id}",
            arguments = listOf(
                navArgument("id"){
                    type= NavType.StringType
                }
            )
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.get("id")
            val manga = dummyManga.firstOrNull { it.id == id }

            manga?.let {
                MangaDetailScreen(
                    manga = it,
                    onBack = {
                        navController.navigateUp()
                    }
                )
            }
        }
    }
}