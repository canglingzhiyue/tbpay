package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.squareup.wire.g;

/* loaded from: classes3.dex */
public enum CmdType implements g {
    IpListUpdate(1),
    ReConnect(2),
    ConnectionDowngrade(3),
    Crash(4);
    
    private final int value;

    CmdType(int i) {
        this.value = i;
    }

    @Override // com.squareup.wire.g
    public int getValue() {
        return this.value;
    }
}
