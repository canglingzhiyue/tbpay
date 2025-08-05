package com.alipay.android.phone.mobilesdk.socketcraft.exceptions;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class IncompleteHandshakeException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 7906596804233893092L;
    private int newsize;

    public IncompleteHandshakeException(int i) {
        this.newsize = i;
    }

    public IncompleteHandshakeException() {
        this.newsize = 0;
    }

    public int getPreferedSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58faa340", new Object[]{this})).intValue() : this.newsize;
    }
}
