package com.dumv.ailatrieuphu.sql;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.dumv.ailatrieuphu.object.CauHoi;

import java.util.ArrayList;
import java.util.HashMap;

public class DBManager {
    private Context context;
    private SQLiteDatabase database;
    private  DBHelper dbHelper;
    public DBManager(Context c){
        this.context=c;
    }
    public  DBManager open() throws SQLException{
        this.dbHelper = new DBHelper(this.context);
        this.database=this.dbHelper.getWritableDatabase();
        return  this;
    }
    public  void  close(){
        this.dbHelper.close();
    }
    public ArrayList<ArrayList<CauHoi>> getcauhoi(){
        ArrayList<ArrayList<CauHoi>> arr= new ArrayList<>();  //dang du lieu
        HashMap<Integer,ArrayList<CauHoi>> arrs = new HashMap<>();  //key value
        Cursor cursor = this.database.query("cauhoi",new String[]{
                "capdo",
                "noidung",
                "dapan",
                "dapansai"
        },null,null,null,null,null);
        while (cursor.moveToNext()){
            int capdo =cursor.getInt(cursor.getColumnIndex("capdo"));
            ArrayList<CauHoi> arrCapDo=arrs.get(capdo);
            if(arrCapDo==null){
                arrCapDo= new ArrayList<>();
            }
                    arrCapDo.add(taoCauHoi(
                            cursor.getString(cursor.getColumnIndex("noidung")),
                            cursor.getString(cursor.getColumnIndex("dapan")),
                            cursor.getString(cursor.getColumnIndex("dapansai"))
                    ));
            arrs.put(capdo,arrCapDo);
        }
        for (Integer key:arrs.keySet()){
            arr.add(arrs.get(key));
        }
        return  arr;
    }

    private CauHoi taoCauHoi(String s1, String s2, String s3) {
        CauHoi c1 = new CauHoi();
        c1.setNoiDung(s1);
        c1.setDapAnDung(s2);
        c1.setArrDapAnSai(s3);
        return c1;
    }
}
