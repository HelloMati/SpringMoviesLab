package com.bnta.spring_movies_lab.repositories;

import com.bnta.spring_movies_lab.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
