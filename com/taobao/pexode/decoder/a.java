package com.taobao.pexode.decoder;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;
import java.util.List;
import tb.neb;
import tb.nec;
import tb.qol;

/* loaded from: classes7.dex */
public class a implements com.taobao.pexode.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18695a;

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "pexapng";
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean acceptInputType(int i, nec necVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fcc7314", new Object[]{this, new Integer(i), necVar, new Boolean(z)})).booleanValue();
        }
        return true;
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
        neb.ALL_EXTENSION_TYPES.add(b.APNG);
        String a2 = a();
        try {
            System.loadLibrary(a2);
            f18695a = APngImage.nativeLoadedVersionTest() == 1;
            qol.f(com.taobao.pexode.d.TAG, "system load lib%s.so result=%b", a2, Boolean.valueOf(f18695a));
        } catch (UnsatisfiedLinkError e) {
            qol.h(com.taobao.pexode.d.TAG, "system load lib%s.so error=%s", a2, e);
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (f18695a) {
        } else {
            String a2 = a();
            f18695a = com.taobao.pexode.common.d.a(a2, 1) && APngImage.nativeLoadedVersionTest() == 1;
            qol.f(com.taobao.pexode.d.TAG, "retry load lib%s.so result=%b", a2, Boolean.valueOf(f18695a));
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean isSupported(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb701393", new Object[]{this, necVar})).booleanValue() : f18695a && b.APNG.a(necVar);
    }

    @Override // com.taobao.pexode.decoder.d
    public nec detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("b308357b", new Object[]{this, bArr});
        }
        if (f18695a && b.APNG.a(bArr)) {
            return b.APNG;
        }
        return null;
    }

    @Override // com.taobao.pexode.decoder.d
    public com.taobao.pexode.e decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pexode.e) ipChange.ipc$dispatch("29e98e02", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        if (pexodeOptions.justDecodeBounds) {
            pexodeOptions.outHeight = 1;
            pexodeOptions.outWidth = 1;
            return null;
        } else if (pexodeOptions.forceStaticIfAnimation) {
            List<d> a2 = com.taobao.pexode.d.a(neb.PNG);
            if (a2 != null && a2.size() > 0 && (dVar = a2.get(0)) != null) {
                return dVar.decode(rewindableStream, pexodeOptions, bVar);
            }
            return null;
        } else {
            int inputType = rewindableStream.getInputType();
            if (inputType == 1) {
                return com.taobao.pexode.e.a(APngImage.nativeCreateFromBytes(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength()));
            }
            if (inputType == 2) {
                return com.taobao.pexode.e.a(APngImage.nativeCreateFromFd(rewindableStream.getFD()));
            }
            byte[] a3 = com.taobao.pexode.c.a().a(2048);
            com.taobao.pexode.e a4 = com.taobao.pexode.e.a(APngImage.nativeCreateFromRewindableStream(rewindableStream, a3));
            com.taobao.pexode.c.a().a(a3);
            return a4;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "APngDecoder@" + Integer.toHexString(hashCode());
    }
}
