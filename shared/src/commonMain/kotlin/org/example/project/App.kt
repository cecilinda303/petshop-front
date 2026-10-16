package org.example.project

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.example.project.screen.LoginScreen
import org.example.project.screen.PetScreen
import org.example.project.screen.TutorScreen

@Composable
fun App() {
    MaterialTheme {
        var logado by remember { mutableStateOf(false) }
        var telaAtual by remember { mutableStateOf("pet") }

        if (!logado) {
            LoginScreen(onLoginSuccess = { logado = true })
        } else {
            Scaffold(
                topBar = {
                    Column {
                        TopAppBar(title = { Text("🐾 Petshop") })
                        TabRow(selectedTabIndex = if (telaAtual == "pet") 0 else 1) {
                            Tab(
                                selected = telaAtual == "pet",
                                onClick = { telaAtual = "pet" },
                                text = { Text("Pet") }
                            )
                            Tab(
                                selected = telaAtual == "tutor",
                                onClick = { telaAtual = "tutor" },
                                text = { Text("Tutor") }
                            )
                        }
                    }
                }
            ) { padding ->
                Box(modifier = Modifier.padding(padding)) {
                    when (telaAtual) {
                        "pet" -> PetScreen()
                        "tutor" -> TutorScreen()
                    }
                }
            }
        }
    }
}