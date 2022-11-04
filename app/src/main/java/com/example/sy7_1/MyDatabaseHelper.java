package com.example.sy7_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {
        public static final String sql1 = "create table Book ("
            + "id integer primary key autoincrement, "
            + "name text, "
            + "phone text) ";


    private Context mContext;
    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql1);
//        Toast.makeText(mContext, "Create succeeded",
//        Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (newVersion){
            case 3:
                ContentValues values=new ContentValues();
                values.put("name","刘德华");
                values.put("phone",10086);
                db.insert("Book",null,values);
                values.clear();

                break;



        }

    }}