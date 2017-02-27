package com.example.cal_resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected ArrayAdapter<CharSequence> adapter;

    Spinner spinner = (Spinner) findViewById(R.id.Sbanda1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = ArrayAdapter.createFromResource(this, R.array.Banda,
                android.R.layout.simple_spinner_item);

        //Asignas el layout a inflar para cada elemento
//al momento de desplegar la lista
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

//Seteas el adaptador
        spinner.setAdapter(adapter);





    }
}
