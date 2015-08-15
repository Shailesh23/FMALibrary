package com.fma.di;

import android.content.Context;

import com.fma.utils.LocalBroadcastManagerUtil;
import com.google.gson.Gson;
import com.musiclibrary.shal.httpadapter.PrepareFMARequest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shal on 02-08-2015.
 */
public class DaggerComponents {
    @Singleton
    @Component(modules = {FMAHttpProviders.class})
    public interface FMARequest {
        PrepareFMARequest provideFMARequest();
    }

    @Singleton
    @Component(modules = (UtilProviders.class))
    public interface LocalBroadCastProvider {
        LocalBroadcastManagerUtil provideLocalBroadCastManagerUtilObj(Context context);
    }
}
