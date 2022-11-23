public class Mainpersona {
    public static void main(String[] args) {
        protected class Persona {
            Persona persona1 = new Persona("Jose", "Palma");
            Persona persona2 = new Persona("Juan", "Garcia");
            Persona persona3 = new Persona("Fran", "Gómez");
            Persona persona4 = new Persona("Alberto", "Palas");
        System.out.println("Persona1");
        persona1.setNombre("Jose");
        persona1.setEdad("27")
        System.out.println("Nombre: "+persona1.getNombre);
        System.out.println("Edad: "+persona1.getEdad);

        persona2.setNombre("Juan");
        persona2.setEdad("17")
        System.out.println("Persona2");
        System.out.println("Nombre: "+persona2.getNombre);
        System.out.println("Edad: "+persona2.getEdad);

        persona3.setNombre("Fran");
        persona3.setEdad("37")
        System.out.println("Persona3");
        System.out.println("Nombre: "+persona3.getNombre);
        System.out.println("Edad: "+persona3.getEdad);

        persona4.setNombre("Alberto");
        persona4.setEdad("87")
         System.out.println("Persona4");
        System.out.println("Nombre: "+persona4.getNombre);
        System.out.println("Edad: "+persona4.getEdad);
        }
    }
}