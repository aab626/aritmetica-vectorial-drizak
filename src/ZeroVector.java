import java.util.Arrays;

class ZeroVector extends VectorND{
    public ZeroVector(){
        super(new double[] {});
    }

    @Override
    public VectorND add(VectorND otherVector){
        return new VectorND(otherVector.components);
    }

    @Override
    public boolean isZeroVector(){
        return true;
    }
}
