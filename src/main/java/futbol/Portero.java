package futbol;

public class Portero extends Futbolista implements Comparable{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public String toString(){
        return super.toString() +" con el dorsal " +dorsal+". Le han marcado "+ golesRecibidos;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public int compareTo(Object f) {
        return Math.abs(this.golesRecibidos - ((Portero) f).golesRecibidos);
    }

}
