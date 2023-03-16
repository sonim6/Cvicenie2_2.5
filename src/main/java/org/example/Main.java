package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] m_arr= new int[3][3];
        Scanner num= new Scanner(System.in);
        for(int i=0; i<m_arr.length; i++){
            for(int j=0; j<m_arr[i].length; j++){
                System.out.println("Zadajte cislo do riadku "+i+" a stlpca "+j+":");
                m_arr[i][j]=num.nextInt();
            }
        }
        System.out.println("Vase zadane cisla: ");
        for(int i=0; i<m_arr.length; i++){
            for(int j=0; j<m_arr[i].length; j++){
                System.out.print(m_arr[i][j]+" ");
            }
            System.out.print(",");
        }
    }
}