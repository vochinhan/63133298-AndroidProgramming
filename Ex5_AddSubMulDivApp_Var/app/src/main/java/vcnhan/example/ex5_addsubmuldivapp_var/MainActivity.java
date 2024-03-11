package vcnhan.example.ex5_addsubmuldivapp_var;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText a, b, res;
    Button add, sub, mul, div;

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

        GetViews();

        add.setOnClickListener(Add);
        sub.setOnClickListener(Sub);
        mul.setOnClickListener(Mul);
        div.setOnClickListener(Div);
    }

    public void GetViews()
    {
        a = findViewById(R.id.edtA);
        b = findViewById(R.id.edtB);
        res = findViewById(R.id.edtRes);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);
    }

    View.OnClickListener Add = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNum1 = a.getText().toString();
            String strNum2 = b.getText().toString();

            float intNum1 = Float.parseFloat(strNum1);
            float intNum2 = Float.parseFloat(strNum2);

            res.setText(String.valueOf(intNum1 + intNum2));
        }
    };

    View.OnClickListener Sub = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNum1 = a.getText().toString();
            String strNum2 = b.getText().toString();

            float intNum1 = Float.parseFloat(strNum1);
            float intNum2 = Float.parseFloat(strNum2);

            res.setText(String.valueOf(intNum1 - intNum2));
        }
    };

    View.OnClickListener Mul = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNum1 = a.getText().toString();
            String strNum2 = b.getText().toString();

            float intNum1 = Float.parseFloat(strNum1);
            float intNum2 = Float.parseFloat(strNum2);

            res.setText(String.valueOf(intNum1 * intNum2));
        }
    };

    View.OnClickListener Div = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strNum1 = a.getText().toString();
            String strNum2 = b.getText().toString();

            float intNum1 = Float.parseFloat(strNum1);
            float intNum2 = Float.parseFloat(strNum2);

            if (intNum2 == 0) res.setText("Divisor cant be 0");
            else
                res.setText(String.valueOf(intNum1 / intNum2));
        }
    };
}