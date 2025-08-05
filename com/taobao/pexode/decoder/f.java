package com.taobao.pexode.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.NotSupportedException;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;
import tb.kge;
import tb.neb;
import tb.nec;
import tb.qol;

/* loaded from: classes7.dex */
public class f implements com.taobao.pexode.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18697a;

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "pexgif";
    }

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
        kge.a(-512043014);
        kge.a(-91359644);
        String a2 = a();
        try {
            System.loadLibrary(a2);
            f18697a = GifImage.nativeLoadedVersionTest() == 2;
            qol.f(com.taobao.pexode.d.TAG, "system load lib%s.so result=%b", a2, Boolean.valueOf(f18697a));
        } catch (UnsatisfiedLinkError e) {
            qol.h(com.taobao.pexode.d.TAG, "system load lib%s.so error=%s", a2, e);
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else if (f18697a) {
        } else {
            String a2 = a();
            f18697a = com.taobao.pexode.common.d.a(a2, 2) && GifImage.nativeLoadedVersionTest() == 2;
            qol.f(com.taobao.pexode.d.TAG, "retry load lib%s.so result=%b", a2, Boolean.valueOf(f18697a));
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean isSupported(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb701393", new Object[]{this, necVar})).booleanValue() : f18697a && necVar != null && necVar.a(neb.GIF);
    }

    @Override // com.taobao.pexode.decoder.d
    public nec detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("b308357b", new Object[]{this, bArr});
        }
        if (f18697a && neb.GIF.a(bArr)) {
            return neb.GIF;
        }
        return null;
    }

    @Override // com.taobao.pexode.decoder.d
    public com.taobao.pexode.e decode(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException {
        GifImage create;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pexode.e) ipChange.ipc$dispatch("29e98e02", new Object[]{this, rewindableStream, pexodeOptions, bVar});
        }
        Bitmap bitmap = null;
        if (pexodeOptions.justDecodeBounds) {
            pexodeOptions.outHeight = 1;
            pexodeOptions.outWidth = 1;
            return null;
        }
        int inputType = rewindableStream.getInputType();
        if (inputType == 1) {
            create = GifImage.create(rewindableStream.getBuffer(), rewindableStream.getBufferOffset(), rewindableStream.getBufferLength());
        } else if (inputType == 2) {
            create = GifImage.create(rewindableStream.getFD());
        } else {
            throw new NotSupportedException("Not support input type(" + rewindableStream.getInputType() + ") when GifImage creating!");
        }
        if (!pexodeOptions.forceStaticIfAnimation || create == null) {
            return com.taobao.pexode.e.a(create);
        }
        GifFrame mo1201getFrame = create.mo1201getFrame(0);
        if (mo1201getFrame == null) {
            create.dispose();
            return null;
        }
        int width = mo1201getFrame.getWidth();
        int height = mo1201getFrame.getHeight();
        if (pexodeOptions.enableAshmem && !com.taobao.pexode.c.a().b) {
            z = true;
        }
        if (z) {
            bitmap = com.taobao.pexode.common.a.a().b(width, height, Bitmap.Config.ARGB_8888);
        }
        if (!z || (bitmap == null && pexodeOptions.allowDegrade2NoAshmem)) {
            bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        if (bitmap != null) {
            mo1201getFrame.renderFrame(width, height, bitmap);
        }
        mo1201getFrame.dispose();
        create.dispose();
        return com.taobao.pexode.e.a(bitmap);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GifDecoder@" + Integer.toHexString(hashCode());
    }
}
