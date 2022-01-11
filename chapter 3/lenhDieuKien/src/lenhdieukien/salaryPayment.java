
package lenhdieukien;

import java.util.Scanner;

public class salaryPayment {

    public static void main(String[] args) {
        
        final int STANDARD_HOUR = 40;
        final float RATE_OT = 1.5f;
        
        System.out.println("Chuong trinh tra tien luong OT cho nhan vien.\n");
        
        Scanner scan = new Scanner(System.in);
        float hours, rate;
        double payment;
        
        System.out.print("Nhap so gio nhan vien da lam: ");
        hours = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap so tien trong 1h: ");
        rate = Float.parseFloat(scan.nextLine());
        
        if (hours > STANDARD_HOUR) {
            payment = STANDARD_HOUR*rate + RATE_OT*rate*(hours-STANDARD_HOUR);
        } else {
            payment = hours*rate;
        }
        System.out.println("So tien phai tra la: " + payment);
    }
    
}
