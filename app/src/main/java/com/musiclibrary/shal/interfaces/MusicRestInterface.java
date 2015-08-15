package com.musiclibrary.shal.interfaces;

import com.musiclibrary.shal.pojos.Artist;
import com.musiclibrary.shal.pojos.Genre;
import com.musiclibrary.shal.pojos.MusicLibrary;

import retrofit.Callback;
import retrofit.http.GET;

public interface MusicRestInterface<T> {

	@GET("/get/artists.json/7Y8CNHXREY4GJ9W6")
	MusicLibrary<Artist> getArtists();

	@GET("/get/genres.json/7Y8CNHXREY4GJ9W6")
	MusicLibrary<Genre> getGenres();

}