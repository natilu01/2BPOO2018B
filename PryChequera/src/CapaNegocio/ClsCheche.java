
package CapaNegocio;
import org.bolivia.qulqi.Qulqi;
import org.bolivia.qulqi.Qulqi$COIN;
import org.bolivia.qulqi.Qulqi$FLOATING;

public class ClsCheche {
    private String _nombre;
    private float[] _cantidad;
    
//CONSTRUCTOR
    
    public ClsCheche(String _nombre, float[] _cantidad) {
        this._nombre = _nombre;
        this._cantidad = _cantidad;
    }
//GET & SET
    public String nombre() {
        return _nombre;
    }

    public void nombre(String nombre) {
        this._nombre = nombre;
    }

    public float[] cantidad() {
        return _cantidad;
    }

    public void cantidad(float[] cantidad) {
        this._cantidad = cantidad;
    }

    
    
}
