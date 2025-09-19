package com.example.davomatdasturi3

import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.davomatdasturi3.databese.AppDatabe
import com.example.davomatdasturi3.databinding.ActivityMainBinding
import com.example.davomatdasturi3.rs.MyRacAdapter
import java.security.cert.Extension

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var recAdapter: MyRacAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        try {

            val db = AppDatabe.getDb(this@MainActivity).getService()
            var listStudent = db.getAllStudent()
            recAdapter = MyRacAdapter(listStudent)
            binding.myrecid.adapter = recAdapter

        } catch (e: Exception) {


        }


        binding.rasm.setOnClickListener {
            var intent = Intent(this, AppStudentActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        try {
            val db = AppDatabe.getDb(this@MainActivity).getService()
            var listStudent = db.getAllStudent()
            recAdapter = MyRacAdapter(listStudent)
            binding.myrecid.adapter = recAdapter
        } catch (e: Exception) {

        }
    }
}