package com.example.clear.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController




@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    email: MutableState<TextFieldValue>,
    phoneNo: MutableState<TextFieldValue>
) {


    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = email.value,
            onValueChange = {
                email.value = it
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Icon"
                )
            },
            shape = RoundedCornerShape(25.dp),
            textStyle = TextStyle(color = Color.Black),
            label = { Text("EMAIL:") },
//        colors = TextFieldDefaults.outlinedTextFieldColors(
//            unfocusedBorderColor = Color.Blue,
//            focusedBorderColor = Color.Blue,
//            unfocusedLabelColor = Color.Blue,
//            focusedLabelColor = Color.Blue,
//        )
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = phoneNo.value,
            onValueChange = {
                phoneNo.value = it
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = ""
                )
            },
            shape = RoundedCornerShape(25.dp),
            textStyle = TextStyle(color = Color.Black),
            label = { Text("PHONE NUMBER:") }
        )
    }
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Top,
    horizontalArrangement = Arrangement.SpaceBetween) {
        Button(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
        Button(
            enabled = email.value.text.isNotEmpty()&&phoneNo.value.text.isNotEmpty(),
            onClick = { navController.navigate("NameScreen") }) {
            Text("Next")
        }
    }
}