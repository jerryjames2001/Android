package com.example.activity_life_cycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="Life cycle example";

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
        Log.d(TAG,"on create called");
        Toast.makeText(this,"Activity created",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"on start called");
        Toast.makeText(this,"Activity started",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"on resume called");
        Toast.makeText(this,"Activity resumed",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"on pause called");
        Toast.makeText(this,"Activity paused",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"on stop created");
        Toast.makeText(this,"Activity stoped",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"on reatart called");
        Toast.makeText(this,"Activity restarted",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"on destroy created");
        Toast.makeText(this,"Activity destroyed",Toast.LENGTH_SHORT).show();
    }
}
