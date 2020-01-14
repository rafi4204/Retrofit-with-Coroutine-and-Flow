package com.example.coroutinewithflow.di.module

import com.example.coroutinewithflow.network.RetrofitInstance
import com.example.coroutinewithflow.repository.Repository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class AppModule {
    @Provides
    fun provideRetrofitIns():Retrofit=RetrofitInstance().retrofitInstance()
    @Provides
    fun provideRepository():Repository=Repository()

}