package org.ifaa.ifaf.message.keyserver;

/* loaded from: classes9.dex */
public class AuthenticateDeviceResp extends IfaaKeyServerMessage {
    private boolean isValid;

    public boolean getIsValid() {
        return this.isValid;
    }

    public void setIsValid(boolean z) {
        this.isValid = z;
    }
}
