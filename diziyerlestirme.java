
import java.util.Scanner;
//example7.20
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class diziyerlestirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı:");
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a dizisi:");
            a[i] = input.nextInt();

        }
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {

            }
            if (a[i] > 0) {
                x++;
                System.out.print("b dizisi:" + b[i]);
                b[i] = input.nextInt();
            } else 
                y++;

                c[y] = a[i];
                System.out.print("c dizisi:" + c[y]);
            }
        }
    }

