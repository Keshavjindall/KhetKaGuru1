package khetkaguru.android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnExplore;
    private Button btnLearning;
    private Button btnBot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnExplore = findViewById(R.id.btnExplore);
        btnLearning = findViewById(R.id.btnLearning);
        btnBot = findViewById(R.id.btnBot);

        btnExplore.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
            startActivity(intent);
            finish();
        });
        btnLearning.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LearningActivity.class);
            startActivity(intent);
            finish();
        });
        btnBot.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChatBotActivity.class);
            startActivity(intent);
            finish();
        });


    }
}