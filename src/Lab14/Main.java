package Lab14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Movie> movies = new ArrayList<>();
//
//        movies.add(new Movie(2014,7.5,120,"Interstellar"));
//        movies.add(new Movie(2022,7,150,"Openheimer"));
//        movies.add(new Movie(2012,7,150,"Inception"));
//        movies.add(new Movie(2016,8,120,"Tanet"));
//
//
//        Collections.sort(movies, new SortMovieByYear());
//
//        for (Movie m: movies){
//            System.out.println(m.getYear()+" "+ m.getTitle() + " "+ m.getRating());
//        }




        int[] arr = { 5, 9, 3, 2, 4};
        List<Integer>fianalResult = Arrays.stream(arr)
                .map(value-> value*value)
                .filter(value -> value% 2 != 0)
                .sorted().boxed()
                .collect(Collectors.toList());

        for(Integer i: fianalResult){
            System.out.println(i+ " ");
        }
    }
}
