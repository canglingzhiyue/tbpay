package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class PreparedStatement extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(PreparedStatement preparedStatement, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native void nativeAddBatch();

    private native long nativeExecuteQuery();

    private native long nativeExecuteUpdate();

    private native int nativeGetParamsCount();

    private native void nativeSetBinary(int i, byte[] bArr, int i2);

    private native void nativeSetDouble(int i, double d);

    private native void nativeSetInt(int i, int i2);

    private native void nativeSetLong(int i, long j);

    private native void nativeSetNull(int i);

    private native void nativeSetString(int i, String str);

    public PreparedStatement(long j) {
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

    public void a(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114003", new Object[]{this, new Integer(i), new Double(d)});
        } else {
            nativeSetDouble(i, d);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            nativeSetInt(i, i2);
        }
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else {
            nativeSetString(i, str);
        }
    }

    public void a(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26218da2", new Object[]{this, new Integer(i), bArr});
        } else {
            nativeSetBinary(i, bArr, bArr.length);
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : nativeGetParamsCount();
    }
}
