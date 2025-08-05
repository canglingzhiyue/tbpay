package com.taobao.pexode.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.decoder.i;
import tb.kge;
import tb.qol;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.pexode.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static class C0749a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f18684a;

        static {
            kge.a(-2011179250);
            f18684a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("777dd151", new Object[0]) : f18684a;
        }
    }

    static {
        kge.a(-1908419705);
        kge.a(480702192);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("777dd151", new Object[0]) : C0749a.a();
    }

    public Bitmap a(int i, int i2, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9d49a802", new Object[]{this, new Integer(i), new Integer(i2), config});
        }
        Bitmap bitmap = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = config;
        i.a(options, true);
        byte[] a2 = c.a(i, i2, com.taobao.pexode.c.a().a(c.FIXED_JPG_LENGTH));
        if (a2 != null) {
            bitmap = BitmapFactory.decodeByteArray(a2, 0, c.FIXED_JPG_LENGTH, options);
            com.taobao.pexode.c.a().a(a2);
        }
        if (bitmap != null) {
            bitmap.setHasAlpha(true);
        }
        return bitmap;
    }

    public Bitmap b(int i, int i2, Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("90d92c43", new Object[]{this, new Integer(i), new Integer(i2), config});
        }
        Bitmap a2 = a(i, i2, config);
        if (a2 == null) {
            return a2;
        }
        try {
            NdkCore.nativePinBitmap(a2);
            a2.eraseColor(0);
            return a2;
        } catch (Throwable th) {
            qol.h(com.taobao.pexode.d.TAG, "AshmemBitmapFactory native pin bitmap error=%s", th);
            return null;
        }
    }
}
