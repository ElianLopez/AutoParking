package gt.edu.umg.autoparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class principal extends AppCompatActivity {

    Button registro;
    RadioButton sanmarcos;
    RadioButton sanpedro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        registro = (Button)findViewById(R.id.registroID);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registroID = new Intent(principal.this, LoginActivity.class);
                startActivity(registroID);
            }
        });

        sanmarcos = (RadioButton)findViewById(R.id.r_uno);
        sanmarcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r_uno = new Intent(principal.this, sanMarcos.class);
                startActivity(r_uno);
            }
        });

        sanpedro = (RadioButton)findViewById(R.id.r_dos);
        sanpedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r_dos = new Intent(principal.this, SanPedro.class);
                startActivity(r_dos);
            }
        });

    }
}
