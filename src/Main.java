public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Pedro");
        cliente.setEdad(30);
        cliente.setTelefono(666555111);
        cliente.setCredito(3000);

        System.out.println("Cliente");
        System.out.println("--------------------------------");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());
        System.out.println("--------------------------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Trabajador");
        System.out.println("--------------------------------");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Raul");
        trabajador.setEdad(35);
        trabajador.setTelefono(222123654);
        trabajador.setSalario(2000);

        System.out.println("Cliente");
        System.out.println("--------------------------------");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Credito: " + trabajador.getSalario());


    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    float salario;

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }
}