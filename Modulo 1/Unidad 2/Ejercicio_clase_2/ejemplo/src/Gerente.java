public class Gerente extends Empleado implements Trabajable {

    private double bonoActual;

    public Gerente(String nombre, String id, double salario, double bono){
        super(nombre, id, salario);
        this.bonoActual = bono;
    }

    public double getBonoActual(){
        return this.bonoActual;
    }

    public void setBonoActual (double bonoActual) {
        this.bonoActual = bonoActual;
    }

    @Override
    public double calcularSalario(){
        return this.getSalario() + this.bonoActual;
    }

    @Override
    public void mostrarDetalles (){
        super.mostrarDetalles();
        System.out.println("Bono actual: " + bonoActual);
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente está coordinando el equipo y gestionando proyectos.");
    }

}
