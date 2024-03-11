package vcnhan.example.ex5_addsubmuldivapp_anonymous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, res;
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

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                float intNum1 = Float.parseFloat(strNum1);
                float intNum2 = Float.parseFloat(strNum2);

                res.setText(String.valueOf(intNum1 + intNum2));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                float intNum1 = Float.parseFloat(strNum1);
                float intNum2 = Float.parseFloat(strNum2);

                res.setText(String.valueOf(intNum1 - intNum2));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                float intNum1 = Float.parseFloat(strNum1);
                float intNum2 = Float.parseFloat(strNum2);

                res.setText(String.valueOf(intNum1 * intNum2));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNum1 = num1.getText().toString();
                String strNum2 = num2.getText().toString();

                float intNum1 = Float.parseFloat(strNum1);
                float intNum2 = Float.parseFloat(strNum2);

                if (intNum2 == 0) res.setText("Divisor cant be 0");
                else
                    res.setText(String.valueOf(intNum1 / intNum2));
            }
        });


    }

    public void GetViews()
    {
        num1 = findViewById(R.id.edtNum1);
        num2 = findViewById(R.id.edtNum2);
        res = findViewById(R.id.edtRes);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);
    }
}