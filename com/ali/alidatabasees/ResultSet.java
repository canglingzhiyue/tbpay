package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ResultSet extends Result {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ResultSet resultSet, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native byte[] nativeGetBinary(int i);

    private native byte[] nativeGetBinaryByColumnName(String str);

    private native int nativeGetColumnIndex(String str);

    private native String nativeGetColumnName(int i);

    private native int nativeGetColumnType(int i);

    private native int nativeGetColumnsCount();

    private native double nativeGetDouble(int i);

    private native double nativeGetDoubleByColumnName(String str);

    private native int nativeGetInt(int i);

    private native int nativeGetIntByColumnName(String str);

    private native long nativeGetLong(int i);

    private native long nativeGetLongByColumnName(String str);

    private native String nativeGetString(int i);

    private native String nativeGetStringByColumnName(String str);

    private native boolean nativeNext();

    public ResultSet(long j) {
        super(j);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : nativeNext();
    }

    public String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : nativeGetString(i);
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : nativeGetInt(i);
    }

    public long c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cd", new Object[]{this, new Integer(i)})).longValue() : nativeGetLong(i);
    }

    public byte[] d(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("fac39265", new Object[]{this, new Integer(i)}) : nativeGetBinary(i);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : nativeGetStringByColumnName(str);
    }

    public long b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{this, str})).longValue() : nativeGetLongByColumnName(str);
    }
}
