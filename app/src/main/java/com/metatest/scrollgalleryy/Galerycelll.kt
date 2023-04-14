package com.metatest.scrollgalleryy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp



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

