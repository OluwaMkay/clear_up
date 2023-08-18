package com.example.clear.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun school(){

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SchoolScreen(
    navController: NavController,
    school: MutableState<TextFieldValue>,
    level: MutableState<TextFieldValue>,
    bestCourse: MutableState<TextFieldValue>,
    hopeful: MutableState<TextFieldValue>,
    errorMessage: MutableState<TextFieldValue>
){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
        OutlinedTextField(
            value = school.value,
            onValueChange = {school.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = { Text("SCHOOL:") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = ""
                )
            },
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = level.value,
            onValueChange = {level.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {Text("LEVEL:")},
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Info,
                    contentDescription = ""
                )
            },
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = bestCourse.value,
            onValueChange = {bestCourse.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {Text("BEST COURSE:")},
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Info,
                    contentDescription = ""
                )
            },
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = hopeful.value,
            onValueChange = {hopeful.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {Text("HOPEFUL CGPA:")},
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Decimal
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Info,
                    contentDescription = ""
                )
            },
        )
    }
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Button(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
        Button(
            enabled = school.value.text.isNotEmpty()&&level.value.text.isNotEmpty()&&bestCourse.value.text.isNotEmpty()&&hopeful.value.text.isNotEmpty(),
            onClick = { navController.navigate("DisplayScreen") }) {
            Text("Next")
        }
    }
}