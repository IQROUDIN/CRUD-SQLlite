package com.example.pendataanibuhamil;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "datapegawai.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, alamat text null, berat text null, usia text null, janin text null);";
        Log.d( "Data", "onCreate: "+sql );
        db.execSQL( sql );
        // sql = "INSERT INTO biodata (no, nama,tgl,jk, alamat,jabatan) VALUES ('1001','Bima','1998-06-03','Laki-laki','Yogyakarta','Manager');";
        // db.execSQL( sql );

    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg2, int arg3) {

    }
}
