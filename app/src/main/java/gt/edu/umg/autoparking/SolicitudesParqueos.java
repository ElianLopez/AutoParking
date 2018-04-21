package gt.edu.umg.autoparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SolicitudesParqueos extends AppCompatActivity {

Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitudes_parqueos);

        regresar = (Button)findViewById(R.id.RegresarLog);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(SolicitudesParqueos.this, LoginActivity.class);
                startActivity(regresar);
            }
        });

    }

    public static class disponibleSanmarcos extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_parqueo_disponible);
        }
    }
}
