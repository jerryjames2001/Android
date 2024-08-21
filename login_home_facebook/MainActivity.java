package com.example.authentication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText username,password;

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
        username=(EditText) findViewById(R.id.uname);
        password=(EditText) findViewById(R.id.pass);
    }

    public void loginn(View view) {
        String name=username.getText().toString();
        String pass=password.getText().toString();
        if (name.isEmpty())
            username.setError("Username empty");
        else if (pass.isEmpty())
            password.setError("Password empty");
        else if (name.equals("admin") && pass.equals("admin")) {
            Toast.makeText(this, "Login sucessful", Toast.LENGTH_SHORT).show();
//            Intent home = new Intent(MainActivity.this, home_page.class);
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")));
//            startActivity(home);
        }
        else
            Toast.makeText(this,"Login un-sucessful",Toast.LENGTH_LONG).show();
    }
}
