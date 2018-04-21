package gt.edu.umg.autoparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueoRegistrado extends AppCompatActivity {
Button irlogin;
Button irajustes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parqueo_registrado);

        irlogin = (Button)findViewById(R.id.button14);
        irlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irlogin = new Intent(ParqueoRegistrado.this, LoginActivity.class);
                startActivity(irlogin);
            }
        });

        irajustes = (Button)findViewById(R.id.button5);
        irajustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irajustes = new Intent(ParqueoRegistrado.this, Ajustes.class);
                startActivity(irajustes);
            }
        });
    }
}
