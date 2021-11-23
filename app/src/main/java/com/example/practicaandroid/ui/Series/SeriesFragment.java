package com.example.practicaandroid.ui.Series;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.practicaandroid.ui.adapters.FindSerieAdapter;
import com.example.practicaandroid.R;
import com.example.practicaandroid.ui.adapters.SerieAdapter;
import com.example.practicaandroid.ui.models.TVShowFeed;
import com.example.practicaandroid.ui.retrofit.MovieService;
import com.example.practicaandroid.ui.retrofit.RetrofitInstance;

public class SeriesFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_media_final, container, false);

        return root;
    }


}