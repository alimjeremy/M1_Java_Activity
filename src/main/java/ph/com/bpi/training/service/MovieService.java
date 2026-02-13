package ph.com.bpi.training.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import ph.com.bpi.training.Main;
import ph.com.bpi.training.model.Movie;
import ph.com.bpi.training.repository.MovieRepository;
import ph.com.bpi.training.util.EntityManagerUtil;

public class MovieService {
	
	private static final Logger logger =  LoggerFactory.getLogger(Main.class);
	private EntityManager em = EntityManagerUtil.getInstance().createEntityManager();
	private MovieRepository movieRepository;
	
	public MovieService() {
		this.movieRepository = new MovieRepository(em);
	}
	
	public List<Movie> getAllMovies() {
		
		return movieRepository.findAll();
	}
	
	public Movie getMovieById(Long id) {
		return null;
	}
	
	public Movie createMovie(Movie movie) {
		
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			movie = movieRepository.save(movie);
			tx.commit();

		} catch (Exception e) {
			logger.error("Saving movie failed!");

		}
		return movie;
	}

}
