package com.example.eobardallen.sunshine;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();
    private final String MAINACTIVITYFRAGMENT_TAG = "MATAG";

    private String mLocation;

    protected void onCreate(Bundle savedInstanceState) {
        mLocation = Utility.getPreferredLocation(this);
        super.onCreate(savedInstanceState);
        Log.d("LOG_TAG", "SO THIS IS AWKWARD");
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_container, new MainActivityFragment(), MAINACTIVITYFRAGMENT_TAG)
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        } else if (id == R.id.action_location) {
            openPreferredLocationInMap();
        }

        return super.onOptionsItemSelected(item);
    }

    private void openPreferredLocationInMap(){
        String location = Utility.getPreferredLocation(this);

        // Using the URI scheme for showing a location found on a map.
        Uri geoLocation = Uri.parse("geo:0,0?").buildUpon()
                .appendQueryParameter("q",location)
                .build();

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);

        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        } else {
            Log.d ("LOG_TAG", "Couldn't call" + location + ", no receiving apps installed!");
        }
    }

    @Override
    protected void onResume(){
        super.onResume();
        String location = Utility.getPreferredLocation(this);
        //update location in the second pane using the fragment manager
        if (location!=null && !location.equals(mLocation)){
            MainActivityFragment ma = (MainActivityFragment)getSupportFragmentManager()
                    .findFragmentByTag(MAINACTIVITYFRAGMENT_TAG);
            if (null != ma){
                ma.onLocationChanged();
            }
            mLocation = location;
        }
    }
}
