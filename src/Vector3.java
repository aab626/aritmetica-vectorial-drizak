class Vector3 extends VectorND{
    public double x, y, z;

    public Vector3(double x, double y, double z){
        super(new double[] {x,y,z});

        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString(){
        return "Vector3(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    // Retorna un Vector3 segun el producto cruz entre dos Vector3
    public Vector3 crossProduct(Vector3 otherVector){
        double x = this.y*otherVector.z - this.z*otherVector.y;
        double y = this.z*otherVector.x - this.x*otherVector.z;
        double z = this.x*otherVector.y - this.y*otherVector.x;

        return new Vector3(x,y,z);
    }
}
