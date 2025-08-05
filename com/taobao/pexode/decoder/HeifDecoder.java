package com.taobao.pexode.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.common.NdkCore;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.NotSupportedException;
import com.taobao.pexode.exception.PexodeException;
import java.io.FileDescriptor;
import java.io.IOException;
import tb.neb;
import tb.nec;
import tb.qol;

/* loaded from: classes7.dex */
public class HeifDecoder extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18691a;
    private static boolean c;
    private i b = new i();

    private static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : "pexheif";
    }

    public static /* synthetic */ Object ipc$super(HeifDecoder heifDecoder, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private static native boolean nativeDecodeBytesWithOutAddress(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeBytesWithOutBuffer(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native boolean nativeDecodeFdWithOutAddress(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeFdWithOutBuffer(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr);

    public static native void nativeFixAlpha(boolean z);

    public static native void nativeFixMemoryOutOfBounds(boolean z);

    public static native void nativeIccSupportEnable(boolean z);

    private static native int nativeLoadedVersionTest();

    public static native void nativeOptMultiThread(boolean z, int i);

    public static native void nativeUseBugFix(boolean z);

    @Override // com.taobao.pexode.decoder.d
    public boolean acceptInputType(int i, nec necVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2fcc7314", new Object[]{this, new Integer(i), necVar, new Boolean(z)})).booleanValue() : i != 3;
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean canDecodeIncrementally(nec necVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bac5b18", new Object[]{this, necVar})).booleanValue();
        }
        return false;
    }

    static {
        neb.ALL_EXTENSION_TYPES.add(g.HEIF);
        String b = b();
        try {
            System.loadLibrary(b);
            f18691a = nativeLoadedVersionTest() == 2;
            qol.f(com.taobao.pexode.d.TAG, "system load lib%s.so result=%b", b, Boolean.valueOf(f18691a));
        } catch (UnsatisfiedLinkError e) {
            qol.h(com.taobao.pexode.d.TAG, "system load lib%s.so error=%s", b, e);
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else if (!f18691a) {
        } else {
            nativeUseBugFix(z);
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
        } else if (!f18691a) {
        } else {
            nativeFixAlpha(z);
        }
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{new Boolean(z)});
        } else if (!f18691a) {
        } else {
            nativeFixMemoryOutOfBounds(z);
        }
    }

    public static void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{new Boolean(z), new Integer(i)});
        } else if (!f18691a) {
        } else {
            nativeOptMultiThread(z, i);
        }
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{new Boolean(z)});
        } else if (!f18691a) {
        } else {
            nativeIccSupportEnable(z);
        }
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c;
    }

    @Override // com.taobao.pexode.decoder.d
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (f18691a) {
        } else {
            String b = b();
            f18691a = com.taobao.pexode.common.d.a(b, 2) && GifImage.nativeLoadedVersionTest() == 2;
            this.b.prepare(context);
            qol.f(com.taobao.pexode.d.TAG, "retry load lib%s.so result=%b", b, Boolean.valueOf(f18691a));
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean isSupported(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb701393", new Object[]{this, necVar})).booleanValue() : f18691a && g.HEIF.a(necVar);
    }

    @Override // com.taobao.pexode.decoder.d
    public nec detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("b308357b", new Object[]{this, bArr});
        }
        if (f18691a && g.HEIF.a(bArr)) {
            return g.HEIF;
        }
        return null;
    }

    private boolean a(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c9ea762", new Object[]{this, rewindableStream, pexodeOptions, bitmap, new Boolean(z)})).booleanValue();
        }
        if (e.invalidBitmap(bitmap, pexodeOptions, "HeifDecoder decodeIntoBitmap")) {
            return false;
        }
        byte[] bArr = null;
        if (z) {
            j = e.getPixelAddressFromBitmap(bitmap);
        } else if (Build.VERSION.SDK_INT >= 26) {
            j = e.getPixelAddressFromBitmap(bitmap);
        } else {
            bArr = getPixelBufferFromBitmap(bitmap);
            j = 0;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType != 1) {
            if (inputType == 2) {
                if (bArr != null) {
                    return nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, bArr);
                }
                if (j != 0) {
                    return nativeDecodeFdWithOutAddress(rewindableStream.getFD(), pexodeOptions, j);
                }
            }
        } else if (bArr != null) {
            return nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, bArr);
        } else {
            if (j != 0) {
                boolean nativeDecodeBytesWithOutAddress = nativeDecodeBytesWithOutAddress(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, j);
                if (!z) {
                    NdkCore.nativeUnpinBitmap(bitmap);
                }
                return nativeDecodeBytesWithOutAddress;
            }
        }
        return false;
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a8d841ea", new Object[]{this, rewindableStream, pexodeOptions});
        }
        Bitmap newBitmap = e.newBitmap(pexodeOptions, false);
        if (!a(rewindableStream, pexodeOptions, newBitmap, false)) {
            return null;
        }
        return newBitmap;
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws IOException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("798d3b79", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        if (a(rewindableStream, pexodeOptions, pexodeOptions.inBitmap, false)) {
            return pexodeOptions.inBitmap;
        }
        Bitmap bitmap = null;
        if (!com.taobao.pexode.c.a(pexodeOptions) && pexodeOptions.allowDegrade2NoInBitmap) {
            rewindableStream.rewind();
            bitmap = decodeNormal(rewindableStream, pexodeOptions);
            if (!com.taobao.pexode.c.a(pexodeOptions)) {
                if (bitmap == null) {
                    z = false;
                }
                bVar.c(z);
            }
        }
        return bitmap;
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws IOException {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8722de64", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        Bitmap newBitmap = e.newBitmap(pexodeOptions, true);
        if (a(rewindableStream, pexodeOptions, newBitmap, true)) {
            return newBitmap;
        }
        Bitmap bitmap = null;
        if (!com.taobao.pexode.c.a(pexodeOptions) && pexodeOptions.allowDegrade2NoAshmem) {
            rewindableStream.rewind();
            bitmap = decodeNormal(rewindableStream, pexodeOptions);
            if (!com.taobao.pexode.c.a(pexodeOptions)) {
                if (bitmap != null) {
                    z = true;
                }
                bVar.b(z);
            }
        }
        return bitmap;
    }

    @Override // com.taobao.pexode.decoder.d
    public com.taobao.pexode.e decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
        Bitmap decodeNormal;
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pexode.e) ipChange.ipc$dispatch("29e98e02", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        if (c && pexodeOptions.fromLocal && (iVar = this.b) != null) {
            return iVar.decode(rewindableStream, pexodeOptions, bVar);
        }
        if (!pexodeOptions.isSizeAvailable()) {
            int inputType = rewindableStream.getInputType();
            if (inputType == 1) {
                nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, null);
            } else if (inputType == 2) {
                nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, null);
            } else if (inputType == 3) {
                throw new NotSupportedException("Not support stream type when HeifImage decoding!");
            }
        } else if (pexodeOptions.sampleSize != com.taobao.pexode.c.b(pexodeOptions)) {
            int i = pexodeOptions.outWidth;
            pexodeOptions.outWidth = i / pexodeOptions.sampleSize;
            pexodeOptions.outHeight = (pexodeOptions.outHeight * pexodeOptions.outWidth) / i;
        }
        com.taobao.pexode.c.a(pexodeOptions, pexodeOptions.sampleSize);
        if (pexodeOptions.justDecodeBounds || com.taobao.pexode.c.a(pexodeOptions)) {
            return null;
        }
        if (!pexodeOptions.isSizeAvailable()) {
            qol.h(com.taobao.pexode.d.TAG, "HeifDecoder size unavailable before bitmap decoding", new Object[0]);
            return null;
        }
        if (pexodeOptions.enableAshmem && !com.taobao.pexode.c.a().b) {
            decodeNormal = decodeAshmem(rewindableStream, pexodeOptions, bVar);
        } else if (pexodeOptions.inBitmap != null && !com.taobao.pexode.c.a().f18681a) {
            decodeNormal = decodeInBitmap(rewindableStream, pexodeOptions, bVar);
        } else {
            decodeNormal = decodeNormal(rewindableStream, pexodeOptions);
        }
        return com.taobao.pexode.e.a(decodeNormal);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "HeifDecoder@" + Integer.toHexString(hashCode());
    }
}
