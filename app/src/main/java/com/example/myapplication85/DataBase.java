package com.example.myapplication85;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.google.android.material.internal.NavigationMenu;

public class DataBase extends SQLiteOpenHelper {

    private static final String dbName = "mydb.db";
    private static final int version = 1;

    public DataBase(Context context){
        super(context, dbName, null, version);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql  = "CREATE TABLE PRODUCTS(_id INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, DESCRIPTION TEXT)";
        sqLiteDatabase.execSQL(sql);
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists PRODUCTS");
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String name, String descripition){
        SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAME",name);
        values.put("DESCRIPTION", descripition);
        long e= sqLiteDatabase.insert("PRODUCTS", null, values);
        if (e == -1){
            return false;
        }
        else{
            return true;
        }
    }
        Cursor readall(){
            SQLiteDatabase sqLiteDatabase= this.getWritableDatabase();

            String sq= "SELECT * FROM PRODUCTS";
        Cursor cursor = null;
        if(sqLiteDatabase != null){
                 cursor = sqLiteDatabase.rawQuery(sq, null);
            }
        return cursor;
        }
}
