package gt.edu.umg.autoparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView siguiente;
    TextView parqueo;
    Button solicitudParqueo;
    Button salirfinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


            siguiente = (TextView)findViewById(R.id.TextAdmin);
            siguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent siguiente = new Intent(LoginActivity.this, AdminActivity.class);
                    startActivity(siguiente);

                }
            });


            parqueo = (TextView)findViewById(R.id.TextParqueo);
            parqueo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent parqueo = new Intent(LoginActivity.this, RegistrarParqueo.class);
                    startActivity(parqueo);
                }
            });


        solicitudParqueo = (Button)findViewById(R.id.prueba);
        solicitudParqueo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent solicitudParqueo = new Intent(LoginActivity.this, SolicitudesParqueos.class);
                startActivity(solicitudParqueo);
            }
        });


        salirfinal = (Button)findViewById(R.id.button8);
        salirfinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent salirfinal = new Intent(LoginActivity.this, principal.class);
                startActivity(salirfinal);
            }
        });
        }


}
