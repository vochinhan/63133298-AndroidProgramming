package vcnhan.example.viewpager2tablayoutfragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryFragment extends Fragment {
    Country country;

    public CountryFragment(Country _country) {
        country = _country;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_country, container, false);
        TextView countryName = fragmentView.findViewById(R.id.tvCountryName);
        TextView population = fragmentView.findViewById(R.id.tvPopulation);
        ImageView img = fragmentView.findViewById(R.id.imgCountry);
        countryName.setText(country.getName());
        population.setText("Population: " + String.valueOf(country.getPopulation()));
        int resId = fragmentView.getResources().getIdentifier(country.getFlag(),
                        "mipmap",
                        fragmentView.getContext().getPackageName());

        img.setImageResource(resId);

        return fragmentView;
    }
}