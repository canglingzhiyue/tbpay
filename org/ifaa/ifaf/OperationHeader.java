package org.ifaa.ifaf;

/* loaded from: classes9.dex */
public class OperationHeader {
    private String appID;
    private byte authType;
    private String deviceModel;
    private Version ipv;
    private String op;
    private String opType;
    private String serverData;

    public String getAppID() {
        return this.appID;
    }

    public byte getAuthType() {
        return this.authType;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public Version getIpv() {
        return this.ipv;
    }

    public String getOp() {
        return this.op;
    }

    public String getOpType() {
        return this.opType;
    }

    public String getServerData() {
        return this.serverData;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setAuthType(byte b) {
        this.authType = b;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setIpv(Version version) {
        this.ipv = version;
    }

    public void setOp(String str) {
        this.op = str;
    }

    public void setOpType(String str) {
        this.opType = str;
    }

    public void setServerData(String str) {
        this.serverData = str;
    }
}
