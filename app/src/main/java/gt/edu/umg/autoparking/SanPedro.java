package gt.edu.umg.autoparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SanPedro extends AppCompatActivity {

    Button irPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_san_pedro);

        irPrincipal = (Button)findViewById(R.id.button9);
        irPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irPrincipal = new Intent(SanPedro.this, principal.class);
                startActivity(irPrincipal);
            }
        });

    }
}
