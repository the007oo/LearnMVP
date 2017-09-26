package com.phattarapong.learnmvp.home;

import com.phattarapong.learnmvp.home.model.Station;

import java.util.List;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public interface HomeContract {

    interface HomeView {

        void showProgress();

        void hideProgress();

        void showRefresh();

        void hideRefresh();

        void showWeather(List<Station> stationList);

        void showMessage(String message);
    }

    interface HomePresenter {

        void getWeather();

    }
}
