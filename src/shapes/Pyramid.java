package shapes;

class Pyramid extends Shape {
    double side;

    public Pyramid(double height, double side) {
        super(height);
        this.side = side;
    }

    @Override
    public double calcVolume() {
        return (1.0 / 3) * Math.pow(side, 2) * height;
    }

    @Override
    public double calcBaseArea() {
        return Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }
}
