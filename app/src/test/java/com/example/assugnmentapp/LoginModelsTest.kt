package com.example.assugnmentApp
import org.junit.Assert.*
import org.junit.Test

class LoginModelsTest {

    @Test
    fun loginRequest_ShouldContainCorrectUsernameAndPassword() {
        val request = LoginRequest(username = "Anup", password = "mypassword")
        assertEquals("Anup", request.username)
        assertEquals("mypassword", request.password)
    }

    @Test
    fun loginResponse_ShouldContainCorrectKeypass() {
        val response = LoginResponse(keypass = "xyz123")
        assertEquals("xyz123", response.keypass)
    }
}
