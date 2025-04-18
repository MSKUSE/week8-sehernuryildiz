import java.util.Objects;

public class Rectangle extends Sahpe{

    int sideA = 0 , sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if (this.sideA == rectangle.getSideA() && this.sideB == rectangle.getSideB() && this.getColor() == rectangle.getColor()){
            return true;

        else{
            return false;
            }
        }


    }
}
