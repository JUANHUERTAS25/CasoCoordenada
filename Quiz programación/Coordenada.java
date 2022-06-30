public class Coordenada
{
    private double x;
    private double y;

    public Coordenada()
    {

    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    /*public void comparar(double z1, double z2)
    {
        if(z1.getX())
        {
            System.out.println("Las coordenadas son iguales");
        }
        else 
        {
            System.out.println("Las coordenadas no son iguales");
        }
    }*/

    public void distanciaPuntos(Coordenada p1, Coordenada p2)
    {
        double distancia;
        distancia = Math.sqrt((x));

    }



    public String toString() 
    {   
        return "(" + x + "," + y + ")";
    }
    
    public boolean equals(Object o)
    {
        Coordenada c2 = (Coordenada)o;
        return (this.x == c2.x) && (this.y==c2.y);
    }



    
}

