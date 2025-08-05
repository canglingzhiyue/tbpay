package com.taobao.android.interactive_common.view.photoview;

import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.interactive_common.view.photoview.m$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12953a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f12953a[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : (i >> 8) & 255;
    }

    public static void a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edca58", new Object[]{new Float(f), new Float(f2), new Float(f3)});
        } else if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else {
            if (f2 >= f3) {
                throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
            }
        }
    }

    public static boolean a(ImageView imageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83f7c626", new Object[]{imageView})).booleanValue() : imageView.getDrawable() != null;
    }

    public static boolean a(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91bcf1c6", new Object[]{scaleType})).booleanValue();
        }
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass1.f12953a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        return true;
    }
}
