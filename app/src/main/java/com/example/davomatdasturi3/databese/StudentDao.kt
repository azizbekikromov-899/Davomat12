package com.example.davomatdasturi3.databese

import androidx.room.Dao
import androidx.room.Query

@Dao
interface StudentDao {
    @Query("INSERT INTO student (ism,familya,adres,kurs) values (:nomi,:famillya,:addres,:kurss)")
    fun addUserDb(nomi: String, famillya: String, addres: String,kurss: Int)
 @Query("SELECT * from student where kurs>3")
 fun getAllStudentName(): List<String>

 @Query("select * from student")
 fun getAllStudent(): List<StudentModel>

}