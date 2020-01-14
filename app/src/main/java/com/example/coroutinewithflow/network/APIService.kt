package com.example.coroutinewithflow.network

import com.example.coroutinewithflow.model.ResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET("/posts")
    suspend fun requestForUserData(): Response<ArrayList<ResponseModel>>
}