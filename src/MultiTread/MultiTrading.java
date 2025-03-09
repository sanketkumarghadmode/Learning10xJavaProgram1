package MultiTread;

public class MultiTrading {


    public static void main(String[] args) {

      ThreadGroup threadGroup = new ThreadGroup("Threads");

        Thread1 th = new Thread1(threadGroup,"T1");
          th.start();


         Thread1 th1 = new Thread1(threadGroup,"T2");
        th1.start();



        for (int i =0; i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 extends Thread {

Thread1(ThreadGroup threadGroup, String name)
{
    super(threadGroup,name);
}

    @Override
    public void run() {


        for (int i =0; i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }


    }
}