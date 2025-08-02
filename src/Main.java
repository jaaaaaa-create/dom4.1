import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Задача 1
        System.out.println("Задача 1");
        int[] piska = new int [3];
        piska[0]=1;
        piska[1]=2;
        piska[2]=3;
        double[] huy = {1.57, 7.654, 9.986};
        int[] pizda = new int [2];
// Задача 2
        System.out.println("Задача 2");
        for (int i=0; i< (piska.length-1); i++){
        System.out.print(piska[i]+", ");
        } System.out.println(piska[piska.length-1]);
        for (int j=0; j< huy.length-1; j++){
            System.out.print(huy[j]+", ");
        } System.out.println(huy[huy.length-1]);
        for (int k=0; k< pizda.length-1; k++){
            System.out.print(pizda[k]+", ");
        } System.out.println(pizda[pizda.length-1]);
// Задача 3
        System.out.println("Задача 3");
        for (int i=(piska.length-1); i>0; i--){
            System.out.print(piska[i]+", ");
        } System.out.println(piska[0]);
        for (int j=(huy.length-1); j>0; j--){
            System.out.print(huy[j]+", ");
        } System.out.println(huy[0]);
        for (int k=(pizda.length-1); k>0; k--){
            System.out.print(pizda[k]+", ");
        } System.out.println(pizda[0]);
// Задача 4
        System.out.println("Задача 4");
        for (int i=0; i<piska.length; i++){
            if (piska[i]%2!=0){
                piska[i]++;
            }
        }
        System.out.println(Arrays.toString(piska));
    }
}