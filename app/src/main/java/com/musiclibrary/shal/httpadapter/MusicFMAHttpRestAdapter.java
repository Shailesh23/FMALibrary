package com.musiclibrary.shal.httpadapter;

import android.util.Log;

import java.util.List;

import com.musiclibrary.shal.interfaces.MusicRestInterface;
import com.musiclibrary.shal.pojos.Artist;
import com.musiclibrary.shal.pojos.Genre;
import com.musiclibrary.shal.pojos.MusicLibrary;

import retrofit.RetrofitError;

public class MusicFMAHttpRestAdapter {

	private final MusicRestInterface<?> api;

	public MusicFMAHttpRestAdapter(MusicRestInterface<?> api) {
		this.api = api;
	}

	public List<Artist> getListOfArtist() {
        try {
            MusicLibrary<Artist> artistInfoFromServer = api.getArtists();
            return artistInfoFromServer.getDataset();
        }catch (RetrofitError e){
            int value = e.getResponse().getStatus();
            e.printStackTrace();
        }
        return null;
	}

	public List<Genre> getListOfGenre() {
		MusicLibrary<Genre> artistInfoFromServer = api.getGenres();
		return artistInfoFromServer.getDataset();
	}
}
