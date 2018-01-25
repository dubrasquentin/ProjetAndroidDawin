package com.example.cfrecheville.projetdawinmobile;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by cfrecheville on 25/01/18.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private Bitmap tab[];
    private int m_size;
    private int rannul;
    private ArrayList<Integer> listeInts = new ArrayList<Integer>();
    private  ArrayList<Integer> finish = new ArrayList<Integer>();
    private int[] position = {0 , 0 , 0 , 0 } ;
    public ImageAdapter(Context c,Bitmap img, int size) {
        mContext = c;
        m_size=size;
        this.tab= new Bitmap[m_size*m_size];
        for(int i=0;i< ( m_size * m_size ) ;i++)
        {
            this.listeInts.add(i);
            this.finish.add(i);
        }
        decouper(img);

        rannul=m_size*m_size-1; // correspond à la position de la case blanche dans listeInts
        Log.e("rrr" , listeInts.toString() );
        Log.e("rrr" , listeInts.toString() );
    }

    public void decouper (Bitmap image){
        int taille = image.getWidth()/m_size;
        System.out.println(taille);
        int b=0;
        for (int y=0;y < m_size ;y++){
            for( int x =0;x<m_size; x++){
                tab[b]=Bitmap.createBitmap(image, x*taille, y*taille,taille,taille);
                b++;

            }

        }
        tab[tab.length-1]=Bitmap.createBitmap(taille,taille, Bitmap.Config.ALPHA_8);


    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}