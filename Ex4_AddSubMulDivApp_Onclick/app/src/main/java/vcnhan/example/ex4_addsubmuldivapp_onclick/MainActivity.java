package vcnhan.example.ex4_addsubmuldivapp_onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, res;

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
    }

    public void GetViews()
    {
        num1 = findViewById(R.id.edtNum1);
        num2 = findViewById(R.id.edtNum2);
        res = findViewById(R.id.edtRes);
    }

    public void Add(View view)
    {
        String strNum1 = num1.getText().toString();
        String strNum2 = num2.getText().toString();

        float intNum1 = Float.parseFloat(strNum1);
        float intNum2 = Float.parseFloat(strNum2);

        res.setText(String.valueOf(intNum1 + intNum2));
    }

    public void Sub(View view)
    {
        String strNum1 = num1.getText().toString();
        String strNum2 = num2.getText().toString();

        float intNum1 = Float.parseFloat(strNum1);
        float intNum2 = Float.parseFloat(strNum2);

        res.setText(String.valueOf(intNum1 - intNum2));
    }

    public void Mul(View view)
    {
        String strNum1 = num1.getText().toString();
        String strNum2 = num2.getText().toString();

        float intNum1 = Float.parseFloat(strNum1);
        float intNum2 = Float.parseFloat(strNum2);

        res.setText(String.valueOf(intNum1 * intNum2));
    }

    public void Div(View view)
    {
        String strNum1 = num1.getText().toString();
        String strNum2 = num2.getText().toString();

        float intNum1 = Float.parseFloat(strNum1);
        float intNum2 = Float.parseFloat(strNum2);

        if (intNum2 == 0) res.setText("Divisor cant be 0");
        else
            res.setText(String.valueOf(intNum1 / intNum2));
    }
}

