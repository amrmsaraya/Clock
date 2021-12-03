package com.github.amrmsaraya.clock.presentation.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.github.amrmsaraya.clock.presentation.alarm.AlarmScreen
import com.github.amrmsaraya.clock.presentation.clock.ClockScreen
import com.github.amrmsaraya.clock.presentation.navigation.Screens.*
import com.github.amrmsaraya.clock.presentation.stopwatch.StopwatchScreen
import com.github.amrmsaraya.clock.presentation.timer.TimerScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalComposeUiApi
@ExperimentalUnitApi
@ExperimentalPagerApi
@ExperimentalMaterialApi
@Composable
fun Navigation(
    modifier: Modifier,
    navController: NavHostController,
    onShowBottomNavigation: (Boolean) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = Alarm.route
    ) {
        composable(Alarm.route) {
            AlarmScreen(
                modifier = modifier,
                onShowBottomNavigation = onShowBottomNavigation,
                onBackPress = {
                    navController.popBackStack()
                }
            )
        }

        composable(Clock.route) {
            ClockScreen(
                modifier = modifier,
                onShowBottomNavigation = onShowBottomNavigation,
                onBackPress = {
                    navController.popBackStack()
                }
            )
        }

        composable(Stopwatch.route) {
            StopwatchScreen(modifier = modifier)
        }

        composable(Timer.route) {
            TimerScreen(modifier = modifier)
        }
    }
}
