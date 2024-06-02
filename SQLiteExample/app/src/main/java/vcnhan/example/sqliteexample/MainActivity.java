package vcnhan.example.sqliteexample;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        SQLiteDatabase db;
        db = openOrCreateDatabase("Sach.db", MODE_PRIVATE, null);

//        db.execSQL("DROP TABLE IF EXISTS Book;");
//
//        db.execSQL("CREATE TABLE BOOK( id text PRIMARY KEY, title text, pages integer, author text );");

        String sql = "Select * from Books;";
        Cursor cs = db.rawQuery(sql, null);
        cs.moveToFirst();

        ArrayList<Book> ls = new ArrayList<>();
        while (cs.moveToNext())
        {
            ls.add(new Book(cs.getString(0),
                    cs.getString(1),
                    cs.getInt(2),
                    cs.getString(3)
                    )
            );
        }

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < ls.size(); i++)
        {
            names.add(ls.get(i).title);
        }

        ListView lv = findViewById(R.id.lvBookName);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        lv.setAdapter(adapter);
    }
}