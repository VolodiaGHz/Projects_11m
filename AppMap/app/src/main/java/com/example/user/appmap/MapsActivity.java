package com.example.user.appmap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    private void addMarker(){
        if (null != googleMap){
            googleMap.
        }

    }
    private void createMapView()
    {
        try{
            if(null == googleMap){
                googleMap = ((MapFragment)getFragmentManager().findFragmentById(R.id.mapView)).getMap();
                if(null == googleMap){
                    Toast.makeText(getApplicationContext(),"Eror creating MAP",Toast.LENGTH_SHORT).show();
                }
            }
        }catch (NullPointerException){
            Log.e("AppMap",String);

        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(new LatLng(0,0)).title("Marker"));

    }
}
