package com.example.android.parkiteasy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Boolean mInternetStatus;
    RecyclerView mParkingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mParkingList = findViewById(R.id.parkingList);

        //checking for internet connection
           mInternetStatus = isOnline();

        if(mInternetStatus){

           mParkingList.setLayoutManager(new LinearLayoutManager(this));
           mParkingList.setAdapter(new RecyclerViewAdapter());

        }
        else
        {
            Toast.makeText(this,"Internet is not available",Toast.LENGTH_LONG).show();
        }
    }


    // check Internet connectivity status

    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        return netInfo != null && netInfo.isConnectedOrConnecting();
    }
}
