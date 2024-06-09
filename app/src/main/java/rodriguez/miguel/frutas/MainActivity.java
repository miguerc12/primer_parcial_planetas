package rodriguez.miguel.frutas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.content.Intent;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<planet> planets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView fruitListView = findViewById(R.id.fruitListView);

        // Lista de planetas
        planets = new ArrayList<>();
        planets.add(new planet(getString(R.string.mercurio), getString(R.string.mercurio_desc), R.drawable.mercurio));
        planets.add(new planet(getString(R.string.venus), getString(R.string.venus_desc), R.drawable.venus));
        planets.add(new planet(getString(R.string.tierra), getString(R.string.tierra_desc), R.drawable.tierra));
        planets.add(new planet(getString(R.string.marte), getString(R.string.marte_desc), R.drawable.marte));
        planets.add(new planet(getString(R.string.jupiter), getString(R.string.jupiter_desc), R.drawable.jupiter));
        planets.add(new planet(getString(R.string.saturno), getString(R.string.saturno_desc), R.drawable.saturno));
        planets.add(new planet(getString(R.string.urano), getString(R.string.urano_desc), R.drawable.urano));
        planets.add(new planet(getString(R.string.neptuno), getString(R.string.neptuno_desc), R.drawable.neptuno));

        PlanetAdapter adapter = new PlanetAdapter(this, planets);
        fruitListView.setAdapter(adapter);


        fruitListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                planet selectedFruit = planets.get(position);
                if (selectedFruit.getName().equals("Mercurio")) {
                    // Iniciar la actividad para "Mercurio"
                    Intent intent = new Intent(MainActivity.this, Mercurio.class);
                    startActivity(intent);
                } else if (selectedFruit.getName().equals("Venus")) {
                    // Iniciar la actividad para "Venus"
                    Intent intent = new Intent(MainActivity.this, Venus.class);
                    startActivity(intent);
                } else if (selectedFruit.getName().equals("Tierra")) {
                    // Iniciar la actividad para "Tierra"
                    Intent intent = new Intent(MainActivity.this, Tierra.class);
                    startActivity(intent);
                }
             else if (selectedFruit.getName().equals("Marte")) {
                // Iniciar la actividad para "marte"
                Intent intent = new Intent(MainActivity.this, Marte.class);
                startActivity(intent);
            }
                else if (selectedFruit.getName().equals("Júpiter")) {
                    // Iniciar la actividad para "jupiter"
                    Intent intent = new Intent(MainActivity.this, Jupiter.class);
                    startActivity(intent);
                }
                else if (selectedFruit.getName().equals("Saturno")) {
                    // Iniciar la actividad para "saturno"
                    Intent intent = new Intent(MainActivity.this, Saturno.class);
                    startActivity(intent);
                }
                else if (selectedFruit.getName().equals("Urano")) {
                    // Iniciar la actividad para "urano"
                    Intent intent = new Intent(MainActivity.this, Urano.class);
                    startActivity(intent);
                }

                else if (selectedFruit.getName().equals("Neptuno")) {
                    // Iniciar la actividad para "neptuno"
                    Intent intent = new Intent(MainActivity.this, Neptuno.class);
                    startActivity(intent);
                }

            }
        });
    }
}