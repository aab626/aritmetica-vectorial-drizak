import java.util.Arrays;

class ZeroVector extends VectorND{
    public ZeroVector(int length){
        super(new double[length]);
    }

    @Override
    public String toString(){
        return "ZeroVector(" + Arrays.toString(this.components) + ")";
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
