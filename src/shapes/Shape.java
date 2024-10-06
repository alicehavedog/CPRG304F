package shapes;

abstract class Shape {
    double height;

    public Shape(double height) {
        this.height = height;
    }

// 用來計算體積
    public abstract double calcVolume();
    
// 用來計算底面積
    public abstract double calcBaseArea();

    public double getHeight() {
        return height;
    }
}
