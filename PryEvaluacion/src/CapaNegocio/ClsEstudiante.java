
package CapaNegocio;

public class ClsEstudiante {
    //Atributos
    private String _nombre;
    private float[] _notas;
    
    //Constructor

    public ClsEstudiante(String nombre) {
        _nombre = nombre;
        _notas = new float[3];
    }

    public ClsEstudiante(String nombre, float[] notas) {
        _nombre = nombre;
        _notas = notas;
    }
    
    public ClsEstudiante(ClsEstudiante p) {
        _nombre = p._nombre;
        _notas = p._notas;
    }
    
    //Metodos Get & Set

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float[] getNotas() {
        return _notas;
    }

    public void setNotas(float[] _notas) {
        this._notas = _notas;
    }
    
    public void notas(int indice,float valor){
        _notas[indice]=valor; 
    }
    
    public float notas(int indice){
        return _notas[indice];
    }
    
    //Metodos
    
    public boolean exonerado(){
        return _notas[0]+_notas[1] >= 14;
    }
    
    public boolean pierde(){
        return _notas[0]+_notas[1] < 9;
    }
    
    public boolean aprueba(){
        return (_notas[0]+_notas[1]+_notas[2] >= 24) && (_notas[2]>=12);
    }      
    
    public float promedio(){
        float promedio;
        promedio = (_notas[0]+_notas[1])/2;
        if(!exonerado() && !pierde()){
            promedio = (promedio+_notas[2])/3;
        }
        return promedio;        
    }
    
    public String estado(){
        String estado = "Pierde";
        if(exonerado()){
            estado = "Exonerado";
        }else if (aprueba()){
            estado = "Aprueba";
        }
        return estado;
    }

    public String verString(){
        String ver = "El estudiante "+ _nombre;
        ver += estado() + "con promedio de: " + promedio();
        return ver;
    }
    
}
