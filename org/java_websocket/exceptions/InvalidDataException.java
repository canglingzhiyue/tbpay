package org.java_websocket.exceptions;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class InvalidDataException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 3731842424390998726L;
    private int closecode;

    public InvalidDataException(int i) {
        this.closecode = i;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.closecode = i;
    }

    public InvalidDataException(int i, Throwable th) {
        super(th);
        this.closecode = i;
    }

    public InvalidDataException(int i, String str, Throwable th) {
        super(str, th);
        this.closecode = i;
    }

    public int getCloseCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d42ffa49", new Object[]{this})).intValue() : this.closecode;
    }
}
