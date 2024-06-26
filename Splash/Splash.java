package com.ashakanoj.program3;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.nio.Buffer;
//import java.util.logging.Handler;
public class Splash extends Activity {
 Handler handler;
 @Override
 protected void onCreate(Bundle savedInstanceState){
 super.onCreate(savedInstanceState);
 setContentView(R.layout.splash);
 handler = new Handler();
 handler.postDelayed(new Runnable() {
 @Override
public void run() {
 Intent intent = new Intent(Splash.this,
MainActivity.class);
 startActivity(intent);
finish();
 }
 },3000);
 }
 }
