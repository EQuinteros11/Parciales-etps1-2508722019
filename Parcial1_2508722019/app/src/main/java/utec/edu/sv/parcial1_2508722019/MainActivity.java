package utec.edu.sv.parcial1_2508722019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edtUser,edtPass;
TextView tvLogin;
Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUser = findViewById(R.id.edtUser);
        tvLogin =findViewById(R.id.tvlogin);
        edtPass = findViewById(R.id.edtPass);
        btnlogin = findViewById(R.id.btnlogin);
     /*
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intento = new Intent(getApplicationContext(),Home.class);
                startActivity(intento);

            }
        });*/


   }

   public void login(View v){
        String use, pas;
        use = edtUser.getText().toString();
        pas = edtPass.getText().toString();
        if ( use.equals("parcialETps1") && pas.equals("p4rC14l#tp$") ){
            Intent mostrar = new Intent(this,Home.class);
            startActivity(mostrar);
        }
        else {
            Toast toastP = new Toast(getApplicationContext());
            LayoutInflater inflater =getLayoutInflater();
            View layout=inflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.lytMensaje));

            TextView txtMensaje=(TextView) layout.findViewById(R.id.tvmensaje);
            txtMensaje.setText("contraseña y usuario no son correctos");

            toastP.setDuration(Toast.LENGTH_LONG);
            toastP.setView(layout);
            toastP.show();
        }

   }


}