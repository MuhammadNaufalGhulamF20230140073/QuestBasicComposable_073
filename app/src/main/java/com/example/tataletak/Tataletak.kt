package com.example.tataletak

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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

@Composable
fun IniLatetakBoxColumnRow(modifier: Modifier = Modifier) {
    val gambar = painterResource(id = R.drawable.notastokbok)

    Column {
        // Bagian atas (kuning)
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text("Coll_Row1_Komponen1")
                    Text("Coll_Row1_Komponen2")
                    Text("Coll_Row1_Komponen3")
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text("Coll_Row2_Komponen1")
                    Text("Coll_Row2_Komponen2")
                    Text("Coll_Row2_Komponen3")
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Bagian bawah (biru muda + gambar)
        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {