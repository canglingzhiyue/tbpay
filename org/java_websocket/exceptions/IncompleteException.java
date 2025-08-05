package org.java_websocket.exceptions;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class IncompleteException extends Throwable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 7330519489840500997L;
    private int preferredSize;

    public IncompleteException(int i) {
        this.preferredSize = i;
    }

    public int getPreferredSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d90762e6", new Object[]{this})).intValue() : this.preferredSize;
    }
}
