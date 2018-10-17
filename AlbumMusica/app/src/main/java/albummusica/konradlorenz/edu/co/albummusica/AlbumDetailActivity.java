package albummusica.konradlorenz.edu.co.albummusica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumDetailActivity extends AppCompatActivity {

    private ImageView imagenAlbum;
    private TextView titulo;
    private TextView canciones;
    private TextView descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);





        Bundle extras = getIntent().getExtras();

        int thumbnail = extras.getInt("thumbnail");
        imagenAlbum = (ImageView) findViewById(R.id.imagenAlbum);
        imagenAlbum.setImageResource(thumbnail);

        String nombre = extras.getString("nombre");
        titulo = (TextView) findViewById(R.id.title);
        titulo.setText(nombre);
        int count = extras.getInt("count");
        canciones = (TextView) findViewById(R.id.cancionesAlbum);
        canciones.setText(getString(R.string.canciones) +": "+ Integer.toString(count));

        String description = extras.getString("description");
        descripcion = (TextView) findViewById(R.id.description);
        descripcion.setText(getString(R.string.descripcion)+" \n"+ description);

    }

}
