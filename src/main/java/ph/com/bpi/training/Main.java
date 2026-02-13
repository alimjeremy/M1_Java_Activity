package ph.com.bpi.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import ph.com.bpi.training.controller.MovieController;
import ph.com.bpi.training.service.MovieService;
import static spark.Spark.*;


public class Main {
	
	private static final Logger logger =  LoggerFactory.getLogger(Main.class);
	private static final ObjectMapper mapper = new ObjectMapper();
	 
    public static void main(String[] args) {
    	
    	 // Start server on port 4567 (default)
        port(4567);
        
        // Routes
    	MovieService moverService = new MovieService();
    	MovieController movieController = new MovieController(moverService);
    	movieController.registerRoutes();
    }
    
    

}
