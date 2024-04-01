package com.example.experiment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity {

    EditText editText;
    CheckBox checkBox;
    RadioButton radioButton1, radioButton2;
    RadioGroup radioGroup;
    Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        clearButton = (Button) findViewById(R.id.button);
    }

    public void submitForm(View view) {
        String text = editText.getText().toString();
        boolean isChecked = checkBox.isChecked();

        int selectedId = radioGroup.getCheckedRadioButtonId();
        if(selectedId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedId);
            String radioButtonText = selectedRadioButton.getText().toString();
            String message = "Name: " + text + ", Section: " + (isChecked ? "21BCS-KRG-SC-1" : "Not Selected") + ", " + radioButtonText;
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "No Radio Button selected", Toast.LENGTH_LONG).show();
        }
    }

    public void clearSelection(View view) {
        radioGroup.clearCheck();
    }
}

