package com.example.azterketa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.azterketa.ui.theme.AzterketaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AzterketaTheme {
                    Greeting(
                    )
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .padding(40.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
                .padding(vertical = 40.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom

        ) {
            Column(
                modifier = Modifier
                    .background(Color.Red),
            ) {
                Text(
                    text = "Hello Android!"
                )
            }
            Column(
                modifier = Modifier
                    .background(Color.Red)
            ) {
                Text(
                    text = "Hello Android!"
                )
                Text(
                    text = "Hello Android!"
                )
                Text(
                    text = "Hello Android!"
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 40.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Text(
                text = "Hello Android!",
                modifier = Modifier
                    .padding(vertical = 40.dp)

            )

        }
        Row (
            modifier = Modifier
                .background(Color.Green),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .padding(horizontal = 13.dp)

            ){
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .border(width = 0.dp, color = Color.Green)
                        .background(Color.Blue)
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Text(
                            text = "1"
                        )

                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Text(
                            text = "2"
                        )

                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Text(
                            text = "3"
                        )

                    }

                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Magenta)
                    .padding(horizontal = 40.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text(
                        text = "4"
                    )

                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text(
                        text = "5"
                    )

                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(60.dp)
                ) {
                    Text(
                        text = "6"
                    )

                }

            }

            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .padding(horizontal = 13.dp)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(Color.Black)
                ) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Text(
                            text = "7"
                        )

                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Text(
                            text = "8"
                        )

                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .size(60.dp)
                    ) {
                        Text(
                            text = "9"
                        )

                    }

                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 140.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Resultado"
                )
                Text(
                    text = "666"
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AzterketaTheme {
        Greeting()
    }
}