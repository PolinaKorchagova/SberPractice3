public class Philosophers implements Runnable {
    public final Object leftFork;
    public final Object rightFork;

    public Philosophers(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void Action(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep(0);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Action(" размышляет");
                synchronized (leftFork) {
                    Action(" взял левую вилку");
                    synchronized (rightFork) {
                        Action(" ест");
                        Action(" положил правую вилку");
                    }
                    Action(" размышляет");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}