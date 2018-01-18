package com.example.cfrecheville.projetdawinmobile;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

/**
 * Created by cfrecheville on 12/01/18.
 */

public class SpinnerActivity extends MainActivity implements AdapterView.OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent View v, int pos, long id){
        parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    Spinner spinner = (Spinner) findViewById(R.id.spinner);
    spinner.setOnItemSelectedListener(this);
}
