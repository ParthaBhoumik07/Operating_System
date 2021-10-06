import java.io.*;
import java.util.*;

public class banker{
    public static void main (String[]args) throws Exception {
        BufferedReader b = new BufferedReader(new FileReader("b_input.txt")) ;
        int row = Integer.parseInt(b.readLine()) ;                  // processe number insertion
        int column = Integer.parseInt(b.readLine()) ;               // resource number insertion
        String [] process = new String [row] ;                      // process name array insertion
        int [][] max = new int [row][column] ;                      // maximum matrix declaration
        int [][] allocation = new int [row][column] ;               // allocation matrix declaration
        int [][] need = new int [row][column] ;                     // need matrix declaration
        int [][] available = new int [row + 1][column] ;            // available matrix declaration
        LinkedList <Integer> pointer = new LinkedList<Integer>() ;  // linked list declaration for safe sequence

        String a = b.readLine() ;
        StringTokenizer s = new StringTokenizer(a , " ") ;
        int n = 0 ;
        while (s.hasMoreTokens()) {
            process[n] = s.nextToken() ;      // process name insertion in "process" array
            n++ ;
        }

        for (int i = 0 ; i < row ; i++ ) {
            String c = b.readLine() ;
            StringTokenizer s1 = new StringTokenizer(c , " ") ;
            for (int j = 0 ; j < column ; j++) {
                max[i][j] = Integer.parseInt(s1.nextToken()) ;     // max matrix insertion
            }
        }

        for (int i = 0 ; i < row ; i++ ) {
            String c = b.readLine() ;
            StringTokenizer s1 = new StringTokenizer(c , " ") ;
            for (int j = 0 ; j < column ; j++) {
                allocation[i][j] = Integer.parseInt(s1.nextToken()) ;     // allocation matrix insertion
                need[i][j] = max[i][j] - allocation [i][j] ;              // finding out need matrix [need = max - allocation]
            } 
        }

        System.out.println();

        System.out.print("Need Matrix :");

        for (int i = 0 ; i < row ; i++) {
            System.out.println();
            for (int j = 0 ; j < column ; j++) {
                System.out.print(need[i][j] + " ");              // printing need matrix
            }
        }
        System.out.println();

        String d = b.readLine() ;
        StringTokenizer s3 = new StringTokenizer(d , " ") ;
        int m = 0 ;
        while (s3.hasMoreTokens()) {
            available[0][m] = Integer.parseInt(s3.nextToken()) ;     // inserting available vector in available matrix's 0th row 
            m++ ;
        }

        System.out.println();
       


        int count = 0;           

        for (int i = 0;; i++) {      // as we do not know how many time loop will run so no condition for "i"

            i = i % row ;           // used mod to avoid array out of bound issue
            boolean flag = true ;         //initially flag is declared as "true" which means need is less than or equal to available

            for ( int j = 0 ; j < column ; j++ ) {    
                if ( need[i][j] > available[count][j] ) {       // checking if need is greater  available
                    flag = false;                                 // if yes then flag will be false 

                } 
                if (flag && j == (column - 1) && !pointer.contains(i)) {  // if need is less than or equal to available and if all resources have been checked  and if "i" is not in the list already
                    for ( int k = 0 ; k < column ; k++ ) {
                        available[count+1][k] = available[count][k] + allocation[i][k] ; // updating the available matrix [ available after execution of i'th process = current available + allocated for i'th process]
                    }
                    pointer.addLast(i) ;  // adding that index "i" into the list
                    count++ ;
                }
            }
            if (pointer.size() == row) {  // if size of "pointer" linked list is same as row [row = number of process]. means we have all the indices 
                 break ;      // we break the loop
            }
        }
        System.out.println("Safe sequence :") ;
        for (int i = 0 ; i < pointer.size(); i++) {
            System.out.print(process[pointer.get(i)] + " ") ;  //  fetching out process name from "process" array using the index sequence inserted in linkedlist "pointer"
        }
        System.out.println() ;
        System.out.println() ;

        System.out.print("Change in available resource matrix :");

        for (int i = 1 ; i < column ; i++) {
            System.out.println();
            for (int j = 0 ; j < column ; j++) {
                System.out.print(available[i][j] + " ");              // printing upgraded available matrix
            }
        }
        System.out.println();

    }
}
