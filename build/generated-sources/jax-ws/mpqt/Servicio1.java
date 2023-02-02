
package mpqt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicio1", targetNamespace = "http://MPQT/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Servicio1 {


    /**
     * 
     * @param numero
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operation", targetNamespace = "http://MPQT/", className = "mpqt.Operation")
    @ResponseWrapper(localName = "operationResponse", targetNamespace = "http://MPQT/", className = "mpqt.OperationResponse")
    @Action(input = "http://MPQT/servicio1/operationRequest", output = "http://MPQT/servicio1/operationResponse")
    public String operation(
        @WebParam(name = "numero", targetNamespace = "")
        int numero);

}