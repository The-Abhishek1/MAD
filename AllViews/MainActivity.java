package com.ashakanoj.program4;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 Button example = (Button) findViewById(R.id.buttonExample);

 CheckBox exampleCheckBox = (CheckBox) findViewById(R.id.checkBoxExample);
 RadioGroup exampleRadioGroup = (RadioGroup) findViewById(R.id.radioGroupExample);
 ToggleButton exampletoggleButton = (ToggleButton)
findViewById(R.id.toggleButtonExample);
 ImageButton exampleImageButton = (ImageButton)
findViewById(R.id.imageButtonExample);
 example.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View arg0) {
 // TODO Auto-generated method stub
 ToastToDisplay("Hey Button is pressed!!");
 }
 });
 exampleCheckBox.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 // TODO Auto-generated method stub
 if (((CheckBox) v).isChecked()) {
 ToastToDisplay("Check Box is checked");
 } else {
 ToastToDisplay("Check box is unchecked");
 }
 }
 });
 exampleRadioGroup
 .setOnCheckedChangeListener(new OnCheckedChangeListener() {
 @Override
public void onCheckedChanged(RadioGroup group, int checkedId) {
 // TODO Auto-generated method stub
 RadioButton rb1 = (RadioButton) findViewById(R.id.radioBtton1);
RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
 if (rb1.isChecked()) {
 ToastToDisplay("Radio Button 1 is checked");
 } else if (rb2.isChecked()) {
 ToastToDisplay("Radio Button 2 is checked");
 } else {
 ToastToDisplay("Radio Button 3 is checked");
 }
 }
 });
 exampletoggleButton.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 // TODO Auto-generated method stub
 if (((ToggleButton) v).isChecked()) {
 ToastToDisplay("Toggle button is ON");
 } else {
 ToastToDisplay("Toggle Button is OFF");
 }
 }
 });
 exampleImageButton.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 // TODO Auto-generated method stub
 ToastToDisplay("Image Button is pressed");
 }
 });
 }
 private void ToastToDisplay(String args) {
 Toast.makeText(getBaseContext(), args, Toast.LENGTH_SHORT).show();
 }
 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
 // Inflate the menu; this adds items to the action bar if it is present.
 getMenuInflater().inflate(R.menu.main, menu);
 return true;
 }
}
