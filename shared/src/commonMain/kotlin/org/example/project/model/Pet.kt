package org.example.project.model

import kotlinx.serialization.Serializable

@Serializable
data class Pet(
    val id: Long? = null,
    val nome: String,
    val especie: String,
    val raca: String,
    val peso: Double,
    val dataNascimento: String,
    val vacinado: Boolean
)