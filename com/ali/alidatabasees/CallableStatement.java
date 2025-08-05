package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class CallableStatement extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CallableStatement callableStatement, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native long nativeExecuteQuery();

    private native long nativeExecuteUpdate();

    public CallableStatement(long j) {
        super(j);
    }

    public Result a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Result) ipChange.ipc$dispatch("75a870b9", new Object[]{this});
        }
        long nativeExecuteUpdate = nativeExecuteUpdate();
        if (nativeExecuteUpdate == 0) {
            return null;
        }
        return new Result(nativeExecuteUpdate);
    }

    public ResultSet b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultSet) ipChange.ipc$dispatch("1049ee7c", new Object[]{this});
        }
        long nativeExecuteQuery = nativeExecuteQuery();
        if (nativeExecuteQuery == 0) {
            return null;
        }
        return new ResultSet(nativeExecuteQuery);
    }
}
