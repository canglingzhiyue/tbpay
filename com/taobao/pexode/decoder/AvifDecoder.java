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
import tb.ihq;
import tb.ihy;
import tb.ihz;
import tb.neb;
import tb.nec;
import tb.qol;

/* loaded from: classes.dex */
public class AvifDecoder extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f18689a;
    private static boolean b;
    private static int c;
    private static boolean d;
    private static boolean f;
    private i e = new i();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z, int i);
    }

    private static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : "pexavif";
    }

    public static /* synthetic */ Object ipc$super(AvifDecoder avifDecoder, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private static native boolean nativeDecodeBytesWithOutAddress(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeBytesWithOutBuffer(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native boolean nativeDecodeFdWithOutAddress(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeFdWithOutBuffer(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr);

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

    public static /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            b(str);
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : b;
    }

    public static /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c;
    }

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cab56486", new Object[0]) : f18689a;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        int i = c;
        c = i + 1;
        return i;
    }

    static {
        neb.ALL_EXTENSION_TYPES.add(c.AVIF);
    }

    public AvifDecoder() {
        String e = e();
        try {
            b(e);
        } catch (Throwable th) {
            b = false;
            qol.h(com.taobao.pexode.d.TAG, "system load lib%s.so error=%s", e, th);
        }
    }

    private static void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            ihq.a().a(str, new ihy() { // from class: com.taobao.pexode.decoder.AvifDecoder.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                        return;
                    }
                    AvifDecoder.b(ihzVar != null && ihzVar.g());
                    qol.h(com.taobao.pexode.d.TAG, "load remote lib%s.so status=%b index=%d", str, Boolean.valueOf(AvifDecoder.a()), Integer.valueOf(AvifDecoder.b()));
                    if (AvifDecoder.c() != null) {
                        AvifDecoder.c(false);
                        AvifDecoder.c().a(AvifDecoder.a(), AvifDecoder.b());
                    } else {
                        AvifDecoder.c(true);
                    }
                    h.a().a(AvifDecoder.a());
                    if (AvifDecoder.a() || AvifDecoder.b() >= 2) {
                        return;
                    }
                    AvifDecoder.d();
                    AvifDecoder.a(str);
                }
            });
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (b) {
        } else {
            String e = e();
            this.e.prepare(context);
            qol.f(com.taobao.pexode.d.TAG, "retry load lib%s.so result=%b", e, Boolean.valueOf(b));
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f = z;
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean isSupported(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb701393", new Object[]{this, necVar})).booleanValue() : b && c.AVIF.a(necVar);
    }

    @Override // com.taobao.pexode.decoder.d
    public nec detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("b308357b", new Object[]{this, bArr});
        }
        if (b && c.AVIF.a(bArr)) {
            return c.AVIF;
        }
        return null;
    }

    @Override // com.taobao.pexode.decoder.d
    public com.taobao.pexode.e decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
        Bitmap decodeNormal;
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pexode.e) ipChange.ipc$dispatch("29e98e02", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        if (f && pexodeOptions.fromLocal && (iVar = this.e) != null) {
            return iVar.decode(rewindableStream, pexodeOptions, bVar);
        }
        if (!pexodeOptions.isSizeAvailable()) {
            if (rewindableStream.getInputType() == 1) {
                nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, rewindableStream.getBuffer());
            } else if (rewindableStream.getInputType() == 2) {
                nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, null);
            } else if (rewindableStream.getInputType() == 3) {
                throw new NotSupportedException("Not support stream type when AvifImage decoding!");
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
            qol.h(com.taobao.pexode.d.TAG, "AvifDecoder size unavailable before bitmap decoding", new Object[0]);
            return null;
        }
        if (pexodeOptions.enableAshmem && !com.taobao.pexode.c.a().b) {
            decodeNormal = decodeAshmem(rewindableStream, pexodeOptions, bVar);
        } else if (pexodeOptions.inBitmap != null && !com.taobao.pexode.c.a().f18681a) {
            decodeNormal = decodeInBitmap(rewindableStream, pexodeOptions, bVar);
        } else {
            decodeNormal = decodeNormal(rewindableStream, pexodeOptions);
        }
        qol.h(com.taobao.pexode.d.TAG, "AvifDecoder returnBitmap=%s", decodeNormal);
        return com.taobao.pexode.e.a(decodeNormal);
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException {
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
    public Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
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

    private boolean a(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, boolean z) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c9ea762", new Object[]{this, rewindableStream, pexodeOptions, bitmap, new Boolean(z)})).booleanValue();
        }
        if (e.invalidBitmap(bitmap, pexodeOptions, "AvifDecoder decodeIntoBitmap")) {
            return false;
        }
        byte[] bArr = null;
        if (z) {
            j = e.getPixelAddressFromBitmap(bitmap);
        } else if (Build.VERSION.SDK_INT >= 26) {
            j = e.getPixelAddressFromBitmap(bitmap);
            NdkCore.nativeUnpinBitmap(bitmap);
        } else {
            bArr = getPixelBufferFromBitmap(bitmap);
            j = 0;
        }
        if (rewindableStream.getInputType() == 1) {
            if (bArr != null) {
                return nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, bArr);
            }
            if (j != 0) {
                return nativeDecodeBytesWithOutAddress(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, j);
            }
        } else if (rewindableStream.getInputType() == 2) {
            if (bArr != null) {
                return nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, bArr);
            }
            if (j != 0) {
                return nativeDecodeFdWithOutAddress(rewindableStream.getFD(), pexodeOptions, j);
            }
        }
        return false;
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
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

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AvifDecoder@" + Integer.toHexString(hashCode());
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545af184", new Object[]{aVar});
            return;
        }
        f18689a = aVar;
        if (!d) {
            return;
        }
        f18689a.a(b, c);
    }
}
