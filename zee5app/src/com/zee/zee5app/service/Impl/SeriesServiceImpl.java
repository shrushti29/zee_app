package com.zee.zee5app.service.Impl;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.repository.SeriesRepository2;
import com.zee.zee5app.repository.Impl.SeriesRepositoryImpl;
import com.zee.zee5app.service.SeriesService2;

public class SeriesServiceImpl implements SeriesService2 {
	
	private SeriesServiceImpl()
	{
		
	}
	
	private static SeriesService2 series;
	public static SeriesService2 getInstance()
	{
		if(series==null)
			series=new SeriesServiceImpl();
		return series;
	}
	SeriesRepository2 seriesservice=SeriesRepositoryImpl.getInstance();
	@Override
	public String addSeries(Series series) {
		// TODO Auto-generated method stub
		return seriesservice.addSeries(series);
	}

	@Override
	public String updateSeries(String id, Series series) {
		// TODO Auto-generated method stub
		return seriesservice.modifySeries(id, series);
	}

	@Override
	public Series getSeriesById(String id) {
		// TODO Auto-generated method stub
		return seriesservice.getSeriesById(id);
	}

	@Override
	public Series[] getAllSeries() {
		// TODO Auto-generated method stub
		return seriesservice.getSeries();
	}

	@Override
	public String deleteSeriesById(String id) {
		// TODO Auto-generated method stub
		return seriesservice.deleteSeriesById(id);
	}

}