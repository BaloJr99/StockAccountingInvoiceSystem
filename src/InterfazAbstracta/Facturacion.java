package InterfazAbstracta;

public interface Facturacion {
    public boolean generar(int folio, String facturas);
    public boolean cancelar(int folio, String facturas);
}
