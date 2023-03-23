package utec.edu.sv.parcial2_elias_quinteros_2508722019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView Lista;
List<String> Nombre ;
List<String> Cargo ;
List<String> Compania ;

int [] img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lista = findViewById(R.id.lstperson);


        Nombre = new ArrayList<>();
        Nombre.add("Alexander Pierrot");
        Nombre.add("Carlos Lopez");
        Nombre.add("Sara Bonz");
        Nombre.add("lilian Clarence");
        Nombre.add("Benito Peralta");
        Nombre.add("Juan Jaramillo");
        Nombre.add("Christian Steps");
        Nombre.add("Alexa Giraldo");
        Nombre.add("Linda Murillo");
        Nombre.add("Lizeth Astrada");

        Cargo = new ArrayList<>();
        Cargo.add("CEO");
        Cargo.add("Asistente");
        Cargo.add("Directora de Marketing");
        Cargo.add("Diseñadora de producto");
        Cargo.add("Supervisora de Ventas");
        Cargo.add("CEO");
        Cargo.add("CTO");
        Cargo.add("Led Programmer");
        Cargo.add("Directora de Marketing");
        Cargo.add("CEO");

        Compania = new ArrayList<>();
        Compania.add("Insure S.O");
        Compania.add("Hospital Blue");
        Compania.add("Electric Parts Ltd");
        Compania.add("Creative App");
        Compania.add("Neumáticos Press");
        Compania.add("Banco Nacional");
        Compania.add("Cooperativa Verde");
        Compania.add("Frutysofy");
        Compania.add("Seguros Boliver");
        Compania.add("Consecionario Motolox");

        int [] picture ={
                R.drawable.lead_photo_1,
                R.drawable.lead_photo_2,
                R.drawable.lead_photo_3,
                R.drawable.lead_photo_4,
                R.drawable.lead_photo_5,
                R.drawable.lead_photo_6,
                R.drawable.lead_photo_7,
                R.drawable.lead_photo_8,
                R.drawable.lead_photo_9,
                R.drawable.lead_photo_10
        };
       // ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        Adaptador adaptador = new Adaptador(this,R.layout.elementos,Nombre,Cargo,Compania,picture);
        Lista.setAdapter(adaptador);
        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Selecciono\n"+Nombre.get(position),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),mostrar.class);
                i.putExtra("posi", Nombre.get(position));
                i.putExtra("posic", Cargo.get(position));
                i.putExtra("posiCo", Compania.get(position));
                i.putExtra("posiIm", picture[position]);
                startActivity(i);
            }
        });
    }
}