package shapes;

class SquarePrism extends Prism {

    public SquarePrism(double height, double side) {
        super(height, side);
    }

    @Override
    public double calcVolume() {
        return Math.pow(side, 2) * height;
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(side, 2);
    }
}
