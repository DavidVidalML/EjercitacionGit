package misClases

public class Animal
{
    private String raza;
    private String nombre;
    private int edad;
    private boolean desparasitado;
    public Dueño dueño;

    public Animal(String nuevoNombre)
    {
        nombre = nuevoNombre; //Se le da un nombre al animal
    }

    //Método para obtener la edad del animal
    public int getEdad()
    {
        return edad;
    }

    //Método para establecer la edad del animal
    public void setEdad(int nuevaEdad)
    {
        edad = nuevaEdad;
    }

    //Método para obtener el nombre del animal
    public String getNombre()
    {
        return nombre;
    }

    public boolean desparasitado(boolean siono)
    {
        desparasitado = siono;
    }

    public Dueño getDueño()
     {
        return dueño;
    }
}
