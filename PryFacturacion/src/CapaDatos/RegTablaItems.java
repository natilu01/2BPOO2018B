package CapaDatos;

public class RegTablaItems {
    private int numitem;//numero de items q se maneja internamente
    private RegItem[] _inventario;
    
    public RegTablaItems(){
        _inventario=new RegItem[20]; 
//hacer la descripcion de cada item de los 5 articulos dados
        _inventario[0]=new RegItem(1,"Cuaderno Universitario 100h cuadros",(float)0.6,(float)0.8,40,5,100);
        _inventario [1]=new RegItem (2,"Cartulinas de colores INEN",(float)0.7,(float)0.10,50,10,200);
        _inventario [2]=new RegItem (3,"Pinturas 12 colores NORMA",(float)1.25,(float)1.30,50,8,100);
        _inventario [3]=new RegItem (4,"Marcadores 12 colores STEDLER",(float)1.30,(float)1.40,50,8,100);
        _inventario [4]=new RegItem (5,"Goma en barra",(float)0.55,(float)0.60,75,10,100);
        
        numitem=5;//
    }
    
    public void nuevo (int clv, String desc, float vu, float pu, int cant,int reord, int cantped){
        numitem+=1;
        //crea registros
        _inventario [numitem-1]=new RegItem(clv, desc, vu, pu, cant, reord, cantped);
    }
    public float venta(int clv, int cantvend){
        float venta=0;
        int n=busca(clv);
        int cantex=_inventario[n].cantidad() - cantvend;
        if (cantex>=0){
            _inventario[n].cantidad(cantex);
            venta=cantvend*_inventario[n].precioUnitario();
        }
        return venta;
    }
    public int busca (int clv){
        int numprd=-1;
        for(int i=0;i<numitem; i++){
            if (_inventario[i].clvItem()==clv){
                numprd=i;
            } 
        }
        
        return numprd;
    }
    public void compra(int clv, int cantcomp,float vu){
        int n=busca (clv);
        _inventario [n].cantidad(_inventario[n].cantidad()+cantcomp);
        _inventario[n].valorUnitario(vu);
        _inventario[n].precioUnitario((float) (vu*1.1));
        return ;
    }
    public int []pedido(){
        int k=0;
        int []prdped=new int [numitem];
        for (int i = 0; i < numitem; i++) {
            if (_inventario[i].cantidad()<=_inventario[i].reorden()) {
                prdped[k]=_inventario[i].clvItem();
                k++;
            }
        }
        return prdped;
    }
}
