
package lenhdieukien;

import java.util.Scanner;

public class studenRating {

    public static void main(String[] args) {
        System.out.println("Chuong trinh xep loai sinh vien.");
        Scanner scan = new Scanner(System.in);
        String name;
        String rating="";
        float math, physics, chemistry, avg;
        
        System.out.println("Nhap ten sinh vien: ");
        name = scan.nextLine();
        System.out.println("Nhap diem toan: ");
        math = Float.parseFloat(scan.nextLine());
        System.out.println("Nhap diem ly: ");
        physics = Float.parseFloat(scan.nextLine());
        System.out.println("Nhap diem hoa: ");
        chemistry = Float.parseFloat(scan.nextLine());
        
        avg = (math + physics + chemistry)/3;
        if (avg >= 8.5) {
            rating="Gioi";
        } else if ((avg >= 6.5)&&(avg < 8.5)) {
            rating="Kha";
        } else if ((avg >= 5)&&(avg < 6)) {
            rating="Trung binh";
        } else if (avg < 5) {
            rating="Yeu";
        }
        System.out.println("Ten: " + name);
        System.out.println("Diem trung binh: " + avg);
        System.out.println("Xep loai: " + rating);
    }
    
}
