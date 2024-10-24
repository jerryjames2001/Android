package com.example.data;

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
    EditText name,username,mark;
    Mydatabase database=new Mydatabase(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        username=findViewById(R.id.username);
        mark=findViewById(R.id.marks);
    }

    public void Save(View view) {
        String nam=name.getText().toString();
        String usernam=username.getText().toString();
        Integer marrk=Integer.parseInt(mark.getText().toString());
        Boolean result=database.insertdata(nam,usernam,marrk);
        if (result) {
            Toast.makeText(getApplicationContext(), "Data inserted sucessfully", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "data insertion failed", Toast.LENGTH_SHORT).show();
        }
    }
}
