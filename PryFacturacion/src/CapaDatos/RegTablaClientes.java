
package CapaDatos;

import jdk.nashorn.internal.runtime.regexp.joni.constants.RegexState;

public class RegTablaClientes {
    //ATRIBUTOS
    private RegCliente [] _clientes;//arreglo de clientes
    //CONSTRUCTOR
    public RegTablaClientes() {
        _clientes =new RegCliente[20];
        _clientes[0]=new RegCliente("1712347651","Juan Bermudez","Quito","0998147522");
        _clientes[1]=new RegCliente("1722380571","Nataly Guallichico","Quito","0983556641");
        _clientes[2]=new RegCliente("1752489314","Vicente Gomez","Quito","0954821722");
        _clientes[3]=new RegCliente("1785649345","Luis Guaman","Quito","0948921364");
        _clientes[4]=new RegCliente("1725653823","Rosa Benavides","Quito","0978941354");
    }
    
    
}
