package com.fma.di;

import android.content.Context;

import com.fma.utils.LocalBroadcastManagerUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shal on 08-08-2015.
 */
@Module
public class UtilProviders {

    @Provides @Singleton
    public LocalBroadcastManagerUtil providesLocalBroadcastManagerUtil(Context context) {
        return new LocalBroadcastManagerUtil(context);
    }
}
