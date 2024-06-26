package com.ashakanoj.program6;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;
import androidx.appcompat.widget.PopupMenu;
import static android.os.Build.VERSION_CODES.N;
public class MainActivity extends AppCompatActivity implements
 PopupMenu.OnMenuItemClickListener{
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 //Registering for Context Menu
 registerForContextMenu((TextView) findViewById(R.id.t1));
 }
 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
 MenuInflater mi = getMenuInflater();
 mi.inflate(R.menu.menu_main, menu);
 return true;
 }
 @Override
 public boolean onOptionsItemSelected(MenuItem item) {
 int mid = item.getItemId();
 if (mid == R.id.i1) {
 Toast.makeText(this, "Clicked Option Menu",
 Toast.LENGTH_SHORT).show();
 } else if (mid == R.id.i2) {
 Toast.makeText(this, "I am Sub-menu 1",
 Toast.LENGTH_SHORT).show();
 } else if (mid == R.id.i3) {
 Toast.makeText(this, "I am Sub-menu 2",
 Toast.LENGTH_SHORT).show();
 }
 return super.onOptionsItemSelected(item);
 }
 @Override
 public void onCreateContextMenu(ContextMenu menu, View v,
 ContextMenu.ContextMenuInfo menuInfo) {
 super.onCreateContextMenu(menu, v, menuInfo);
 MenuInflater mi = getMenuInflater();
 mi.inflate(R.menu.menu_main, menu);
 }
 @Override
 public boolean onContextItemSelected(MenuItem item) {
 int mid = item.getItemId();
 if (mid == R.id.i1) {
 Toast.makeText(this, "Clicked Context Menu",
 Toast.LENGTH_SHORT).show();
 } else if (mid == R.id.i2) {
 Toast.makeText(this, "I am Sub-menu 1",
 Toast.LENGTH_SHORT).show();
 } else if (mid == R.id.i3) {
 Toast.makeText(this, "I am Sub-menu 2",
 Toast.LENGTH_SHORT).show();
 }
 return super.onContextItemSelected(item);
 }
 public void pop(View v) {
 PopupMenu popup = new PopupMenu(this, v);
 MenuInflater mi = getMenuInflater();
 mi.inflate(R.menu.menu_main, popup.getMenu());
 popup.show();
 }
 @Override
 public boolean onMenuItemClick(MenuItem item) {
 int mid = item.getItemId();
 if (mid == R.id.i1) {
 Toast.makeText(this, "Clicked Popup Menu",
 Toast.LENGTH_SHORT).show();
 } else if (mid == R.id.i2) {
 Toast.makeText(this, "I am Sub-menu 1",
 Toast.LENGTH_SHORT).show();
 } else if (mid == R.id.i3) {
 Toast.makeText(this, "I am Sub-menu 2",
 Toast.LENGTH_SHORT).show();
 }
 return true;
 }
}
