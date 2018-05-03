
package ChatService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkNewThreadMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkNewThreadMessages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threadId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latestMessageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkNewThreadMessages", propOrder = {
    "threadId",
    "latestMessageId"
})
public class CheckNewThreadMessages {

    protected String threadId;
    protected int latestMessageId;

    /**
     * Gets the value of the threadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadId() {
        return threadId;
    }

    /**
     * Sets the value of the threadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadId(String value) {
        this.threadId = value;
    }

    /**
     * Gets the value of the latestMessageId property.
     * 
     */
    public int getLatestMessageId() {
        return latestMessageId;
    }

    /**
     * Sets the value of the latestMessageId property.
     * 
     */
    public void setLatestMessageId(int value) {
        this.latestMessageId = value;
    }

}
