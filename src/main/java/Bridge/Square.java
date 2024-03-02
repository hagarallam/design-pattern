package Bridge;

public class Square extends Shape{

    private Color color;
    public Square(Color color) {
        super(color);
        this.color=color;
    }

    @Override
    void shapeColor() {
        System.out.print("Square Color is ");
        this.color.applyColor();
    }
}
