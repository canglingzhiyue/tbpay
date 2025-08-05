package com.alipay.security.mobile.util;

import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AsyncCall {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXCEPTION_FUNCERR = 2;
    public static final int EXCEPTION_INTERRUPTED = 3;
    public static final int EXCEPTION_TIMEOUT = 1;
    public static final int EXCEPTION_UNKNOWN = 4;
    public static final int SUCCESS = 0;
    private static final int TIMEOUT = 2000;
    private int exception = 0;

    public int getException() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdb65193", new Object[]{this})).intValue() : this.exception;
    }

    public <T> T callFunc(FutureTask<T> futureTask) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("c934d23a", new Object[]{this, futureTask}) : (T) callFunc(futureTask, 2000);
    }

    public <T> T callFunc(FutureTask<T> futureTask, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("11ba5087", new Object[]{this, futureTask, new Integer(i)});
        }
        this.exception = 0;
        Executors.newSingleThreadExecutor().execute(futureTask);
        AuthenticatorLOG.fpInfo("asyncall call func");
        T t = null;
        try {
            t = futureTask.get(i, TimeUnit.MILLISECONDS);
        } finally {
            try {
                return t;
            } finally {
            }
        }
        return t;
    }
}
