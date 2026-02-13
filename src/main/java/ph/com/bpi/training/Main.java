package ph.com.bpi.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;


public class Main {
	
	private static final Logger logger =  LoggerFactory.getLogger(Main.class);
	private static final ObjectMapper mapper = new ObjectMapper();
	 
    public static void main(String[] args) {
    	// intialize entityManager;
        EntityManager em = EntityManagerUtil.getInstance().createEntityManager();
    	
        // initialize movieRepository
    	MovieRepository movieRepository = new MovieRepository(em);
    	
    	 // Start server on port 4567 (default)
        port(4567);
        
        // add routes here

        // Get Profile List
        get("/movies", (req, res) -> {
        	res.type("application/json");
        	
        	Map<String, Object> response = new HashMap<>();
        	List<Movie> movies = new ArrayList<>();
        	movies.add( new Movie(1L, "The Avengers", "Joss Whedon", "2012-05-04"));
        	movies.add( new Movie(2L, "300", "Zack Snyder", "2007-03-09"));
        	response.put("Data", movies);
        	return JsonUtil.toJson(response);
        });
               
        // Create Profile List
        post("/movies", (req, res) -> {
        	res.type("application/json");
        	return req.body();
        });
    }
    
    

}
