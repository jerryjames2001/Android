package com.example.registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText fname,lname,email,pass,dob;
    private RadioGroup gen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        email=findViewById(R.id.mail);
        pass=findViewById(R.id.pass);
        dob=findViewById(R.id.datee);
        gen=findViewById(R.id.gen);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void logg(View view) {
        SharedPreferences sp=getSharedPreferences("Myprefs",MODE_PRIVATE);
        SharedPreferences.Editor editor=sp.edit();

        editor.putString("fname",fname.getText().toString());
        editor.putString("lname",lname.getText().toString());
        editor.putString("email",email.getText().toString());
        editor.putString("lname",dob.getText().toString());

        int rid=gen.getCheckedRadioButtonId();
        RadioButton selected=findViewById(rid);
        if (selected != null)
            editor.putString("gen",selected.getText().toString());
        editor.apply();
        Intent intent=new Intent(this, home.class);
        startActivity(intent);
    }
}
