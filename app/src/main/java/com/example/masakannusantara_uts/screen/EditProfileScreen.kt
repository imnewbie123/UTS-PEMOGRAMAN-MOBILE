package com.example.masakannusantara_uts.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.masakannusantara_uts.data.preferences.PreferenceManager
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*

@Composable
fun EditProfileScreen(navController: NavController) {

    val context = LocalContext.current
    val prefs = PreferenceManager(context)

    var name by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var desc by remember { mutableStateOf("") }
    var hours by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {

        Text("Edit Profile")

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nama") }
        )

        OutlinedTextField(
            value = address,
            onValueChange = { address = it },
            label = { Text("Alamat") }
        )

        OutlinedTextField(
            value = desc,
            onValueChange = { desc = it },
            label = { Text("Deskripsi") }
        )

        OutlinedTextField(
            value = hours,
            onValueChange = { hours = it },
            label = { Text("Jam Buka") }
        )

        Button(onClick = {
            prefs.saveProfile(name, address, desc, hours)
            navController.popBackStack()
        }) {
            Text("Simpan")
        }
    }
}