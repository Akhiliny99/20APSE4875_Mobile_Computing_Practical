#!/usr/bin/env kotlin

package com.example.practical2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practical2.ui.theme.Practical2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}

@Composable
fun ProfileScreen(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ProfileTitle()
        ProfileImage()
        ProfileDescription()
    }
}

@Composable
fun ProfileTitle(){
    Text(
        text = "Akhiliny Vijeyagumar",
        modifier = Modifier.padding( all = 16.dp)
    )
}

@Composable
fun ProfileImage(){
    Icon(
        imageVector = Icons.Default.AccountCircle,
        contentDescription = "Profile Image",
        modifier = Modifier
            .padding( all = 16.dp)
            .size( size = 120.dp)
    )
}

@Composable
fun ProfileDescription(){
    Text(
        text = "Akhiliny is a professional Data Scientist",
        modifier = Modifier.padding( all = 16.dp)
    )
}