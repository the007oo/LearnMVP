package com.phattarapong.learnmvp.home;

import com.phattarapong.learnmvp.home.model.Station;
import com.phattarapong.learnmvp.home.model.Wethertoday;
import com.phattarapong.learnmvp.manager.HttpManager;
import com.phattarapong.learnmvp.manager.http.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class WeatherPresenter implements HomeContract.HomePresenter {
    private HomeContract.HomeView homeView;
    private ApiService apiService;

    public WeatherPresenter(HomeContract.HomeView homeView) {
        this.homeView = homeView;
        apiService = HttpManager.getInstance().getApiService();
    }

    @Override
    public void getWeather() {
        homeView.showProgress();
        apiService.getWeatherToDay().enqueue(new Callback<Wethertoday>() {
            @Override
            public void onResponse(Call<Wethertoday> call, Response<Wethertoday> response) {
                if (!response.body().equals("") || !response.body().equals(null)) {
                    homeView.showWeather(response.body().getStations());
                }
                homeView.hideProgress();
                homeView.hideRefresh();
            }

            @Override
            public void onFailure(Call<Wethertoday> call, Throwable t) {
                homeView.showMessage(t.getMessage());
                homeView.hideProgress();
                homeView.hideRefresh();
            }
        });
    }
}
