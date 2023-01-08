
import java.util.Scanner;
//7.9
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class skalercarpım {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısı:");
        int N = input.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        System.out.println("A dizisi:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();

        }
        System.out.println("B dizisi:");
        for (int j = 0; j < B.length; j++) {
            B[j] = input.nextInt();

        }

        int skalercarpım = 0;
        for (int i = 0; i < N; i++) {
            skalercarpım = skalercarpım + (A[i] * B[i]);

        }
        System.out.println("Skaler çarpım:" + skalercarpım);
    }

}
