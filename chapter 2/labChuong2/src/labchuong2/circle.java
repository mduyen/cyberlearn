
package labchuong2;

import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        float xC, yC, xM, yM, r, value, CM;
        Scanner scan = new Scanner(System.in);
        System.out.println("Chuong trinh xet vi tri tuong doi diem M voi duong tron tam C.\n");
        
        System.out.print("Nhap hoanh do tam C: ");
        xC = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap tung do tam C: ");
        yC = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap hanh do diem M: ");
        xM = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap tung do diem M: ");
        yM = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap ban kinh: ");
        r = Float.parseFloat(scan.nextLine());
        
        value = (xM - xC)*(xM - xC) + (yM- yC)*(yM - yC);
        CM = (float) Math.sqrt(value);
        
        if (CM > r){
            System.out.println("M nam ngoai vong tron.");
        } else if (CM == r){
            System.out.println("M nam tren vong tron");
        } else {
            System.out.println("M nam trong vong tron");
        }
        
    }
    
}
