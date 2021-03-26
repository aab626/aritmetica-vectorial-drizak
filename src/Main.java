class Main {
    public static void main(String[] args){
        // Creacion de vectores para pruebas
        ZeroVector v0 = new ZeroVector();

        VectorND v1a = new VectorND(new double[] {0});
        VectorND v1b = new VectorND(new double[] {8});

        Vector2 v2a = new Vector2(1,2);
        Vector2 v2b = new Vector2(0,0);
        Vector2 v2c = new Vector2(-5,13);
        Vector2 v2d = new Vector2(5, -13);

        Vector3 v3a = new Vector3(1,2,3);
        Vector3 v3b = new Vector3(0,0,0);
        Vector3 v3c = new Vector3(0,0,-2);

        VectorND vna = new VectorND(new double[] {1.2,44,5,0,0,0,0,1});
        VectorND vnb = new VectorND(new double[] {0,0,0,0,0});
        VectorND vnc = new VectorND(new double[] {0,1,2,4,5,76,10,0,0,0,0});

        // Pruebas
        // Suma
        System.out.println("Sumas:");

        System.out.println("1. " + v2a + " + " + v3c + " = " + v2a.add(v3c));
        System.out.println("Resultado: " + new VectorND(new double[] {1,2,-2}) + "\n");

        System.out.println("2. " + vna + " + " + v1b + " = " + vna.add(v1b));
        System.out.println("Resultado: " + new VectorND(new double[] {9.2, 44.0, 5.0, 0.0, 0.0, 0.0, 0.0, 1.0}) + "\n");

        System.out.println(" ---------------------------------------- \n");

        // Largo
        System.out.println("Largo:");

        System.out.println("1. " + "||" + v0 + "|| = " + v0.getLength());
        System.out.println("Resultado: 0\n");

        System.out.println("2. " + "||" + v3a + "|| = " + v3a.getLength());
        System.out.println("Resultado: 3.7416573867739413855837487323165\n");

        System.out.println("3. " + "||" + v2a + "|| = " + v2a.getLength());
        System.out.println("Resultado: 2.2360679774997896964091736687313\n");

        System.out.println(" ---------------------------------------- \n");

        // Vector cero (suma)
        System.out.println("Sumas con vector cero:");

        System.out.println("1. " + v0 + " + " + v0 + " = " + v0.add(v0));
        System.out.println("Resultado: " + new ZeroVector() + "\n");

        System.out.println("2. " + v2c + " + " + v0 + " = " + v2c.add(v0));
        System.out.println("Resultado: " + v2c + "\n");

        System.out.println("3. " + v0 + " + " + vnc + " = " + v0.add(vnc));
        System.out.println("Resultado: " + vnc + "\n");

        System.out.println(" ---------------------------------------- \n");

        // Vector cero (chequeo)
        System.out.println("Chequeo de vector cero:");

        System.out.println("1. " + v0 + ": " + v0.isZeroVector());
        System.out.println("Resultado: true\n");

        System.out.println("2. " + vnb + ": " + vnb.isZeroVector());
        System.out.println("Resultado: true\n");

        System.out.println("3. " + v3c + ": " + v3c.isZeroVector());
        System.out.println("Resultado: false\n");

        System.out.println(" ---------------------------------------- \n");

        // Opuestos
        System.out.println("Chequeo de opuestos:");

        System.out.println("1. " + v2c + " opuesto de " + v2d + "? " + v2c.isOppositeTo(v2d));
        System.out.println("Resultado: true\n");

        System.out.println("2. " + v3c + " opuesto de " + vna + "? " + v3c.isOppositeTo(vna));
        System.out.println("Resultado: false\n");

        System.out.println(" ---------------------------------------- \n");

        // Producto Punto
        System.out.println("Producto Punto:");

        System.out.println("1. " + v2a + " dot " + v3a + " = " + v2a.dotProduct(v3a));
        System.out.println("Resultado: 5\n");

        System.out.println("2. " + v1b + " dot " + vna + " = " + v1b.dotProduct(vna));
        System.out.println("Resultado: 9.6\n");

        // Producto Cruz
        System.out.println("Producto Cruz:");

        System.out.println("1. " + v3a + " x " + v3b + " = " + v3a.crossProduct(v3b));
        System.out.println("Resultado: " + new Vector3(0,0,0) + "\n");

        System.out.println("2. " + v3a + " x " + v3c + " = " + v3a.crossProduct(v3c));
        System.out.println("Resultado: " + new Vector3(-4,2,0) + "\n");

        System.out.println("3. " + v3c + " x " + v3a + " = " + v3c.crossProduct(v3a));
        System.out.println("Resultado: " + new Vector3(4,-2,0) + "\n");



    }
}