import java.util.Arrays;

class Vector2D extends VectorND{
    public double x, y;

    public Vector2D(double x, double y){
        super(new double[] {x,y});

        this.x = x;
        this.y = y;

    }

    @Override
    public String toString(){
        return "Vector2D(" + Arrays.toString(this.components) + ")";
    }
}
