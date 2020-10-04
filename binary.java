import java.util.Scanner;
/**
 * binary
 */
public class binary {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of array that you want to make:");
        int s=scan.nextInt();
        int a[]=new  int[s];
        System.out.println("enter the array:");
        for(int i=0;i<s;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("enter the new element whos index you want to search:");
        int e=scan.nextInt();

        for(int j=1;j<s;j++){ //sorting logic(is)
            int key=a[j];
            int i=j-1;
            while(i>=0&&a[i]>key){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
        
        int i=1;
        int j=s;
        int m;
        while(i<j){
            m=((i+j)/2);
            if(e>a[m]){
                i=m+1;
            }else{
                j=m;
            }
        }
        if(e==a[i]){
            System.out.println("index="+i);
        }else{
            System.out.println("element not found!");
        }
        scan.close();
    }
}
/* output
enter the size of array that you want to make:
5
enter the array:
1 2 3 4 5
enter the new element whos index you want to search:
4
index=3
*/