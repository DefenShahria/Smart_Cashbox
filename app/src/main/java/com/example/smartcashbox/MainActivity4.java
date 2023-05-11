package com.example.smartcashbox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity4 extends AppCompatActivity {

    BottomNavigationView bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bottom=findViewById(R.id.bottom);

        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity4.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity4.this,MainActivity4.class);
                        startActivity(intent);
                        break;
                    case R.id.details:
                        Toast.makeText(MainActivity4.this, "Details", Toast.LENGTH_SHORT).show();
                        Intent intent1=new Intent(MainActivity4.this,MainActivity5.class);
                        startActivity(intent1);
                        break;
                    case R.id.Profit:
                        Toast.makeText(MainActivity4.this, "Profit", Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(MainActivity4.this,MainActivity6.class);
                        startActivity(intent2);
                        break;

                }


                return true;
            }
        });

    }
}