import java.util.* ;
public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of processes");
        int n = scanner.nextInt();
        int [] p_id = new int[n];                  // storing process id
        int [] burst_time = new int [n] ;          // storing burst time
        int [] remaining_time = new int [n] ;      // stores burst time but used to calculate remaining burst time
        int [] arrival_time = new int [n] ;        // as we are not taking arrival time as input so we assume all processes arrived at time unit " 0 "
        int [] turn_around_time = new int [n] ;    // storing turn around time
        int [] waiting_time = new int[n] ;         // storing waiting time
        int [] completion_time = new int[n] ;      // storing completion time
        int start_time = arrival_time[0] ;         // as all processes arrived at the same time so whatever is the arrival time of all process that will be value of start_time
        float average_waiting_time = 0 , average_turn_around_time = 0 ;

        System.out.println("Please input time quantum ") ;
        int time_quantum = scanner.nextInt() ;

        for ( int i = 0 ; i < n ; i++ ) {
            System.out.println("Please enter burst time of process " + (i+1) ) ;
            burst_time [i] = scanner.nextInt() ;   //  saving burst time in burst_time[] (array [input])
            remaining_time [i] = burst_time[i] ;   //  copying burst time in remaining_time[] (array [input])
            p_id [i] = i + 1 ;
        }


        while ( true ) {
            boolean a = false ;  //  loop will break if a stays false
            for (int i = 0 ; i < n ; i++ ) {
               if ( remaining_time[i] > 0 ) {
                   a = true ;   //  up until remaining time of i'th process is greater than 0 "a" will remain true meaning while loop will continue

                  if (remaining_time[i] > time_quantum ) {
                      start_time += time_quantum ;   //  as remaining time is greater than time quantum, So value of time quantum will be added with start_time
                      remaining_time [i] -= time_quantum ;   // for remaining time , time quantum will be deducted from remaining time for i'th process

                  } else {   // else means remaining time is less than time quantum. meaning after this execution i'th process will be finished
                      start_time += remaining_time[i] ;   //  as remaining time is lesser than time quantum, So value of remaining time of ith process will be added with start_time
                      completion_time[i] = start_time ;   // storing completion time for i'th process in completion array
                      remaining_time [i] = 0 ;  // process finished , so remaining time is 0
                  }
               }
            }

            if ( a == false ) {
                break;
            }
        }

        System.out.print ( "process ID --- Arrival Time --- Burst Time --- Completion Time --- Turn Around Time --- Waiting Time " ) ;
        System.out.println() ;

        for ( int i = 0 ; i < n ; i++ ) {
            turn_around_time [i] =  completion_time [i] - arrival_time[i] ;
            average_turn_around_time += turn_around_time[i] ;  // printing average turnaround time
            waiting_time [i] = turn_around_time [i] - burst_time[i] ;
            average_waiting_time += waiting_time[i] ;    // printing average waiting time
            System.out.println( "    " + "P" + p_id[i] + "              " + arrival_time[i] + "                " + burst_time[i] + "                " + completion_time[i] + "                   " + turn_around_time[i] + "                   " + waiting_time[i]) ;
        }

        System.out.println( " Average waiting time " + average_waiting_time / n ) ;             // printing average waiting time
        System.out.println( " Average turnaround time " + average_turn_around_time / n ) ;     // printing average turnaround time

    }
}

