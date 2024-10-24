package com.example.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Mydatabase extends SQLiteOpenHelper {
    public Mydatabase(Context context){
        super(context,"Login.db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table USERS(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME text,USERNAME text,MARKS INTEGER)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS USERS");
    }
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.ra
    }
    public Boolean insertdata(String myname, String myuname, Integer mar) {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("NAME",myname);
        contentValues.put("USERNAME",myuname);
        contentValues.put("MARKS",mar);
        long result = db.insert("USERS",null,contentValues);
        db.close();
        if (result == -1) {
            return false;
        } else {
            return true;
        }
        }
    }
