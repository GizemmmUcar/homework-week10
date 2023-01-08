
import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class orthesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı:");
        int n = input.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            System.out.print("A dizisi:" );
            A[i] = input.nextInt();
        }
        int t1 = 0, c = 1, ht = 0, t2 = 0;
        for (int i = 0; i < n; i++) {
            t1 += A[i];
            c *= A[i];
            ht += 1 / A[i];
            t2 += Math.pow(A[i], 2);

        }
        int aritmetikort = t1 / n;
        int geometrikort = (int) Math.pow(c, (1 / n));
        int harmonikort = n / ht;
        int kontraharmonikort = t2 / t1;
        System.out.println("Aritmetik Ortalama:" + aritmetikort);
        System.out.println("Geometrik Ortalama:" + geometrikort);
        System.out.println("Harmonik Ortalama:" + harmonikort);
        System.out.println("Kontraharmonik Ortalama:" + kontraharmonikort);
    }

}
