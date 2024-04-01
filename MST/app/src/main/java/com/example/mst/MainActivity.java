package com.example.mst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nameInput;
    private EditText uid;
    private TextView greetingText;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.nameInput);
        uid = findViewById(R.id.uid);
        greetingText = findViewById(R.id.show);
        okButton = findViewById(R.id.okButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_ = nameInput.getText().toString();
                String uid_ = uid.getText().toString();
                greetingText.setText("NAME: " + name_ + " UID: "+uid_);
    }
});
    }
}
