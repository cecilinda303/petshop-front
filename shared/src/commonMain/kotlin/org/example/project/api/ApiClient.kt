package org.example.project.api

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import org.example.project.model.Pet
import org.example.project.model.Tutor

@Serializable
data class AuthRequest(val email: String, val senha: String)

@Serializable
data class AuthResponse(val token: String, val tipo: String = "Bearer")

object ApiClient {

    private const val BASE_URL = "https://stunning-space-spork-x5j4xqxv6gvjfppxq-8080.app.github.dev"

    var token: String? = null
        private set

    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                isLenient = true
                encodeDefaults = true
            })
        }
    }

    // ---------- AUTH ----------
    suspend fun signin(email: String, senha: String): Boolean {
        return try {
            val response: AuthResponse = client.post("$BASE_URL/auth/signin") {
                contentType(ContentType.Application.Json)
                setBody(AuthRequest(email, senha))
            }.body()
            token = response.token
            true
        } catch (e: Exception) {
            false
        }
    }

    suspend fun signup(email: String, senha: String): Boolean {
        return try {
            val response: AuthResponse = client.post("$BASE_URL/auth/signup") {
                contentType(ContentType.Application.Json)
                setBody(AuthRequest(email, senha))
            }.body()
            token = response.token
            true
        } catch (e: Exception) {
            false
        }
    }

    fun logout() { token = null }

    private fun HttpRequestBuilder.authHeader() {
        token?.let {
            header(HttpHeaders.Authorization, "Bearer $it")
        }
    }

    // ---------- PET ----------
    suspend fun listarPets(): List<Pet> {
        return client.get("$BASE_URL/api/pets") { authHeader() }.body()
    }

    suspend fun criarPet(pet: Pet): Pet {
        return client.post("$BASE_URL/api/pets") {
            contentType(ContentType.Application.Json)
            authHeader()
            setBody(pet)
        }.body()
    }

    // ---------- TUTOR ----------
    suspend fun listarTutores(): List<Tutor> {
        return client.get("$BASE_URL/api/tutores") { authHeader() }.body()
    }

    suspend fun criarTutor(tutor: Tutor): Tutor {
        return client.post("$BASE_URL/api/tutores") {
            contentType(ContentType.Application.Json)
            authHeader()
            setBody(tutor)
        }.body()
    }
}