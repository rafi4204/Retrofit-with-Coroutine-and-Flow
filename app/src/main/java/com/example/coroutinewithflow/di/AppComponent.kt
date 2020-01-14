package com.example.coroutinewithflow.di

import com.example.coroutinewithflow.MainActivity
import com.example.coroutinewithflow.MainFragment
import com.example.coroutinewithflow.MainViewModel
import com.example.coroutinewithflow.di.module.AppModule
import com.example.coroutinewithflow.repository.Repository
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(target: MainActivity)
    fun inject(target: MainFragment)
    fun inject(target: MainViewModel)
    fun inject(target:Repository)

}