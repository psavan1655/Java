import java.util.Scanner;
/**
 * radix
 */
public class radix {

    public static void main(String[] args) {
        booleanflag=false;
        int tmp=-1;divisor=1;
        while(!flag){
            flag=true;
            for(Integer i:input){
                tmp=1/divisor;
                buk[tmp%10].add(i);
                if(flag&&tmp>0){
                    flag=false;
                }
            }
            int a=0;
            for(int b=0;b<10;b++){
                for(Integer i:buk[b]){
                    input[a++]=i;
                }
                buk[b].clear();
            }
            divisor*=10;
        }
    }
}