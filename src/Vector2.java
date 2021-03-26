import java.util.Arrays;

class Vector2 extends VectorND{
    public double x, y;

    public Vector2(double x, double y){
        super(new double[] {x,y});

        this.x = x;
        this.y = y;

    }

    @Override
    public String toString(){
        return "Vector2(" + this.x + ", " + this.y + ")";
    }
}
