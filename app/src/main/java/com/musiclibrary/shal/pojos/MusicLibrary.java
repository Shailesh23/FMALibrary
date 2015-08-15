package com.musiclibrary.shal.pojos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MusicLibrary<T> {

	private String title;
	private String message;
	private List<Object> errors = new ArrayList<Object>();
	private String total;
	private long totalPages;
	private long page;
	private String limit;
	private List<T> dataset = new ArrayList<T>();
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public MusicLibrary<T> withTitle(String title) {
		this.title = title;
		return this;
	}

	/**
	 * 
	 * @return The message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 *            The message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public MusicLibrary<T> withMessage(String message) {
		this.message = message;
		return this;
	}

	/**
	 * 
	 * @return The errors
	 */
	public List<Object> getErrors() {
		return errors;
	}

	/**
	 * 
	 * @param errors
	 *            The errors
	 */
	public void setErrors(List<Object> errors) {
		this.errors = errors;
	}

	public MusicLibrary<T> withErrors(List<Object> errors) {
		this.errors = errors;
		return this;
	}

	/**
	 * 
	 * @return The total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * 
	 * @param total
	 *            The total
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	public MusicLibrary<T> withTotal(String total) {
		this.total = total;
		return this;
	}

	/**
	 * 
	 * @return The totalPages
	 */
	public long getTotalPages() {
		return totalPages;
	}

	/**
	 * 
	 * @param totalPages
	 *            The total_pages
	 */
	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}

	public MusicLibrary<T> withTotalPages(long totalPages) {
		this.totalPages = totalPages;
		return this;
	}

	/**
	 * 
	 * @return The page
	 */
	public long getPage() {
		return page;
	}

	/**
	 * 
	 * @param page
	 *            The page
	 */
	public void setPage(long page) {
		this.page = page;
	}

	public MusicLibrary<T> withPage(long page) {
		this.page = page;
		return this;
	}

	/**
	 * 
	 * @return The limit
	 */
	public String getLimit() {
		return limit;
	}

	/**
	 * 
	 * @param limit
	 *            The limit
	 */
	public void setLimit(String limit) {
		this.limit = limit;
	}

	public MusicLibrary<T> withLimit(String limit) {
		this.limit = limit;
		return this;
	}

	/**
	 * 
	 * @return The dataset
	 */
	public List<T> getDataset() {
		return dataset;
	}

	/**
	 * 
	 * @param dataset
	 *            The dataset
	 */
	public void setDataset(List<T> dataset) {
		this.dataset = dataset;
	}

	public MusicLibrary<T> withDataset(List<T> dataset) {
		this.dataset = dataset;
		return this;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public MusicLibrary<T> withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}
}