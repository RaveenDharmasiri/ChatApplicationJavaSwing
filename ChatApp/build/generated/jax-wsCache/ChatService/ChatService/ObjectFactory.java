
package ChatService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ChatService package. 
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

    private final static QName _AddThread_QNAME = new QName("http://ChatService/", "addThread");
    private final static QName _CheckNewThreadResponse_QNAME = new QName("http://ChatService/", "checkNewThreadResponse");
    private final static QName _CheckNewThread_QNAME = new QName("http://ChatService/", "checkNewThread");
    private final static QName _AddThreadResponse_QNAME = new QName("http://ChatService/", "addThreadResponse");
    private final static QName _GetThreadMessages_QNAME = new QName("http://ChatService/", "getThreadMessages");
    private final static QName _GetThreadsResponse_QNAME = new QName("http://ChatService/", "getThreadsResponse");
    private final static QName _AddMessageResponse_QNAME = new QName("http://ChatService/", "addMessageResponse");
    private final static QName _CheckNewThreadMessages_QNAME = new QName("http://ChatService/", "checkNewThreadMessages");
    private final static QName _GetThreadMessagesResponse_QNAME = new QName("http://ChatService/", "getThreadMessagesResponse");
    private final static QName _AddMessage_QNAME = new QName("http://ChatService/", "addMessage");
    private final static QName _GetThreads_QNAME = new QName("http://ChatService/", "getThreads");
    private final static QName _CheckNewThreadMessagesResponse_QNAME = new QName("http://ChatService/", "checkNewThreadMessagesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ChatService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddThread }
     * 
     */
    public AddThread createAddThread() {
        return new AddThread();
    }

    /**
     * Create an instance of {@link CheckNewThreadResponse }
     * 
     */
    public CheckNewThreadResponse createCheckNewThreadResponse() {
        return new CheckNewThreadResponse();
    }

    /**
     * Create an instance of {@link CheckNewThread }
     * 
     */
    public CheckNewThread createCheckNewThread() {
        return new CheckNewThread();
    }

    /**
     * Create an instance of {@link AddThreadResponse }
     * 
     */
    public AddThreadResponse createAddThreadResponse() {
        return new AddThreadResponse();
    }

    /**
     * Create an instance of {@link GetThreadMessages }
     * 
     */
    public GetThreadMessages createGetThreadMessages() {
        return new GetThreadMessages();
    }

    /**
     * Create an instance of {@link GetThreadsResponse }
     * 
     */
    public GetThreadsResponse createGetThreadsResponse() {
        return new GetThreadsResponse();
    }

    /**
     * Create an instance of {@link AddMessageResponse }
     * 
     */
    public AddMessageResponse createAddMessageResponse() {
        return new AddMessageResponse();
    }

    /**
     * Create an instance of {@link CheckNewThreadMessages }
     * 
     */
    public CheckNewThreadMessages createCheckNewThreadMessages() {
        return new CheckNewThreadMessages();
    }

    /**
     * Create an instance of {@link GetThreadMessagesResponse }
     * 
     */
    public GetThreadMessagesResponse createGetThreadMessagesResponse() {
        return new GetThreadMessagesResponse();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link GetThreads }
     * 
     */
    public GetThreads createGetThreads() {
        return new GetThreads();
    }

    /**
     * Create an instance of {@link CheckNewThreadMessagesResponse }
     * 
     */
    public CheckNewThreadMessagesResponse createCheckNewThreadMessagesResponse() {
        return new CheckNewThreadMessagesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "addThread")
    public JAXBElement<AddThread> createAddThread(AddThread value) {
        return new JAXBElement<AddThread>(_AddThread_QNAME, AddThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckNewThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "checkNewThreadResponse")
    public JAXBElement<CheckNewThreadResponse> createCheckNewThreadResponse(CheckNewThreadResponse value) {
        return new JAXBElement<CheckNewThreadResponse>(_CheckNewThreadResponse_QNAME, CheckNewThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckNewThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "checkNewThread")
    public JAXBElement<CheckNewThread> createCheckNewThread(CheckNewThread value) {
        return new JAXBElement<CheckNewThread>(_CheckNewThread_QNAME, CheckNewThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "addThreadResponse")
    public JAXBElement<AddThreadResponse> createAddThreadResponse(AddThreadResponse value) {
        return new JAXBElement<AddThreadResponse>(_AddThreadResponse_QNAME, AddThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "getThreadMessages")
    public JAXBElement<GetThreadMessages> createGetThreadMessages(GetThreadMessages value) {
        return new JAXBElement<GetThreadMessages>(_GetThreadMessages_QNAME, GetThreadMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "getThreadsResponse")
    public JAXBElement<GetThreadsResponse> createGetThreadsResponse(GetThreadsResponse value) {
        return new JAXBElement<GetThreadsResponse>(_GetThreadsResponse_QNAME, GetThreadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "addMessageResponse")
    public JAXBElement<AddMessageResponse> createAddMessageResponse(AddMessageResponse value) {
        return new JAXBElement<AddMessageResponse>(_AddMessageResponse_QNAME, AddMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckNewThreadMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "checkNewThreadMessages")
    public JAXBElement<CheckNewThreadMessages> createCheckNewThreadMessages(CheckNewThreadMessages value) {
        return new JAXBElement<CheckNewThreadMessages>(_CheckNewThreadMessages_QNAME, CheckNewThreadMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "getThreadMessagesResponse")
    public JAXBElement<GetThreadMessagesResponse> createGetThreadMessagesResponse(GetThreadMessagesResponse value) {
        return new JAXBElement<GetThreadMessagesResponse>(_GetThreadMessagesResponse_QNAME, GetThreadMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "addMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "getThreads")
    public JAXBElement<GetThreads> createGetThreads(GetThreads value) {
        return new JAXBElement<GetThreads>(_GetThreads_QNAME, GetThreads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckNewThreadMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ChatService/", name = "checkNewThreadMessagesResponse")
    public JAXBElement<CheckNewThreadMessagesResponse> createCheckNewThreadMessagesResponse(CheckNewThreadMessagesResponse value) {
        return new JAXBElement<CheckNewThreadMessagesResponse>(_CheckNewThreadMessagesResponse_QNAME, CheckNewThreadMessagesResponse.class, null, value);
    }

}
