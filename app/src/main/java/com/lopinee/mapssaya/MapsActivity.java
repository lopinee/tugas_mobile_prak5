package com.lopinee.mapssaya;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng rumah = new LatLng(-2.684890, 111.650933);
        mMap.addMarker(new MarkerOptions().position(rumah).title("INI RUMAH SAYA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumah));

        LatLng sekolah = new LatLng(-2.685423, 111.648568);
        mMap.addMarker(new MarkerOptions().position(sekolah).title("SMAN 2 PANGKALAN BUN"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sekolah, 17));


        mMap.addPolyline(new PolylineOptions().add(
                rumah,
                new LatLng(-2.684890, 111.650933),
                new LatLng(-2.685603, 111.650043),
                new LatLng(-2.685215, 111.649756),
                new LatLng(-2.684628, 111.649371),
                new LatLng(-2.683835, 111.648737),
                new LatLng(-2.683682, 111.648587),
                new LatLng(-2.683594, 111.648437),
                new LatLng(-2.683934, 111.648378),
                new LatLng(-2.683993, 111.648354),
                new LatLng(-2.684039, 111.648322),
                new LatLng(-2.684580, 111.647724),
                new LatLng(-2.684650, 111.647743),
                new LatLng(-2.684725, 111.647751),
                new LatLng(-2.685239, 111.648124),
                new LatLng(-2.685480, 111.648317),
                new LatLng(-2.685550, 111.648376),
                new LatLng(-2.685423, 111.648568),
                sekolah
                ).color(Color.BLUE)
        );
    }
}
