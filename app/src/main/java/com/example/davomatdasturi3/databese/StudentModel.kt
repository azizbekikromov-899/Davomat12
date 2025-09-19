package com.example.davomatdasturi3.databese

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
class StudentModel (
    @PrimaryKey(autoGenerate = true)
    var id: Int=0,
    var ism: String,
    var familya: String,
    var adres: String,
    var kurs: Int
){

}