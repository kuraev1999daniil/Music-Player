package ru.kuraev.music_player.presentation.main

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import ru.kuraev.util_resources.JetComposeNavMultiModuleTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainContent() {
    JetComposeNavMultiModuleTheme {
        val tabs = remember { BottomTabs.values() }
        val navController = rememberNavController()
        Scaffold(
            bottomBar = {
                BottomBar(navController = navController, tabs = tabs)
            }
        ) { innerPaddingModifier ->

        }
    }
}

@Composable
fun BottomBar(navController: NavController, tabs: Array<BottomTabs>) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route ?: BottomTabs.MUSIC.route
    val routes = remember { BottomTabs.values().map { it.route } }
    if (currentRoute in routes) {
        BottomNavigation(
            Modifier.height(56.dp)
        ) {
            tabs.forEach { tab ->
                BottomNavigationItem(
                    icon = { Icon(painterResource(id = tab.icon), contentDescription = null) },
                    selected = currentRoute == tab.route,
                    onClick = {

                    },
                    alwaysShowLabel = false,
                    selectedContentColor = MaterialTheme.colors.secondary,
                    unselectedContentColor = LocalContentColor.current,
                    modifier = Modifier.navigationBarsPadding()
                )
            }
        }
    }
}