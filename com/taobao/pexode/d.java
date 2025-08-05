package com.taobao.pexode;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.common.NdkCore;
import com.taobao.pexode.decoder.i;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.DegradeNotAllowedException;
import com.taobao.pexode.exception.IncrementalDecodeException;
import com.taobao.pexode.exception.NotSupportedException;
import com.taobao.pexode.exception.PexodeException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.neb;
import tb.nec;
import tb.qol;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int APPEND_DECODE_CHUNK_SIZE = 2048;
    public static final int MB = 1048576;
    public static final int MINIMUM_HEADER_BUFFER_SIZE = 64;
    public static final String TAG = "Pexode";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18687a;
    public static boolean b;
    public static boolean c;
    private boolean d;
    private Context e;
    private final com.taobao.pexode.decoder.d f;
    private final List<com.taobao.pexode.decoder.d> g;
    private a h;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final d f18688a;

        static {
            kge.a(-1480952221);
            f18688a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("bc3c5504", new Object[0]) : f18688a;
        }
    }

    static {
        kge.a(1627695388);
        f18687a = false;
        b = false;
        c = false;
    }

    private d() {
        this.f = new i();
        this.g = new CopyOnWriteArrayList();
        this.g.add(this.f);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        synchronized (b.a()) {
            b.a().e = context;
            com.taobao.pexode.common.d.a(context);
            NdkCore.a(context);
            for (com.taobao.pexode.decoder.d dVar : b.a().g) {
                dVar.prepare(context);
            }
        }
    }

    public static void a(com.taobao.pexode.decoder.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebeaad6f", new Object[]{dVar});
            return;
        }
        synchronized (b.a()) {
            if (b.a().d) {
                b.a().g.add(1, dVar);
            } else {
                b.a().g.add(0, dVar);
            }
            if (b.a().e != null) {
                dVar.prepare(b.a().e);
            }
        }
    }

    public static void a(com.taobao.tcommon.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80773505", new Object[]{aVar});
        } else {
            c.a().a(aVar);
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        synchronized (b.a()) {
            if (z == b.a().d) {
                return;
            }
            qol.g(TAG, "force degrading to system decoder, result=%b", Boolean.valueOf(z));
            b.a().g.remove(b.a().f);
            if (z) {
                b.a().g.add(0, b.a().f);
            } else {
                b.a().g.add(b.a().f);
            }
            b.a().d = z;
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
            return;
        }
        c.a().b = z;
        qol.g(TAG, "force degrading to no ashmem, result=%b", Boolean.valueOf(z));
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("9e7ad9a7", new Object[0]) : b.a().h;
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939705a7", new Object[]{aVar});
        } else {
            b.a().h = aVar;
        }
    }

    public static void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{new Boolean(z)});
        } else {
            PexodeOptions.sEnabledCancellability = z;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b.a().d;
    }

    public static List<com.taobao.pexode.decoder.d> a(nec necVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f42036fb", new Object[]{necVar});
        }
        ArrayList arrayList = new ArrayList();
        for (com.taobao.pexode.decoder.d dVar : b.a().g) {
            if (dVar.isSupported(necVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    private static com.taobao.pexode.decoder.d a(RewindableStream rewindableStream, PexodeOptions pexodeOptions, int i) throws IOException {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pexode.decoder.d) ipChange.ipc$dispatch("d93119d2", new Object[]{rewindableStream, pexodeOptions, new Integer(i)});
        }
        pexodeOptions.tempHeaderBuffer = c.a().a(i);
        try {
            i2 = rewindableStream.read(pexodeOptions.tempHeaderBuffer, 0, i);
        } catch (IOException unused) {
        }
        rewindableStream.rewind();
        int a2 = a((nec) null, pexodeOptions.tempHeaderBuffer);
        if (i2 > 0) {
            for (com.taobao.pexode.decoder.d dVar : b.a().g) {
                pexodeOptions.outMimeType = dVar.detectMimeType(pexodeOptions.tempHeaderBuffer);
                if (pexodeOptions.outMimeType != null) {
                    if (a2 != -1 && !(dVar instanceof com.taobao.pexode.b)) {
                        pexodeOptions.forceSkipCache = true;
                    }
                    return dVar;
                }
            }
        }
        if (a2 != -1) {
            pexodeOptions.forceSkipCache = true;
        }
        return b.a().f;
    }

    private static com.taobao.pexode.decoder.d a(PexodeOptions pexodeOptions) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pexode.decoder.d) ipChange.ipc$dispatch("edb473fe", new Object[]{pexodeOptions});
        }
        if (pexodeOptions == null || pexodeOptions.outMimeType == null) {
            i = -1;
        } else {
            i = a(pexodeOptions.outMimeType, (byte[]) null);
            for (com.taobao.pexode.decoder.d dVar : b.a().g) {
                if (dVar.isSupported(pexodeOptions.outMimeType)) {
                    if (i != -1 && !(dVar instanceof com.taobao.pexode.b)) {
                        pexodeOptions.forceSkipCache = true;
                    }
                    return dVar;
                }
            }
        }
        if (i != -1) {
            pexodeOptions.forceSkipCache = true;
        }
        return b.a().f;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : NdkCore.a() && Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT <= 19;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 21;
    }

    private static void b(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c8f3d6", new Object[]{pexodeOptions});
            return;
        }
        if (pexodeOptions.enableAshmem && !c()) {
            qol.g(TAG, "cannot use ashmem in the runtime, disabled ashmem already!", new Object[0]);
            pexodeOptions.enableAshmem = false;
        }
        if (pexodeOptions.inBitmap == null || d()) {
            return;
        }
        qol.g(TAG, "cannot reuse bitmap in the runtime, disabled inBitmap already!", new Object[0]);
        pexodeOptions.inBitmap = null;
    }

    public static int a(RewindableStream rewindableStream, PexodeOptions pexodeOptions, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("448882cf", new Object[]{rewindableStream, pexodeOptions, new Boolean(z)})).intValue();
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            return inputType;
        }
        com.taobao.pexode.decoder.d a2 = a(pexodeOptions);
        return a2.acceptInputType(inputType, pexodeOptions.outMimeType, z) ? inputType : (inputType != 2 || !a2.acceptInputType(3, pexodeOptions.outMimeType, z)) ? 1 : 3;
    }

    public static boolean b(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e48a5051", new Object[]{necVar})).booleanValue() : b.a().f.isSupported(necVar);
    }

    public static boolean c(nec necVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d30d56d2", new Object[]{necVar})).booleanValue();
        }
        if (necVar != null) {
            for (com.taobao.pexode.decoder.d dVar : b.a().g) {
                if (dVar.isSupported(necVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static e a(byte[] bArr, int i, int i2, PexodeOptions pexodeOptions) throws IOException, PexodeException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("86c6496b", new Object[]{bArr, new Integer(i), new Integer(i2), pexodeOptions}) : a(new com.taobao.pexode.entity.b(bArr, i, i2), pexodeOptions, c.a());
    }

    public static e a(InputStream inputStream, PexodeOptions pexodeOptions) throws IOException, PexodeException {
        RewindableStream dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6236338f", new Object[]{inputStream, pexodeOptions});
        }
        if (inputStream instanceof RewindableStream) {
            dVar = (RewindableStream) inputStream;
        } else if (inputStream instanceof FileInputStream) {
            dVar = new com.taobao.pexode.entity.c((FileInputStream) inputStream, 1048576);
        } else {
            dVar = new com.taobao.pexode.entity.d(inputStream, 1048576);
        }
        return a(dVar, pexodeOptions, c.a());
    }

    private static e a(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws IOException, PexodeException {
        com.taobao.pexode.decoder.d a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("36ccc75", new Object[]{rewindableStream, pexodeOptions, bVar});
        }
        b(pexodeOptions);
        if (pexodeOptions.outMimeType == null) {
            a2 = a(rewindableStream, pexodeOptions, rewindableStream.getBufferLength());
        } else {
            a2 = a(pexodeOptions);
        }
        nec necVar = pexodeOptions.outMimeType;
        pexodeOptions.outAlpha = necVar != null && necVar.c();
        boolean z2 = pexodeOptions.enableAshmem;
        Bitmap bitmap = pexodeOptions.inBitmap;
        if (pexodeOptions.incrementalDecode && !a2.canDecodeIncrementally(necVar)) {
            throw new IncrementalDecodeException("incremental decoding not supported for type[" + necVar + "] in " + a2);
        }
        e decode = a2.decode(rewindableStream, pexodeOptions, bVar);
        if (decode != null && decode.f18702a != null) {
            decode.f18702a.getConfig();
        }
        Object[] objArr = new Object[8];
        objArr[0] = a2;
        objArr[1] = Integer.valueOf(rewindableStream.getInputType());
        objArr[2] = Boolean.valueOf(pexodeOptions.justDecodeBounds);
        objArr[3] = Boolean.valueOf(pexodeOptions.isSizeAvailable());
        objArr[4] = Boolean.valueOf(pexodeOptions.enableAshmem);
        if (pexodeOptions.inBitmap == null) {
            z = false;
        }
        objArr[5] = Boolean.valueOf(z);
        objArr[6] = Boolean.valueOf(pexodeOptions.incrementalDecode);
        objArr[7] = decode;
        qol.e(TAG, "decoder=%s, type=%d, justBounds=%b, sizeAvailable=%b, ashmem=%b, inBitmap=%b, increment=%b, result=%s", objArr);
        if (c.b(decode, pexodeOptions) || a2 == b.a().f) {
            if (decode != null) {
                decode.c = a2.toString();
            }
            return decode;
        }
        com.taobao.pexode.decoder.d dVar = b.a().f;
        if (necVar != null && dVar.isSupported(necVar) && (!pexodeOptions.incrementalDecode || dVar.canDecodeIncrementally(necVar))) {
            if (pexodeOptions.allowDegrade2System) {
                rewindableStream.rewind();
                pexodeOptions.enableAshmem = z2;
                pexodeOptions.inBitmap = bitmap;
                e decode2 = dVar.decode(rewindableStream, pexodeOptions, bVar);
                if (!pexodeOptions.cancelled) {
                    bVar.a(c.a(decode2, pexodeOptions));
                }
                if (decode2 != null) {
                    decode2.c = dVar.toString();
                }
                return decode2;
            }
            throw new DegradeNotAllowedException("unfortunately, system supported type[" + necVar + "] but not allow degrading to system");
        } else if (pexodeOptions.incrementalDecode) {
            throw new IncrementalDecodeException("incremental decoding not supported for type[" + necVar + "] when degraded to system");
        } else {
            throw new NotSupportedException("type[" + necVar + "] not supported when degraded to system");
        }
    }

    private static int a(nec necVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91727b86", new Object[]{necVar, bArr})).intValue();
        }
        if (neb.APNG.a(necVar) || neb.APNG.a(bArr)) {
            return 1;
        }
        return (neb.GIF.a(necVar) || neb.GIF.a(bArr)) ? 0 : -1;
    }
}
