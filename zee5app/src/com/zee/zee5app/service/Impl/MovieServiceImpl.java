package com.zee.zee5app.service.Impl;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.repository.MovieRepository2;
import com.zee.zee5app.repository.Impl.MovieRepositoryImpl;
import com.zee.zee5app.service.MovieService2;

public class MovieServiceImpl implements MovieService2 {
	
	private MovieServiceImpl(){
		
	}
	private static MovieService2 movieservice;
	public static MovieService2 getInstance()
	{
		if(movieservice==null)
			movieservice=new MovieServiceImpl();
		return movieservice;
	}
	MovieRepository2 movierepository=MovieRepositoryImpl.getInstance();
	@Override
	public String addMovie(Movies movie) {
		// TODO Auto-generated method stub
		return movierepository.addMovie(movie);
	}

	@Override
	public String updateMovie(String id, Movies movie) {
		// TODO Auto-generated method stub
		return movierepository.modifyMovie(id, movie);
	}

	@Override
	public Movies getMovieById(String id) {
		// TODO Auto-generated method stub
		return movierepository.getMovieById(id);
	}

	@Override
	public Movies[] getAllMovies() {
		// TODO Auto-generated method stub
		return movierepository.getMovies();
	}

	@Override
	public String deleteMovieById(String id) {
		// TODO Auto-generated method stub
		return movierepository.deleteMovieById(id);
	}

}