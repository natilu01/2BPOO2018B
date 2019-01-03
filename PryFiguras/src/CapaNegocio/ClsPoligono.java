
package CapaNegocio;

public class ClsPoligono {
    
    private double _lado;
    private double _numLados;

    public ClsPoligono(double _lado, double _numLados) {
        this._lado = _lado;
        this._numLados = _numLados;
    }

    public double lado() {
        return _lado;
    }

    public void lado(double _lado) {
        this._lado = _lado;
    }

    public double numLados() {
        return _numLados;
    }

    public void numLados(double _numLados) {
        this._numLados = _numLados;
    }
    public void Perimetro(){
        float perimetro;
        perimetro =(float)(_numLados * _lado);
    }
}
