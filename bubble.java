import java.util.Scanner;
/**
 * bubble
 */
public class bubble {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array that you want to make:");
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("enter the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        scan.close();
    }
}
/* output
enter the size of array that you want to make:
6
enter the array:
10 37 49 77 26 1
1 10 26 37 49 77
*/
