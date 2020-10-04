import java.util.Scanner;
/**
 * linearR
 */
public class linearR {
    public static int func(int e,int i,int j,int a[]){
        if(a[i]==e)
            return i;
        else if(i==j-1)
            return -1;
        else return func(e, i+1, j, a);    
    }
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
        int print=func(e, 0, a.length, a);
        if(print==-1){
            System.out.println("element not found!");
        }else{
            System.out.println("index="+print);
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
6
element not found!
*/