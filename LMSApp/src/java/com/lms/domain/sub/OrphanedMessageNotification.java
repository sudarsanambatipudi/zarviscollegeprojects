/**
 * 
 */
package com.lms.domain.sub;

import org.smslib.AGateway;
import org.smslib.IOrphanedMessageNotification;
import org.smslib.InboundMessage;

/**
 * @author Sudarsan
 *
 */
public class OrphanedMessageNotification implements IOrphanedMessageNotification {

    public boolean process(AGateway gateway, InboundMessage msg) {
        System.out.println(">>> Orphaned message part detected from " + gateway.getGatewayId());
        System.out.println(msg);
        // Since we are just testing, return FALSE and keep the orphaned message part.
        return false;
    }
}