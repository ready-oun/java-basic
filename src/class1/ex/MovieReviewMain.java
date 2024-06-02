package class1.ex;

public class MovieReviewMain {

    String title;
    String review;

    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReviewMain movie1 = new MovieReviewMain();
        movie1.title = "매드맥스 퓨리오사";
        movie1.review = "오늘 보기 전인데 벌써 재밌음";

        MovieReviewMain movie2 = new MovieReviewMain();
        movie2.title = "아는 영화가 없음 ㅈㅅ";
        movie2.review = "오늘 마사지 받았는데 짱임";

        MovieReviewMain movie3 = new MovieReviewMain();
        movie3.title = "매일은 아니더라도 매주는 받고 싶더라";
        movie3.review = "근데 많이 받아도 매달이 한계임 파산할 순 없잖아";

        // 배열 선언
        MovieReviewMain[] movies = new MovieReviewMain[]{movie1, movie2, movie3};

        // 영화 리뷰 정보 출력 - for문
        for (MovieReviewMain movie : movies)
            System.out.println("영화 제목 : " + movie.title
                                + " || 영화 리뷰: " + movie.review);

    }
}
