package com.example.miprimeraapp.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class) // permitir utilizar funciones
@Composable // GENERA LA INTERFAZ GRAFICA

fun HomeScreen() {

    val ColorScheme = darkColorScheme(
        primary = Color(0xFF98222E),
        onPrimary = Color.White,

    )

    Scaffold(
        // Crea estructura basica de la interfaz
        topBar = {
            // Degine el contenido de la barra superior
            TopAppBar(title ={Text("Mi primer App",
                color= MaterialTheme.colorScheme.onPrimary,
            )})
        } // fin topbar
    ) // fin scaff
    {
        innerPadding ->
        // asegura que el contenido no quede oculto bajo la barra
        Column (
            // Van los elementos de UI
            modifier = Modifier
                .padding(innerPadding) //aplica al scaffold
                .fillMaxSize() // hace que ocupe toda la pantalla
                .padding(16.dp) //agrega el margen
                .background(Color())
        verticalArrangement = Arrangement.spacedBy(20.dp)
            // elementos dentro de la columna esten separados
        )
        {
            Text(text="Bienvenido")

            Button(onClick = {/* accion futura */})
            {
                Text("Presione")
            } // fin del boton

            Image(
                painter
            )
        }
    }

}
