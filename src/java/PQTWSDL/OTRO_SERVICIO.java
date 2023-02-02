/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PQTWSDL;

import javax.jws.WebService;

/**
 *
 * @author Lenovo
 */
@WebService(serviceName = "servicio1", portName = "servicio1Port", endpointInterface = "mpqt.Servicio1", targetNamespace = "http://MPQT/", wsdlLocation = "WEB-INF/wsdl/OTRO_SERVICIO/servicio1.wsdl.xml.wsdl")
public class OTRO_SERVICIO {

    public java.lang.String operation(int numero) {
        //TODO implement this method
         return  " DOBLE ES : " + 2*numero + " Y EL CUADRUPLE " + 4*numero;
    }
    
}
