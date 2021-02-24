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

public class Cinemas extends Fragment {

    public Cinemas() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<Data> arrayList = new ArrayList<>();

        arrayList.add(new Data(getString(R.string.cinema_1) , R.drawable.alatoo_cin, getString(R.string.cinema_i_1), getString(R.string.cinema_n_1), getString(R.string.cinema_a_1),"42.876156, 74.607749"));
        arrayList.add(new Data(getString(R.string.cinema_2) , R.drawable.man_cin, getString(R.string.cinema_i_2), getString(R.string.cinema_n_2), getString(R.string.cinema_a_2),"42.876597, 74.596964"));
        arrayList.add(new Data(getString(R.string.cinema_3) , R.drawable.russ_cin, getString(R.string.cinema_i_3), getString(R.string.cinema_n_3), getString(R.string.cinema_a_3),"42.845099, 74.585397"));
        arrayList.add(new Data(getString(R.string.cinema_4) , R.drawable.cosmo_cin, getString(R.string.cinema_i_4), getString(R.string.cinema_n_4), getString(R.string.cinema_a_4),"42.834032, 74.620764"));
        DataAdapter dataAdapter = new DataAdapter(getActivity(), arrayList);

        ListView listView = rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;
    }
}