
package lenhdieukien;

import java.util.Scanner;

public class bigger {

    public static void main(String[] args) {
        System.out.println("Chuong trinh nhap hai so, tim so lon nhat.\n");
        Scanner scan = new Scanner (System.in);
        float num1, num2, bigger;
        
        System.out.print("Nhap so thu nhat: ");
        num1 = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap so thu hai: ");
        num2 = Float.parseFloat(scan.nextLine());
        
        bigger = (num1 > num2) ? num1 : num2;
        
//        if (num1 > num2) {
//            bigger = num1;
//        } else {
//            bigger = num2;
//        }
        System.out.println("So lon nhat la: " + bigger);
    }
    
}
