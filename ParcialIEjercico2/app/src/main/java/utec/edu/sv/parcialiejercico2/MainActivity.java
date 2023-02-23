package utec.edu.sv.parcialiejercico2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText edtPeso,edtEsta;
TextView tvMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEsta = findViewById(R.id.edtEsta);
        edtPeso = findViewById(R.id.edtPeso);
        tvMostrar = findViewById(R.id.tvMostrar);

    }

    public void calcular(View v){
        Double IMC, peso, esta;
        peso = Double.parseDouble(edtPeso.getText().toString());
        esta= Double.parseDouble(edtEsta.getText().toString());
        IMC = ((peso)/(esta*esta));
        
    }
}