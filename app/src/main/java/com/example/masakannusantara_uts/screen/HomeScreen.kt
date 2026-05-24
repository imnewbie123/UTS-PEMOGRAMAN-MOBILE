package com.example.masakannusantara_uts.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.masakannusantara_uts.data.preferences.PreferenceManager

@Composable
fun HomeScreen(navController: NavController) {

    val context = LocalContext.current
    val prefs = PreferenceManager(context)
    val data = prefs.getProfile()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Masakan Nusantara",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primary
            ),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {

                Text(data["name"] ?: "", color = Color.White)
                Text(data["address"] ?: "", color = Color.White)
                Text(data["desc"] ?: "", color = Color.White)
                Text(data["hours"] ?: "", color = Color.White)

            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate("menu") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Lihat Menu")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { navController.navigate("profile") },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Profile")
        }
    }
}