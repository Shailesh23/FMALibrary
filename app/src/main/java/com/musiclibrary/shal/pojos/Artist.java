package com.musiclibrary.shal.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Artist implements Serializable {

    @SerializedName("artist_id")
    @Expose
    private String artistId;
    @SerializedName("artist_handle")
    @Expose
    private String artistHandle;
    @SerializedName("artist_url")
    @Expose
    private String artistUrl;
    @SerializedName("artist_name")
    @Expose
    private String artistName;
    @SerializedName("artist_bio")
    @Expose
    private Object artistBio;
    @SerializedName("artist_members")
    @Expose
    private Object artistMembers;
    @SerializedName("artist_website")
    @Expose
    private Object artistWebsite;
    @SerializedName("artist_wikipedia_page")
    @Expose
    private Object artistWikipediaPage;
    @SerializedName("artist_donation_url")
    @Expose
    private Object artistDonationUrl;
    @SerializedName("artist_contact")
    @Expose
    private Object artistContact;
    @SerializedName("artist_active_year_begin")
    @Expose
    private Object artistActiveYearBegin;
    @SerializedName("artist_active_year_end")
    @Expose
    private Object artistActiveYearEnd;
    @SerializedName("artist_related_projects")
    @Expose
    private Object artistRelatedProjects;
    @SerializedName("artist_associated_labels")
    @Expose
    private Object artistAssociatedLabels;
    @SerializedName("artist_comments")
    @Expose
    private String artistComments;
    @SerializedName("artist_favorites")
    @Expose
    private String artistFavorites;
    @SerializedName("artist_date_created")
    @Expose
    private String artistDateCreated;
    @SerializedName("artist_flattr_name")
    @Expose
    private Object artistFlattrName;
    @SerializedName("artist_paypal_name")
    @Expose
    private Object artistPaypalName;
    @SerializedName("artist_latitude")
    @Expose
    private Object artistLatitude;
    @SerializedName("artist_longitude")
    @Expose
    private Object artistLongitude;
    @SerializedName("artist_image_file")
    @Expose
    private String artistImageFile;
    @SerializedName("artist_location")
    @Expose
    private Object artistLocation;
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("artist_images")
    @Expose
    private List<ArtistImage> artistImages = new ArrayList<ArtistImage>();

    /**
     * @return The artistId
     */
    public String getArtistId() {
        return artistId;
    }

    /**
     * @param artistId The artist_id
     */
    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    /**
     * @return The artistHandle
     */
    public String getArtistHandle() {
        return artistHandle;
    }

    /**
     * @param artistHandle The artist_handle
     */
    public void setArtistHandle(String artistHandle) {
        this.artistHandle = artistHandle;
    }

    /**
     * @return The artistUrl
     */
    public String getArtistUrl() {
        return artistUrl;
    }

    /**
     * @param artistUrl The artist_url
     */
    public void setArtistUrl(String artistUrl) {
        this.artistUrl = artistUrl;
    }

    /**
     * @return The artistName
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @param artistName The artist_name
     */
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    /**
     * @return The artistBio
     */
    public Object getArtistBio() {
        return artistBio;
    }

    /**
     * @param artistBio The artist_bio
     */
    public void setArtistBio(Object artistBio) {
        this.artistBio = artistBio;
    }

    /**
     * @return The artistMembers
     */
    public Object getArtistMembers() {
        return artistMembers;
    }

    /**
     * @param artistMembers The artist_members
     */
    public void setArtistMembers(Object artistMembers) {
        this.artistMembers = artistMembers;
    }

    /**
     * @return The artistWebsite
     */
    public Object getArtistWebsite() {
        return artistWebsite;
    }

    /**
     * @param artistWebsite The artist_website
     */
    public void setArtistWebsite(Object artistWebsite) {
        this.artistWebsite = artistWebsite;
    }

    /**
     * @return The artistWikipediaPage
     */
    public Object getArtistWikipediaPage() {
        return artistWikipediaPage;
    }

    /**
     * @param artistWikipediaPage The artist_wikipedia_page
     */
    public void setArtistWikipediaPage(Object artistWikipediaPage) {
        this.artistWikipediaPage = artistWikipediaPage;
    }

    /**
     * @return The artistDonationUrl
     */
    public Object getArtistDonationUrl() {
        return artistDonationUrl;
    }

    /**
     * @param artistDonationUrl The artist_donation_url
     */
    public void setArtistDonationUrl(Object artistDonationUrl) {
        this.artistDonationUrl = artistDonationUrl;
    }

    /**
     * @return The artistContact
     */
    public Object getArtistContact() {
        return artistContact;
    }

    /**
     * @param artistContact The artist_contact
     */
    public void setArtistContact(Object artistContact) {
        this.artistContact = artistContact;
    }

    /**
     * @return The artistActiveYearBegin
     */
    public Object getArtistActiveYearBegin() {
        return artistActiveYearBegin;
    }

    /**
     * @param artistActiveYearBegin The artist_active_year_begin
     */
    public void setArtistActiveYearBegin(Object artistActiveYearBegin) {
        this.artistActiveYearBegin = artistActiveYearBegin;
    }

    /**
     * @return The artistActiveYearEnd
     */
    public Object getArtistActiveYearEnd() {
        return artistActiveYearEnd;
    }

    /**
     * @param artistActiveYearEnd The artist_active_year_end
     */
    public void setArtistActiveYearEnd(Object artistActiveYearEnd) {
        this.artistActiveYearEnd = artistActiveYearEnd;
    }

    /**
     * @return The artistRelatedProjects
     */
    public Object getArtistRelatedProjects() {
        return artistRelatedProjects;
    }

    /**
     * @param artistRelatedProjects The artist_related_projects
     */
    public void setArtistRelatedProjects(Object artistRelatedProjects) {
        this.artistRelatedProjects = artistRelatedProjects;
    }

    /**
     * @return The artistAssociatedLabels
     */
    public Object getArtistAssociatedLabels() {
        return artistAssociatedLabels;
    }

    /**
     * @param artistAssociatedLabels The artist_associated_labels
     */
    public void setArtistAssociatedLabels(Object artistAssociatedLabels) {
        this.artistAssociatedLabels = artistAssociatedLabels;
    }

    /**
     * @return The artistComments
     */
    public String getArtistComments() {
        return artistComments;
    }

    /**
     * @param artistComments The artist_comments
     */
    public void setArtistComments(String artistComments) {
        this.artistComments = artistComments;
    }

    /**
     * @return The artistFavorites
     */
    public String getArtistFavorites() {
        return artistFavorites;
    }

    /**
     * @param artistFavorites The artist_favorites
     */
    public void setArtistFavorites(String artistFavorites) {
        this.artistFavorites = artistFavorites;
    }

    /**
     * @return The artistDateCreated
     */
    public String getArtistDateCreated() {
        return artistDateCreated;
    }

    /**
     * @param artistDateCreated The artist_date_created
     */
    public void setArtistDateCreated(String artistDateCreated) {
        this.artistDateCreated = artistDateCreated;
    }

    /**
     * @return The artistFlattrName
     */
    public Object getArtistFlattrName() {
        return artistFlattrName;
    }

    /**
     * @param artistFlattrName The artist_flattr_name
     */
    public void setArtistFlattrName(Object artistFlattrName) {
        this.artistFlattrName = artistFlattrName;
    }

    /**
     * @return The artistPaypalName
     */
    public Object getArtistPaypalName() {
        return artistPaypalName;
    }

    /**
     * @param artistPaypalName The artist_paypal_name
     */
    public void setArtistPaypalName(Object artistPaypalName) {
        this.artistPaypalName = artistPaypalName;
    }

    /**
     * @return The artistLatitude
     */
    public Object getArtistLatitude() {
        return artistLatitude;
    }

    /**
     * @param artistLatitude The artist_latitude
     */
    public void setArtistLatitude(Object artistLatitude) {
        this.artistLatitude = artistLatitude;
    }

    /**
     * @return The artistLongitude
     */
    public Object getArtistLongitude() {
        return artistLongitude;
    }

    /**
     * @param artistLongitude The artist_longitude
     */
    public void setArtistLongitude(Object artistLongitude) {
        this.artistLongitude = artistLongitude;
    }

    /**
     * @return The artistImageFile
     */
    public String getArtistImageFile() {
        return artistImageFile;
    }

    /**
     * @param artistImageFile The artist_image_file
     */
    public void setArtistImageFile(String artistImageFile) {
        this.artistImageFile = artistImageFile;
    }

    /**
     * @return The artistLocation
     */
    public Object getArtistLocation() {
        return artistLocation;
    }

    /**
     * @param artistLocation The artist_location
     */
    public void setArtistLocation(Object artistLocation) {
        this.artistLocation = artistLocation;
    }

    /**
     * @return The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * @return The artistImages
     */
    public List<ArtistImage> getArtistImages() {
        return artistImages;
    }

    /**
     * @param artistImages The artist_images
     */
    public void setArtistImages(List<ArtistImage> artistImages) {
        this.artistImages = artistImages;
    }

}