package com.alibaba.idst.nls.nlsclientsdk.transport;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface ConnectionListener {
    void onClose(int i, String str);

    void onError(Exception exc);

    void onFail(int i, String str);

    void onMessage(String str);

    void onMessage(ByteBuffer byteBuffer);

    void onOpen();
}
