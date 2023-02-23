package ma.projet.android.efmjavaxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText weightEditText;
    EditText heightEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = (EditText) findViewById(R.id.weight_edit_text);
        heightEditText = (EditText) findViewById(R.id.height_edit_text);


        String weightStr = weightEditText.Text.toString();
        String heightStr = heightEditText.Text.toString();


        double weight = Double.parseDouble(weightStr);
        double height = Double.parseDouble(heightStr);


        double bmi = weight / (height * height) * 703;

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        Toast.makeText(getApplicationContext(), "BMI: " + bmi + "\nStatus: " + status, Toast.LENGTH_SHORT).show();

    }
}