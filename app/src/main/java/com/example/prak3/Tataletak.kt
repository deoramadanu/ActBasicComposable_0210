package com.example.prak3
import androidx.compose.ui.tooling.preview.Preview
import com.example.prak3.ui.theme.Prak3Theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 1. Tata Letak Column
@Composable
fun TataletakComm(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

