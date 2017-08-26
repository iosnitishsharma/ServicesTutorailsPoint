package com.example.nitishsharma.servicestutorailspoint;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//
//
//    A service is a component that runs in the background to perform long-running operations without needing to interact
//
//    with the user and it works even if
//    application is destroyed. A service can essentially take two states −
   // Started

//    A service is started when an application component, such as an activity, starts it by calling startService().
//    Once started, a service can run
//    in the background indefinitely, even if the component that started it is destroyed.

//
//    A service is bound when an application component binds to it by calling bindService().
//    A bound service offers a client-server interface that allows components to interact with the service,
//            send requests, get results, and even
//    do so across processes with interprocess communication (IPC).

        String msg = "Android : ";

        /** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d(msg, "The onCreate() event");
        }

        public void startService(View view) {
            startService(new Intent(getBaseContext(), MyService.class));
        }

        // Method to stop the service
        public void stopService(View view) {
            stopService(new Intent(getBaseContext(), MyService.class));
        }
    }
