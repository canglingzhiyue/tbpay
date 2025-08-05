package com.alibaba.idst.nls.nlsclientsdk.transport;

/* loaded from: classes2.dex */
public interface Connection {
    void close();

    String getId();

    void sendBinary(byte[] bArr);

    void sendText(String str);
}
