package spring.project.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import spring.project.models.Movies;
import spring.project.repositories.MoviesRepository;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class MoviesController {
	
	@Autowired
    MoviesRepository repository;
	
	@CrossOrigin(origins = "http://localhost:8000")
	@RequestMapping(method=RequestMethod.GET, value="/movies")
	  public List<Movies> getAllMovies() {
	    return repository.findAll();
	  }
	
	 @RequestMapping(value = "/movies/{id}", method = RequestMethod.GET)
	  public Movies getMoviesById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }


}

