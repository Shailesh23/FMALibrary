package com.fma.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

import com.fma.services.MakeFMAHttpRequestService;


/**
 * Created by Shal on 08-08-2015.
 */
public class LocalBroadcastManagerUtil {

    private Context mContext;

    public LocalBroadcastManagerUtil(Context context) {
        this.mContext = context;
    }

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

        }
    };

    public void registerLocalBroadCastManager() {
        LocalBroadcastManager.getInstance(mContext).registerReceiver(broadcastReceiver, new IntentFilter(MakeFMAHttpRequestService.ARTIST_REQUEST_RECEIVER));
    }
}
