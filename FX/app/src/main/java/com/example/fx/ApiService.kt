package com.example.fx
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("/countries/{Country}/{Slug}/in.json")
    fun getCountries(@Path("Country") Country: String,
                    @Path("Slug") Slug: String):
            Call<Json>
}