import java.util.* ;
public class Task_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Please enter number of processes") ;
        int n = scanner.nextInt() ;
        int[] p_id = new int[n] ;               // storing process id
        int[] arrival_time = new int[n] ;       // storing arrival time
        int[] burst_time = new int[n] ;         // storing burst time
        int[] completion_time = new int[n] ;    // storing completion time
        int[] turn_around_time = new int[n] ;   // storing turn around time
        int[] waiting_time = new int[n] ;       // storing waiting time
        int[] flag = new int[n] ;               // flag array to indicate whether process is done or not ( 0 indicates not executed , 1 indicates executed )
        int start_time = 0 , total = 0 ;        // total stores total number of completed processes
        float average_waiting_time = 0 , average_turn_around_time = 0 ;

        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println( "enter arrival time of process " + (i + 1) ) ;
            arrival_time[i] = scanner.nextInt() ;     //  saving arrival time in arrival_time[] (array [input])
        }

        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println( "enter burst time of process " + (i + 1) ) ;
            burst_time[i] = scanner.nextInt() ;     //  saving burst time in burst_time[] (array [input])
            p_id[i] = i+1 ; 
        }

        int burst_time_2[] = new int[n] ;
        for ( int i = 0 ; i < n ; i++ ) {     //  copying burst_time[] array , into burst_time_2[] array. As burst_time[] array will be modified
                burst_time_2[i] = burst_time[i] ;
        }


        boolean a = true ;

        while (true) {
            int c = n , min = 999 ;
            if (total == n) {    // if total completed number of processes is equal to n , the loop will be terminated
                break ;
            }

            for ( int i = 0 ; i < n ; i++ ) {
                if ( ( arrival_time[i] <= start_time ) && ( flag[i] == 0 ) && ( burst_time_2[i] < min ) ) {      // if i'th process's arrival time <= system time and flag = 0 and burst_time < min  then i'th process will execute
                    min = burst_time_2[i] ;     //  min will be updated with every new process
                    c = i ;
                }
            }

            burst_time_2[c]-- ;    // decrementing the burst time by 1 unit for c'th process as c'th process executed for 1 unit
            start_time++ ;        // incrementing start time as it is carrying the completion time
            if ( burst_time_2[c] == 0 ) {             //  burst_time = 0 meaning process executed
                completion_time[c] = start_time ;    // storing completion time for c'th process in completion array
                flag[c] = 1 ;    // turning flag 1 for c'th process meaning c'th process is done
                total++ ;       // incrementing total
            }

            turn_around_time[c] = completion_time[c] - arrival_time[c] ;   // calculating turn around for c'th process
            waiting_time[c] = turn_around_time[c] - burst_time[c] ;       // calculating waiting time for c'th process

        }

        System.out.print ( "process ID --- Arrival Time --- Burst Time --- Completion Time --- Turn Around Time --- Waiting Time " ) ;
        System.out.println() ;
        for ( int i = 0 ; i < n ; i++ ) {
            average_waiting_time += waiting_time[i] ;           // adding up waiting times of all processes
            average_turn_around_time += turn_around_time[i] ;  // adding up turn around times of all processes

            System.out.println( "    " + "P" + p_id[i] + "              " + arrival_time[i] + "              " + burst_time[i] + "              " + completion_time[i] + "                  " + turn_around_time[i] + "                   " + waiting_time[i]) ;
        }

        System.out.println( " Average waiting time " + average_waiting_time / n ) ;             // printing average waiting time
        System.out.println( " Average turnaround time " + average_turn_around_time / n ) ;     // printing average turnaround time

    }
}
