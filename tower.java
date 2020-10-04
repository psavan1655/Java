
import java.util.Scanner;
public class tower {
    static void towerOfHanoi(int disc, int from, int to, int aux){
        if(disc==1)
            System.out.println("Move the disk-"+disc+" from "+from+" to "+to);
        else{
            towerOfHanoi(disc-1, from, aux, to);
            System.out.println("Move the disk-"+disc+" from "+from+" to "+to);
            towerOfHanoi(disc-1, aux, to, from);
        }
    }
    public static void main(String[] args){
        System.out.println("Enter n0 of disc:");
        Scanner scan = new Scanner(System.in);
        int disc, from, to, aux = 0;
        disc = scan.nextInt();
        System.out.println("Enter from:");
        from = scan.nextInt();
        System.out.println("Enter to:");
        to = scan.nextInt();
        for(int i =1; i<4; i++){
            aux = i;
            if(from!=i && to!=i){
                break;
            }
        }
        towerOfHanoi(disc, from, to, aux);
    }
    
}