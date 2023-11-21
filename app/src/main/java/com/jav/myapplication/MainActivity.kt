package com.jav.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jav.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessApp()
                }
            }
        }
    }
}

@Composable
fun BusinessApp() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        personImage()
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            name("Jose")
            Column(verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                // Tittle Section
                tittle("Mobile Developer")
                // Contact Information
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row() {
                        phoneImage()
                        ContactInformations("3424-4259")
                    }
                    Row {
                        phoneImage()
                        ContactInformations("99621-4961")
                    }
                    Row {
                        phoneImage()
                        ContactInformations("3426-4628")
                    }
                }
            }
        }
    }
}

@Composable
fun personImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.jav)
    androidx.compose.foundation.Image(
        painter = image,
        contentDescription = "Jose Augusto Image",
        modifier = Modifier.size(400.dp)
    )

}

@Composable
fun name(name: String, modifier: Modifier = Modifier) {
    Text(text = name)
}

@Composable
fun tittle(tittleRole: String, modifier: Modifier = Modifier) {
    Text(text = tittleRole, fontSize = 24.sp)
}

@Composable
fun phoneImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.phone_icon)
    androidx.compose.foundation.Image(
        painter = image,
        contentDescription = "Phone Icon",
        modifier = Modifier
            .size(24.dp)
            .padding(end = 5.dp) // change the size of the image

    )
}

@Composable
fun ContactInformations(
    number: String,
    modifier: Modifier = Modifier
) {
    Text(text = number, fontSize = 18.sp)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        BusinessApp()
    }
}