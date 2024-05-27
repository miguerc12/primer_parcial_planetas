package rodriguez.miguel.frutas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView totalPriceTextView;
    private double totalPrice = 0.0;
    private ArrayList<fruit> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalPriceTextView = findViewById(R.id.totalPrice);
        ListView fruitListView = findViewById(R.id.fruitListView);

        //  lista de frutas
        fruits = new ArrayList<>();
        fruits.add(new fruit("Manzana", "Roja y deliciosa", 1.50, R.drawable.manzana));
        fruits.add(new fruit("Banana", "Amarilla y dulce", 0.75, R.drawable.banana));
        fruits.add(new fruit("Naranja", "Jugosa y rica en vitamina C", 1.25, R.drawable.naranja));
        fruits.add(new fruit("Fresa", "Pequeña y jugosa", 2.00, R.drawable.fresa));
        fruits.add(new fruit("Uva", "Perfecta para el vino", 3.00, R.drawable.uva));

        FruitAdapter adapter = new FruitAdapter(this, fruits);
        fruitListView.setAdapter(adapter);


        fruitListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                fruit selectedFruit = (fruit) parent.getItemAtPosition(position);
                totalPrice += selectedFruit.getPrice();
                updateTotalPrice();
            }
        });

        fruitListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                fruit selectedFruit = (fruit) parent.getItemAtPosition(position);
                totalPrice -= selectedFruit.getPrice();
                updateTotalPrice();
                return true;
            }
        });
    }

    private void updateTotalPrice() {
        totalPriceTextView.setText("Total: $" + String.format("%.2f", totalPrice));
    }
}


