//GOOGLE  : Recursion problem
//MICROSOFT
// SNAPDEAL

// Tower of Hanoi : full question is in the nots 


public class TowerOFHanoi {

    public static void TOH(int n, String Source,String AUX,String Dect){

        // base conditoin 

        if(n==1){
            System.out.println("transfer disk " + n + " from " + Source + " to " + Dect);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        TOH(n-1, Source, Dect, AUX );

        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + Source + " to " + AUX);

        //transfer n-1 from helper to dest using
        TOH(n-1, AUX, Source, Dect);
        
    }
    public static void main(String[] args) {
        int n =4;
        TOH(n, "A", "B", "C");
        
    }
    
}
