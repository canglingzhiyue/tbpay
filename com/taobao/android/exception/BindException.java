package com.taobao.android.exception;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class BindException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_BIND_FAILD = -6;
    public static final int CODE_CLASS_NOT_FOUND = -2;
    public static final int CODE_CONNECTING = -3;
    public static final int CODE_CONNECTION_EXIST = -1;
    public static final int CODE_UNFIND_SERVICE = -4;
    public static final int CODE_UNKNOW = -5;
    public int code;

    static {
        kge.a(1923713663);
    }

    public static /* synthetic */ Object ipc$super(BindException bindException, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -2128160755) {
            if (hashCode != -926732344) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.getMessage();
        }
        return super.toString();
    }

    public BindException(int i, String str) {
        this(i, str, null);
    }

    public BindException(int i, String str, Throwable th) {
        super(str, th);
        this.code = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return super.getMessage() + " code=" + this.code;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + " code=" + this.code;
    }
}
