package com.example.bus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database2 extends SQLiteOpenHelper {

    public static final String DATABASENAME="Dbase1";
    public static final String TABLENAME="table2";
    public static final String COL0="ID";
    public static final String COL1="Amount";

    public Database2(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL(" create table " +TABLENAME+ "(Amount INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLENAME);
        onCreate(db);
    }
    public Boolean insertdata(String amount)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL1,amount);
        long result=db.insert(TABLENAME,null,contentValues);
        if(result==-1)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
