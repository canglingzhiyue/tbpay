package com.android.taobao.zstd.dict;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.Zstd;

/* loaded from: classes3.dex */
public class ZstdCompressDict {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f6414a;

    private native long createCompressDict(byte[] bArr, int i, int i2, int i3);

    private native int freeCompressDict(long j);

    private static native int loadCompressDict(long j, byte[] bArr, int i, int i2);

    private static native int refCompressDict(long j, long j2);

    static {
        Zstd.a();
    }

    public static boolean a(long j, byte[] bArr) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("262fa527", new Object[]{new Long(j), bArr})).booleanValue();
        }
        Zstd.b();
        if (j == 0) {
            throw new IllegalStateException("Invalid Compress context or stream");
        }
        return !Zstd.isError((long) loadCompressDict(j, bArr, 0, bArr.length));
    }

    public static boolean a(long j, ZstdCompressDict zstdCompressDict) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2ee8d82", new Object[]{new Long(j), zstdCompressDict})).booleanValue();
        }
        Zstd.b();
        if (j == 0) {
            throw new IllegalStateException("Invalid Compress context or stream");
        }
        return !Zstd.isError((long) refCompressDict(j, zstdCompressDict.f6414a));
    }
}
