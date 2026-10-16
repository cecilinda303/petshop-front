package org.example.project.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.example.project.api.ApiClient
import org.example.project.model.Pet

@Composable
fun PetScreen() {
    var nome by remember { mutableStateOf("") }
    var especie by remember { mutableStateOf("") }
    var raca by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    var dataNascimento by remember { mutableStateOf("") }
    var vacinado by remember { mutableStateOf(false) }
    var mensagem by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("🐶 Cadastro de Pet", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(
            value = nome,
            onValueChange = { nome = it },
            label = { Text("Nome") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = especie,
            onValueChange = { especie = it },
            label = { Text("Espécie") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = raca,
            onValueChange = { raca = it },
            label = { Text("Raça") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text("Peso (kg)") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = dataNascimento,
            onValueChange = { dataNascimento = it },
            label = { Text("Data Nascimento (AAAA-MM-DD)") },
            modifier = Modifier.fillMaxWidth()
        )

        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Checkbox(checked = vacinado, onCheckedChange = { vacinado = it })
            Text("Vacinado")
        }

        if (mensagem.isNotEmpty()) {
            Text(mensagem)
        }

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(
                onClick = {
                    scope.launch {
                        try {
                            val pet = Pet(
                                nome = nome,
                                especie = especie,
                                raca = raca,
                                peso = peso.toDoubleOrNull() ?: 0.0,
                                dataNascimento = dataNascimento,
                                vacinado = vacinado
                            )
                            ApiClient.criarPet(pet)
                            mensagem = "✅ Pet gravado com sucesso!"
                        } catch (e: Exception) {
                            mensagem = "❌ Erro: ${e.message}"
                        }
                    }
                }
            ) {
                Text("Gravar")
            }

            OutlinedButton(
                onClick = {
                    nome = ""
                    especie = ""
                    raca = ""
                    peso = ""
                    dataNascimento = ""
                    vacinado = false
                    mensagem = ""
                }
            ) {
                Text("Limpar Campos")
            }
        }
    }
}
