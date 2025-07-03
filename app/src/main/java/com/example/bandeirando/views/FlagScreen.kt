package com.example.bandeirando.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun FlagScreen() {
    TitleApp(title = "Bandeirando", fontWeight = FontWeight.Bold)
}

@Composable
fun TitleApp(title: String, fontSize: TextUnit = 18.sp, fontWeight: FontWeight){
    Text(
        text = title,
        fontSize = fontSize,
        fontWeight = fontWeight
    )
}


@Composable
@Preview
fun PreviewDefault(){
    FlagScreen()
}
