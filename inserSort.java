import java.util.Scanner;
/**
 * inserSort
 */
public class inserSort {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of array that you want to make:");
        int s=scan.nextInt();
        int a[]=new  int[s];
        System.out.println("enter the array:");
        for(int i=0;i<s;i++){
            a[i]=scan.nextInt();
        }
        for(int j=1;j<s;j++){
            int key=a[j];
            int i=j-1;
            while(i>=0&&a[i]>key){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
        for (int i = 0; i < s; i++) {
            System.out.print(a[i] + " ");
            
        }
        scan.close();
    }
}
/* output
enter the size of array that you want to make:
5
enter the array:
9 8 7 6 5
5 6 7 8 9
*/