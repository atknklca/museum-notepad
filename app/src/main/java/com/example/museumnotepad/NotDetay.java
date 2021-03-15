package com.example.museumnotepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.museumnotepad.Database.VeriKaynagi;
import com.example.museumnotepad.Fragments.NotFragment;
import com.example.museumnotepad.Nesne.not;

import java.util.List;

public class NotDetay extends AppCompatActivity {

    Button sil;
    Button geriDon;
    TextView baslik;
    TextView aciklama;

    List<not> notlar;

    VeriKaynagi vk;
    int notId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_detay);

        sil=findViewById(R.id.notuSil);
        geriDon = findViewById(R.id.geriDon);
        baslik = findViewById(R.id.baslikGoruntuleme);
        aciklama = findViewById(R.id.notGoruntuleme);

        vk = new VeriKaynagi(this);
        vk.ac();
        notlar = vk.listeleNot();

        Intent intent = getIntent();
        notId = intent.getIntExtra("notId",25);

        notuEkranaVer(notId);

        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                vk.notSil(notlar.get(notId).getId());

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        geriDon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void notuEkranaVer(int i){
        baslik.setText(notlar.get(i).getNot_basligi());
        aciklama.setText(notlar.get(i).getNot_aciklamasi());
    }

    @Override
    protected void onResume() {
        vk.ac();
        super.onResume();
    }

    @Override
    protected void onPause() {
        vk.kapat();
        super.onPause();
    }
}