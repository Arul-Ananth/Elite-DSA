package org.example.hopeThread;

public class OverrideThread extends Thread{
    @Override
    public void run() {
        for (int counter = 0; counter < 5; counter++)
        {
            IO.println("counter = " + counter);
        }
    }

    static void main() {
        new OverrideThread().start();
        new OverrideThread().start();
        new OverrideThread().start();

    }
}
