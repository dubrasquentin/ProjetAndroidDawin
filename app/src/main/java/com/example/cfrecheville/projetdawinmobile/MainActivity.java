package com.example.cfrecheville.projetdawinmobile;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton ib = (ImageButton) findViewById(R.id.imgGrenouille);
        ImageButton ib2 = (ImageButton) findViewById(R.id.imgTiger);
        ImageButton ib3 = (ImageButton) findViewById(R.id.imgLoutre);


        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = 1;
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = 2;
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                choice = 3;
            }
        });
        final Button Active = (Button) findViewById(R.id.Active);
        Active.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                intent.putExtra("choice", choice);
                intent.putExtra("tailleimg", tailleImg);
                startActivity(intent);
            }
        });
    }
}

