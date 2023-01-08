
import java.util.Scanner;
//7.13
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class polinom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        double b;
        double t;
        System.out.print("Derece:");
        int  n=input.nextInt();
        double[] A=new double[n+1];
        for (int i = 0; i <= n; i++) {
            System.out.print("x^"+i+" nin katsayısı:");
            A[i]=input.nextDouble();
            
        }
        System.out.print("Heseplanacak x değeri:");
        b=input.nextDouble();
        t=A[0];
        for (int i = 1; i <= n; i++) {
        t+=A[i]*Math.pow(b,i);
                
        }
        
        System.out.println(t);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
