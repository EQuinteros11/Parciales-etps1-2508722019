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
        if (IMC<10.5){
            tvMostrar.setText("Criticamente bajo de peso");
        }
        else
            if (IMC<15.9){
                tvMostrar.setText("Severamente bajo de peso");
            }
            else
                if (IMC<18.5){
                    tvMostrar.setText("Bajo de Peso");
                }
                else
                    if (IMC < 25){
                        tvMostrar.setText("Normal (Peso Saludable)");
                    }
                    else
                        if(IMC<30){
                            tvMostrar.setText("Sobrepeso");
                    }
                        else
                            if (IMC<35){
                                tvMostrar.setText("Obesidad Clase 1 - Moderadamente Obeso");
                            }
                            else
                                if (IMC<40){
                                    tvMostrar.setText("Obesidad clase 2 - Severamente Obeso");
                            }
                                else
                                    tvMostrar.setText("Obesidad Clase 3 - Criticamente Obeso");
    }
}