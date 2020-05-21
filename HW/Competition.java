package Java_2_lesson_1.HW;

public class Competition {
    static Competitor[] competitors = {new Human(), new Cat(), new Robot()};
    static Obstacle [] obstacles = {new Wall(2),
            new Threadmill(90),
            new Threadmill(1000)};

    public static void main (String[] args) {
        for(Competitor competitor: competitors) {
            for (Obstacle obstacle: obstacles) {
                boolean canPass = competitor.canPass(obstacle);
                if (!canPass) break;
            }
        }
    }
}
