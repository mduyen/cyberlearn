package labchuong2;

import java.util.Scanner;

public class tree {
    
    public static void main(String[] args) {
       final float PI = 3.14f;
       float length, radiusOfTree, place, sumOfPlace;
       int sumOfTree;
       Scanner scan = new Scanner(System.in);
       System.out.println("Chuong trinh tinh tong so cay va tong khong gian.\n");
        
       System.out.print("Nhap chieu dai: ");
       length = Float.parseFloat(scan.nextLine());
       System.out.print("Nhap ban kinh cay: ");
       radiusOfTree = Float.parseFloat(scan.nextLine());
       System.out.println("Nhap khong gian phat trien cua cay: ");
       place = Float.parseFloat(scan.nextLine());
       
       if (radiusOfTree>place/2){
           System.out.println("Nhap lai ban kinh");
       }
       // Hàm Math.floor: làm tròn xuống
       // Ta ép kiểu 
       sumOfTree = (int) Math.floor (length / place )+1; // Tổng số cây = chiều dài sân / không gian phát triển cây + 1
       sumOfPlace = (((place/2)*(place/2))*PI )*sumOfTree;  // Tổng không gian = diện tích cây phát triển (hình tròn) * tổng cây
       
       System.out.println("So cay trong duoc la: " + sumOfTree + " cay"); 
       System.out.println("Tong khong gian la: " + sumOfPlace + " m2");
    }
    
}
