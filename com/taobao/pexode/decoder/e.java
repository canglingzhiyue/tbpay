package com.taobao.pexode.decoder;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.common.NdkCore;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.io.IOException;
import java.lang.reflect.Field;
import tb.kge;
import tb.qol;

/* loaded from: classes.dex */
public abstract class e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Field sBitmapBufferField;

    static {
        kge.a(695867129);
        kge.a(59738730);
    }

    public abstract Bitmap decodeAshmem(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException;

    public abstract Bitmap decodeInBitmap(RewindableStream rewindableStream, PexodeOptions pexodeOptions, com.taobao.pexode.common.b bVar) throws PexodeException, IOException;

    public abstract Bitmap decodeNormal(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException;

    public synchronized boolean ensureBitmapBufferField() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f923558", new Object[]{this})).booleanValue();
        }
        if (sBitmapBufferField == null) {
            try {
                Field declaredField = Bitmap.class.getDeclaredField("mBuffer");
                sBitmapBufferField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                qol.h(com.taobao.pexode.d.TAG, "ensure Bitmap buffer field error=%s", e);
                return false;
            }
        }
        return true;
    }

    public byte[] getPixelBufferFromBitmap(Bitmap bitmap) {
        try {
            if (!ensureBitmapBufferField()) {
                return null;
            }
            return (byte[]) sBitmapBufferField.get(bitmap);
        } catch (Exception e) {
            qol.h(com.taobao.pexode.d.TAG, "get Bitmap buffer field error=%s", e);
            return null;
        }
    }

    public static long getPixelAddressFromBitmap(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de63a6fe", new Object[]{bitmap})).longValue();
        }
        long[] jArr = {0};
        try {
            NdkCore.nativePinBitmapWithAddr(bitmap, jArr);
        } catch (Throwable th) {
            qol.h(com.taobao.pexode.d.TAG, "get Bitmap pixels address error=%s", th);
        }
        return jArr[0];
    }

    public static Bitmap newBitmap(PexodeOptions pexodeOptions, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4d9d469", new Object[]{pexodeOptions, new Boolean(z)});
        }
        if (z) {
            return com.taobao.pexode.common.a.a().a(pexodeOptions.outWidth, pexodeOptions.outHeight, PexodeOptions.CONFIG);
        }
        return Bitmap.createBitmap(pexodeOptions.outWidth, pexodeOptions.outHeight, PexodeOptions.CONFIG);
    }

    public static boolean invalidBitmap(Bitmap bitmap, PexodeOptions pexodeOptions, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f83d1cc", new Object[]{bitmap, pexodeOptions, str})).booleanValue();
        }
        if (bitmap == null) {
            qol.h(com.taobao.pexode.d.TAG, "%s bitmap is null", str);
            return true;
        } else if (bitmap.getWidth() * bitmap.getHeight() >= pexodeOptions.outWidth * pexodeOptions.outHeight) {
            return false;
        } else {
            qol.h(com.taobao.pexode.d.TAG, "%s bitmap space not large enough", str);
            return true;
        }
    }
}
