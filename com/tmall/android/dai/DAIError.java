package com.tmall.android.dai;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public class DAIError extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errorCode;

    static {
        kge.a(403150132);
    }

    private static String getErrorMessage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e42ba59", new Object[]{new Integer(i)});
        }
        if (i == 201) {
            return "参数错误";
        }
        if (i != 151) {
            return null;
        }
        return "运行超时";
    }

    public DAIError() {
    }

    public DAIError(int i) {
        this(i, getErrorMessage(i));
    }

    public DAIError(int i, String str) {
        this(i, str, null);
    }

    public DAIError(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{errorCode=" + this.errorCode + ", message=" + getMessage() + riy.BLOCK_END_STR;
    }
}
