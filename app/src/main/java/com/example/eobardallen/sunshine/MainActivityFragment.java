package com.example.eobardallen.sunshine;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    String LOG_TAG = MainActivityFragment.class.getSimpleName();
    ArrayAdapter<String> dataAdapter;

    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        dataAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.list_item_forecast, R.id.list_item_forecast_textview,
                new ArrayList<String>());

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView weatherDetails = (ListView)rootView.findViewById(R.id.listview_forecast);
        weatherDetails.setAdapter(dataAdapter);
        weatherDetails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent detailItemView = new Intent(getActivity(), DetailActivity.class)
                        .putExtra(Intent.EXTRA_TEXT, dataAdapter.getItem(position));
                startActivity(detailItemView);
            }
        });


        return rootView;
    }

    private void updateWeather(){
        FetchWeatherTask FWT = new FetchWeatherTask(getActivity(), dataAdapter);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(
                getActivity());
        String location = prefs.getString(getString(R.string.pref_location_key)
                ,getString(R.string.pref_location_default));
        FWT.execute(location);
    }

    public void onStart(){
        super.onStart();
        updateWeather();
    }
}
