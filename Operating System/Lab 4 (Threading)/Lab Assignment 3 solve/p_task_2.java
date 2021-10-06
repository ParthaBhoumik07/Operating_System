class thread_1 extends Thread { // thread_1 checking from 1-10000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {  // finding divisors
            int count_divisor = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    ++count_divisor;  // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {  // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {   // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_2 extends Thread {  // thread_2 checking from 10001-20000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 10001; i <= 20000; i++) {   // finding divisors
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {   // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {    // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}

class thread_3 extends Thread {     // thread_3 checking from 20001-30000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 20001; i <= 30000; i++) {
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;    // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {   // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {     // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_4 extends Thread {  // thread_4 checking from 30001-40000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 30001; i <= 40000; i++) {
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {    // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {   // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_5 extends Thread {   // thread_5 checking from 40001-50000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 40001; i <= 50000; i++) {
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {   // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {   // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_6 extends Thread {   // thread_6 checking from 50001-60000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 50001; i <= 60000; i++) {
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {    // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {    // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_7 extends Thread {   // thread_7 checking from 60001-70000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 60001; i <= 70000; i++) {
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {    // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {    // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_8 extends Thread {   // thread_8 checking from 70001-80000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 70001; i <= 80000; i++) {
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {    // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {    // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_9 extends Thread {   // thread_9 checking from 80001-90000
    int max_number_of_divisors = 1 , number = 1 ;
    @Override
    public void run() {
        for (int i = 80001 ; i <= 90000 ; i++) {
            int count_divisor = 0 ;
            for (int j = 1 ; j <= i ; j++) {
                if (i % j == 0 ) {
                    ++count_divisor ;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {     // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }
    public int[] arrayReturn() {    // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


class thread_10 extends Thread {    // thread_10 checking from 90001-100000
    int max_number_of_divisors = 1, number = 1;
    @Override
    public void run() {
        for (int i = 90001; i <= 100000; i++) {
            int count_divisor = 0;
            for (int j = 1 ; j <= i; j++) {
                if (i % j == 0 ) {
                    ++count_divisor;   // counting divisors
                }
            }
            if (count_divisor > max_number_of_divisors) {    // determining max divisors
                max_number_of_divisors = count_divisor;
                number = i;
            }
        }
    }

    public int[] arrayReturn() {    // returning number and max divisors
        int array[] = { max_number_of_divisors, number };
        return array;
    }
}


public class p_task_2 {
    public static void main(String[] args) {

        int[] ab = new int[20];    //  initializing array to store numbers and their divisors
                                  //  as each thread will have 1 number and 1 divisor from each thread so total will be ( 2 * 10 ) = 20 .Thus array length is 20

        thread_1 a = new thread_1();
        a.start();

        thread_2 b = new thread_2();
        b.start();

        thread_3 c = new thread_3();
        c.start();

        thread_4 d = new thread_4();
        d.start();

        thread_5 e = new thread_5();
        e.start();

        thread_6 f = new thread_6();
        f.start();

        thread_7 g = new thread_7();
        g.start();

        thread_8 h = new thread_8();
        h.start();

        thread_9 i = new thread_9();
        i.start();

        thread_10 j = new thread_10();
        j.start();



        try {
            a.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }

        int[] a_1 = a.arrayReturn();
        ab[0] = a_1[0];
        ab[1] = a_1[1];


        try {
            b.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int[] b_1 = b.arrayReturn();
        ab[2] = b_1[0];
        ab[3] = b_1[1];


        try {
            c.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }

        int[] c_1 = a.arrayReturn();
        ab[4] = c_1[0];
        ab[5] = c_1[1];


        try {
            d.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int [] d_1 = d.arrayReturn();
        ab[6] = d_1[0];
        ab[7] = d_1[1];


        try {
            e.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int [] e_1 = d.arrayReturn();
        ab[8] = e_1[0];
        ab[9] = e_1[1];


        try {
            f.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int [] f_1 = f.arrayReturn();
        ab[10] = f_1[0];
        ab[11] = f_1[1];


        try {
            g.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int [] g_1 = g.arrayReturn();
        ab[12] = g_1[0];
        ab[13] = g_1[1];


        try {
            h.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int [] h_1 = h.arrayReturn();
        ab[14] = h_1[0];
        ab[15] = h_1[1];


        try {
            i.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int [] i_1 = i.arrayReturn();
        ab[16] = i_1[0];
        ab[17] = i_1[1];


        try {
            j.join();
        } catch (InterruptedException ef) {
            ef.printStackTrace();
        }
        int [] j_1 = j.arrayReturn();
        ab[18] = j_1[0];
        ab[19] = j_1[1];


        int bbbb [] = new int [10] ;   // bbbb array stores the divisors
        for (int ba = 0 , bb = 0 ; ba < bbbb.length ; ba++ , bb+=2) {
            bbbb [ba] = ab[bb] ;
        }

        int ccc [] = new int [10] ;    //  ccc array stores the largest numbers
        for (int ba = 0 , bb = 1 ; ba < ccc.length ; ba++ , bb+=2) {
            ccc [ba] = ab[bb] ;
        }

        int max_divisor = 0 ;   //  this will store the maximum divisor among the elements of array

        for ( int ia = 0  ; ia < bbbb.length ; ia++ ) {     //  loop to find the maximum divisor
            for ( int ib = ia+1 ; ib < bbbb.length ; ib++ ) {
                if ( bbbb [ia] < bbbb[ib] ) {
                    max_divisor = bbbb[ib] ;
                }
            }
        }

        for ( int ij = 0; ij < bbbb.length ; ij++ ) {   //  loop to print the number corresponding to that maximum divisor
            if ( bbbb[ij] == max_divisor ) {
                System.out.println( ccc[ij] + " is the Largest integer number having " +  max_divisor + "  divisors"  ) ;
            }
        }
    }
}

