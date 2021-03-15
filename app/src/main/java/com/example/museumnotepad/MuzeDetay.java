package com.example.museumnotepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.museumnotepad.Database.VeriKaynagi;
import com.example.museumnotepad.Nesne.muze;

import java.util.List;

public class MuzeDetay extends AppCompatActivity {

        TextView muzeAdi;
        ImageView muzeKart;
        ImageView rehberlik;
        ImageView magaza;
        ImageView otomat;
        ImageView cafe;
        TextView sehir;
        TextView adres;
        TextView ucret;
        TextView aciklama;

    List<muze> muzeler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muze_detay);

        muzeAdi= findViewById(R.id.MuzeAdi);
        muzeKart = findViewById(R.id.IconMuzeKart);
        rehberlik = findViewById(R.id.IconRehberlik);
        magaza= findViewById(R.id.IconMagaza);
        otomat = findViewById(R.id.IconOtomat);
        cafe = findViewById(R.id.IconCafe);
        sehir = findViewById(R.id.SehirDb);
        adres= findViewById(R.id.AdresDb);
        ucret = findViewById(R.id.UcretDb);
        aciklama = findViewById(R.id.Aciklama);

        final VeriKaynagi vk = new VeriKaynagi(this);
        vk.ac();
        muzeler= vk.listeleMuze();

        Intent intent = getIntent();
        int muzeId = intent.getIntExtra("MuzeId",25);

        veriyiEkranaVer(muzeId);
    }

    private void veriyiEkranaVer(int i) {
        muzeAdi.setText(muzeler.get(i).getMuzeAdi());

        if(muzeler.get(i).getMuzeKart().equals("Var")){
            muzeKart.setImageResource(R.drawable.var);
        }else{muzeKart.setImageResource(R.drawable.yok);}

        if(muzeler.get(i).getMuzeRehberlik().equals("Var")){
            rehberlik.setImageResource(R.drawable.var);
        }else{rehberlik.setImageResource(R.drawable.yok);}

        if(muzeler.get(i).getMuzeMagaza().equals("Var")){
            magaza.setImageResource(R.drawable.var);
        }else{magaza.setImageResource(R.drawable.yok);}

        if(muzeler.get(i).getMuzeOtomat().equals("Var")){
            otomat.setImageResource(R.drawable.var);
        }else{otomat.setImageResource(R.drawable.yok);}

        if(muzeler.get(i).getMuzeCafe().equals("Var")){
            cafe.setImageResource(R.drawable.var);
        }else{cafe.setImageResource(R.drawable.yok);}

        sehir.setText(muzeler.get(i).getMuzeSehir());

        adres.setText(muzeler.get(i).getMuzeAdres());

        ucret.setText(muzeler.get(i).getMuzeUcret());

        aciklama.setText(muzeler.get(i).getMuzeAciklamasi());
  }
}