package spring.project.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import spring.project.models.Movies;

public interface MoviesRepository extends MongoRepository<Movies, String> {
	Movies findBy_id(ObjectId _id);

	List<Movies> findAll();
	
}
