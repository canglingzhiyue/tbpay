package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class SpdyErrorException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int error;

    public SpdyErrorException(int i) {
        this.error = 0;
        this.error = i;
    }

    public SpdyErrorException(String str, int i) {
        super(str);
        this.error = 0;
        this.error = i;
    }

    public SpdyErrorException(String str, Throwable th, int i) {
        super(str, th);
        this.error = 0;
        this.error = i;
    }

    public SpdyErrorException(Throwable th, int i) {
        super(th);
        this.error = 0;
        this.error = i;
    }

    public int SpdyErrorGetCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5743e27", new Object[]{this})).intValue() : this.error;
    }
}
