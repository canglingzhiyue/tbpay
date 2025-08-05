package org.ifaa.ifaf.message.keyserver;

/* loaded from: classes9.dex */
public class IfaaKeyServerMessage {
    private int code;
    private String deviceId;
    private String errorMessage;

    public int getCode() {
        return this.code;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }
}
