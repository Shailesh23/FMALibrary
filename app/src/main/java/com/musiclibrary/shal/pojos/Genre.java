package com.musiclibrary.shal.pojos;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Genre {

	@SerializedName("genre_id")
	@Expose
	private String genreId;
	@SerializedName("genre_parent_id")
	@Expose
	private Object genreParentId;
	@SerializedName("genre_title")
	@Expose
	private String genreTitle;
	@SerializedName("genre_handle")
	@Expose
	private String genreHandle;
	@SerializedName("genre_color")
	@Expose
	private String genreColor;

	/**
	 * 
	 * @return The genreId
	 */
	public String getGenreId() {
		return genreId;
	}

	/**
	 * 
	 * @param genreId
	 *            The genre_id
	 */
	public void setGenreId(String genreId) {
		this.genreId = genreId;
	}

	/**
	 * 
	 * @return The genreParentId
	 */
	public Object getGenreParentId() {
		return genreParentId;
	}

	/**
	 * 
	 * @param genreParentId
	 *            The genre_parent_id
	 */
	public void setGenreParentId(Object genreParentId) {
		this.genreParentId = genreParentId;
	}

	/**
	 * 
	 * @return The genreTitle
	 */
	public String getGenreTitle() {
		return genreTitle;
	}

	/**
	 * 
	 * @param genreTitle
	 *            The genre_title
	 */
	public void setGenreTitle(String genreTitle) {
		this.genreTitle = genreTitle;
	}

	/**
	 * 
	 * @return The genreHandle
	 */
	public String getGenreHandle() {
		return genreHandle;
	}

	/**
	 * 
	 * @param genreHandle
	 *            The genre_handle
	 */
	public void setGenreHandle(String genreHandle) {
		this.genreHandle = genreHandle;
	}

	/**
	 * 
	 * @return The genreColor
	 */
	public String getGenreColor() {
		return genreColor;
	}

	/**
	 * 
	 * @param genreColor
	 *            The genre_color
	 */
	public void setGenreColor(String genreColor) {
		this.genreColor = genreColor;
	}

}