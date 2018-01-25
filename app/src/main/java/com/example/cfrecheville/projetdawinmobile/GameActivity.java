package com.example.cfrecheville.projetdawinmobile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private String imgFile;
    //Taille par défaut 3 x 3
    private int m_size = 3;
    private ImageAdapter adapter;
    private GridView gridview ;
    private String taille ;
    private int tailleI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

            Intent res = getIntent();
            imgFile = res.getStringExtra("choice");
            taille = res.getStringExtra("tailleimg");
            tailleI = Integer.parseInt(taille);
                    gridview = (GridView) findViewById(R.id.imageCoupe);
            Bitmap img = BitmapFactory.decodeResource(this.getResources(), R.drawable.image3);
            switch (imgFile){
                case "1" :
                    img = BitmapFactory.decodeResource(this.getResources(), R.drawable.image3);
                    break;
                case "2" :
                    img = BitmapFactory.decodeResource(this.getResources(), R.drawable.image2);
                    break;
                case "3" :
                    img = BitmapFactory.decodeResource(this.getResources(), R.drawable.image1);
                    break;
            }


            adapter = new ImageAdapter(getBaseContext(),img,tailleI);
            gridview.setAdapter(adapter);
            gridview.setNumColumns(tailleI);
        
        }

    }
