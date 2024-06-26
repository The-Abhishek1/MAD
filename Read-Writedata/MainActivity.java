package com.ashakanoj.program7;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainActivity extends AppCompatActivity {
 EditText editTextFileName,editTextData;
 Button saveButton,readButton;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 editTextFileName=findViewById(R.id.editText1);
 editTextData=findViewById(R.id.editText2);
 saveButton=findViewById(R.id.button1);
 readButton=findViewById(R.id.button2);
 //Performing Action on Read Button
 saveButton.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View arg0) {
 String filename=editTextFileName.getText().toString();
 String data=editTextData.getText().toString();
 FileOutputStream fos;
 try {
 fos = openFileOutput(filename, Context.MODE_PRIVATE);
//default mode is PRIVATE, can be APPEND etc.
fos.write(data.getBytes());
fos.close();
 Toast.makeText(getApplicationContext(),filename + " stored",
 Toast.LENGTH_LONG).show();
 } catch (FileNotFoundException e) {e.printStackTrace();}
 catch (IOException e) {e.printStackTrace();}
 }
 });
 //Performing Action on Read Button
 readButton.setOnClickListener(new View.OnClickListener(){
 @Override
 public void onClick(View arg0) {
 String filename=editTextFileName.getText().toString();
 StringBuffer stringBuffer = new StringBuffer();
 try {
 //Attaching BufferedReader to the FileInputStream by the help of
InputStreamReader
 BufferedReader inputReader = new BufferedReader(new InputStreamReader(
 openFileInput(filename)));
 String inputString;
//Reading data line by line and storing it into the stringbuffer
while ((inputString = inputReader.readLine()) != null) {
 stringBuffer.append(inputString + "\n");
 }
 } catch (IOException e) {
 e.printStackTrace();
 }
 //Displaying data on the toast

Toast.makeText(getApplicationContext(),stringBuffer.toString(),Toast.LENGTH_LONG).show();
 }
 });
 }
}
