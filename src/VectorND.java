import java.util.Arrays;

class VectorND{
    // Almacena la n-tupla del vector
    public double[] components;

    public VectorND(double[] components){
        this.components = components;
    }

    // Metodo auxiliar para imprimir el array
    public String toString(){
        return "VectorND(" + Arrays.toString(this.components) + ")";
    }

    // Retorna la suma del vector con otro (distinto a un ZeroVector)
    public VectorND add(VectorND otherVector){
        int nMin = Math.min(this.components.length, otherVector.components.length);
        int nMax = Math.max(this.components.length, otherVector.components.length);
        double[] resultComponents = new double[nMax];

        for (int i = 0; i < nMin; i++){
            resultComponents[i] = this.components[i] + otherVector.components[i];
        }

        double[] longestComponents;
        if (this.components.length > otherVector.components.length) {
            longestComponents = this.components;
        } else {
            longestComponents = otherVector.components;
        }

        for (int i = nMin; i < nMax; i++){
            resultComponents[i] = longestComponents[i];
        }

        return new VectorND(resultComponents);
    }

    // Sobrecarga de add para considerar el caso que se suma con un ZeroVector
    public VectorND add(ZeroVector zeroVector){
        return new VectorND(this.components);
    }

    // Retorna la norma del vector
    public double getLength(){
        double length = 0;

        for (int i = 0; i < this.components.length; i++){
            length += Math.pow(this.components[i], 2);
        }

        return Math.sqrt(length);
    }

    // Retorna true si el vector es considerado un ZeroVector, false de lo contrario
    public boolean isZeroVector(){
        for (int i = 0; i < this.components.length; i++){
            if (this.components[i] != 0){
                return false;
            }
        }

        return true;
    }

    // Retorna true si el vector es el opuesto segun v1_i = -v2_i, para todo i
    public boolean isOppositeTo(VectorND otherVector){
        VectorND vectorSum = this.add(otherVector);
        return vectorSum.isZeroVector();
    }

    // Retorna el producto punto entre dos vectores
    public double dotProduct(VectorND otherVector){
        int nMin = Math.min(this.components.length, otherVector.components.length);
        double result = 0;

        for (int i = 0; i < nMin; i++){
            result += this.components[i] * otherVector.components[i];
        }

        return result;
    }
}