package com.alipay.android.msp.network;

/* loaded from: classes3.dex */
public enum Protocol {
    HTTP("http"),
    RPC_V1("rpc_v1"),
    RPC_V2("rpc_v2"),
    RPC_SDK_V3("rpc_sdk_v3"),
    RPC_V3("RPC_V3");
    
    private final String protocol;

    Protocol(String str) {
        this.protocol = str;
    }

    public static Protocol get(String str) throws EnumConstantNotPresentException {
        if (str.equals(HTTP.protocol)) {
            return HTTP;
        }
        if (str.equals(RPC_V1.protocol)) {
            return RPC_V1;
        }
        if (str.equals(RPC_V2.protocol)) {
            return RPC_V2;
        }
        if (str.equals(RPC_SDK_V3.protocol)) {
            return RPC_SDK_V3;
        }
        if (!str.equals(RPC_V3.protocol)) {
            throw new EnumConstantNotPresentException(Protocol.class, str);
        }
        return RPC_V3;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
