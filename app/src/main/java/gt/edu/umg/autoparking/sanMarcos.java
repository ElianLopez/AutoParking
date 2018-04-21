package gt.edu.umg.autoparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class sanMarcos extends AppCompatActivity {

    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_marcos);

        regresar = (Button)findViewById(R.id.regreso);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regreso = new Intent(sanMarcos.this, principal.class);
                startActivity(regreso);
            }
        });
    }
}
