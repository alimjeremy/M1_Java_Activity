package ph.com.bpi.training.controller;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import ph.com.bpi.training.model.Movie;
import ph.com.bpi.training.service.MovieService;
import ph.com.bpi.training.util.JsonUtil;

public class MovieController {

	private MovieService movieService;

	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	public void registerRoutes() {

		get("/movies", (req, res) -> {
			res.type("application/json");

			Map<String, Object> response = new HashMap<>();
			response.put("status", "Successful");
			response.put("Data", this.movieService.getAllMovies());
			return JsonUtil.toJson(response);
		});

		// Create Profile List
		post("/movies", (req, res) -> {
			Map<String, Object> response = new HashMap<>();
			Movie movie = JsonUtil.fromJson(req.body(), Movie.class);
			response.put("status", "SUCCESS");
			response.put("data", this.movieService.createMovie(movie));
			
			return JsonUtil.toJson(response);
		});
	}
}
