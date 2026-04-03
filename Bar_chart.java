import java.util.*;
import java.io.*;

public class Bar_chart{
    public static void main(String[] args){
        System.out.println("Enter the number of bars:"); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bars = new int[n];
        System.out.println("Enter the heights of the bars:");       
        for(int i=0; i<n; i++){
            bars[i] = sc.nextInt();
        }
        int max_height = 0;
        for(int i=0; i<n; i++){
            if(bars[i] > max_height){
                max_height = bars[i];
            }
        }
        System.out.println("The maximum height of the bars is: " + max_height);
            for(int i=max_height; i>0; i--){
                for(int j=0; j<n; j++){
                    if(bars[j] >= i){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }   

    }
}