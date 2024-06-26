package com.ashakanoj.program10;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
 private GoogleMap mMap;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 SupportMapFragment mapFragment = (SupportMapFragment)
 getSupportFragmentManager().findFragmentById(R.id.id_map);
 mapFragment.getMapAsync(this);
 }
 @Override
 public void onMapReady(@NonNull GoogleMap googleMap) {
 LatLng location=new LatLng(12.9364 , 77.5782 );
 // co-ordinates of surana college 12.9364° N, 77.5782° E
 googleMap.addMarker(new MarkerOptions().position(location).title("Surana
College"));
 googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location,12));
 }
}
