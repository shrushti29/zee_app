package com.zee.zee5app.repository;
import com.zee.zee5app.dto.Movies;
public interface MovieRepository2 {
	public Movies[] getMovies();
	public String addMovie(Movies movie);
	public Movies getMovieById(String movieId);
	public String modifyMovie(String movieId,Movies movie);
	public String deleteMovieById(String id);

}
