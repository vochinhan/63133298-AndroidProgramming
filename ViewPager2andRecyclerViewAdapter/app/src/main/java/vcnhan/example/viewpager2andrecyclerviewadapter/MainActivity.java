package vcnhan.example.viewpager2andrecyclerviewadapter;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandscapeAdapter landscapeAdapter;
    ArrayList<Landscape> data;
    ViewPager2 viewPager2Land;
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

        data = getViewPager2Data();
        viewPager2Land = findViewById(R.id.vp2Land);
        landscapeAdapter = new LandscapeAdapter(this, data);
        viewPager2Land.setAdapter(landscapeAdapter);
        viewPager2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    ArrayList<Landscape> getViewPager2Data() {
        ArrayList<Landscape> ls = new ArrayList<>();
        ls.add(new Landscape("Landscape 1", "land1"));
        ls.add(new Landscape("Landscape 2", "land2"));
        ls.add(new Landscape("Landscape 3", "land3"));
        return ls;
    }
}