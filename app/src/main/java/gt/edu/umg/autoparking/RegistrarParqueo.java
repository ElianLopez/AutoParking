package gt.edu.umg.autoparking;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class RegistrarParqueo extends AppCompatActivity {

    ImageView imagen;
    Button irlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_parqueo);

        irlogin = (Button)findViewById(R.id.button5);
        irlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irlogin = new Intent(RegistrarParqueo.this, LoginActivity.class);
                startActivity(irlogin);
            }
        });


        imagen = (ImageView) findViewById(R.id.image_ID);

    }

    public void onclick(View view) {
        cargarImagen();
    }

    private void cargarImagen() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI );
        intent.setType("image/");
        startActivityForResult(intent.createChooser(intent,"Seleccione imagen"),10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){

            Uri path=data.getData();
            imagen.setImageURI(path);
        }

    }
}
