public class CounterExample {
    private static int counter = 0;

    public static void main(String[] args) {
        // Create two threads that increment the counter
        Thread thread1 = new Thread(new IncrementTask());
        Thread thread2 = new Thread(new IncrementTask());

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final counter value: " + counter);
    }

    static class IncrementTask implements Runnable {
        @Override
        public void run() {
            // Increment the counter in a synchronized block to ensure thread safety
            synchronized (CounterExample.class) {
                // Simulate some work in the critical section
                for (int i = 0; i < 100000; i++) {
                    counter++;
                }
            }
        }
    }
}