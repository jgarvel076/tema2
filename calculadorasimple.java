public class main calculadorasimple {
    //calculadora con suma, resta, división y multiplicación//
    final static Integer a = 2;
    final static Integer b = 3;
    final static Integer c = 6;
    final static Integer d = 2.5;
    final static Integer e = 3.0;

    enum Operacion{
        suma, resta, division, multiplicacion
    }

    public static void main(String[] args){
        calculadorasimple basica = new calculadorasimple();
        Operacion operacionSelecciona = Operacion.multiplicacion;

        basica.suma(2, 3);
        basica.suma(2, 3, 6);

        basica.resta(2, 3);
        basica.resta(2, 3, 6);

    }

}
