package com.qopuir.restapi.core.entities;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Podcast entity")
@XmlRootElement
public class Podcast implements Serializable {
	private static final long serialVersionUID = -9211515241781842759L;

	private Long id;
	private String title;
	private String linkOnPodcastpedia;
	private String feed;
	private String description;
	private Date insertionDate;

	public Podcast() {
	}

	public Podcast(String title, String linkOnPodcastpedia, String feed, String description) {
		this.title = title;
		this.linkOnPodcastpedia = linkOnPodcastpedia;
		this.feed = feed;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ApiModelProperty(value = "Podcast Tile", required = true)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLinkOnPodcastpedia() {
		return linkOnPodcastpedia;
	}

	public void setLinkOnPodcastpedia(String linkOnPodcastpedia) {
		this.linkOnPodcastpedia = linkOnPodcastpedia;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(Date insertionDate) {
		this.insertionDate = insertionDate;
	}
}