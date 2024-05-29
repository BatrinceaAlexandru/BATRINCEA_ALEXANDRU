package homework_nr_17;

public class Main {
    public static void main ( String[] args ) {

        Runnable runnableObject0 = () -> {
            String color = ColorConstants.ANSI_RED;
            printLetters( color );
        };
        Runnable runnableObject1 = () -> {
            String color = ColorConstants.ANSI_BLUE;
            printLetters( color );
        };
        Runnable runnableObject2 = () -> {
            String color = ColorConstants.ANSI_GREEN;
            printAnything( color );
        };
        Runnable runnableObject3 = () -> {
            String color = ColorConstants.ANSI_PURPLE;
            printAnything( color );
        };


        Thread t0 = new Thread(runnableObject0);
        Thread t1 = new Thread(runnableObject1);
        Thread t2 = new Thread(runnableObject2);
        Thread t3 = new Thread(runnableObject3);

        t0.start();
        t0.interrupt();
        t1.start();

        t2.start();
        t3.start();

    }

    public static synchronized void printLetters ( String color ) {
        for (char i = 'A'; i <= 'Z'; i++) {
            try {
                Thread.sleep( 5 );
            } catch (InterruptedException e) {
                throw new RuntimeException( Thread.currentThread().getName() + "I was interrupted!" );
            }
            System.out.println( color + i + " " + Thread.currentThread().getName() );
        }
    }

    public static void printAnything ( String color ) {
        System.out.println( color + Thread.currentThread().getName() + " I am  going to sleep!" );
        try {
            Thread.sleep( 5000 );
        } catch (InterruptedException e) {
            throw new RuntimeException( e );
        }
        System.out.println(color + "Hello from " + Thread.currentThread().getName() + " I slept perfectly!");
    }
}
