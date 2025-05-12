package collections;

import java.util.ArrayList;

public class MovieSystem {

    public static void main(String[] args) {
        // ArrayList 사용해 보기
        ArrayList<Movie> movies = new ArrayList();

        movies.add(new Movie("범죄도시 4", 5));
        movies.add(new Movie("기생충", 5));
        movies.add(new Movie("올드보이", 4));
        movies.add(new Movie("귀궁", 3));
        movies.add(new Movie("파일럿", 3));

        // 순회 하면서 자료구조 안에 있는 영화 제목들만 출력 하자.
        for(int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).getTitle());
        }


        System.out.println("---------------------");
        // 초기화 for 구문
        for ( Movie m :  movies) {
            System.out.println(m.getTitle());
        }



    } // end of main

} // end of class


class Movie {

    private String title;
    private int rating;

    public Movie(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}


