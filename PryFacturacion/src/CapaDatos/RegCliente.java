
package CapaDatos;

public class RegCliente {
    //ATRIBUTOS
    private String _cedula;
    private String _nombre;
    private String _direccion;
    private String _telefono;
    //CONSTRUCTORES

    public RegCliente(String _cedula, String _nombre, String _direccion, String _telefono) {
        _cedula = _cedula;
        _nombre = _nombre;
        _direccion = _direccion;
        _telefono = _telefono;
    }
    //GETTERS & SETTERS

    public String cedula() {
        return _cedula;
    }

    public void cedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String nombre() {
        return _nombre;
    }

    public void nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String direccion() {
        return _direccion;
    }

    public void direccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String telefono() {
        return _telefono;
    }

    public void telefono(String _telefono) {
        this._telefono = _telefono;
    }
    
    
}
