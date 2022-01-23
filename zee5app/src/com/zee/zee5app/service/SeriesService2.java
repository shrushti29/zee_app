package com.zee.zee5app.service;

import java.util.Optional;

import com.zee.zee5app.dto.Series;

import com.zee.zee5app.exception.*;

public interface SeriesService2 {
	public String addSeries(Series series);
	public String updateSeries(String id, Series series);
	public Optional<Series> getSeriesById(String id) throws SeriesNotFoundException;
	public Series[] getAllSeries();
	public String deleteSeriesById(String id) throws SeriesNotFoundException;
}