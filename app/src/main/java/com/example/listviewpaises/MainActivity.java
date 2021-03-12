package com.example.listviewpaises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    TextView pepe;
    ArrayList<String> paises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista= findViewById(R.id.lista);
        pepe= findViewById(R.id.pepe);
        paises= new ArrayList<>();
        paises.add("Estados Unidos");
        paises.add("República Dominicana");
        paises.add("Venezuela");
        paises.add("Cuba");
        paises.add("Canada");
        paises.add("España");
        paises.add("Panama");
        paises.add("Brasil");
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener((parent, view, position, id) -> {
           if(position==0){
               pepe.setText("Estados Unidos tiene 382.2 millones de habitantes");
           }
            if(position==1){
                pepe.setText("República Dominicana tiene 10.63 millones de habitantes");
            }
            if(position==2){
                pepe.setText("Venezuela tiene 28.87 millones de habitantes");
            }
            if(position==3){
                pepe.setText("Cuba tiene 11.34 millones de habitantes");
            }
            if(position==4){
                pepe.setText("Canada tiene 37.59 millones de habitantes");
            }
            if(position==5){
                pepe.setText("España tiene 46.94 millones de habitantes");
            }
            if(position==6){
                pepe.setText("Panama tiene 4.177 millones de habitantes");
            }
            if(position==7){
                pepe.setText("Brasil tiene 209.5 millones de habitantes");
            }
        });
    }
}