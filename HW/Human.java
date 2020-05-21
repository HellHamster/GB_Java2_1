package Java_2_lesson_1.HW;

public class Human implements Competitor{
    static int MAX_HEIGHT = 2;
    static int MAX_LENGTH = 2000;

    @Override
    public void run() {
        System.out.println("Человек бежит");

    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (MAX_LENGTH >= o.getLENGTH());
        if (canRun){
            System.out.println("Человек справился с дистанцией");
        } else {
            System.out.println("Человек не справился с дистанцией");
            return false;
        }
        boolean canJump = (MAX_HEIGHT >= o.getHEIGHT());
        if (canJump) {
            System.out.println("Человек перепрыгнул препятствие");
        } else {
            System.out.println("Человек не перепрыгнул препятствие");
            return false;
        }
        return canRun && canJump;
    }
}
