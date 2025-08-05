package org.ifaa.ifaf.message.server;

/* loaded from: classes9.dex */
public class DeregisterRequestReq extends IFAFServerMessage {
    private byte certEncode;
    private byte ifaaVersion;
    private String token;

    public byte getCertEncode() {
        return this.certEncode;
    }

    public byte getIfaaVersion() {
        return this.ifaaVersion;
    }

    public String getToken() {
        return this.token;
    }

    public void setCertEncode(byte b) {
        this.certEncode = b;
    }

    public void setIfaaVersion(byte b) {
        this.ifaaVersion = b;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
