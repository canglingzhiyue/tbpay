package com.taobao.phenix.compat.effects.internal;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.qol;

/* loaded from: classes7.dex */
public class NdkCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18900a;

    private static native int nativeBlurBitmap(Bitmap bitmap, int i, int i2, int i3);

    static {
        try {
            System.loadLibrary("EffectsCore");
            f18900a = true;
            qol.f("Effects4Phenix", "system load lib%s.so success", "EffectsCore");
        } catch (UnsatisfiedLinkError e) {
            qol.h("Effects4Phenix", "system load lib%s.so error=%s", "EffectsCore", e);
        }
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        if (f18900a && bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            try {
                if (nativeBlurBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), i) == 0) {
                    return bitmap;
                }
            } catch (UnsatisfiedLinkError e) {
                qol.f("Effects4Phenix", "native blur bitmap error=%s", e);
            }
        }
        return null;
    }
}
