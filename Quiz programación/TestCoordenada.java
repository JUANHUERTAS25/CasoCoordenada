public class TestCoordenada {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        c1.setX(1.3);
        c1.setY(5.3);
        Coordenada c2 = new Coordenada(1.3,5.3);
        System.out.println(c1);
        System.out.println(c2);

        //System.out.println(c1.equals(c2));
        
        if(c1.equals(c2)==true)
        {
            System.out.println("Las fechas son iguales");
        }
        else 
        {
            System.out.println("Las fechas no son iguales");
        }

        
    }

    
}
