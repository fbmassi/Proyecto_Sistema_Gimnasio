package articulos;

public class ArticuloPersonalizado extends Articulo {
	
    private String descripcion;
    
    public ArticuloPersonalizado(String tipo, String descripcion, int estado_desgaste) {
		super(tipo, estado_desgaste);
		this.setDescripcion(descripcion);
	}
    
    public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public void calcularDesgaste(int estado_desgaste) {
		//DESGASTE PERSONALZADO
	}
}