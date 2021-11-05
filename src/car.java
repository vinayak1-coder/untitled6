import java.util.Scanner;
public class car {
    String manufacture;
    int prise;

    public car(int p, String m) {
        this.manufacture = m;
        this.prise = p;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car obj1 = new car(sc.nextInt(), sc.nextLine());
        car obj2 = new car(sc.nextInt(), sc.nextLine());
        car obj3 = new car(sc.nextInt(), sc.nextLine());

        if (obj1.prise >obj2.prise && obj1.prise > obj2.prise) {
            if (obj2.prise > obj3.prise) {
                System.out.println(obj1.manufacture + " " + obj1.prise);
                System.out.println(obj2.manufacture + " " + obj2.prise);
                System.out.println(obj3.manufacture + " " + obj3.prise);
            }
            else{
                System.out.println(obj1.manufacture+" "+obj1.prise);
                System.out.println(obj3.manufacture+" "+obj3.prise);
                System.out.println(obj2.manufacture+" "+obj2.prise);
            }

        }
        else if (obj2.prise > obj1.prise && obj2.prise > obj3.prise){
            if(obj1.prise > obj3.prise){
                System.out.println(obj2.manufacture+" "+obj2.prise);
                System.out.println(obj1.manufacture+" "+obj1.prise);
                System.out.println(obj3.manufacture+" "+obj3.prise);
            }
            else{
                System.out.println(obj2.manufacture+" "+obj2.prise);
                System.out.println(obj3.manufacture+" "+obj3.prise);
                System.out.println(obj1.manufacture+" "+obj1.prise);

            }
        }
        else{
            if(obj1.prise > obj2.prise){
                System.out.println(obj3.manufacture+" "+obj3.prise);
                System.out.println(obj1.manufacture+" "+obj1.prise);
                System.out.println(obj2.manufacture+" "+obj2.prise);
            }
            else{
                System.out.println(obj3.manufacture+" "+obj3.prise);
                System.out.println(obj2.manufacture+" "+obj2.prise);
                System.out.println(obj1.manufacture+" "+obj1.prise);

            }
        }
    }
}

