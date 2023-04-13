package com.metatest.scrollgalleryy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.metatest.scrollgalleryy.ui.theme.ScrollGalleryyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // sauvegarder l'instance
        setContent {
            ScrollGalleryyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AppScreen()
                }
            }
        }
    }
}




@Composable
fun AppScreen() {  // function sans paramètres
    GaleryCell()
}

@Composable
fun GaleryCell() {


    Column(Modifier.verticalScroll(rememberScrollState()))  // tête, arguments de Column


    { // body, arguments de ColumnScope

        repeat(3) {






            Card(
                elevation = 16.dp,
                modifier = Modifier.padding(8.dp),
            )

            {
                Image(
                    painter = painterResource(id = R.drawable.greeksalad),
                    contentDescription = "Greek Salad"

                )






            }




        } // fin de repeat

    }
}

