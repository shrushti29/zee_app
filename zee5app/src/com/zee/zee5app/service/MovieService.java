package com.zee.zee5app.service;
import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.repository.MovieRepository;

public class MovieService {
	MovieRepository movierepo=MovieRepository.getInstance();
	private MovieService() {
		// TODO Auto-generated constructor stub
	}
	private static MovieService movieservice=null;
	public static MovieService getInstance()
	{
		if(movieservice==null)
			movieservice=new MovieService();
		return movieservice;
	}
	public String addMovie(Movies movie)
	{
		return this.movierepo.addMovie(movie);
	}
	public Movies getMovieById(String id)
	{
		return this.movierepo.getMovieById(id);
	}
	public Movies[] getAllUsers()
	{
		return this.movierepo.getMovies();
	}
	public String modifyMovie(String id,Movies movie)
	{
		return this.movierepo.modifyMovie(id, movie);
	}
}