package com.example.experiment_7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new HomeFragment())
                    .commit();
        }
    }

    public void navigateToDetailsFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new DetailsFragment())
                .addToBackStack(null)
                .commit();
    }
}
