import java.util.Arrays;
import java.util.Scanner;
public class sortArrayNumbers {

        public static void main (String[]args){
            int arraySize;
            Scanner input=new Scanner(System.in);
            System.out.print("Dizinin boyutu n : ");
            arraySize=input.nextInt();
            int [] number=new int[arraySize];
            for (int i=0; i<number.length; i++){
                System.out.print( i+1 +". Elemanı : ");
                
                number[i]=input.nextInt();
            }
            Arrays.sort(number);
            System.out.println("Sıralama : "+Arrays.toString(number));
        }
    }
