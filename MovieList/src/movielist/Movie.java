/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielist;

/**
 *
 * @author Mr Porcupine
 */
public class Movie {
   private String movieName;
   private int movieYear;
   private String movieRating;
   private String movieRunTime;
public Movie (String movieName, int movieYear, String movieRating, String movieRunTime)
{
    this.movieYear = movieYear;
    this.movieRating = movieRating;
    this.movieRunTime = movieRunTime;
}

  public String toString()
    {
     return "Your favorite movie is " + movieName +
     "\nYour Movie was made in " + movieYear +
     "\nYour Movie was rated " + movieRating +
     "\nYour Movie the lenght of your movie is " + movieRunTime;       
     
    }

}
