package Java_2_lesson_1.HW;

public class Cat implements Competitor{
    static int MAX_HEIGHT = 3;
    static int MAX_LENGTH = 100;

    @Override
    public void run() {
        System.out.println("Кот бежит");

    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (MAX_LENGTH >= o.getLENGTH());
        if (canRun) {
            System.out.println("Кот справился с дистанцией");
        } else {
            System.out.println("Кот не справился с дистанцией");
            return false;
        }
        boolean canJump = (MAX_HEIGHT >= o.getHEIGHT());
        if (canJump) {
            System.out.println("Кот перепрыгнул препятствие");
        } else {
            System.out.println("Кот не перепрыгнул препятствие");
            return false;
        }
        return canRun && canJump;
    }
}