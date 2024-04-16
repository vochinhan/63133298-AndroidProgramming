package vcnhan.example.viewpager2tablayoutfragment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> countries;
    ViewPager2 viewPager2;
    CountryPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        countries.add(new Country("VietNam", "vn", 30));
        countries.add(new Country("United States", "us", 100));
        countries.add(new Country("Russia", "ru", 40));

        viewPager2.findViewById(R.id.vp2Country);
        adapter = new CountryPagerAdapter(this, countries);
        viewPager2.setAdapter(adapter);
    }
}