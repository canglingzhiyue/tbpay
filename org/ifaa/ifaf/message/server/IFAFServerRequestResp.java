package org.ifaa.ifaf.message.server;

import org.ifaa.ifaf.message.IFAFMessage;

/* loaded from: classes9.dex */
public class IFAFServerRequestResp extends IFAFServerMessage {
    private IFAFMessage request;

    public IFAFMessage getRequest() {
        return this.request;
    }

    public void setRequest(IFAFMessage iFAFMessage) {
        this.request = iFAFMessage;
    }
}
