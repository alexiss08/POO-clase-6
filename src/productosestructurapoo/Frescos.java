package productosestructurapoo;

import javax.swing.JOptionPane;

public class Frescos extends Productos {
    
    protected String fechaEnvasado;
    protected String paisOrigen;

    public Frescos(String fechaEnvasado, String paisOrigen, String nombre, String fechaCaducidad, int lote) {
        super(nombre, fechaCaducidad, lote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: "+this.nombre+ 
                "\nFecha de caducidad: "+this.fechaCaducidad+ 
                "\nLote # "+this.lote+"\nFecha de envasado: "+this.fechaEnvasado+ 
                "\nPaís de orígen: "+this.paisOrigen);
    }
    
}
