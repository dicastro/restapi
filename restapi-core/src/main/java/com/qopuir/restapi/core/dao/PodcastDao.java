package com.qopuir.restapi.core.dao;

import java.util.List;

import com.qopuir.restapi.core.entities.Podcast;

public interface PodcastDao {
	List<Podcast> getPodcasts();

	Podcast getPodcastById(Long id);

	Long deletePodcastById(Long id);

	Long createPodcast(Podcast podcast);

	int updatePodcast(Podcast podcast);

	void deletePodcasts();
}