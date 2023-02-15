package com.bnta.spring_movies_lab.services;

import com.bnta.spring_movies_lab.models.Movie;
import com.bnta.spring_movies_lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService() {

    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).get();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getMoviesByMaxDuration(int maxDuration) {
        return movieRepository.findByDurationLessThan(maxDuration);
    }

}
