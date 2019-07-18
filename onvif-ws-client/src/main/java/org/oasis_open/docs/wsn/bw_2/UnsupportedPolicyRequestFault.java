
package org.oasis_open.docs.wsn.bw_2;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-07-18T11:13:16.322-07:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "UnsupportedPolicyRequestFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnsupportedPolicyRequestFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType unsupportedPolicyRequestFault;

    public UnsupportedPolicyRequestFault() {
        super();
    }

    public UnsupportedPolicyRequestFault(String message) {
        super(message);
    }

    public UnsupportedPolicyRequestFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UnsupportedPolicyRequestFault(String message, org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType unsupportedPolicyRequestFault) {
        super(message);
        this.unsupportedPolicyRequestFault = unsupportedPolicyRequestFault;
    }

    public UnsupportedPolicyRequestFault(String message, org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType unsupportedPolicyRequestFault, java.lang.Throwable cause) {
        super(message, cause);
        this.unsupportedPolicyRequestFault = unsupportedPolicyRequestFault;
    }

    public org.oasis_open.docs.wsn.b_2.UnsupportedPolicyRequestFaultType getFaultInfo() {
        return this.unsupportedPolicyRequestFault;
    }
}
