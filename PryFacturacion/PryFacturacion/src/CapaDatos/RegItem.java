
package CapaDatos;

public class RegItem {
    
    private int _clvItem;
    private String _descripcion;
    private float _valorunitario; //valor es a lo que compro
    private float _preciounitario;//precio es a lo que vendo 
    private int _cantidad;
    private int _reorden;//punto minimo de reorden es el punto minimo de stock
    private int _cantpedido;

    public RegItem(int _clvItem, String _descripcion, float _valorunitario, float _preciounitario, int _cantidad, int _reorden, int _cantpedido) {
        this._clvItem = _clvItem;
        this._descripcion = _descripcion;
        this._valorunitario = _valorunitario;
        this._preciounitario = _preciounitario;
        this._cantidad = _cantidad;
        this._reorden = _reorden;
        this._cantpedido = _cantpedido;
    }

    public int clvItem() {
        return _clvItem;
    }

    public void clvItem(int _vlvItem) {
        this._clvItem = _vlvItem;
    }

    public String Descripcion() {
        return _descripcion;
    }

    public void Descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public float Valorunitario() {
        return _valorunitario;
    }

    public void Valorunitario(float _valorunitario) {
        this._valorunitario = _valorunitario;
    }

    public float Preciounitario() {
        return _preciounitario;
    }

    public void Preciounitario(float _preciounitario) {
        this._preciounitario = _preciounitario;
    }

    public int Cantidad() {
        return _cantidad;
    }

    public void Cantidad(int _cantidad) {
        this._cantidad = _cantidad;
    }

    public int Reorden() {
        return _reorden;
    }

    public void Reorden(int _reorden) {
        this._reorden = _reorden;
    }

    public int Cantpedido() {
        return _cantpedido;
    }

    public void Cantpedido(int _cantpedido) {
        this._cantpedido = _cantpedido;
    }
    
   
    
    
    
    
}
