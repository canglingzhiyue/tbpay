package org.ifaa.ifaf.message.server;

/* loaded from: classes9.dex */
public class IFAFServerMessage {
    private int code;
    private String errorMessage;

    public int getCode() {
        return this.code;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }
}
