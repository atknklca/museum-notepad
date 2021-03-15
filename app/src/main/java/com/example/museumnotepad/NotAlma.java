package com.example.museumnotepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.museumnotepad.Database.VeriKaynagi;

public class NotAlma extends AppCompatActivity {

    Button notuKaydet;
    TextView baslik;
    TextView aciklama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_alma);

        notuKaydet = findViewById(R.id.NotuKaydet);
        baslik = findViewById(R.id.Baslik);
        aciklama = findViewById(R.id.Not);

        notuKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String notBasligi = baslik.getText().toString();
                String notAciklamasi=aciklama.getText().toString();

                if(notBasligi==""){
                    Toast.makeText(getApplicationContext(),"Lütfen Başlık Giriniz!",Toast.LENGTH_SHORT).show();
                }else if(notAciklamasi ==""){
                    Toast.makeText(getApplicationContext(),"Lütfen Notunuzu Giriniz!",Toast.LENGTH_SHORT).show();
                }else {

                    final VeriKaynagi vk = new VeriKaynagi(NotAlma.this);
                    vk.ac();
                    vk.notOlustur(notBasligi,notAciklamasi);
                    //System.out.println("Burdayız");
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}