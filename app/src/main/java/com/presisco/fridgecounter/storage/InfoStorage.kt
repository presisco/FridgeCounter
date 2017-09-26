package com.presisco.fridgecounter.storage

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by presisco on 2017/8/11.
 */

class InfoStorage(context: Context) {

    private val mDBOpener: SQLiteOpener = SQLiteOpener(context)

    fun addShopItem(): Long {
        return DB_ADD_FAILED
    }

    fun delShopItem(id: Long): Boolean {
        return true
    }

    fun addFridgeItem(): Long {
        return DB_ADD_FAILED
    }

    fun delFrigdeItem(id: Long): Boolean {
        return true
    }

    fun addMealItem(): Long {
        return DB_ADD_FAILED
    }

    companion object {
        val DB_ADD_FAILED: Long = -1

        private lateinit var instance: InfoStorage

        class SQLiteOpener(context: Context) : SQLiteOpenHelper(context, "app_data.db", null, 1) {
            override fun onCreate(db: SQLiteDatabase?) {
                db?.execSQL("create table SHOP_LIST (" +
                        "name text not null," +
                        "quantity text not null," +
                        "unit text" +
                        ");")
                db?.execSQL("create table FRIDGE_LIST (" +
                        "name text not null," +
                        "quantity text not null," +
                        "unit text," +
                        "position text not null" +
                        "deadline text not null" +
                        ");")
                db?.execSQL("create table MEAL_LIST(" +
                        "date text not null," +
                        "type text not null," +
                        "name text," +
                        "ingredients text" +
                        ");")
            }

            override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

            }
        }

        fun getInstance(context: Context): InfoStorage {
            if (instance == null) {
                instance = InfoStorage(context)
            }
            return instance
        }
    }
}
