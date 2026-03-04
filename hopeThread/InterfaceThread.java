package org.example.hopeThread;

public class InterfaceThread implements Runnable{
    @Override
    public void run() {
        for ( int counter = 0 ; counter< 5 ; counter++)
        {
            IO.println("counter = " + counter);
        }
    }

    static void main() {
        new Thread(new InterfaceThread()).start();
        new Thread(new InterfaceThread()).start();
        new Thread(new InterfaceThread()).start();
    }
}
