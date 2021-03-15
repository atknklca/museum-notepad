package com.example.museumnotepad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.museumnotepad.Fragments.NotFragment;
import com.example.museumnotepad.Fragments.TumFragment;


public class MainActivity extends AppCompatActivity {
    Fragment selectedFragment=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNot = findViewById(R.id.notlar);
        Button buttonTum = findViewById(R.id.tumu);
        Button EkleButton = findViewById(R.id.EkleButton);



        buttonNot.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
            selectedFragment = new NotFragment();
            loadFragment(selectedFragment);
            }
        });


        buttonTum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                selectedFragment = new TumFragment();
                loadFragment(new TumFragment());
            }
        });

        EkleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NotAlma.class);
                startActivity(intent);
            }
        });

    }

    private  void loadFragment(Fragment selectedFragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,selectedFragment).commit();
    }

}