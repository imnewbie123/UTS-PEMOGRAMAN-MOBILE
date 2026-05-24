package com.example.masakannusantara_uts.screen

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailMenuScreen(navController: NavController) {

    var qty by remember { mutableIntStateOf(1) }

    Column(modifier = Modifier.padding(16.dp)) {

        Text("Jumlah: $qty")

        Row {

            Button(onClick = { qty++ }) {
                Text("+")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = { if (qty > 1) qty-- }) {
                Text("-")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Kembali")
        }
    }
}