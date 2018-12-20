
package CapaDatos;


public class RegClientes {
    
    private String _cedula;
    private String _nombre;
    private String _direccion;
    private String _Telf;

    public RegClientes(String _cedula, String _nombre, String _direccion, String _Telf) {
        this._cedula = _cedula;
        this._nombre = _nombre;
        this._direccion = _direccion;
        this._Telf = _Telf;
    }
    
    public String Cedula() {
        return _cedula;
    }

    public void Cedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String Direccion() {
        return _direccion;
    }

    public void Direccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String Telf() {
        return _Telf;
    }

    public void Telf(String _Telf) {
        this._Telf = _Telf;
    }

    
}
