package shapes;

class OctagonalPrism extends Prism {

    public OctagonalPrism(double height, double side) {
        super(height, side);
    }

    @Override
    public double calcVolume() {
        return 2 * Math.pow(side, 2) * (1 + Math.sqrt(2)) * height;
    }

    @Override
    public double calcBaseArea() {
        return 2 * Math.pow(side, 2) * (1 + Math.sqrt(2));
    }
}
