
package CapaDatos;


public class RegTablaItems {
    private int numitem;
    private RegItem[] _inventario;
    
    public RegTablaItems(){
        _inventario=new RegItem[20];
        _inventario[0]=new RegItem(1,"Mouse ergonomico inalambrico",10, (float) 18.50,70,10,100);
        _inventario[1]=new RegItem(2,"Teclado inalambrico", (float) 15.10,23,80,10,90);
        _inventario[2]=new RegItem(3,"Tarjeta grafica externa",100, (float) 150.30,25,5,50);
        _inventario[3]=new RegItem(4,"Tarjeta de audio externa",70, (float) 89.99,50,7,65);
        _inventario[4]=new RegItem(5,"Disco duro externio",30, (float) 69.99,80,15,110);
        numitem=5;
    }
    
    public void nuevo(int clv, String desc, float vu, float pu, int cant, int reord, int cantped ){
        numitem+=1;
        _inventario[numitem-1]=new RegItem(clv,desc,vu,pu,cant,reord,cantped);
        
    }
    public float venta(int clv, int cantvend){
        float venta=0;
        int n=busca(clv);
        int cantex=_inventario[n].Cantidad()-cantvend;
        if(cantex>0){
            _inventario[n].Cantidad(cantex);
            venta=cantvend*_inventario[n].Preciounitario();
        }
        return venta;
    }
    
    public int busca(int clv){
        int numprd=-1;
        for (int i=0;i<numitem;i++){
            if(_inventario[i].clvItem()==clv)
                numprd=i;
        }
        return numprd;
    }
    
    public void compra(int clv, int cantcomp, float vu){
        int n=busca(clv);
        _inventario[n].Cantidad(_inventario[n].Cantidad()+cantcomp);
        _inventario[n].Valorunitario(vu);
        _inventario[n].Preciounitario((float) (vu*1.1));
    }
    
    public int[] pedido(){
        int k=0;
        int[] prdped=new int[numitem];
        for (int i=0;i<numitem;i++)
            if(_inventario[i].Cantidad()<=_inventario[i].Reorden()){
                prdped[k]=_inventario[i].clvItem();
            k++;
        }
        return prdped;
    }
}