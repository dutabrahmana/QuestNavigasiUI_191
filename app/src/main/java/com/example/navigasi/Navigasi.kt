package com.example.navigasi

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigasi.view.FormIsian
import com.example.navigasi.view.TampilData


enum class Navigation {
    FormulirKu,
    Detail
}

}