package com.ali.user.open.core.exception;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class SecRuntimeException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -2429061914258524220L;
    private int secCode;

    static {
        kge.a(1317761208);
    }

    public static /* synthetic */ Object ipc$super(SecRuntimeException secRuntimeException, String str, Object... objArr) {
        if (str.hashCode() == -926732344) {
            return super.getMessage();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public SecRuntimeException(int i, Throwable th) {
        super(th);
        this.secCode = i;
    }

    public int getErrorCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5461de59", new Object[]{this})).intValue() : this.secCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return super.getMessage() + " secCode = " + this.secCode;
    }
}
