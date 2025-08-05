package org.ifaa.ifaf.message.server;

/* loaded from: classes9.dex */
public class RegisterRequestReq {
    private byte authType;
    private byte certEncode;
    private byte ifaaVersion;

    public byte getAuthType() {
        return this.authType;
    }

    public byte getCertEncode() {
        return this.certEncode;
    }

    public byte getIfaaVersion() {
        return this.ifaaVersion;
    }

    public void setAuthType(byte b) {
        this.authType = b;
    }

    public void setCertEncode(byte b) {
        this.certEncode = b;
    }

    public void setIfaaVersion(byte b) {
        this.ifaaVersion = b;
    }
}
