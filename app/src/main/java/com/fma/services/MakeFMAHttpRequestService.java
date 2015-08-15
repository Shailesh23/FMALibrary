package com.fma.services;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;

import com.fma.di.DaggerComponents;
import com.fma.di.DaggerDaggerComponents_FMARequest;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.musiclibrary.shal.httpadapter.PrepareFMARequest;
import com.musiclibrary.shal.pojos.Artist;

import java.util.List;

import javax.inject.Inject;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class MakeFMAHttpRequestService extends IntentService {

    // TODO: Rename parameters
    public static final String HTTP_REQUEST = "com.fma.services.HTTP_REQUEST";
    public static final String ARTIST_REQUEST = "com.fma.services.ARTIST_REQUEST";
    public static final String ARTIST_REQUEST_RECEIVER = "com.fma.services.ARTIST_REQUEST_RECEIVER";

    @Inject
    public PrepareFMARequest prepareFMARequest;
    //TODO: add Gson DI
//    @Inject
    public Gson gson;

    public MakeFMAHttpRequestService() {
        super("MakeHttpRequestService");
        prepareFMARequest = DaggerDaggerComponents_FMARequest.create().provideFMARequest();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null && intent.hasExtra(HTTP_REQUEST)) {
            if (intent.hasExtra(ARTIST_REQUEST)) {
                gson =new GsonBuilder().setFieldNamingPolicy(
                        FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
                List<Artist> artists = prepareFMARequest.getArtistList();
                Intent activityEventSender = new Intent(ARTIST_REQUEST_RECEIVER);
                String jsonObject = gson.toJson(artists);
                activityEventSender.putExtra(ARTIST_REQUEST, jsonObject);
                LocalBroadcastManager.getInstance(this).sendBroadcast(activityEventSender);
            }
        }
    }
}
