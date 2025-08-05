package com.taobao.pexode.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.entity.a;
import com.taobao.pexode.exception.IncrementalDecodeException;
import com.taobao.pexode.exception.PexodeException;
import java.io.FileDescriptor;
import java.io.IOException;
import tb.ihq;
import tb.ihy;
import tb.ihz;
import tb.kge;
import tb.neb;
import tb.nec;
import tb.qol;

/* loaded from: classes7.dex */
public class WebPDecoder extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LIBRARY_JNI_VERSION = 2;
    private static final int MAX_RETRY_TIME = 2;
    private static final int NATIVE_RET_DECODE_OK = 0;
    private static final int NATIVE_RET_NULL_STRAIGHT = 2;
    private static final int NATIVE_RET_TRY_DEGRADING = 1;
    private static final int VP8_STATUS_OK = 0;
    private static final int VP8_STATUS_REQUEST_CANCELLED = -6;
    private static final int VP8_STATUS_SUSPENDED = 5;
    private static boolean remoteSoValid;
    private static boolean sIsSoInstalled;
    private static int sRetryTime;
    private final a.InterfaceC0750a CONFIG_OUT_DESTRUCTOR = new a.InterfaceC0750a() { // from class: com.taobao.pexode.decoder.WebPDecoder.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.pexode.entity.a.InterfaceC0750a
        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                WebPDecoder.access$400(j);
            }
        }
    };

    private static String getLibraryName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f7797849", new Object[0]) : "pexwebp";
    }

    public static /* synthetic */ Object ipc$super(WebPDecoder webPDecoder, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private static native int nativeDecodeBytesIncrementally(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeBytesWithOutAddress(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j);

    private static native int nativeDecodeBytesWithOutAddressIncrementally(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, long j, long[] jArr);

    private static native boolean nativeDecodeBytesWithOutBuffer(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native int nativeDecodeBytesWithOutBufferIncrementally(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions, byte[] bArr2, long[] jArr);

    private static native int nativeDecodeFdIncrementally(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeFdWithOutAddress(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j);

    private static native int nativeDecodeFdWithOutAddressIncrementally(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, long j, long[] jArr);

    private static native boolean nativeDecodeFdWithOutBuffer(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr);

    private static native int nativeDecodeFdWithOutBufferIncrementally(FileDescriptor fileDescriptor, PexodeOptions pexodeOptions, byte[] bArr, long[] jArr);

    private static native int nativeDecodeStreamIncrementally(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, long j);

    private static native boolean nativeDecodeStreamWithOutAddress(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, long j);

    private static native int nativeDecodeStreamWithOutAddressIncrementally(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, long j, long[] jArr);

    private static native boolean nativeDecodeStreamWithOutBuffer(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, byte[] bArr2);

    private static native int nativeDecodeStreamWithOutBufferIncrementally(RewindableStream rewindableStream, byte[] bArr, PexodeOptions pexodeOptions, byte[] bArr2, long[] jArr);

    private static native void nativeDestructConfigOut(long j);

    private static native int nativeLoadedVersionTest();

    @Override // com.taobao.pexode.decoder.d
    public boolean acceptInputType(int i, nec necVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fcc7314", new Object[]{this, new Integer(i), necVar, new Boolean(z)})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue() : sIsSoInstalled;
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        sIsSoInstalled = z;
        return z;
    }

    public static /* synthetic */ int access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1bc42ab", new Object[0])).intValue() : nativeLoadedVersionTest();
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue() : sRetryTime;
    }

    public static /* synthetic */ int access$208() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("271339f4", new Object[0])).intValue();
        }
        int i = sRetryTime;
        sRetryTime = i + 1;
        return i;
    }

    public static /* synthetic */ void access$300(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58bc884", new Object[]{str});
        } else {
            loadRemoteSo(str);
        }
    }

    public static /* synthetic */ void access$400(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7011a9", new Object[]{new Long(j)});
        } else {
            nativeDestructConfigOut(j);
        }
    }

    static {
        kge.a(-1986405298);
        remoteSoValid = false;
        try {
            Class.forName("tb.ihq");
            remoteSoValid = true;
        } catch (Throwable th) {
            qol.h(com.taobao.pexode.d.TAG, "remote so module not import", th);
        }
    }

    public WebPDecoder() {
        String libraryName = getLibraryName();
        try {
            loadRemoteSo(libraryName);
        } catch (Throwable th) {
            sIsSoInstalled = false;
            qol.h(com.taobao.pexode.d.TAG, "system load lib%s.so error=%s", libraryName, th);
        }
    }

    private static void loadRemoteSo(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8840d9", new Object[]{str});
            return;
        }
        qol.h(com.taobao.pexode.d.TAG, "start load remote lib%s.so status=%b index=%d", str, Boolean.valueOf(sIsSoInstalled), Integer.valueOf(sRetryTime));
        if (!remoteSoValid) {
            return;
        }
        ihq.a().a(str, new ihy() { // from class: com.taobao.pexode.decoder.WebPDecoder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihy
            public void onLoadFinished(ihz ihzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
                    return;
                }
                WebPDecoder.access$002(ihzVar != null && ihzVar.g() && WebPDecoder.access$100() == 2);
                qol.h(com.taobao.pexode.d.TAG, "load remote lib%s.so finish status=%b index=%d", str, Boolean.valueOf(WebPDecoder.access$000()), Integer.valueOf(WebPDecoder.access$200()));
                if (WebPDecoder.access$000() || WebPDecoder.access$200() >= 2) {
                    return;
                }
                WebPDecoder.access$208();
                WebPDecoder.access$300(str);
            }
        });
    }

    @Override // com.taobao.pexode.decoder.d
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (sIsSoInstalled) {
        } else {
            String libraryName = getLibraryName();
            sIsSoInstalled = com.taobao.pexode.common.d.a(libraryName, 2) && nativeLoadedVersionTest() == 2;
            qol.f(com.taobao.pexode.d.TAG, "retry load lib%s.so result=%b", libraryName, Boolean.valueOf(sIsSoInstalled));
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean canDecodeIncrementally(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7bac5b18", new Object[]{this, necVar})).booleanValue() : isSupported(necVar);
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean isSupported(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb701393", new Object[]{this, necVar})).booleanValue() : sIsSoInstalled && necVar != null && neb.WEBP.a().equals(necVar.a());
    }

    @Override // com.taobao.pexode.decoder.d
    public nec detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("b308357b", new Object[]{this, bArr});
        }
        if (!sIsSoInstalled) {
            return null;
        }
        if (neb.WEBP.a(bArr)) {
            return neb.WEBP;
        }
        if (!neb.WEBP_A.a(bArr)) {
            return null;
        }
        return neb.WEBP_A;
    }

    private int decodeFirstIncrementally(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, boolean z) throws PexodeException {
        byte[] pixelBufferFromBitmap;
        long j;
        long[] jArr;
        int nativeDecodeBytesWithOutBufferIncrementally;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad6a1295", new Object[]{this, rewindableStream, pexodeOptions, bitmap, new Boolean(z)})).intValue();
        }
        if (invalidBitmap(bitmap, pexodeOptions, "decodeFirstIncrementally")) {
            return 1;
        }
        if (z) {
            j = getPixelAddressFromBitmap(bitmap);
            pixelBufferFromBitmap = null;
        } else {
            pixelBufferFromBitmap = getPixelBufferFromBitmap(bitmap);
            j = 0;
        }
        if (pixelBufferFromBitmap == null && j == 0) {
            return 1;
        }
        long[] jArr2 = new long[1];
        int inputType = rewindableStream.getInputType();
        if (inputType != 1) {
            if (inputType != 2) {
                byte[] a2 = com.taobao.pexode.c.a().a(2048);
                if (z) {
                    long j2 = j;
                    bArr = a2;
                    nativeDecodeBytesWithOutBufferIncrementally = nativeDecodeStreamWithOutAddressIncrementally(rewindableStream, a2, pexodeOptions, j2, jArr2);
                } else {
                    bArr = a2;
                    nativeDecodeBytesWithOutBufferIncrementally = nativeDecodeStreamWithOutBufferIncrementally(rewindableStream, bArr, pexodeOptions, pixelBufferFromBitmap, jArr2);
                }
                com.taobao.pexode.c.a().a(bArr);
            } else if (z) {
                nativeDecodeBytesWithOutBufferIncrementally = nativeDecodeFdWithOutAddressIncrementally(rewindableStream.getFD(), pexodeOptions, j, jArr2);
            } else {
                nativeDecodeBytesWithOutBufferIncrementally = nativeDecodeFdWithOutBufferIncrementally(rewindableStream.getFD(), pexodeOptions, pixelBufferFromBitmap, jArr2);
            }
            jArr = jArr2;
        } else if (z) {
            long j3 = j;
            jArr = jArr2;
            nativeDecodeBytesWithOutBufferIncrementally = nativeDecodeBytesWithOutAddressIncrementally(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, j3, jArr2);
        } else {
            jArr = jArr2;
            nativeDecodeBytesWithOutBufferIncrementally = nativeDecodeBytesWithOutBufferIncrementally(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, pixelBufferFromBitmap, jArr);
        }
        com.taobao.pexode.entity.a aVar = new com.taobao.pexode.entity.a(bitmap, jArr[0], this.CONFIG_OUT_DESTRUCTOR);
        if (nativeDecodeBytesWithOutBufferIncrementally != 5 || com.taobao.pexode.c.a(pexodeOptions)) {
            aVar.c();
        }
        if (nativeDecodeBytesWithOutBufferIncrementally == -6) {
            return 2;
        }
        if (nativeDecodeBytesWithOutBufferIncrementally != 0 && nativeDecodeBytesWithOutBufferIncrementally != 5) {
            return 1;
        }
        com.taobao.pexode.c.a(pexodeOptions, aVar);
        return nativeDecodeBytesWithOutBufferIncrementally == 5 ? 2 : 0;
    }

    private int decodeLaterIncrementally(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.entity.a aVar) throws PexodeException {
        int nativeDecodeBytesIncrementally;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6942e73e", new Object[]{this, rewindableStream, pexodeOptions, aVar})).intValue();
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            nativeDecodeBytesIncrementally = nativeDecodeBytesIncrementally(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, aVar.b());
        } else if (inputType == 2) {
            nativeDecodeBytesIncrementally = nativeDecodeFdIncrementally(rewindableStream.getFD(), pexodeOptions, aVar.b());
        } else {
            byte[] a2 = com.taobao.pexode.c.a().a(2048);
            nativeDecodeBytesIncrementally = nativeDecodeStreamIncrementally(rewindableStream, a2, pexodeOptions, aVar.b());
            com.taobao.pexode.c.a().a(a2);
        }
        if (nativeDecodeBytesIncrementally != 5 || com.taobao.pexode.c.a(pexodeOptions)) {
            aVar.c();
        }
        if (nativeDecodeBytesIncrementally == 5 || nativeDecodeBytesIncrementally == -6) {
            return 2;
        }
        if (nativeDecodeBytesIncrementally == 0) {
            return 0;
        }
        throw new IncrementalDecodeException("native decode bytes with buffer incrementally error, status=" + nativeDecodeBytesIncrementally);
    }

    private int decodeInBitmapBuffer(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap) {
        byte[] pixelBufferFromBitmap;
        boolean nativeDecodeBytesWithOutBuffer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("713cae08", new Object[]{this, rewindableStream, pexodeOptions, bitmap})).intValue();
        }
        if (invalidBitmap(bitmap, pexodeOptions, "decodeInBitmapBuffer") || (pixelBufferFromBitmap = getPixelBufferFromBitmap(bitmap)) == null) {
            return 1;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            nativeDecodeBytesWithOutBuffer = nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, pixelBufferFromBitmap);
        } else if (inputType == 2) {
            nativeDecodeBytesWithOutBuffer = nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, pixelBufferFromBitmap);
        } else {
            byte[] a2 = com.taobao.pexode.c.a().a(2048);
            nativeDecodeBytesWithOutBuffer = nativeDecodeStreamWithOutBuffer(rewindableStream, a2, pexodeOptions, pixelBufferFromBitmap);
            com.taobao.pexode.c.a().a(a2);
        }
        return nativeDecodeBytesWithOutBuffer ? 0 : 1;
    }

    private static int decodeInBitmapAddress(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap) {
        boolean nativeDecodeBytesWithOutAddress;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bce7fad8", new Object[]{rewindableStream, pexodeOptions, bitmap})).intValue();
        }
        if (invalidBitmap(bitmap, pexodeOptions, "decodeInBitmapAddress")) {
            return 1;
        }
        long pixelAddressFromBitmap = getPixelAddressFromBitmap(bitmap);
        if (pixelAddressFromBitmap == 0) {
            return 1;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            nativeDecodeBytesWithOutAddress = nativeDecodeBytesWithOutAddress(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, pixelAddressFromBitmap);
        } else if (inputType == 2) {
            nativeDecodeBytesWithOutAddress = nativeDecodeFdWithOutAddress(rewindableStream.getFD(), pexodeOptions, pixelAddressFromBitmap);
        } else {
            byte[] a2 = com.taobao.pexode.c.a().a(2048);
            nativeDecodeBytesWithOutAddress = nativeDecodeStreamWithOutAddress(rewindableStream, a2, pexodeOptions, pixelAddressFromBitmap);
            com.taobao.pexode.c.a().a(a2);
        }
        return nativeDecodeBytesWithOutAddress ? 0 : 1;
    }

    private int decodeReturnInBuffer(RewindableStream rewindableStream, PexodeOptions pexodeOptions, Bitmap bitmap, com.taobao.pexode.entity.a aVar, boolean z, boolean z2) throws PexodeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82599b52", new Object[]{this, rewindableStream, pexodeOptions, bitmap, aVar, new Boolean(z), new Boolean(z2)})).intValue();
        }
        if (!z) {
            return decodeInBitmapBuffer(rewindableStream, pexodeOptions, bitmap);
        }
        if (z2) {
            return decodeFirstIncrementally(rewindableStream, pexodeOptions, bitmap, false);
        }
        return decodeLaterIncrementally(rewindableStream, pexodeOptions, aVar);
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a8d841ea", new Object[]{this, rewindableStream, pexodeOptions});
        }
        boolean z = pexodeOptions.incrementalDecode;
        com.taobao.pexode.entity.a c = com.taobao.pexode.c.c(pexodeOptions);
        boolean z2 = c == null;
        Bitmap newBitmap = (!z || z2) ? newBitmap(pexodeOptions, false) : null;
        int decodeReturnInBuffer = decodeReturnInBuffer(rewindableStream, pexodeOptions, newBitmap, c, z, z2);
        if (decodeReturnInBuffer == 0) {
            return z ? com.taobao.pexode.c.c(pexodeOptions).a() : newBitmap;
        } else if (1 == decodeReturnInBuffer && z) {
            throw new IncrementalDecodeException("incremental decoding error at the first and cannot degrade now");
        } else {
            return null;
        }
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("798d3b79", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        boolean z2 = pexodeOptions.incrementalDecode;
        com.taobao.pexode.entity.a c = com.taobao.pexode.c.c(pexodeOptions);
        int decodeReturnInBuffer = decodeReturnInBuffer(rewindableStream, pexodeOptions, pexodeOptions.inBitmap, c, z2, c == null);
        if (decodeReturnInBuffer == 0) {
            if (z2) {
                return com.taobao.pexode.c.c(pexodeOptions).a();
            }
            return pexodeOptions.inBitmap;
        }
        Bitmap bitmap = null;
        if (2 == decodeReturnInBuffer) {
            return null;
        }
        if (!com.taobao.pexode.c.a(pexodeOptions) && pexodeOptions.allowDegrade2NoInBitmap) {
            rewindableStream.rewind();
            bitmap = decodeNormal(rewindableStream, pexodeOptions);
            if (!com.taobao.pexode.c.a(pexodeOptions)) {
                if (bitmap == null && !z2) {
                    z = false;
                }
                bVar.c(z);
            }
        }
        return bitmap;
    }

    @Override // com.taobao.pexode.decoder.e
    public Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
        int decodeInBitmapAddress;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8722de64", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        boolean z2 = pexodeOptions.incrementalDecode;
        com.taobao.pexode.entity.a c = com.taobao.pexode.c.c(pexodeOptions);
        boolean z3 = c == null;
        Bitmap bitmap = null;
        Bitmap newBitmap = (!z2 || z3) ? newBitmap(pexodeOptions, true) : null;
        if (!z2) {
            decodeInBitmapAddress = decodeInBitmapAddress(rewindableStream, pexodeOptions, newBitmap);
        } else if (z3) {
            decodeInBitmapAddress = decodeFirstIncrementally(rewindableStream, pexodeOptions, newBitmap, true);
        } else {
            decodeInBitmapAddress = decodeLaterIncrementally(rewindableStream, pexodeOptions, c);
        }
        if (decodeInBitmapAddress == 0) {
            return z2 ? com.taobao.pexode.c.c(pexodeOptions).a() : newBitmap;
        } else if (2 == decodeInBitmapAddress) {
            return null;
        } else {
            if (!com.taobao.pexode.c.a(pexodeOptions) && pexodeOptions.allowDegrade2NoAshmem) {
                rewindableStream.rewind();
                bitmap = decodeNormal(rewindableStream, pexodeOptions);
                if (!com.taobao.pexode.c.a(pexodeOptions)) {
                    if (bitmap != null || z2) {
                        z = true;
                    }
                    bVar.b(z);
                }
            }
            return bitmap;
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public com.taobao.pexode.e decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
        Bitmap decodeNormal;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pexode.e) ipChange.ipc$dispatch("29e98e02", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        if (!pexodeOptions.isSizeAvailable()) {
            int inputType = rewindableStream.getInputType();
            if (inputType == 1) {
                nativeDecodeBytesWithOutBuffer(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength(), pexodeOptions, null);
            } else if (inputType == 2) {
                nativeDecodeFdWithOutBuffer(rewindableStream.getFD(), pexodeOptions, null);
            } else {
                byte[] a2 = com.taobao.pexode.c.a().a(64);
                nativeDecodeStreamWithOutBuffer(rewindableStream, a2, pexodeOptions, null);
                com.taobao.pexode.c.a().a(a2);
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
            qol.h(com.taobao.pexode.d.TAG, "WebPDecoder size unavailable before bitmap decoding", new Object[0]);
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
        return "WebPDecoder@" + Integer.toHexString(hashCode());
    }
}
