package com.example.davomatdasturi3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.davomatdasturi3.databese.AppDatabe
import com.example.davomatdasturi3.databinding.ActivityAppStudentBinding
import com.example.davomatdasturi3.databinding.ActivityMainBinding

class AppStudentActivity : AppCompatActivity() {

    lateinit var binding: ActivityAppStudentBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding= ActivityAppStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var db= AppDatabe.getDb(this).getService()

        binding.saqlashbtn.setOnClickListener {
            val ism=binding.ismedt.text.toString().trim()
            val familya=binding.familyaedt.text.toString().trim()
            val adres=binding.adresedt.text.toString().trim()
            val kurs=binding.kursedt.text.toString().trim()
            db.addUserDb(nomi = ism , famillya = familya , addres = adres, kurss =kurs.toInt())
            finish()

        }
    }
}