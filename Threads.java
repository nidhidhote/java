public class Threads {
    public static void main(String[] args) {
//        System.out.println("Hello world");

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am a runnable task ");
            }
        };
//        task.run();
        Thread thread = new Thread(task);
        thread.start();


    }
}
