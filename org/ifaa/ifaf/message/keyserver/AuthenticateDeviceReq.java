package org.ifaa.ifaf.message.keyserver;

/* loaded from: classes9.dex */
public class AuthenticateDeviceReq extends IfaaKeyServerMessage {
    private String signature;
    private String signedData;

    public String getSignature() {
        return this.signature;
    }

    public String getSignedData() {
        return this.signedData;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setSignedData(String str) {
        this.signedData = str;
    }
}
