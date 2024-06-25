//Amazon : Recursion Problem
// How many ways to fit the stile in a floor -- and the full question is in the nots   



public class TilingProblem {

    public static int RecTiling(int n){ // 2 X n floor Size
        //bases case 

        if(n==1 ||  n==0){
            return 1;
        }
//Kam

//Vertical Choise

int fnm1 = RecTiling(n-1);

// Horizontal Choise 


int fnm2 =RecTiling(n-2);

int total_ways= fnm1+fnm2;

return total_ways;

// return RecTiling(n-1)+RecTiling(n-2);


}
public static void main(String[] args) {
    int n = 4;
   System.out.println(RecTiling(n));
}
}
    

