package com.example.museumnotepad.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {


    public static final String CreateMuzeler = "CREATE TABLE muzeler ( id INTEGER PRIMARY KEY AUTOINCREMENT , muze_adi TEXT NOT NULL, muze_aciklamasi text , " +
            "muze_kart text , muze_rehberlik text , muze_magaza text , muze_otomat text , muze_cafe text , muze_sehir text , muze_adres text , muze_ucret text);";

    public static  final String CreateNot = "CREATE TABLE notlar (id INTEGER PRIMARY KEY AUTOINCREMENT , not_basligi TEXT NOT NULL , not_aciklamasi TEXT );";



    public Database(Context context) {
    super(context,"Muzeler",null,1);

    }




    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CreateMuzeler);
        sqLiteDatabase.execSQL(CreateNot);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}
