public class App {
    public static void main(String[] args) throws Exception {
        Circle c = new Circle(12);
        System.out.print("Luas lingkaran :"+c.area());
        System.out.println();
        System.out.print("Keliling lingkaran :"+c.perimeter());
        System.out.println();
        Rectangle r = new Rectangle(19, 19);
        System.out.print("Luas persegi :"+r.area());
        System.out.println();
        System.out.print("Keliling persegi :"+r.perimeter());
        System.out.println();
        Triangle t = new Triangle(4, 5, 5);
        System.out.print("Luas segitiga :"+t.area());
        System.out.println();
        System.out.print("Keliling segitiga :"+t.perimeter());
        System.out.println();

    }
}
