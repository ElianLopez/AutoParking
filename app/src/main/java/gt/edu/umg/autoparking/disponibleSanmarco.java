package gt.edu.umg.autoparking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class disponibleSanmarco extends AppCompatActivity {

    Button irsanmarcos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parqueo_disponible);

        irsanmarcos = (Button)findViewById(R.id.button12);
        irsanmarcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irsanmarcos = new Intent(disponibleSanmarco.this, sanMarcos.class);
                startActivity(irsanmarcos);
            }
        });
    }
}
