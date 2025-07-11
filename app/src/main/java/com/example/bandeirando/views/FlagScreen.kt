package com.example.bandeirando.views

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FlagScreenApp() {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text(text = "Bandeirando Wiki") }
        )

    }) { paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(color = colorResource(id = com.example.bandeirando.R.color.background))
        ) {
            FlagAndInfos(
                flagName = com.example.bandeirando.R.string.japao_nome,
                flagImage = com.example.bandeirando.R.drawable.japao,
                continent = com.example.bandeirando.R.string.japao_continente,
                capital = com.example.bandeirando.R.string.japao_capital,
                area = com.example.bandeirando.R.string.japao_area,
                population = com.example.bandeirando.R.string.japao_populacao

            )
        }
    }
}


@Composable
fun FlagAndInfos(
    flagName: Int,
    flagImage: Int,
    continent: Int,
    capital: Int,
    area: Int,
    population: Int
) {
    Column() {
        Text(
            text = stringResource(id = flagName),
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )
        Image(
            contentDescription = "",
            painter = painterResource(id = flagImage),
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(350.dp)
        )
        Row() {
            Column() {
                Text(text = "Continente: ")
                Text(text = "Capital: ")
                Text(text = "Área(Km): ")
                Text(text = "População: ")
            }
            Column {

                Text(text = stringResource(id = continent))
                Text(text = stringResource(id = capital))
                Text(text = stringResource(id = area))
                Text(text = stringResource(id = population))
            }
        }
    }
}


@Composable
@Preview
fun PreviewDefault() {
    FlagScreenApp()
}
