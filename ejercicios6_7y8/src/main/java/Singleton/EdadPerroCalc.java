package Singleton;

public class EdadPerroCalc {
    private static EdadPerroCalc instancia;
    public int edad = 0;

    private EdadPerroCalc() { }

    public static EdadPerroCalc getInstance() {
        if (instancia == null) {
            instancia = new EdadPerroCalc();
            System.out.println("Solo pasa una vez aca!!!");
        }

        return instancia;
    }

    public void setCalc(int edad) { this.edad = edad; }

    public int getCalc() {
        return edad/10;
    }
}
