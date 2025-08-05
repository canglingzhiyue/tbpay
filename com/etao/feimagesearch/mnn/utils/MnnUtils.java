package com.etao.feimagesearch.mnn.utils;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class MnnUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.etao.feimagesearch.mnn.utils.MnnUtils$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6801a = new int[Bitmap.Config.values().length];

        static {
            try {
                f6801a[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum MnnImageFormat {
        RGBA(0),
        RGB(1),
        BGR(2),
        GRAY(3),
        BGRA(4),
        YUV_NV21(11),
        YUVNV12(12);
        
        private final int mnnFormatValue;

        MnnImageFormat(int i) {
            this.mnnFormatValue = i;
        }

        public int getMnnFormatValue() {
            return this.mnnFormatValue;
        }
    }

    static {
        kge.a(1377768659);
    }

    public static MnnImageFormat a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MnnImageFormat) ipChange.ipc$dispatch("ce00ba9", new Object[]{bitmap});
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null || AnonymousClass1.f6801a[config.ordinal()] != 1) {
            return null;
        }
        return MnnImageFormat.RGBA;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return str + "_" + str2;
    }
}
