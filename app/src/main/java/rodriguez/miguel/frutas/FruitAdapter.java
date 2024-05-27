package rodriguez.miguel.frutas;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class FruitAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<fruit> fruits;

    public FruitAdapter(Context context, ArrayList<fruit> fruits) {
        this.context = context;
        this.fruits = fruits;
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return fruits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        fruit currentFruit = (fruit) getItem(position);

        ImageView fruitImage = convertView.findViewById(R.id.fruitImage);
        TextView fruitName = convertView.findViewById(R.id.fruitName);
        TextView fruitDescription = convertView.findViewById(R.id.fruitDescription);
        TextView fruitPrice = convertView.findViewById(R.id.fruitPrice);

        fruitImage.setImageResource(currentFruit.getImage());
        fruitName.setText(currentFruit.getName());
        fruitDescription.setText(currentFruit.getDescription());
        fruitPrice.setText("$" + currentFruit.getPrice());

        return convertView;
    }
}
