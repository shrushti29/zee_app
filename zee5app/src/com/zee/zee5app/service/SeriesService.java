package com.zee.zee5app.service;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.repository.SeriesRepository;

public class SeriesService {
	SeriesRepository seriesrepo=SeriesRepository.getInstance();
	private SeriesService() {
		// TODO Auto-generated constructor stub
	}
	private static SeriesService seriesservice=null;
	public static SeriesService getInstance()
	{
		if(seriesservice==null)
			seriesservice=new SeriesService();
		return seriesservice;
	}
	public String addSeries(Series serie)
	{
		return this.seriesrepo.addSeries(serie);
	}
	public Series getSeriesById(String id)
	{
		return this.seriesrepo.getSeriesById(id);
	}
	public Series[] getAllUsers()
	{
		return this.seriesrepo.getSeries();
	}
	public String modifySeries(String id,Series serie)
	{
		return this.seriesrepo.modifySeries(id, serie);
	}
}