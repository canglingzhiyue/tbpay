package org.ifaa.ifaf.message.server;

/* loaded from: classes9.dex */
public class RegisterResponseResp extends IFAFServerMessage {
    private byte authType;
    private String deviceId;
    private String token;

    public byte getAuthType() {
        return this.authType;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getToken() {
        return this.token;
    }

    public void setAuthType(byte b) {
        this.authType = b;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
