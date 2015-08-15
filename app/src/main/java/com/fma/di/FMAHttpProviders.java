package com.fma.di;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.musiclibrary.shal.httpadapter.PrepareFMARequest;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shal on 14-07-2015.
 */
@Module
public class FMAHttpProviders {
    @Provides
    @Singleton
    public PrepareFMARequest provideFMARequest() {
        return new PrepareFMARequest();
    }

    @Provides
    @Singleton
    public Gson provideGson() {
        Gson gson =  new GsonBuilder().setFieldNamingPolicy(
                FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        return gson;
    }
}
