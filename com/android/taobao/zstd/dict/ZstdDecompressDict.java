package com.android.taobao.zstd.dict;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.Zstd;

/* loaded from: classes3.dex */
public class ZstdDecompressDict {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f6415a;

    private native long createDecompressDict(byte[] bArr, int i, int i2);

    private native int freeDecompressDict(long j);

    private static native int loadDecompressDict(long j, byte[] bArr, int i, int i2);

    private static native int refDecompressDict(long j, long j2);

    static {
        Zstd.a();
    }

    public ZstdDecompressDict(byte[] bArr, int i, int i2) {
        Zstd.b();
        if (bArr.length - i < 0) {
            throw new IllegalArgumentException("Dictionary buffer is to short");
        }
        this.f6415a = createDecompressDict(bArr, i, i2);
        if (this.f6415a == 0) {
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        long j = this.f6415a;
        if (j == 0) {
            return;
        }
        freeDecompressDict(j);
        this.f6415a = 0L;
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
        return !Zstd.isError((long) loadDecompressDict(j, bArr, 0, bArr.length));
    }

    public static boolean a(long j, ZstdDecompressDict zstdDecompressDict) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("783d8b61", new Object[]{new Long(j), zstdDecompressDict})).booleanValue();
        }
        Zstd.b();
        if (j == 0) {
            throw new IllegalStateException("Invalid Compress context or stream");
        }
        return !Zstd.isError((long) refDecompressDict(j, zstdDecompressDict.f6415a));
    }
}
