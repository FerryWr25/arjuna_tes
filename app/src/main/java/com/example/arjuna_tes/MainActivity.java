package com.example.arjuna_tes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("ferry") && password.getText().toString().equals("ferry")){
                    Toast.makeText(MainActivity.this, "Berhasil", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,dash.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, password.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
