import java.util.* ;
import java.util.concurrent.* ;

public class p_task_3 extends RecursiveTask<Integer> {

    public int first_index, last_index  ;
    public int [] array ;

    public static void main( String [] args ) {    //This is the main method
        Scanner scanner = new Scanner (System.in) ;
        System.out.print("Please enter array length ") ;
        int b = scanner.nextInt() ;
        int [] a = new int[b] ;

        System.out.print("Enter the integers of the array : ") ;   // taking array input
        for ( int i = 0 ; i < b ; i++ ) {
            a[i] = scanner.nextInt() ;
        }

        System.out.println("Given Array") ;    // printing the given array
        for ( int i = 0 ; i < b ; i++ ) {
            System.out.print( a[i] + " ") ;
        }
        System.out.println();

        ForkJoinPool p = ForkJoinPool.commonPool();  // We are using Fork join ThreadPool for thread creation according to resources
        p.invoke( new p_task_3 ( a ,0, b - 1 ) ) ;

        System.out.println("Sorted Array "); // printing the sorted array
        for (int i = 0 ; i < b ; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public p_task_3 ( int[] arr, int first_index, int last_index ) {  // constructor
        this.array = arr;
        this.first_index = first_index;
        this.last_index  = last_index ;
    }


    @Override
    public Integer compute () {
        if (first_index >= last_index ) {       //This is for the base case
            return null;                       //We return nothing
        } else {
            int p = partition(array ,first_index, last_index);  // if not base case partitioning the array
            p_task_3 sub_array_1 = new p_task_3( array ,first_index, p - 1);   // calling quick_sort for first part
            p_task_3 sub_array_2 = new p_task_3( array, p + 1, last_index);   // calling quick_sort for second part
            sub_array_1.fork();         //  splitting sub_array_1 as an independent thread
            sub_array_2.compute();
            sub_array_1.join();       //waiting till sub_array_1 is executed
            return null;             //We return nothing
        }
    }


    public int partition( int [] a, int l , int r ) {
        int pivot = a[l] ;
        int i = l ;
        for (int j = l + 1 ; j <= r ; j++) {
            if (a[j] <= pivot) {
                i++ ;
                int temp = 0 ;
                temp = a[i] ;
                a[i] = a[j] ;
                a[j] = temp ;
            }
        }
        int temp = 0 ;
        temp = a[i] ;
        a[i] = a[l] ;
        a[l] = temp ;
        return i ;
    }
}