
package CapaDatos;


public class RegTablaClientes {
   private RegClientes[] _clientes;
   
   public RegTablaClientes(){
       _clientes=new RegClientes[20];
       _clientes[0]=new RegClientes("1707922546","Anita Morales","El Condado","2546589");
       _clientes[1]=new RegClientes("1718962551","Oliver Martinez","Carcelen bajo","2290265");
       _clientes[2]=new RegClientes("1716542410","Diana Lopez","La Vicentina","2229970");
       _clientes[3]=new RegClientes("1707922546","Pablo Rojas","Monteserrín","2665447");
       _clientes[4]=new RegClientes("1723666507","Nicole Zambrano","Nayon-Las Palmas","2885998");
       
   }
    
}
