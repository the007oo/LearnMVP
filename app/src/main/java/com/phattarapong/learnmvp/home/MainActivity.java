package com.phattarapong.learnmvp.home;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.phattarapong.learnmvp.R;
import com.phattarapong.learnmvp.home.adapter.WeatherAdapter;
import com.phattarapong.learnmvp.home.model.Station;

import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeContract.HomeView {

    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private HomeContract.HomePresenter homePresenter;
    private ProgressBar progressBar;
    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidget();

        homePresenter = new WeatherPresenter(this);
        homePresenter.getWeather();

        setUpWidget();
    }

    private void setUpWidget() {
        weatherAdapter = new WeatherAdapter();
        recyclerView.setAdapter(weatherAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                homePresenter.getWeather();
            }
        });
    }

    private void initWidget() {
        progressBar = findViewById(R.id.progressBar);
        recyclerView = findViewById(R.id.recycleView);
        swipeRefreshLayout = findViewById(R.id.swipRefreshLayout);
    }

    @Override
    public void showRefresh() {
        swipeRefreshLayout.setRefreshing(true);
    }

    @Override
    public void hideRefresh() {
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showWeather(List<Station> stationList) {
        weatherAdapter.setStationList(stationList);
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
