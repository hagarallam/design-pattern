package Flyweight;

public class Main {

    public static void main(String[] args) {

        // WITHOUT FLYWWEIGHT PATTERN
//        Long start = System.currentTimeMillis();
//        for (int i = 0 ; i<1000000;i++){
//            Circle circle = new Circle(ColorsEnum.BLUE,i+1);
//            circle.draw();
//        }
//        Long end = System.currentTimeMillis();
//        System.out.println("Total time -> "+ (end-start)); // 3549
//

        // WITh FLYWWEIGHT PATTERN
        Long start = System.currentTimeMillis();
        for (int i = 0 ; i<1000000;i++){
            Circle circle = (Circle) CircleFactory.getCircleInstance(ColorsEnum.BLUE,i+1);
            circle.draw();
        }
        Long end = System.currentTimeMillis();
        System.out.println("Total time -> "+ (end-start)); // 3481
    }
}
