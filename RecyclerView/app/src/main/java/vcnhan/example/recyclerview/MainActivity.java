package vcnhan.example.recyclerview;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandscapeAdapter landscapeAdapter;
    ArrayList<Landscape> data;
    RecyclerView recyclerView;

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

        data = getRecyclerViewData();
        recyclerView = findViewById(R.id.recyclerLand);

        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager linearHorizontalLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);

        landscapeAdapter = new LandscapeAdapter(this, data);
        recyclerView.setAdapter(landscapeAdapter);
    }

    ArrayList<Landscape> getRecyclerViewData() {
        ArrayList<Landscape> ls = new ArrayList<>();
        ls.add(new Landscape("Landscape 1", "land1"));
        ls.add(new Landscape("Landscape 2", "land2"));
        ls.add(new Landscape("Landscape 3", "land3"));
        return ls;
    }
}