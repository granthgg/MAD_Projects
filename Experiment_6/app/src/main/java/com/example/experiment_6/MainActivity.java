package com.example.experiment_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.telephony.SmsManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText phoneNumber = (EditText) findViewById(R.id.phone_number);
        final EditText message = (EditText) findViewById(R.id.message);
        Button sendSms = (Button) findViewById(R.id.send_sms);

        sendSms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String number = phoneNumber.getText().toString();
                String msg = message.getText().toString();
                

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(number, null, msg, null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "SMS Failed to Send, Please try again", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }
}
