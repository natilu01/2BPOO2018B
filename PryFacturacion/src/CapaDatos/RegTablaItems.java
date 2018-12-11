package CapaDatos;

public class RegTablaItems {
    private RegItem[] _inventario;
    
    public RegTablaItems(){
        _inventario=new RegItem[20]; 
//hacer la descripcion de cada item de los 5 articulos dados
        _inventario[0]=new RegItem(1,"Cuaderno Universitario 100h cuadros",(float)0.6,(float)0.8,40,5,100);
        _inventario [1]=new RegItem (2,"Cartulinas de colores INEN",(float)0.7,(float)0.10,50,10,200);
        _inventario [2]=new RegItem (3,"Pinturas 12 colores NORMA",(float)1.25,(float)1.30,50,8,100);
        _inventario [3]=new RegItem (4,"Marcadores 12 colores STEDLER",(float)1.30,(float)1.40,50,8,100);
    }
}
