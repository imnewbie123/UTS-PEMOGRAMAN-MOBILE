package com.example.masakannusantara_uts.data.preferences

import android.content.Context
import android.content.SharedPreferences

class PreferenceManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("resto_prefs", Context.MODE_PRIVATE)

    fun saveProfile(
        name: String,
        address: String,
        desc: String,
        hours: String
    ) {
        prefs.edit().apply {
            putString("name", name)
            putString("address", address)
            putString("desc", desc)
            putString("hours", hours)
            apply()
        }
    }

    fun getProfile(): Map<String, String> {
        return mapOf(
            "name" to (prefs.getString("name", "MasakanNusantara") ?: ""),
            "address" to (prefs.getString("address", "Jl. Bareng, Malang") ?: ""),
            "desc" to (prefs.getString("desc", "Restoran modern dengan cita rasa masakan nusantara") ?: ""),
            "hours" to (prefs.getString("hours", "10.00 - 22.00") ?: "")
        )
    }

    fun resetProfile() {
        prefs.edit().clear().apply()
    }
}