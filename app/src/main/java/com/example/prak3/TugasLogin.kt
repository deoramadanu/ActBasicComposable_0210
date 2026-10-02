package com.example.prak3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TugasLoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TugasLoginScreen()
        }
    }
}
@Composable
fun TugasLoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Latar Belakang Gambar / Ornamen
        Image(
            painter = painterResource(id = R.drawable.bg_bangunan), // Pastikan file gambar ada di folder res/drawable
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            // Judul Login (Warna Biru)
            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0047AB)
            )
            // Sub-teks
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 14.sp,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.height(28.dp))

            // Logo Universitas
            Image(
                painter = painterResource(id = R.drawable.logo_umy), // Pastikan file logo ada di folder res/drawable
                contentDescription = "Logo Universitas",
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))
            // Label "Nama" (Warna Merah)
            Text(
                text = "Nama",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )
            // Nama Lengkap Mahasiswa
            Text(
                text = "Alfilla Deo Ramadanu",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0047AB)
            )

            // Nomor Induk Mahasiswa (NIM)
            Text(
                text = "20240140210",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(30.dp))
            // Foto Profil Lingkaran di Bagian Bawah
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.foto_profil), // Pastikan file foto ada di folder res/drawable
                    contentDescription = "Foto Profil",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}


