package shapes;

public class AliceTest {
    public static void main(String[] args) {
        Shape cylinder = new Cylinder(5, 3);
        System.out.println("Cylinder Volume: " + cylinder.calcVolume());
        System.out.println("Cylinder Base Area: " + cylinder.calcBaseArea());

        Shape cone = new Cone(7, 2);
        System.out.println("Cone Volume: " + cone.calcVolume());
        System.out.println("Cone Base Area: " + cone.calcBaseArea());

        Shape pyramid = new Pyramid(8, 4);
        System.out.println("Pyramid Volume: " + pyramid.calcVolume());
        System.out.println("Pyramid Base Area: " + pyramid.calcBaseArea());

        Prism squarePrism = new SquarePrism(10, 4);
        System.out.println("SquarePrism Volume: " + squarePrism.calcVolume());
        System.out.println("SquarePrism Base Area: " + squarePrism.calcBaseArea());

        Prism triangularPrism = new TriangularPrism(12, 5);
        System.out.println("TriangularPrism Volume: " + triangularPrism.calcVolume());
        System.out.println("TriangularPrism Base Area: " + triangularPrism.calcBaseArea());

        Prism pentagonalPrism = new PentagonalPrism(15, 6);
        System.out.println("PentagonalPrism Volume: " + pentagonalPrism.calcVolume());
        System.out.println("PentagonalPrism Base Area: " + pentagonalPrism.calcBaseArea());

        Prism octagonalPrism = new OctagonalPrism(20, 7);
        System.out.println("OctagonalPrism Volume: " + octagonalPrism.calcVolume());
        System.out.println("OctagonalPrism Base Area: " + octagonalPrism.calcBaseArea());
    }
}
