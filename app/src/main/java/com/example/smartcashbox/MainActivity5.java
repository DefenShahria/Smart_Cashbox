package com.example.smartcashbox;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONObject;

public class MainActivity5 extends AppCompatActivity {

    BottomNavigationView bottom;
    TextView tv1;
    TextView tv2;

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        bottom=findViewById(R.id.bottom);
        apicall();







        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("ResourceType")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity5.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity5.this,MainActivity4.class);
                        startActivity(intent);
                        break;
                    case R.id.details:
                        Toast.makeText(MainActivity5.this, "Details", Toast.LENGTH_SHORT).show();
                        Intent intent1=new Intent(MainActivity5.this,MainActivity5.class);
                        startActivity(intent1);

                        break;
                    case R.id.Profit:
                        Toast.makeText(MainActivity5.this, "Profit", Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(MainActivity5.this,MainActivity6.class);
                        startActivity(intent2);
                        break;

                }


                return true;
            }
        });
    }
    public void apicall(){
        tv1 =findViewById(R.id.tv1);
        tv2 =findViewById(R.id.tv2);



       String url ="https://restcountries.com/v3.1/alpha/pe";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {



                            String sex = response.getString("id");
                            String porn = response.getString("text");
                            tv1.setText(porn);
                            tv2.setText(sex);



                        } catch (Exception e) {


                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


            }
        });
        Volley.newRequestQueue(this).add(request);

    }




}