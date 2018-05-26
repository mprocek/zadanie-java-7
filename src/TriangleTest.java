public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,5,7);
        CheckTriangle checkTriangle = new CheckTriangle();

        System.out.println("Trójkąt prostokątny: " + checkTriangle.isRightTriangle(triangle));

        triangle.setA(10);
        triangle.setB(4);
        triangle.setC(9.16515138991168);

        System.out.println("Trójkąt prostokątny: " + checkTriangle.isRightTriangle(triangle));

    }
}
