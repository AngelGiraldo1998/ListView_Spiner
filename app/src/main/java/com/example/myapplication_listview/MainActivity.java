package com.example.myapplication_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Ingresar los datos inico//
    final String[] datos = new String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
    ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item, datos);
    //fin de ingresar datos//

        //Spinners-inicio//
        //Spinner cmbOpciones=(Spinner)findViewById(R.id.spinner);
        //adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //cmbOpciones.setAdapter(adaptador);
        //cmbOpciones.setOnItemSelectedListener(this);
        //Spinners-fin//

        //ListView-Inicio
        ArrayAdapter<String> adaptador2 =new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datos);
        ListView lstOpciones =(ListView)findViewById(R.id.id_lista);
        lstOpciones.setAdapter(adaptador2);
        //Spinners-fin

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        //TextView txtItem =(TextView)findViewById(R.id.id_respuesta);
        //txtItem.setText("Seleccionado: " + parent.getItemAtPosition(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        //TextView txtItem= (TextView)findViewById(R.id.id_respuesta);
        //txtItem.setText("");

    }
}