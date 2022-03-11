package com.example.taskapp.data

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.taskapp.model.*

class Choresdatabasehandler(context:Context): SQLiteOpenHelper(context, DATABASE_NAME,null, DATABASE1_VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
       var CREATE_CHORE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" + KEY_ID + "INTEGER PRIMARY KEY," + KEY_CHORE_NAME + "TEXT" +
                               KEY_CHORE_ASSIGNED_BY + "TEXT" +
                               KEY_CHORE_ASSIGNED_TO + "TEXT" +
                               KEY_CHORE_ASSIGNED_TIME + "LONG"+ ")"
        db?.execSQL(CREATE_CHORE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVERSION: Int, newVERSION: Int) {

        db?.execSQL("DROP TABLE IF EXIST" + TABLE_NAME)

        //ceate table again

        onCreate(db)
    }
    /*
    CRUD - CREATE, READ,UPDATE,DELETE
     */
    fun createChore (chore: Chore){

        var db:SQLiteDatabase = writableDatabase

        var values: ContentValues = ContentValues()
        values.put(KEY_CHORE_NAME, chore.taskname)
        values.put(KEY_CHORE_ASSIGNED_TO, chore.assignedto)
        values.put(KEY_CHORE_ASSIGNED_BY, chore.assignedby)
        values.put(KEY_CHORE_ASSIGNED_TIME, chore.timeassigned)
    }

    fun readChore () {

    }

    fun updateChore () {

    }


}