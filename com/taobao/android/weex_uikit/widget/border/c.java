package com.taobao.android.weex_uikit.widget.border;

import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.support.v4.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-121229366);
    }

    public static void a(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c31ed98", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> a2 = a(0, 3, 1, borderProp, i2, i, borderProp.h(3), borderProp.h(0));
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postRotate(180.0f, 0.0f, i2 / 2.0f);
        a2.first.transform(matrix);
        borderProp.a(0, a2.first);
        b(0, borderProp, a2.second.floatValue());
    }

    public static void b(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc171d9", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> a2 = a(2, 1, 3, borderProp, i2, i, borderProp.h(1), borderProp.h(2));
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postTranslate(i, 0.0f);
        a2.first.transform(matrix);
        borderProp.a(2, a2.first);
        b(2, borderProp, a2.second.floatValue());
    }

    public static void c(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6350f61a", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> a2 = a(1, 0, 2, borderProp, i, i2, borderProp.h(0), borderProp.h(1));
        borderProp.a(1, a2.first);
        b(1, borderProp, a2.second.floatValue());
    }

    public static void d(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e07a5b", new Object[]{borderProp, new Integer(i), new Integer(i2)});
            return;
        }
        Pair<Path, Float> a2 = a(3, 2, 0, borderProp, i, i2, borderProp.h(2), borderProp.h(3));
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, i / 2.0f, i2 / 2.0f);
        a2.first.transform(matrix);
        borderProp.a(3, a2.first);
        b(3, borderProp, a2.second.floatValue());
    }

    private static void b(int i, BorderProp borderProp, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83562bf6", new Object[]{new Integer(i), borderProp, new Float(f)});
        } else {
            borderProp.a(i, a(i, borderProp, f));
        }
    }

    public static PathEffect a(int i, BorderProp borderProp, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("e9bf300c", new Object[]{new Integer(i), borderProp, new Float(f)});
        }
        int c = borderProp.c(i);
        float b = borderProp.b(i);
        if (c == 1) {
            return b(f, b, i);
        }
        if (c == 2) {
            return a(f, b, i);
        }
        return null;
    }

    private static PathEffect a(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("785828f2", new Object[]{new Float(f), new Float(f2), new Integer(i)});
        }
        float f3 = 2.0f * f2;
        int round = Math.round(((f * 2.0f) + f3) / (6.0f * f2));
        new Path().addRect(0.0f, 0.0f, f3, f2, Path.Direction.CW);
        return new DashPathEffect(new float[]{f3, (f - (round * f3)) / (round - 1)}, 0.0f);
    }

    private static PathEffect b(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("ec976151", new Object[]{new Float(f), new Float(f2), new Integer(i)});
        }
        int round = Math.round((f + f2) / (2.0f * f2));
        float f3 = (f - (round * f2)) / (round - 1);
        Path path = new Path();
        path.addOval(new RectF(0.0f, 0.0f, f2, f2), Path.Direction.CW);
        return new PathDashPathEffect(path, f2 + f3, 0.0f, PathDashPathEffect.Style.ROTATE);
    }

    public static Pair<Path, Float> a(int i, int i2, int i3, BorderProp borderProp, int i4, int i5, float f, float f2) {
        float max;
        float f3;
        float f4;
        float f5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("254ff844", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), borderProp, new Integer(i4), new Integer(i5), new Float(f), new Float(f2)});
        }
        Path path = new Path();
        float min = Math.min(i4, i5) / 2.0f;
        float min2 = Math.min(min, f);
        float min3 = Math.min(min, f2);
        int b = borderProp.b(i);
        int b2 = borderProp.b(i2);
        int b3 = borderProp.b(i3);
        float f6 = b;
        if (f6 >= min2 && b2 >= min2) {
            path.moveTo(0.0f, 0.0f);
            float f7 = i4 - min3;
            path.lineTo(f7, 0.0f);
            f4 = f7 + 0.0f;
            f3 = 0.0f;
        } else {
            float f8 = i5 / 2.0f;
            path.moveTo(0.0f, f8);
            path.rLineTo(0.0f, -Math.max(0.0f, f8 - min2));
            float f9 = min2 * 2.0f;
            path.arcTo(new RectF(0.0f, 0.0f, f9, f9), -180.0f, 90.0f);
            float f10 = i4;
            f3 = 0.0f;
            path.lineTo(f10 - min3, 0.0f);
            f4 = ((float) (max + 0.0f + ((min2 * 3.141592653589793d) / 2.0d))) + ((f10 - min2) - min3);
        }
        if (f6 >= min3 && b3 >= min3) {
            path.lineTo(i4, f3);
            f5 = f4 + min3;
        } else {
            float f11 = i4;
            float f12 = min3 * 2.0f;
            path.arcTo(new RectF(f11 - f12, f3, f11, f12), -90.0f, 90.0f);
            float max2 = Math.max(0.0f, (i5 / 2.0f) - min3);
            path.rLineTo(0.0f, max2);
            f5 = ((float) (f4 + ((min3 * 3.141592653589793d) / 2.0d))) + max2;
        }
        return new Pair<>(path, Float.valueOf(f5));
    }

    public static Path a(int i, int i2, int i3, float f, float f2, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("f598f503", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Float(f), new Float(f2), new Integer(i4), new Integer(i5)});
        }
        if (i == i2 && i == i3) {
            return null;
        }
        Path path = new Path();
        float f3 = i4;
        float f4 = f3 / 2.0f;
        float f5 = i5 / 2.0f;
        float min = Math.min(f4, f5);
        float min2 = Math.min(min, f2);
        float min3 = Math.min(min, f);
        path.moveTo(f3, f5);
        path.rLineTo(0.0f, -Math.max(0.0f, f5 - min2));
        float f6 = min2 * 2.0f;
        path.arcTo(new RectF(f3 - f6, 0.0f, f3, f6), 0.0f, -90.0f);
        path.lineTo(f4, 0.0f);
        path.lineTo(min3, 0.0f);
        float f7 = min3 * 2.0f;
        path.arcTo(new RectF(0.0f, 0.0f, f7, f7), -90.0f, -90.0f);
        path.lineTo(0.0f, f5);
        float f8 = i2;
        path.rLineTo(f8, 0.0f);
        float max = Math.max(0.0f, min3 - Math.min(i2, i));
        float f9 = i;
        path.rLineTo(0.0f, -Math.max(0.0f, (f5 - f9) - max));
        float f10 = max * 2.0f;
        float f11 = i5 - i;
        path.arcTo(new RectF(f8, f9, Math.min(f8 + f10, i4 - i2), Math.min(f10 + f9, f11)), -180.0f, 90.0f);
        path.lineTo(f4, f9);
        float max2 = Math.max(0.0f, min2 - Math.min(i, i3));
        float f12 = i3;
        float f13 = i4 - i3;
        float f14 = max2 * 2.0f;
        path.arcTo(new RectF(Math.max(f12, f13 - f14), f9, f13, Math.min(f14 + f9, f11)), -90.0f, 90.0f);
        path.lineTo(f13, f5);
        path.rLineTo(f12, 0.0f);
        return path;
    }

    public static Path e(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Path) ipChange.ipc$dispatch("9b57f0c4", new Object[]{borderProp, new Integer(i), new Integer(i2)}) : a(borderProp.b(1), borderProp.b(0), borderProp.b(2), borderProp.h(0), borderProp.h(1), i, i2);
    }

    public static Path f(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("53445e45", new Object[]{borderProp, new Integer(i), new Integer(i2)});
        }
        Path a2 = a(borderProp.b(2), borderProp.b(1), borderProp.b(3), borderProp.h(1), borderProp.h(2), i2, i);
        if (a2 == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postTranslate(i, 0.0f);
        a2.transform(matrix);
        return a2;
    }

    public static Path g(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("b30cbc6", new Object[]{borderProp, new Integer(i), new Integer(i2)});
        }
        Path a2 = a(borderProp.b(3), borderProp.b(2), borderProp.b(0), borderProp.h(2), borderProp.h(3), i, i2);
        if (a2 == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, i / 2.0f, i2 / 2.0f);
        a2.transform(matrix);
        return a2;
    }

    public static Path h(BorderProp borderProp, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("c31d3947", new Object[]{borderProp, new Integer(i), new Integer(i2)});
        }
        Path a2 = a(borderProp.b(0), borderProp.b(3), borderProp.b(1), borderProp.h(3), borderProp.h(0), i2, i);
        if (a2 == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, 0.0f, 0.0f);
        matrix.postRotate(180.0f, 0.0f, i2 / 2.0f);
        a2.transform(matrix);
        return a2;
    }
}
