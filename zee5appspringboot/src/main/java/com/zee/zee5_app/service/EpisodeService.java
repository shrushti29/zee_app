package com.zee.zee5_app.service;

import java.util.List;
import java.util.Optional;

import com.zee.zee5_app.dto.Episode;
import com.zee.zee5_app.exception.IdNotFoundException;

public interface EpisodeService {
	
	public String addEpisode(Episode episode);
	public Optional<Episode> getEpisodeById(String id);
	public Episode[] getAllEpisode();
	public String deleteEpisode(String id) throws IdNotFoundException;
	public Optional<List<Episode>> getAllEpisodeDetails();

}