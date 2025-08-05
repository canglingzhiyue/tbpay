package com.alipay.android.msp.plugin.engine;

import java.net.InetAddress;

/* loaded from: classes3.dex */
public interface IDnsEngine {
    InetAddress[] getInetAddresses(String str);

    void inscLoopCount();

    boolean isClientConnDegrade();

    void updateDns();
}
