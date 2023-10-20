package cat.institutmontilivi.excalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.institutmontilivi.excalculadora.Composables.DiesDesplegables
import cat.institutmontilivi.excalculadora.ui.theme.ExCalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExCalculadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    var text by remember{ mutableStateOf("1234") }
    var suma by remember{ mutableStateOf(false) }
    var resta by remember{ mutableStateOf(false) }
    var multiplicar by remember{ mutableStateOf(false) }
    var dividir by remember{ mutableStateOf(false) }
    var resultat by remember{ mutableStateOf(0) }
    Column(
        Modifier
            .fillMaxWidth()
            .background(Color.Gray)
            .padding(10.dp)
    ){
        ExCalculadoraTheme {
            TextField(
                value = text,
                onValueChange = { nouText -> text = nouText },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontSize = 50.sp,
                    textAlign = TextAlign.End)
            )
            Spacer(modifier = Modifier.height(23.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column(
                    modifier = Modifier
                        .weight(2f)
                ) {
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ){
                        Button(
                            onClick = { if(text == "0") text = "1"
                                        else text = text + "1" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "1",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { if(text == "0") text = "2"
                                        else text = text + "2" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "2",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { if(text == "0") text = "3"
                                        else text = text + "3" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "3",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ){
                        Button(
                            onClick = { if(text == "0") text = "4"
                                        else text = text + "4" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "4",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { if(text == "0") text = "5"
                                        else text = text + "5" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "5",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { if(text == "0") text = "6"
                                        else text = text + "6" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "6",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ){
                        Button(
                            onClick = { if(text == "0") text = "7"
                                        else text = text + "7" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "7",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { if(text == "0") text = "8"
                                        else text = text + "8" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "8",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { if(text == "0") text = "9"
                                        else text = text + "9" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "9",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Button(
                            onClick = { if(text == "0") text = "0"
                                        else text = text + "0" },
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "0",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                    }

                }
                Spacer(modifier = Modifier.width(5.dp))
                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Row {
                        Button(
                            onClick = { text = "0"
                                        resultat = 0},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "C",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { if(suma) resultat += text.toInt()
                                        if(resta) resultat -= text.toInt()
                                        if(multiplicar) resultat *= text.toInt()
                                        if(dividir) resultat /= text.toInt()
                                        text = resultat.toString()
                                        resultat = 0
                                        suma = false
                                        resta = false
                                        multiplicar = false
                                        dividir = false},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "=",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Button(
                            onClick = { resultat += text.toInt()
                                        text = "0"
                                        suma = true},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "+",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { resultat += text.toInt()
                                        text = "0"
                                        resta = true},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "-",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Row {
                        Button(
                            onClick = { resultat += text.toInt()
                                text = "0"
                                multiplicar = true},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "*",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                        Button(
                            onClick = { resultat += text.toInt()
                                text = "0"
                                dividir = true},
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth()
                        ) {
                            Text(text = "/",
                                fontSize = 40.sp,
                                color = Color.Black,
                                textAlign = TextAlign.Center)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Desplegable(){
    val dies = listOf("DG", "DL", "DM", "DC", "DJ", "DV", "DS")
    DiesDesplegables(dies)
}