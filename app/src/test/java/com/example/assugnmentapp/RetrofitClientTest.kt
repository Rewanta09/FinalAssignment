
package com.example.assugnmentApp

import org.junit.Assert.*
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientTest {

    @Test
    fun retrofitClient_apiServiceShouldNotBeNull() {
        val service = RetrofitClient.apiService
        assertNotNull(service)
    }

    @Test
    fun retrofitBuilder_shouldHaveCorrectBaseUrl() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://nit3213api.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val baseUrl = retrofit.baseUrl().toString()
        assertEquals("https://nit3213api.onrender.com/", baseUrl)
    }
}
