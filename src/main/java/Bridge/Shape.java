package Bridge;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }


    abstract void shapeColor();
}
