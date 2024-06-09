package rodriguez.miguel.frutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlanetAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<planet> planets;

    public PlanetAdapter(Context context, ArrayList<planet> planets) {
        this.context = context;
        this.planets = planets;
    }

    @Override
    public int getCount() {
        return planets.size();
    }

    @Override
    public Object getItem(int position) {
        return planets.get(position);
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

        planet currentPlanet = (planet) getItem(position);

        ImageView planetImage = convertView.findViewById(R.id.planetImage);
        TextView planetName = convertView.findViewById(R.id.planetName);
        TextView planetDescription = convertView.findViewById(R.id.planetDescription);

        planetImage.setImageResource(currentPlanet.getImage());
        planetName.setText(currentPlanet.getName());
        planetDescription.setText(currentPlanet.getDescription());

        return convertView;
    }
}