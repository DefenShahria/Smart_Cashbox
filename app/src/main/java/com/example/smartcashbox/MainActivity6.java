package com.example.smartcashbox;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;




public class MainActivity6 extends AppCompatActivity {

    BottomNavigationView bottom;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        bottom=findViewById(R.id.bottom);



        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        Toast.makeText(MainActivity6.this, "Home", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(MainActivity6.this,MainActivity4.class);
                        startActivity(intent);
                        break;
                    case R.id.details:
                        Toast.makeText(MainActivity6.this, "Details", Toast.LENGTH_SHORT).show();
                        Intent intent1=new Intent(MainActivity6.this,MainActivity5.class);
                        startActivity(intent1);
                        break;
                    case R.id.Profit:
                        Toast.makeText(MainActivity6.this, "Profit", Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(MainActivity6.this,MainActivity6.class);
                        startActivity(intent2);
                        break;

                }


                return true;
            }
        });
    }

//    public class APICaller extends AsyncTask<String, Void, String> {
//
//        @Override
//        protected String doInBackground(String... params) {
//            String urlString = params[0]; // API endpoint URL
//            String result = "";
//
//            try {
//                URL url = new URL(urlString);
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setRequestMethod("GET");
//
//                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                String inputLine;
//                StringBuilder response = new StringBuilder();
//                while ((inputLine = in.readLine()) != null) {
//                    response.append(inputLine);
//                }
//                in.close();
//
//                result = response.toString();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return result;
//        }
//
//        @Override
//        protected void onPostExecute(String result) {
//            super.onPostExecute(result);
//
//            // Do something with the API response here
//            // For example, update the UI with the response data
//        }
//    }
//
//    APICaller apiCaller = new APICaller();
//apiCaller.execute("https://api.example.com/endpoint");

}