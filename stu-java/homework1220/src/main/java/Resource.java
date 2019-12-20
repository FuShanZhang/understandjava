public class Resource {


    private Integer i = 0;
    private Integer count1 = 3;
    private Integer count2 = 1;
    private boolean k = true;
    private boolean m = true;



    public synchronized void add() throws InterruptedException {

        //lock.unlock();
        if (((i == 0 || ( i>0 &&count1%4 == 0)) && k) || ((i == -2 || (i<0)&&(count2%4 == 0)) && m) ) {
            this.i++;
            count1++;
            count2++;

            System.out.println(Thread.currentThread().getName() + "加1  当前i有" + i);
            notifyAll();
            wait();
        }
        if(i>0){
            m=false;
        }
        //lock.lock();
        /*if(i > 0){
            k=f;
        }*/
    }

    public synchronized void reduce() throws InterruptedException {
        //Thread.sleep((int) (Math.random() * 1000));

        if (((i == 2 || (i>0 &&count2 %4 == 0)) && k) || ((i == 0 || (i<0)&&(count1%4 == 0)) && m)  ) {
            this.i--;
            count2++;
            count1++;

            System.out.println(Thread.currentThread().getName() + "减1  当前i有" + i);
            notifyAll();
            wait();
            //lock2.lock();
        }
        if(i<0){
            k=false;
        }

    }

}

class Product extends Thread {
    Resource resource;


    public Product(Resource resource) {
        this.resource = resource;
    }

    @Override
    public   void run() {
            try {
                Thread.sleep((int) (Math.random() * 1000));
                resource.add();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        run();
    }
}

class Consumer extends Thread {
    Resource resource;

    public Consumer(Resource resource) {
        this.resource = resource;
    }

    @Override
    public  void run() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
                resource.reduce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        run();

    }
}

class Test {


    public static void main(String[] args) {
        Resource resource = new Resource();


        Thread p01 = new Product(resource);
        Thread p02 = new Product(resource);

        Thread c01 = new Consumer(resource);
        Thread c02 = new Consumer(resource);



        p01.start();
        p02.start();

        c01.start();
        c02.start();


    }
}

/*class Products extends Thread{

    Resource resource;

    public Products(Resource resource) {
        this.resource = resource;
    }
    */

//}

