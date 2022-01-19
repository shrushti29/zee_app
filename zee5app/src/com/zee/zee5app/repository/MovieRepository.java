package com.zee.zee5app.repository;
import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.dto.Register;
public class MovieRepository {
	
	private Movies[] movies=new Movies[1000];
	private static int count=0;
	
	public Movies[] getMovies()
	{
		return movies;
	}
	
	public String deleteMovieById(String id)
	{
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
	
	
	public String addMovie(Movies movie)
	{
		if(count==movies.length)
		{
			Movies temp[]=new Movies[movies.length*2];
			System.arraycopy(movies, 0, temp, 0, movies.length);
			movies=temp;
		}
		movies[count++]=movie;
		return "success";
	}
	
	public Movies getMovieById(String movieId)
	{
		for (Movies movie : movies) {
			if(movie!=null && movie.getMovieId().equals(movieId))
				return movie;
		}
		return null;
	}
	
	public String modifyMovie(String movieId,Movies movie)
	{
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
	private static MovieRepository repo;
	public static MovieRepository getInstance()
	{
		if(repo==null)
			repo=new MovieRepository();
		return repo;
}
}
