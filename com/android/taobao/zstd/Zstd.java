package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Zstd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_COMPRESS_LEVEL = 3;
    public static final int ZSTD_RESET_PARAMETERS = 2;
    public static final int ZSTD_RESET_SESSION_AND_PARAMETERS = 3;
    public static final int ZSTD_RESET_SESSION_ONLY = 1;

    public static native long compressBound(long j);

    public static native long compressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4, int i5);

    public static native long compressCtx(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native long createCCtx();

    public static native long createDCtx();

    public static native long decompressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native long decompressCtx(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    public static native long decompresseBound(byte[] bArr, long j);

    public static native int destroyCCtx(long j);

    public static native int destroyDCtx(long j);

    public static native String getErrorMessage(long j);

    public static native boolean isError(long j);

    private static native int resetCContextNative(long j, int i);

    private static native int resetDContextNative(long j, int i);

    private static native int setChecksumNative(long j, boolean z);

    private static native int setCompressionLevelNative(long j, int i);

    static {
        a();
    }

    public static synchronized void a() {
        synchronized (Zstd.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                d.c();
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!d.f6413a.get()) {
            throw new IllegalStateException("libzstd.so is not available");
        }
    }

    public static boolean a(long j, int i) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11c72b", new Object[]{new Long(j), new Integer(i)})).booleanValue();
        }
        if (j == 0) {
            throw new IllegalStateException("Invalid Compress context or stream");
        }
        return !isError((long) setCompressionLevelNative(j, i));
    }

    public static boolean a(long j, boolean z) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1206fc", new Object[]{new Long(j), new Boolean(z)})).booleanValue();
        }
        if (j == 0) {
            throw new IllegalStateException("Invalid Compress context or stream");
        }
        return !isError((long) setChecksumNative(j, z));
    }

    public static boolean b(long j, int i) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f8026c", new Object[]{new Long(j), new Integer(i)})).booleanValue();
        }
        if (j == 0) {
            throw new IllegalStateException("Invalid Compress context or stream");
        }
        return !isError((long) resetCContextNative(j, i));
    }

    public static boolean c(long j, int i) throws IllegalStateException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5de3dad", new Object[]{new Long(j), new Integer(i)})).booleanValue();
        }
        if (j == 0) {
            throw new IllegalStateException("Invalid Decompress context or stream");
        }
        return !isError((long) resetDContextNative(j, i));
    }

    public static void a(long j) throws ZstdException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else if (isError(j)) {
            throw new ZstdException(j);
        }
    }

    public static byte[] b(byte[] bArr, int i) throws ZstdException, IllegalStateException, IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4faeb4aa", new Object[]{bArr, new Integer(i)});
        }
        b();
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("compress src is null");
        }
        long compressBound = compressBound(bArr.length);
        if (compressBound > 2147483647L) {
            throw new ZstdException("Max compress size is greater than MAX_INT");
        }
        int i2 = (int) compressBound;
        byte[] bArr2 = new byte[i2];
        long compressByteArray = compressByteArray(bArr2, 0, i2, bArr, 0, bArr.length, i);
        if (isError(compressByteArray)) {
            throw new ZstdException(compressByteArray);
        }
        return Arrays.copyOfRange(bArr2, 0, (int) compressByteArray);
    }

    public static byte[] a(byte[] bArr) throws ZstdException, IllegalStateException, IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        b();
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("decompress src is null");
        }
        long decompresseBound = decompresseBound(bArr, bArr.length);
        if (decompresseBound > 0) {
            if (decompresseBound > 2147483647L) {
                throw new ZstdException("Max decompress size is greater than MAX_INT");
            }
            return a(bArr, (int) decompresseBound);
        }
        throw new ZstdException("Failed to get decompress bound. error:" + decompresseBound);
    }

    public static byte[] a(byte[] bArr, int i) throws ZstdException, IllegalStateException, IllegalArgumentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("bb6a45a9", new Object[]{bArr, new Integer(i)});
        }
        b();
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("decompress src is null");
        }
        byte[] bArr2 = new byte[i];
        long decompressByteArray = decompressByteArray(bArr2, 0, i, bArr, 0, bArr.length);
        if (isError(decompressByteArray)) {
            throw new ZstdException(decompressByteArray);
        }
        return decompressByteArray != ((long) i) ? Arrays.copyOfRange(bArr2, 0, (int) decompressByteArray) : bArr2;
    }
}
