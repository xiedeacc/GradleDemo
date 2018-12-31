package org.xyz.demo.Count;

public class Run {

    public static void main(String argv[]) {
        try {


            Service service = new Service();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    service.waitMethod();
                }
            };
            Thread a = new Thread(runnable);
            a.setName("A");
            a.start();

            Thread.sleep(500);
            Thread b = new Thread(runnable);
            b.setName("B");
            b.start();
            b.interrupt();
            System.out.println("main end");
        } catch (Exception e) {

        }
    }
}
