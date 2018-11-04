package spring.project.models;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movie")
public class Movies {
	@Id
	public Object _id;
	String director_name;
	String reviews;
	String duration;
	String likes;
	String gross;
	String genres; 
	String actor_name;
	String movie_title;
	String voted_users;
	String language;
	String country;
	String budget;
	String year;
	String imdb_score;
	public Movies(Object _id, String director_name, String reviews, String duration, String likes, String gross,
			String genres, String actor_name, String movie_title, String voted_users, String language, String country,
			String budget, String year, String imdb_score) {
		super();
		this._id = _id;
		this.director_name = director_name;
		this.reviews = reviews;
		this.duration = duration;
		this.likes = likes;
		this.gross = gross;
		this.genres = genres;
		this.actor_name = actor_name;
		this.movie_title = movie_title;
		this.voted_users = voted_users;
		this.language = language;
		this.country = country;
		this.budget = budget;
		this.year = year;
		this.imdb_score = imdb_score;
	}
	public Object get_id() {
		return _id.toString();
	}
	public void set_id(Object _id) {
		this._id = _id;
	}
	public String getDirector_name() {
		return director_name;
	}
	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	public String getGross() {
		return gross;
	}
	public void setGross(String gross) {
		this.gross = gross;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public String getActor_name() {
		return actor_name;
	}
	public void setActor_name(String actor_name) {
		this.actor_name = actor_name;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getVoted_users() {
		return voted_users;
	}
	public void setVoted_users(String voted_users) {
		this.voted_users = voted_users;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getImdb_score() {
		return imdb_score;
	}
	public void setImdb_score(String imdb_score) {
		this.imdb_score = imdb_score;
	}
	

	
}