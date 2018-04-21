package gt.edu.umg.autoparking;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ajustes extends AppCompatActivity {
    Button irregistro;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);

        irregistro = (Button)findViewById(R.id.button4);
        irregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irregistro = new Intent(Ajustes.this, ParqueoRegistrado.class);
                startActivity(irregistro);
            }
        });


        imagen = (ImageView) findViewById(R.id.image_ID2);

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
