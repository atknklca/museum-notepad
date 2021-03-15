package com.example.museumnotepad.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.example.museumnotepad.Nesne.muze;
import com.example.museumnotepad.Nesne.not;
import java.util.ArrayList;
import java.util.List;

public class VeriKaynagi {

    SQLiteDatabase db;
    Database bdb;
    public VeriKaynagi(Context context){
        bdb = new Database(context);
    }

    public void ac(){
        db = bdb.getWritableDatabase();
    }

    public void kapat(){
        bdb.close();
    }

    public void muzeOlustur(){
        ContentValues satir = new ContentValues();
        satir.put("muze_adi","Bodrum Antik Tiyatrosu");
        satir.put("muze_aciklamasi","Antik Tiyatro, Klasik çağdaki Bodrum'dan günümüze ulaşabilen tek yapıdır. Bodrum'un ortasındaki Göktepe dağının güney eteklerindeki bu tiyatro, Anadolu'nun en eski tiyatrolarından biridir. 1960'larda bir grup Türk tarafından restore edilen bu tiyatro, (En son restarasyonu Bodrum Belediyesi, Ericsson ve Turkcell işbirliği ile gerçekleştirilmiştir) günümüzde de Bodrum'daki birçok festivale sahne olmaktadır.Tiyatronun ilginç nitelikleri arasında, oyunlardan önce Dionysos uğruna kurbanların kesildiği sunağı ve bazı koltukların arasındaki, belki de gölgelik olarak kullanılmış olabilecek delikler vardır. Her koltuk arasında 40 cm.'lik bir mesafe bırakılmış olan tiyatro 13.000 kişi kapasitelidir.\n" +
                "\n");
        satir.put("muze_kart","Var");
        satir.put("muze_rehberlik","Yok");
        satir.put("muze_magaza","Yok");
        satir.put("muze_otomat","Yok");
        satir.put("muze_cafe","Yok");
        satir.put("muze_sehir","Muğla");
        satir.put("muze_adres","Bodrum");
        satir.put("muze_ucret","Ücretsiz");
        db.insert("muzeler",null,satir);
    }

    public List<muze> listeleMuze(){
        String kolonlar[]= {"id","muze_adi","muze_aciklamasi","muze_kart","muze_rehberlik","muze_magaza","muze_otomat","muze_cafe","muze_sehir","muze_adres","muze_ucret"};

        List<muze> liste = new ArrayList<muze>();

        Cursor cursor = db.query("muzeler",kolonlar,null,null,null,null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {

            muze m = new muze();

            m.setId(cursor.getInt(0));
            m.setMuzeAdi(cursor.getString(1));
            m.setMuzeAciklamasi(cursor.getString(2));
            m.setMuzeKart(cursor.getString(3));
            m.setMuzeRehberlik(cursor.getString(4));
            m.setMuzeMagaza(cursor.getString(5));
            m.setMuzeOtomat(cursor.getString(6));
            m.setMuzeCafe(cursor.getString(7));
            m.setMuzeSehir(cursor.getString(8));
            m.setMuzeAdres(cursor.getString(9));
            m.setMuzeUcret(cursor.getString(10));
            liste.add(m);

            cursor.moveToNext();
        }
        cursor.close();
        System.out.println(liste);
        return liste;
    }

    public void muzeSil(muze m){
        int id = m.getId();
        db.delete("muzeler","id="+id,null);
    }

    public void notOlustur(String baslık, String aciklama){
        ContentValues satir = new ContentValues();
        satir.put("not_basligi",baslık);
        satir.put("not_aciklamasi", aciklama);
        db.insert("notlar",null,satir);
    }

    public List<not> listeleNot(){

        String kolonlar[]= {"id","not_basligi","not_aciklamasi"};

        List<not> liste = new ArrayList<not>();

        Cursor cursor = db.query("notlar",kolonlar,null,null,null,null,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {

            not n = new not();

            n.setId(cursor.getInt(0));
            n.setNot_basligi(cursor.getString(1));
            n.setNot_aciklamasi(cursor.getString(2));

            liste.add(n);

            cursor.moveToNext();
        }
        cursor.close();
        System.out.println(liste);
        return liste;
    }

    public void notSil(int i){
        db.delete("notlar","id = ?",new String[]{String.valueOf(i)});

        //System.out.println("notsil geldi"+i);
    }
}
