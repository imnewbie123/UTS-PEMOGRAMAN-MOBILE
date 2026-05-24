package com.example.masakannusantara_uts.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.shape.RoundedCornerShape
@Composable
fun MenuScreen(navController: NavController) {

    Column(modifier = Modifier.padding(16.dp)) {

        Text("Menu", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))


        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            ListItem(
                headlineContent = { Text("Nasi Goreng") },
                supportingContent = { Text("Rp 15.000") },
                modifier = Modifier.clickable {
                    navController.navigate("detail")
                }
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            ListItem(
                headlineContent = { Text("Mie Goreng") },
                supportingContent = { Text("Rp 12.000") },
                modifier = Modifier.clickable {
                    navController.navigate("detail")
                }
            )
        }
    }
}