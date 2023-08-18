package com.example.clear.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun Display(){
    var level = remember {
        mutableStateOf("")
    }
}



@Composable
fun DisplayScreen(
    navController: NavHostController,
    email: MutableState<TextFieldValue>,
    firstname: MutableState<TextFieldValue>,
    lastname: MutableState<TextFieldValue>,
   username: MutableState<TextFieldValue>,
    phoneNo: MutableState<TextFieldValue>,
    school: MutableState<TextFieldValue>,
    bestCourse: MutableState<TextFieldValue>,
    hopeful: MutableState<TextFieldValue>,
    level: MutableState<TextFieldValue>,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
            //.padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    )
    {
            Button(onClick = { navController.popBackStack() }) {
                Text("Back")
            }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "EMAIL:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = email.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "PHONE NUMBER:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = phoneNo.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "FIRST NAME:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = firstname.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "LAST NAME:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = lastname.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "USERNAME:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = username.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "SCHOOL:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = school.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "LEVEL:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = level.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "BEST COURSE",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = bestCourse.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "HOPEFUL CGPA:",
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp)
                    .fillMaxWidth(),
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Black
            )
            Text(
                text = hopeful.value.text,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd),
                color = Color.LightGray,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif
            )
        }
    }
}



