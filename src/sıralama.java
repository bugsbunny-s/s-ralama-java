import java.util.Scanner;
public class sıralama {
    public static void main(String[] args) throws Exception {

        int a,b,c;

        Scanner inp = new Scanner (System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        a = inp.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        b = inp.nextInt();
        
        System.out.print("3. Sayıyı Giriniz : ");
        c = inp.nextInt();

        if (a > b && a > c) {
            if(b > c)
            System.out.println(a + ">" + b + ">" + c);
            
            else {
                System.out.print(a + ">" + c + ">" + b);
            }
        }
        else if (b > a && b > c){
            if(a > c)
            System.out.println(b + ">" + a + ">" + c);

            else {
                System.out.println(b + ">" + c  + ">" + a);

            }
        }
        else {
            if(a > b)
            System.out.println(c + ">" + a + ">" + b);

            else {
                System.out.println(c + ">" + b + ">" + a);
            }
        }
        
    }
}
