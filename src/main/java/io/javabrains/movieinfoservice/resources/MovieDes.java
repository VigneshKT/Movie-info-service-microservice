package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/movie/desc")
public class MovieDes {

    @RequestMapping(path = "/{movieId}")
    public MovieInfo getMovieDes(@PathVariable("movieId") String movieId){
        return new MovieInfo(movieId,"Good");
    }
}
