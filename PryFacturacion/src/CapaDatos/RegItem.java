package CapaDatos;

public class RegItem {
    private int _clvItem;//codigo de barras
    private String _descipcion;
    private float _valorUnitario;
    private float _precioUnitario;
    private int _cantidad;
    private int _reorden;//punto minimo en stock...cuando llega un  minimo el sistema automaticamente hace el pedido
    private int _cantpedido;

    //constructor
    public RegItem(int _clvItem, String _descipcion, float _valorUnitario, float _precioUnitario, int _cantidad, int _reorden, int _cantpedido) {
        this._clvItem = _clvItem;
        this._descipcion = _descipcion;
        this._valorUnitario = _valorUnitario;
        this._precioUnitario = _precioUnitario;
        this._cantidad = _cantidad;
        this._reorden = _reorden;
        this._cantpedido = _cantpedido;
    }

    //getter y setter
    public int clvItem() {
        return _clvItem;
    }

    public void clvItem(int _clvItem) {
        this._clvItem = _clvItem;
    }

    public String descipcion() {
        return _descipcion;
    }

    public void descipcion(String _descipcion) {
        this._descipcion = _descipcion;
    }

    public float valorUnitario() {
        return _valorUnitario;
    }

    public void valorUnitario(float _valorUnitario) {
        this._valorUnitario = _valorUnitario;
    }

    public float precioUnitario() {
        return _precioUnitario;
    }

    public void precioUnitario(float _precioUnitario) {
        this._precioUnitario = _precioUnitario;
    }

    public int cantidad() {
        return _cantidad;
    }

    public void cantidad(int _cantidad) {
        this._cantidad = _cantidad;
    }

    public int reorden() {
        return _reorden;
    }

    public void reorden(int _reorden) {
        this._reorden = _reorden;
    }

    public int cantpedido() {
        return _cantpedido;
    }

    public void cantpedido(int _cantpedido) {
        this._cantpedido = _cantpedido;
    }
    
}
