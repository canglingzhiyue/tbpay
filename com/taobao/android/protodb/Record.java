package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class Record extends NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(Record record, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private native double nativeGetDouble(long j, int i);

    private native double nativeGetDoubleByColumnName(long j, String str);

    private native float nativeGetFloat(long j, int i);

    private native float nativeGetFloatByColumnName(long j, String str);

    private native int nativeGetInt(long j, int i);

    private native int nativeGetIntByColumnName(long j, String str);

    private native long nativeGetLong(long j, int i);

    private native long nativeGetLongByColumnName(long j, String str);

    private native String nativeGetString(long j, int i);

    private native String nativeGetStringByColumnName(long j, String str);

    public Record(long j) {
        super(j);
    }

    public int getInt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9ab0c236", new Object[]{this, new Integer(i)})).intValue() : nativeGetInt(getNativePointer(), i);
    }

    public Long getLong(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("b47f982b", new Object[]{this, new Integer(i)}) : Long.valueOf(nativeGetLong(getNativePointer(), i));
    }

    public float getFloat(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aecf2e66", new Object[]{this, new Integer(i)})).floatValue() : nativeGetFloat(getNativePointer(), i);
    }

    public double getDouble(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("769404e3", new Object[]{this, new Integer(i)})).doubleValue() : nativeGetDouble(getNativePointer(), i);
    }

    public String getString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)}) : nativeGetString(getNativePointer(), i);
    }

    public int getInt(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{this, str})).intValue() : nativeGetIntByColumnName(getNativePointer(), str);
    }

    public long getLong(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{this, str})).longValue() : nativeGetLongByColumnName(getNativePointer(), str);
    }

    public float getFloat(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("676c62a7", new Object[]{this, str})).floatValue() : nativeGetFloatByColumnName(getNativePointer(), str);
    }

    public double getDouble(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("178d7a06", new Object[]{this, str})).doubleValue() : nativeGetDoubleByColumnName(getNativePointer(), str);
    }

    public String getString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str}) : nativeGetStringByColumnName(getNativePointer(), str);
    }
}
