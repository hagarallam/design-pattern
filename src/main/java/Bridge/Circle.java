package Bridge;

public class Circle extends Shape{

    private Color color;
    public Circle(Color color){
        super(color);
        this.color=color;
    }
    @Override
    void shapeColor() {
        System.out.print("Circle color is ");
        this.color.applyColor();
    }
}
