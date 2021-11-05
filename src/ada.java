import java.util.Scanner;
public class ada {
        int amount;
        ada(){
            amount = 50;
        }
        ada(int s){
            amount = 50 + s;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            ada obj = new ada(n);
            System.out.println("Final Amount : "+obj.amount);
        }
    }
