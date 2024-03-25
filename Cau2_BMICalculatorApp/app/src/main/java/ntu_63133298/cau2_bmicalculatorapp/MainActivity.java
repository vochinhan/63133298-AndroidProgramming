package ntu_63133298.cau2_bmicalculatorapp;

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

    EditText edtHeight, edtWeight, edtBMI;
    Button btnCal;
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

        getViews();

        btnCal.setOnClickListener(calculateBMI);
    }

    public void getViews()
    {
        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);
        edtBMI = findViewById(R.id.edtBMI);
        btnCal = findViewById(R.id.btnCal);
    }

    View.OnClickListener calculateBMI = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strHeight = edtHeight.getText().toString();
            String strWeight = edtWeight.getText().toString();

            float fHeight = Float.parseFloat(strHeight);
            float fWeight = Float.parseFloat(strWeight);

            
        }
    };
}