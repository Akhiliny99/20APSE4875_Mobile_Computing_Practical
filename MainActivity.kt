package com.example.practical_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practical_2.ui.theme.Practical2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practical2Theme {
                Column {
                    GreetingWithBackground(name = "Android")
                    GreetingWithFontSize(name = "Android")
                }
            }
        }
    }
}


@Composable
fun GreetingWithBackground(name: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Yellow)
            .padding(all = androidx.compose.ui.unit.Dp(16f))
    ) {
        Text(text = "Hello $name!")
    }
}


@Composable
fun GreetingWithFontSize(name: String) {
    Text(
        text = "Hello $name!",
        fontSize = 32.sp
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingWithBackgroundPreview() {
    Practical2Theme {
        GreetingWithBackground(name = "Android")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingWithFontSizePreview() {
    Practical2Theme {
        GreetingWithFontSize(name = "Girl!")
    }
}