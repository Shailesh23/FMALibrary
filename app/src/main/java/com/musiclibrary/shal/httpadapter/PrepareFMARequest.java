package com.musiclibrary.shal.httpadapter;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.musiclibrary.shal.interfaces.MusicRestInterface;
import com.musiclibrary.shal.pojos.Artist;
import com.musiclibrary.shal.pojos.Genre;

import java.util.List;

import javax.inject.Inject;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

public class PrepareFMARequest {
    private final MusicRestInterface<?> api;
    private Gson gson;

    public PrepareFMARequest() {
        gson = new GsonBuilder().setFieldNamingPolicy(
                FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setConverter(new GsonConverter(gson))
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint("http://freemusicarchive.org/api").build();
        api = restAdapter.create(MusicRestInterface.class);
    }

    public List<Artist> getArtistList() {
        MusicFMAHttpRestAdapter fmaAdapter = new MusicFMAHttpRestAdapter(api);
        return fmaAdapter.getListOfArtist();
    }

    public List<Genre> getGenreList() {
        MusicFMAHttpRestAdapter fmaAdapter = new MusicFMAHttpRestAdapter(api);
        return fmaAdapter.getListOfGenre();
    }
}
