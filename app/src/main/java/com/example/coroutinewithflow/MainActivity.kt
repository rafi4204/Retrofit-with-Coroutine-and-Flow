package com.example.coroutinewithflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coroutinewithflow.di.DaggerAppComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()

            val repComponent= DaggerAppComponent.create()
            repComponent.inject(this)
          //  repository.test()
        }
    }
}
