package com.fma.ui.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

import com.fma.services.MakeFMAHttpRequestService;
import com.google.gson.Gson;
import com.musiclibrary.shal.httpadapter.PrepareFMARequest;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Created by Shal on 01-08-2015.
 */
public class HomeInteractorImpl implements HomeInteractor {
    @Inject
    public Gson gson;
    @Inject
    public PrepareFMARequest prepareFMARequest;


    OnFinishedInteraction resultHandler;

    BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            try {
                if (intent != null && intent.hasExtra(MakeFMAHttpRequestService.ARTIST_REQUEST)) {
                    String jsonObject = intent.getStringExtra(MakeFMAHttpRequestService.ARTIST_REQUEST);
                    ArrayList artists = new ArrayList<>();
                    artists = gson.fromJson(jsonObject, artists.getClass());
                    System.out.println(artists);
                    resultHandler.dataSetLoadedSucess();
                }
            } catch (Exception e) {
                System.out.println();
            }
        }
    };

    @Override
    public void makeRequestToServer(OnFinishedInteraction resultHandler, int requestType, Context context) {
        this.resultHandler = resultHandler;
        Intent intent = new Intent(context, MakeFMAHttpRequestService.class);
        context.startService(intent);
        LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, new IntentFilter(MakeFMAHttpRequestService.ARTIST_REQUEST_RECEIVER));
    }
}
