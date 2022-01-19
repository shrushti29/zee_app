package com.zee.zee5app.repository.Impl;
import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.MovieRepository2;

public class MovieRepositoryImpl implements MovieRepository2 {
	private Movies[] movies=new Movies[1000];
	private static int count=0;
	
	private static MovieRepository2 repository;
	
	public static MovieRepository2 getInstance()
	{
		if(repository==null)
			repository=new MovieRepositoryImpl();
		return repository;
	}
	@Override
	public Movies[] getMovies() {
		// TODO Auto-generated method stub
		return movies;
	}

	@Override
	public String addMovie(Movies movie) {
		// TODO Auto-generated method stub
		if(count==movies.length)
		{
			Movies temp[]=new Movies[movies.length*2];
			System.arraycopy(movies, 0, temp, 0, movies.length);
			movies=temp;
		}
		movies[count++]=movie;
		return "success";
	}

	@Override
	public Movies getMovieById(String movieId) {
		// TODO Auto-generated method stub
		for (Movies movie : movies) {
			if(movie!=null && movie.getMovieId().equals(movieId))
				return movie;
		}
		return null;
	}

	@Override
	public String modifyMovie(String movieId, Movies movie) {
		// TODO Auto-generated method stub
		for(Movies movie1:movies)
		{
			if(movie1!=null && movie1.getMovieId().equals(movieId))
			{
				movie1=movie;
				return "success";
			}
		}
		return "id does not exist";
	}
	@Override
	public String deleteMovieById(String id) {
		// TODO Auto-generated method stub
		Movies[] temp=new Movies[movies.length];
		boolean flag=false;
		for(int i=0,k=0;i<movies.length;i++)
		{
			if(movies[i]!=null && movies[i].getMovieId().equals(id))
			{
				flag=true;
				continue;
			}
			else
			{
				temp[k++]=movies[i];
			}
		}
		movies=temp;
		return flag?"success":"id was not available";
	}

}