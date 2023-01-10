package com.example.myzhbo.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room

import androidx.room.RoomDatabase
import com.example.myzhbo.entities.BuyList
import com.example.myzhbo.entities.ZboList

@Database(entities = [BuyList::class, ZboList::class], version = 1)
abstract class ZboDataBase : RoomDatabase() {
    companion object {
        @Volatile
        private var INSTANCE: ZboDataBase? = null
        fun getDB(context: Context): ZboDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ZboDataBase::class.java,
                    "zboList.db"
                ).build()
                instance
            }
        }

    }
}