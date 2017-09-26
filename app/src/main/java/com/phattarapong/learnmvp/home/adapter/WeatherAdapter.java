package com.phattarapong.learnmvp.home.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.phattarapong.learnmvp.R;
import com.phattarapong.learnmvp.home.model.Station;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Phattarapong on 9/26/2017.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {

    private List<Station> stationList;
    private OnItemClickListener onItemClickListener;

    public WeatherAdapter() {
        stationList = new ArrayList<>();
    }

    public void setStationList(List<Station> stationList) {
        this.stationList = stationList;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weather, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Station station = stationList.get(position);
        holder.provinceTextView.setText(station.getProvince());
        holder.stationNameTextView.setText(station.getStationNameTh());
        holder.maxTemperatureTextView.setText(station.getObserve().getMaxTemperature().getValue().toString());
        holder.minTemperatureTextView.setText(station.getObserve().getMinTemperature().getValue().toString());
    }

    @Override
    public int getItemCount() {
        return stationList.size() != 0 ? stationList.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView provinceTextView, stationNameTextView, maxTemperatureTextView, minTemperatureTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            provinceTextView = itemView.findViewById(R.id.provinceTextView);
            stationNameTextView = itemView.findViewById(R.id.stationNameTextView);
            maxTemperatureTextView = itemView.findViewById(R.id.maxTemperatureTextView);
            minTemperatureTextView = itemView.findViewById(R.id.minTemperatureTextView);
        }
    }

    public interface OnItemClickListener {
        void OnItemClickListener();
    }
}
