
package UserService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the UserService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RegistrationOperationResponse_QNAME = new QName("http://UserService/", "registrationOperationResponse");
    private final static QName _LoginOperationResponse_QNAME = new QName("http://UserService/", "loginOperationResponse");
    private final static QName _SendNickName_QNAME = new QName("http://UserService/", "sendNickName");
    private final static QName _LoginOperation_QNAME = new QName("http://UserService/", "loginOperation");
    private final static QName _RegistrationOperation_QNAME = new QName("http://UserService/", "registrationOperation");
    private final static QName _SendNickNameResponse_QNAME = new QName("http://UserService/", "sendNickNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: UserService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginOperationResponse }
     * 
     */
    public LoginOperationResponse createLoginOperationResponse() {
        return new LoginOperationResponse();
    }

    /**
     * Create an instance of {@link SendNickName }
     * 
     */
    public SendNickName createSendNickName() {
        return new SendNickName();
    }

    /**
     * Create an instance of {@link RegistrationOperationResponse }
     * 
     */
    public RegistrationOperationResponse createRegistrationOperationResponse() {
        return new RegistrationOperationResponse();
    }

    /**
     * Create an instance of {@link SendNickNameResponse }
     * 
     */
    public SendNickNameResponse createSendNickNameResponse() {
        return new SendNickNameResponse();
    }

    /**
     * Create an instance of {@link LoginOperation }
     * 
     */
    public LoginOperation createLoginOperation() {
        return new LoginOperation();
    }

    /**
     * Create an instance of {@link RegistrationOperation }
     * 
     */
    public RegistrationOperation createRegistrationOperation() {
        return new RegistrationOperation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserService/", name = "registrationOperationResponse")
    public JAXBElement<RegistrationOperationResponse> createRegistrationOperationResponse(RegistrationOperationResponse value) {
        return new JAXBElement<RegistrationOperationResponse>(_RegistrationOperationResponse_QNAME, RegistrationOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserService/", name = "loginOperationResponse")
    public JAXBElement<LoginOperationResponse> createLoginOperationResponse(LoginOperationResponse value) {
        return new JAXBElement<LoginOperationResponse>(_LoginOperationResponse_QNAME, LoginOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNickName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserService/", name = "sendNickName")
    public JAXBElement<SendNickName> createSendNickName(SendNickName value) {
        return new JAXBElement<SendNickName>(_SendNickName_QNAME, SendNickName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserService/", name = "loginOperation")
    public JAXBElement<LoginOperation> createLoginOperation(LoginOperation value) {
        return new JAXBElement<LoginOperation>(_LoginOperation_QNAME, LoginOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserService/", name = "registrationOperation")
    public JAXBElement<RegistrationOperation> createRegistrationOperation(RegistrationOperation value) {
        return new JAXBElement<RegistrationOperation>(_RegistrationOperation_QNAME, RegistrationOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNickNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UserService/", name = "sendNickNameResponse")
    public JAXBElement<SendNickNameResponse> createSendNickNameResponse(SendNickNameResponse value) {
        return new JAXBElement<SendNickNameResponse>(_SendNickNameResponse_QNAME, SendNickNameResponse.class, null, value);
    }

}
