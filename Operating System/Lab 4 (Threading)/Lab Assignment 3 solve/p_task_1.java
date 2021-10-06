public class p_task_1 {
    public static void main(String[] args) {
        thread_01 a = new thread_01() ;
        a.start() ;  // a started in thread_01
    }
}

class thread_01 extends Thread {
    int j = 0 ;
    @Override
    public void run() {
        for ( int i = 1; i < 11; i++ ) {
            System.out.println(Thread.currentThread().getName() + "----------"+ i); // printing 1-10 with name of the thread which is printing them
            j = i ;  // j is here to start b (thread-2) when its value will be 10
        }
        if (j == 10){   // when value of j is 10 we  immediately start b in thread_02
            thread_02 b = new thread_02();
            b.start() ;
            try {
                b.join() ;    // thread_01 waits until b(thread_02) has finished
            } catch (InterruptedException e) {
                e.printStackTrace() ;
            }
        }
        for (int i =21; i<31; i++) {   // again a(thread_01) is running
            System.out.println(Thread.currentThread().getName() + "----------"+ i) ;  // printing 21-30 with name of the thread which is printing them
        }
    }
}


class thread_02 extends Thread {
    @Override
    public void run(){
        for (int i =11 ; i<=20 ; i++){
            System.out.println(Thread.currentThread().getName() + "----------"+ + i) ;   // printing 11-20 with name of the thread which is printing them
        }
    }
}

