
package ChatService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkNewThread complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkNewThread">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latestThreadId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkNewThread", propOrder = {
    "latestThreadId"
})
public class CheckNewThread {

    protected int latestThreadId;

    /**
     * Gets the value of the latestThreadId property.
     * 
     */
    public int getLatestThreadId() {
        return latestThreadId;
    }

    /**
     * Sets the value of the latestThreadId property.
     * 
     */
    public void setLatestThreadId(int value) {
        this.latestThreadId = value;
    }

}
