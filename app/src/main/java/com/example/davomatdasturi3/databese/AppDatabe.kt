package com.example.davomatdasturi3.databese

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.Provider

@Database(entities = [StudentModel::class], version = 1, exportSchema = true)

abstract class AppDatabe: RoomDatabase() {
    abstract fun getService(): StudentDao
    companion object{
        fun getDb(context: Context): AppDatabe{
            return Room.databaseBuilder(context, AppDatabe::class.java,"myr.db").allowMainThreadQueries().build()
        }
    }
}