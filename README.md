# 🐾 Petshop Frontend — Kotlin Multiplatform + Compose Multiplatform

Frontend multiplataforma da aplicação Petshop, desenvolvido com **Kotlin Multiplatform (KMP)** e **Compose Multiplatform**, rodando em **Android, Desktop e Web**.

---

## 📌 Informações do Projeto

- **Nome do projeto:** Petshop Frontend
- **Repositório:** https://github.com/cecilinda303/petshop-front
- **Integrantes:** Maria Cecilia do Prado 
- **Entidades sob responsabilidade:** Pet e Tutor

---

## 📖 Descrição da Aplicação

O **Petshop Frontend** é a interface multiplataforma que consome a API REST do backend Petshop. 
Com uma única base de código em Kotlin, o app roda em **Android, Desktop e Web**, oferecendo:

- Tela de **login e cadastro** de usuário (com autenticação JWT)
- Tela de **formulário de Pet** com botões **Gravar** e **Limpar Campos**
- Tela de **formulário de Tutor** com botões **Gravar** e **Limpar Campos**
- Navegação entre telas via abas
- Integração HTTP com o backend via **Ktor**
- Serialização JSON com **Kotlinx Serialization**

---

## 🛠️ Tecnologias Utilizadas

- **Kotlin Multiplatform (KMP)** — compartilhamento de código entre plataformas
- **Compose Multiplatform** — UI declarativa multiplataforma
- **Material 3** — componentes visuais
- **Ktor Client** — requisições HTTP
- **Kotlinx Serialization** — serialização/desserialização JSON
- **Coroutines** — programação assíncrona
- **Gradle** — build e dependências

---

## 🏗️ Camadas da Arquitetura

Estrutura em `shared/src/commonMain/kotlin/org/example/project/`:

| Camada | Pasta | Descrição |
|---|---|---|
| Modelos | `model/` | Data classes (`Pet`, `Tutor`) |
| API | `api/` | Cliente HTTP Ktor (`ApiClient`) |
| Telas | `screen/` | Composables das telas (`LoginScreen`, `PetScreen`, `TutorScreen`) |
| App | `App.kt` | Tela principal com navegação por abas |

### Source Sets Multiplataforma

```
shared/src/
├── commonMain/   → código compartilhado (regras, telas, modelos)
├── androidMain/  → código específico Android
├── jvmMain/      → código específico Desktop (JVM)
├── jsMain/       → código específico Web (JavaScript)
└── wasmJsMain/   → código específico Web (WebAssembly)
```

---

## 🚀 Instalação e Execução

### Pré-requisitos
- **Java 17+** (recomendado Java 21)
- Não é necessário ter Gradle instalado — o wrapper (`gradlew`) cuida disso

### ⚠️ IMPORTANTE — Backend precisa estar rodando

O frontend consome a API do backend. **Suba o backend antes:**
```bash
# Em outro terminal
cd petshop
./gradlew bootRun
```

O backend deve estar em `http://localhost:8080`.

### ⚠️ CONFIGURAR A URL DO BACKEND

No arquivo `shared/src/commonMain/kotlin/org/example/project/api/ApiClient.kt`, a constante `BASE_URL` aponta para o backend. **Ajuste conforme seu ambiente:**

**Rodando localmente:**
```kotlin
private const val BASE_URL = "http://localhost:8080"
```

**Rodando via Codespaces (URL pública):**
```kotlin
private const val BASE_URL = "https://sua-url-publica-8080.app.github.dev"
```

### Passo a passo

```bash
# Clonar o repositório
git clone https://github.com/cecilinda303/petshop-front.git
cd petshop-front

# (Opcional) Limpar builds antigos
./gradlew clean

# Rodar no Desktop
./gradlew :desktopApp:run

# Rodar na Web (WASM — recomendado)
./gradlew :webApp:wasmJsBrowserDevelopmentRun

# Rodar na Web (JS)
./gradlew :webApp:jsBrowserDevelopmentRun

# Rodar no Android (precisa Android Studio ou emulador configurado)
./gradlew :androidApp:assembleDebug
```

### Acesso

- **Web:** http://localhost:8080 (abre no navegador automaticamente)
- **Desktop:** abre uma janela nativa
- **Android:** instalar o APK gerado em um dispositivo/emulador

---

## 🔐 Como usar

1. **Abrir a aplicação** (Web, Desktop ou Android)
2. **Login:** informe email e senha
   - Se não tiver conta, clique em **"Criar conta"** (signup)
   - Exemplo:
     - Email: `usuario@teste.com`
     - Senha: `123456`
3. **Após login**, você cai na tela principal com **2 abas:**
   - **Pet:** formulário para cadastrar pets
   - **Tutor:** formulário para cadastrar tutores
4. **Preencher os campos** e clicar em **Gravar** para enviar ao backend
5. **Limpar Campos** apaga todos os campos do formulário

---

## 📱 Funcionalidades

### Tela de Login/Signup
- Campo de **email**
- Campo de **senha**
- Botão **Entrar** (signin)
- Botão **Criar conta** (signup)
- Mensagens de erro amigáveis

### Tela de Pet
- Campos: nome, espécie, raça, peso, data de nascimento, vacinado
- Botão **Gravar** (envia POST para `/api/pets`)
- Botão **Limpar Campos**

### Tela de Tutor
- Campos: nome, CPF, email, telefone, data de cadastro, ativo
- Botão **Gravar** (envia POST para `/api/tutores`)
- Botão **Limpar Campos**

---

## 📁 Estrutura Resumida

```
petshop-front/
├── shared/                              ← código compartilhado
│   └── src/
│       ├── commonMain/kotlin/org/example/project/
│       │   ├── App.kt                   ← tela principal + navegação
│       │   ├── api/
│       │   │   └── ApiClient.kt         ← cliente HTTP Ktor
│       │   ├── model/
│       │   │   ├── Pet.kt
│       │   │   └── Tutor.kt
│       │   └── screen/
│       │       ├── LoginScreen.kt
│       │       ├── PetScreen.kt
│       │       └── TutorScreen.kt
│       ├── androidMain/                 ← específico Android
│       ├── jvmMain/                     ← específico Desktop
│       ├── jsMain/                      ← específico Web (JS)
│       └── wasmJsMain/                  ← específico Web (WASM)
├── androidApp/                          ← app Android
├── desktopApp/                          ← app Desktop
├── webApp/                              ← app Web
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── gradlew
```

---

## ⚠️ Observações Importantes

1. **A `BASE_URL` no `ApiClient.kt` precisa apontar para o backend em execução.**
   Se o backend estiver rodando em outra máquina/URL, ajuste essa constante.

2. **Autenticação obrigatória:** o backend exige token JWT para acessar
   as rotas `/api/pets` e `/api/tutores`. Faça login primeiro.

3. **CORS:** o backend já está configurado para aceitar requisições do frontend.

4. **WASM vs JS:** o template compila para WebAssembly (WASM) e JavaScript.
   Recomendado usar WASM para melhor performance em navegadores modernos.

---

## 👨‍🏫 Contato

- **Aluno(a):** Maria Cecilia do Prado
- **Repositório:** https://github.com/cecilinda303/petshop-front
- **Professor:** antoniorcn@hotmail.com