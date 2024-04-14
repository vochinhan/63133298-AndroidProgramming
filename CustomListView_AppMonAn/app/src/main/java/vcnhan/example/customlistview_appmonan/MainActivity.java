package vcnhan.example.customlistview_appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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

        ListView lvMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        ArrayList<MonAn> lsMonAn = new ArrayList<>();
        lsMonAn.add(new MonAn("Cơm tấm sườn", 1000, "Mô tả món ăn", R.drawable.food1));
        lsMonAn.add(new MonAn("Cơm gà", 200, "Mô tả món ăn", R.drawable.food2));
        lsMonAn.add(new MonAn("Cơm tấm sườn trứng", 10000, "Mô tả món ăn", R.drawable.food3));
        lsMonAn.add(new MonAn("Cơm gà xối mỡ", 100, "Mô tả món ăn", R.drawable.food4));
        lsMonAn.add(new MonAn("Cơm hến", 500, "Mô tả món ăn", R.drawable.food5));

        MonAnAdapter adapter = new MonAnAdapter(this, lsMonAn);
        lvMonAn.setAdapter(adapter);

        lvMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonAn monAn = lsMonAn.get(position);

                Toast.makeText(MainActivity.this, monAn.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}