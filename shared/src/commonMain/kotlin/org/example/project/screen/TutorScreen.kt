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
import org.example.project.model.Tutor

@Composable
fun TutorScreen() {
    var nome by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var dataCadastro by remember { mutableStateOf("") }
    var ativo by remember { mutableStateOf(true) }
    var mensagem by remember { mutableStateOf("") }
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("👤 Cadastro de Tutor", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(
            value = nome,
            onValueChange = { nome = it },
            label = { Text("Nome") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = cpf,
            onValueChange = { cpf = it },
            label = { Text("CPF (só números)") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = telefone,
            onValueChange = { telefone = it },
            label = { Text("Telefone") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = dataCadastro,
            onValueChange = { dataCadastro = it },
            label = { Text("Data Cadastro (AAAA-MM-DD)") },
            modifier = Modifier.fillMaxWidth()
        )

        Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
            Checkbox(checked = ativo, onCheckedChange = { ativo = it })
            Text("Ativo")
        }

        if (mensagem.isNotEmpty()) {
            Text(mensagem)
        }

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(
                onClick = {
                    scope.launch {
                        try {
                            val tutor = Tutor(
                                nome = nome,
                                cpf = cpf,
                                email = email,
                                telefone = telefone,
                                dataCadastro = dataCadastro,
                                ativo = ativo
                            )
                            ApiClient.criarTutor(tutor)
                            mensagem = "✅ Tutor gravado com sucesso!"
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
                    cpf = ""
                    email = ""
                    telefone = ""
                    dataCadastro = ""
                    ativo = true
                    mensagem = ""
                }
            ) {
                Text("Limpar Campos")
            }
        }
    }
}
