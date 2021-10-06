import java.util.* ;
public class Task_2 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println( "Please enter number of processes" ) ;
        int n = scanner.nextInt() ;
        int [] p_id = new int [n] ;                // storing process id
        int [] priority = new int [n] ;            // storing priority of that process
        int [] burst_time = new int [n] ;          // storing burst time
        int [] turn_around_time = new int [n] ;    // storing turn around time
        int [] arrival_time = new int [n] ;        // as we are not taking arrival time as input so we assume all processes arrived at time unit " 0 "
        int [] waiting_time = new int[n] ;         // storing waiting time
        int [] completion_time = new int[n] ;      // storing completion time
        int [] copy_priority = new int[n] ;        // copy of priority array
        int start_time = arrival_time[0] ;         // as all processes arrived at the same time so whatever is the arrival time of all process that will be value of start_time
        float average_waiting_time = 0 , average_turn_around_time = 0 ;

        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println( "enter burst time of process " + (i + 1) ) ;
            burst_time[i] = scanner.nextInt() ;     //  saving burst time in burst_time[] (array [input])
            p_id [i] = i + 1 ;
        }

        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println( "enter priority of process " + (i + 1) ) ;
            priority[i] = scanner.nextInt() ;     //  saving priority of processes (array [input])
            copy_priority [i] = priority [i] ;    //  copying priority array
        }

        Arrays.sort( copy_priority ) ;  // sorting the copy_priority array to get the highest priority in correct order

        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = 0 ; j < n ; j++ ) {    // searching for the index number of highest priority from priority array
              if ( copy_priority[i] == priority[j] ) {
                  start_time += burst_time[j] ;  //  saving burst time in start_time
                  completion_time[j] = start_time ;   // storing completion time for j'th process in completion array
                  turn_around_time [j] = completion_time[j] - arrival_time[j] ;
                  waiting_time [j] = turn_around_time [j] - burst_time[j] ;
                  average_waiting_time += waiting_time[j] ;   // adding up waiting times of all processes
                  average_turn_around_time += turn_around_time [j] ;  // adding up turn around times of all processes
                }
            }
        }

        System.out.print ( "process ID --- Arrival Time --- Burst Time --- Completion Time --- Turn Around Time --- Waiting Time " ) ;
        System.out.println() ;
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println( "    " + "P" + p_id[i] + "              " + arrival_time[i] + "              " + burst_time[i] + "              " + completion_time[i] + "                  " + turn_around_time[i] + "                   " + waiting_time[i]) ;
        }

        System.out.println( " Average waiting time " + average_waiting_time / n ) ;             // printing average waiting time
        System.out.println( " Average turnaround time " + average_turn_around_time / n ) ;     // printing average turnaround time
    }
}
