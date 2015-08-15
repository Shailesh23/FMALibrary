package com.fma.ui.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.examples.dagger.fmalibrary.BaseActivity;
import com.examples.dagger.fmalibrary.R;
import com.fma.di.FMAHttpProviders;
import com.fma.services.MakeFMAHttpRequestService;
import com.fma.ui.details.DetailsActivity;
import com.google.gson.Gson;
import com.musiclibrary.shal.httpadapter.PrepareFMARequest;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.inject.Singleton;

import butterknife.Bind;
import butterknife.ButterKnife;
import dagger.Component;


public class HomeActivity extends BaseActivity implements HomeView{

    @Inject
    public PrepareFMARequest prepareFMARequest;
    @Inject
    public Gson gson;
    @Bind(R.id.grid_library_options)
    GridView gridLayoutOptions;
    private HomePresenter presenter;

    @Override
    public void moveToDetails() {
        Intent startDetials = new Intent(this, DetailsActivity.class);
        startActivity(startDetials);
    }

    private BroadcastReceiver mHttpBroadCastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                if (intent != null && intent.hasExtra(MakeFMAHttpRequestService.ARTIST_REQUEST)) {
                    String jsonObject = intent.getStringExtra(MakeFMAHttpRequestService.ARTIST_REQUEST);
                    ArrayList artists = new ArrayList<>();
                    artists = gson.fromJson(jsonObject, artists.getClass());
                    System.out.println(artists);
                }
            } catch (Exception e) {
                System.out.println();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);
        gridLayoutOptions.setAdapter(new CustomGridAdapter());
        gridLayoutOptions.setOnItemClickListener(new GridItemClickListner());

        presenter = new HomePresenterImpl(this,null);
        LocalBroadcastManager.getInstance(this).registerReceiver(mHttpBroadCastReceiver,
                new IntentFilter(MakeFMAHttpRequestService.ARTIST_REQUEST_RECEIVER));
    }

    private class CustomGridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            View gridSingle = (View) inflater.inflate(R.layout.home_grid_single, null);
            TextView text = (TextView) gridSingle.findViewById(R.id.text_grid_single);
            ImageView image = (ImageView) gridSingle.findViewById(R.id.image_grid_image);
            text.setText(Integer.toString(position));
            return gridSingle;
        }
    }

    private class GridItemClickListner implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            presenter.getRequestedTypeFromFMAServer(position);
        }
    }
}
