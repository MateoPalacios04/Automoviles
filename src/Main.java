public class Main {
   public static void main(String[]args){

        Autos2 bmw= new Autos2();
        bmw.setMarca("BMW");
        bmw.setModelo("i220");
        bmw.setColor("negro");
        bmw.setCilindraje(2.2f);
      /* System.out.println("bmw.leerMarca() =" + bmw.getMarca());
       System.out.println("bmw.getModelo() = " + bmw.getModelo());
       System.out.println("bmw.getColor() = " + bmw.getColor());
       System.out.println("bmw.getCilindraje = " + bmw.getCilindraje());*/

       System.out.println("bmw.detalleVeh() = " + bmw.detalleauto());
    }
}