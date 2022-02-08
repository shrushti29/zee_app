package com.zee.zee5_app.service.impl;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.naming.NameNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.zee5_app.dto.Movie;
import com.zee.zee5_app.dto.Register;
import com.zee.zee5_app.exception.AlreadyExistsException;
import com.zee.zee5_app.exception.IdNotFoundException;
import com.zee.zee5_app.exception.InvalidEmailException;
import com.zee.zee5_app.exception.InvalidIdLengthException;
import com.zee.zee5_app.exception.InvalidNameException;
import com.zee.zee5_app.exception.InvalidPasswordException;
import com.zee.zee5_app.service.MovieService;
import com.zee.zee5_app.repository.MovieRepository;
import com.zee.zee5_app.repository.UserRepository;

@Service
public class MovieServiceImpl implements MovieService {


	@Autowired
	private MovieRepository repository ;
	
	@Override
	@org.springframework.transaction.annotation.Transactional(rollbackFor = AlreadyExistsException.class)
	public Movie addMovie(Movie movie) {
		// TODO Auto-generated method stub
		repository.findById(movie.getMovieName());
		Movie movie2 = repository.save(movie);
		if (movie2 != null) {
			//return "record added in movie";
			return movie2;
		} else {
			return null;
		}
	}

	@Override
	public String deleteMovie(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Movie> optional;
		try {
			optional = this.getMovieById(id);
			if(optional.isEmpty()) {
				throw new IdNotFoundException("record not found");
			}
			else {
				repository.deleteById(id);
				return "movies record deleted";
			}
		} catch (IdNotFoundException | InvalidIdLengthException | NameNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new IdNotFoundException(e.getMessage());
		}
	}

	@Override
	public String modifyMovie(String id, Movie movie) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movie> getMovieById(String id) throws IdNotFoundException, NameNotFoundException, InvalidIdLengthException {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Optional<List<Movie>> getAllMovie() throws NameNotFoundException, InvalidIdLengthException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(repository.findAll());
	}
    

}