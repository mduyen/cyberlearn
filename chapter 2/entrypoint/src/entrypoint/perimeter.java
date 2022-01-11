package entrypoint;

public class perimeter {
    public static void main(String[] args) {
        
        final float PI = 3.14f;
        
        System.out.println("Chuon trinh tinh dien tich va chu vi hinh tron da biet so lieu truoc.\n");
        
        float radius = 3;
        float perimeter = radius*2*PI;
        float area = radius*radius*PI;
        
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
