package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText ed1;
EditText ed2;
TextView tv;
int ans=0,a,b;
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
        ed1=(EditText)findViewById(R.id.in1);
        ed2=(EditText)findViewById(R.id.in2);
        tv=(TextView)findViewById(R.id.output);

    }
        public void summs(View view) {
            String x=ed1.getText().toString();
            String y=ed2.getText().toString();
            a=Integer.parseInt(x);
            b=Integer.parseInt(y);
        ans=a+b;
            tv.setText(String.valueOf(ans));
    }

    public void minus(View view) {
        String x=ed1.getText().toString();
        String y=ed2.getText().toString();
        a=Integer.parseInt(x);
        b=Integer.parseInt(y);
        ans=a-b;
        tv.setText(String.valueOf(ans));
    }

    public void star(View view) {
        String x=ed1.getText().toString();
        String y=ed2.getText().toString();
        a=Integer.parseInt(x);
        b=Integer.parseInt(y);
        ans=a*b;
        tv.setText(String.valueOf(ans));
    }

    public void divide(View view) {
        String x=ed1.getText().toString();
        String y=ed2.getText().toString();
        a=Integer.parseInt(x);
        b=Integer.parseInt(y);
        ans=a/b;
        tv.setText(String.valueOf(ans));
    }
    
}
