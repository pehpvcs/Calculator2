import com.example.calculator2.R;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultTextView = findViewById(R.id.result_text_view);

        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0.0);

        resultTextView.setText(String.valueOf(result));
    }
}
