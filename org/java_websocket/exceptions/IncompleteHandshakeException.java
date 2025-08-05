package org.java_websocket.exceptions;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class IncompleteHandshakeException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 7906596804233893092L;
    private int preferedSize;

    public IncompleteHandshakeException(int i) {
        this.preferedSize = i;
    }

    public IncompleteHandshakeException() {
        this.preferedSize = 0;
    }

    public int getPreferedSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58faa340", new Object[]{this})).intValue() : this.preferedSize;
    }
}
