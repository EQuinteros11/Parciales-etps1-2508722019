package utec.edu.sv.parcial2_elias_quinteros_2508722019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class mostrar extends AppCompatActivity {
TextView tvnombre, tvcargo, tvComp;
ImageView miro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        tvnombre = findViewById(R.id.txtnom);
        tvcargo = findViewById(R.id.tvcar);
        tvComp = findViewById(R.id.tvcom);
        miro = findViewById(R.id.imageView2);
        Bundle bundle=getIntent().getExtras();
        String nombre=bundle.getString("posi");
        String cargo=bundle.getString("posic");
        String compania=bundle.getString("posiCo");

        int os =bundle.getInt("posiIm");
        miro.setImageResource(os);
        tvnombre.setText(nombre);
        tvcargo.setText(cargo);
        tvComp.setText(compania);

    }
}