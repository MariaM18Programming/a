package com.example.lotos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotos.retrofit.Repository
import com.example.lotos.view_model.MainViewModel
import com.example.lotos.view_model.MainViewModelFactory

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(findViewById(R.id.toolbar))

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        val viewModel : MainViewModel =
            ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
        viewModel.quotes()
        viewModel.quotesResponse.observe(this, Observer {
            Log.d("Feelings", it.body()!!.data.toString())
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_settings, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}