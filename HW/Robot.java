package Java_2_lesson_1.HW;

public class Robot implements Competitor{
    static int MAX_HEIGHT = 1;
    static int MAX_LENGTH = 100000;

    @Override
    public void run() {
        System.out.println("Робот бежит");

    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public boolean canPass(Obstacle o) {
        boolean canRun = (MAX_LENGTH >= o.getLENGTH());
        if (canRun & o.getLENGTH() != 0) {
            System.out.println("Робот справился с дистанцией");
        } else {
            System.out.println("Робот не справился с дистанцией");
            return false;
        }
        boolean canJump = (MAX_HEIGHT >= o.getHEIGHT());
        if (canJump & o.getHEIGHT() != 0) {
            System.out.println("Робот перепрыгнул препятствие");
        } else {
            System.out.println("Робот не перепрыгнул препятствие");
            return false;
        }
        return canRun && canJump;
    }
}
