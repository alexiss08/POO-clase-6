package productosestructurapoo;

import javax.swing.JOptionPane;

public class Refrigerados extends Congelados{
    
    protected int cosa;
    
    public Refrigerados(String fechaEnvasado, String paisOrigen, String nombre, String fechaCaducidad, int lote, double temperaturaRecomendada, int cosa) {
        super(fechaEnvasado, paisOrigen, nombre, fechaCaducidad, lote, temperaturaRecomendada);
        this.cosa=cosa;
    }
    
        public void mostrar(){
        JOptionPane.showMessageDialog(null, "Nombre: "+this.nombre+ 
                "\nFecha de caducidad: "+this.fechaCaducidad+ 
                "\nLote # "+this.lote+"\nFecha de envasado: "+this.fechaEnvasado+ 
                "\nPaís de orígen: "+this.paisOrigen+ 
                "\nTemperatura recomendada: "+this.temperaturaRecomendada+ 
                "\nCódigo de observación sanitaria: "+this.cosa);
    }
        
}
