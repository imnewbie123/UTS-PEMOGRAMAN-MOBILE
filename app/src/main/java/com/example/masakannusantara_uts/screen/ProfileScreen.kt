package com.example.masakannusantara_uts.screen

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.masakannusantara_uts.data.preferences.PreferenceManager
import androidx.compose.foundation.layout.Column


@Composable
fun ProfileScreen(navController: NavController) {
    val context = LocalContext.current
    val prefs = PreferenceManager(context)
    val data = prefs.getProfile()

    Column {
        Text("Profile Resto")
        Text(data["name"] ?: "")

        Button(onClick = { navController.navigate("editProfile") }) {
            Text("Edit")
        }
    }
}