package com.example.clear.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController= rememberNavController()
    val firstname = remember {
        mutableStateOf(TextFieldValue())
    }
    val lastname = remember {
        mutableStateOf(TextFieldValue())
    }
    val username = remember {
        mutableStateOf(TextFieldValue())
    }
    val email = remember {
        mutableStateOf(TextFieldValue())
    }
    val phoneNo = remember {
        mutableStateOf(TextFieldValue())
    }
    val school = remember {
        mutableStateOf(TextFieldValue())
    }
    val level = remember {
        mutableStateOf(TextFieldValue())
    }
    val bestCourse = remember {
        mutableStateOf(TextFieldValue())
    }
    val hopeful = remember {
        mutableStateOf(TextFieldValue())
    }
    val errorMessage = remember {
        mutableStateOf(TextFieldValue())
    }


    NavHost(navController = navController, startDestination = "SplashScreen") {
        composable("SplashScreen") {
            SplashScreen(navController)
        }
        composable("HomeScreen") {
            HomeScreen(navController = navController, email = email, phoneNo = phoneNo)
        }
        composable("NameScreen"){
            NameScreen(navController = navController, firstname = firstname, lastname = lastname, username = username)
        }
        composable("SchoolScreen"){
            SchoolScreen(navController = navController, school = school, bestCourse = bestCourse, level = level, hopeful = hopeful, errorMessage = errorMessage)
        }
        composable("DisplayScreen"){

            DisplayScreen(navController = navController, email = email, phoneNo = phoneNo, school = school, firstname = firstname, lastname = lastname, username = username, level = level, hopeful = hopeful, bestCourse = bestCourse)
        }
    }
}

