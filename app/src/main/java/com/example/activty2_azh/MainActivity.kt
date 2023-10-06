package com.example.activty2_azh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.activty2_azh.ui.theme.Activty2_azhTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Activty2_azhTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background)
                {
                    TampilLayar(pesan = getString(R.string.greeting),
                        dari = getString(R.string.name))
                }
            }
        }
    }
}

@Composable
fun TampilText(message:String, from:String, modifier: Modifier=Modifier){
    Column( verticalArrangement = Arrangement.Center, modifier =  modifier){
        Text(
            color = Color.Blue,
            text = message,
            fontSize = 80.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )
        Text(
            color = Color.Red,
            text = from,
            fontSize = 60.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun TampilLayar(pesan: String, dari: String){
    val image = painterResource(R.drawable.img)
    Box{
        Image(painter = image, contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.fillMaxSize())
        TampilText(message = pesan, from = dari,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Activty2_azhTheme {
        TampilLayar(pesan = "Selamat Datang", dari ="Di UMY" )
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Activty2_azhTheme {
        Greeting("Android")
    }
}