package com.example.coroutinewithflow

import androidx.lifecycle.ViewModel
import com.example.coroutinewithflow.repository.Repository
import javax.inject.Inject

class MainViewModel : ViewModel() {
    @Inject
    lateinit var repository: Repository



}
