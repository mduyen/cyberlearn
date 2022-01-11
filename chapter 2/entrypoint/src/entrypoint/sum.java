package entrypoint;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh tong 2 so.\n");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhap vao so nguyen thu nhat: ");
        String value1 = scan.nextLine();
        System.out.print("Nhap vao so nguyen thu hai: ");
        String value2 = scan.nextLine();
        
        // Vì số nhập vào được hiểu là ký tự nên ta dùng lệnh parse để chuyển nó sang số cho đỡ bị lỗi

        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int sum = num1 + num2;
        System.out.println("Tong hai so vua nhap la: " + sum);
        
    }
}
