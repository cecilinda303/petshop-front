package org.example.project.model

import kotlinx.serialization.Serializable

@Serializable
data class Tutor(
    val id: Long? = null,
    val nome: String = "",
    val cpf: String = "",
    val email: String = "",
    val telefone: String = "",
    val dataCadastro: String = "",
    val ativo: Boolean = false
)