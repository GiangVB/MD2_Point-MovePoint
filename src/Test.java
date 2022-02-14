public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(11, 1);
        System.out.println(p1.toString());

        Point p2 = new MovablePoint(10, 12, 3, 2);
        System.out.println(p2.toString());
        ((MovablePoint)p2).move();
        System.out.println(p2.toString());

        MovablePoint m1 = new MovablePoint(1, 5, 3, 4);
        System.out.println(m1.toString());
        m1.move();
        System.out.println(m1.toString());
    }
}