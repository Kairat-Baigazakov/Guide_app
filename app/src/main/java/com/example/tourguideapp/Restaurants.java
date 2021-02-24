package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Restaurants extends Fragment {

    public Restaurants() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Data> arrayList = new ArrayList<>();
        arrayList.add(new Data(getString(R.string.restaurant_1) , R.drawable.alatoo_res, getString(R.string.restaurant_i_1), getString(R.string.restaurant_n_1), getString(R.string.restaurant_a_1),"42.827208, 74.600384"));
        arrayList.add(new Data(getString(R.string.restaurant_2) , R.drawable.jan_res, getString(R.string.restaurant_i_2), getString(R.string.restaurant_n_2), getString(R.string.restaurant_a_2),"42.820517, 74.617323"));
        arrayList.add(new Data(getString(R.string.restaurant_3) , R.drawable.fru_res, getString(R.string.restaurant_i_3), getString(R.string.restaurant_n_3), getString(R.string.restaurant_a_3),"42.878912, 74.606989"));
        arrayList.add(new Data(getString(R.string.restaurant_4) , R.drawable.das_res, getString(R.string.restaurant_i_4), getString(R.string.restaurant_n_4), getString(R.string.restaurant_a_4),"42.855532, 74.636723"));

        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;


    }
}