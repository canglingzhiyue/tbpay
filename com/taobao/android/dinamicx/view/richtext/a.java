package com.taobao.android.dinamicx.view.richtext;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-364076619);
    }

    public static void a(Canvas canvas, Paint paint, RectF rectF, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c0e71", new Object[]{canvas, paint, rectF, iArr});
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        b(canvas, paint, rectF, iArr, new int[]{1, 1, 1, 1});
        paint.setStyle(style);
    }

    public static void a(Canvas canvas, Paint paint, RectF rectF, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c8c53f", new Object[]{canvas, paint, rectF, iArr, iArr2});
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.STROKE);
        b(canvas, paint, rectF, iArr, iArr2);
        paint.setStyle(style);
    }

    public static void b(Canvas canvas, Paint paint, RectF rectF, int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a2f5e", new Object[]{canvas, paint, rectF, iArr, iArr2});
            return;
        }
        boolean z = a(iArr2) > 0;
        boolean z2 = b(iArr2) > 0;
        boolean z3 = c(iArr2) > 0;
        boolean z4 = d(iArr2) > 0;
        int f = f(iArr);
        int g = g(iArr);
        int h = h(iArr);
        int i = i(iArr);
        Path path = new Path();
        if (!z && !z2 && !z3 && !z4) {
            return;
        }
        if (!z) {
            path.moveTo(rectF.left, rectF.top);
            a(rectF, path, f, g, h, i, false, z2, z3, z4, 0, 4);
        } else if (!z2) {
            path.moveTo(rectF.right, rectF.top);
            a(rectF, path, f, g, h, i, true, false, z3, z4, 2, 6);
        } else if (!z3) {
            path.moveTo(rectF.right, rectF.bottom);
            a(rectF, path, f, g, h, i, true, true, false, z4, 4, 0);
        } else if (!z4) {
            path.moveTo(rectF.left, rectF.bottom);
            a(rectF, path, f, g, h, i, true, true, true, false, 6, 2);
        } else {
            path.moveTo(rectF.left, rectF.top + f);
            a(rectF, path, f, g, h, i, true, true, true, true, 7, 6);
            path.close();
        }
        canvas.drawPath(path, paint);
    }

    public static int a(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c198169", new Object[]{iArr})).intValue() : b(iArr, 0);
    }

    public static int b(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90ffbcaa", new Object[]{iArr})).intValue() : b(iArr, 1);
    }

    public static int c(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5e5f7eb", new Object[]{iArr})).intValue() : b(iArr, 2);
    }

    public static int d(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("facc332c", new Object[]{iArr})).intValue() : b(iArr, 3);
    }

    public static int e(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2fb26e6d", new Object[]{iArr})).intValue();
        }
        if (iArr == null) {
            return 0;
        }
        for (int i : iArr) {
            if (i != 0) {
                return i;
            }
        }
        return 0;
    }

    public static int f(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6498a9ae", new Object[]{iArr})).intValue() : a(iArr, 0);
    }

    public static int g(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("997ee4ef", new Object[]{iArr})).intValue() : a(iArr, 1);
    }

    public static int h(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ce652030", new Object[]{iArr})).intValue() : a(iArr, 2);
    }

    public static int i(int[] iArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34b5b71", new Object[]{iArr})).intValue() : a(iArr, 3);
    }

    private static int a(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27172040", new Object[]{iArr, new Integer(i)})).intValue();
        }
        if (iArr == null || i < 0 || i > iArr.length - 1) {
            return 0;
        }
        return iArr[i];
    }

    private static int b(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ef84d1f", new Object[]{iArr, new Integer(i)})).intValue();
        }
        if (iArr == null || i < 0 || i > iArr.length - 1) {
            return 0;
        }
        return iArr[i];
    }

    private static void a(RectF rectF, Path path, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e8bc7f", new Object[]{rectF, path, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Integer(i5), new Integer(i6)});
            return;
        }
        int i7 = (i6 + 1) % 8;
        int i8 = i5;
        do {
            switch (i8) {
                case 0:
                    a(path, z3 ? i2 : 0, rectF, z2);
                    i8 = (i8 + 1) % 8;
                    break;
                case 1:
                    b(path, i2, rectF, z2, z3);
                    i8 = (i8 + 1) % 8;
                    break;
                case 2:
                    b(path, z4 ? i4 : 0, rectF, z3);
                    i8 = (i8 + 1) % 8;
                    break;
                case 3:
                    c(path, i4, rectF, z3, z4);
                    i8 = (i8 + 1) % 8;
                    break;
                case 4:
                    c(path, z ? i3 : 0, rectF, z4);
                    i8 = (i8 + 1) % 8;
                    break;
                case 5:
                    d(path, i3, rectF, z4, z);
                    i8 = (i8 + 1) % 8;
                    break;
                case 6:
                    d(path, z2 ? i : 0, rectF, z);
                    i8 = (i8 + 1) % 8;
                    break;
                case 7:
                    a(path, i, rectF, z, z2);
                    i8 = (i8 + 1) % 8;
                    break;
                default:
                    i8 = (i8 + 1) % 8;
                    break;
            }
        } while (i8 != i7);
    }

    private static void a(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f9f944", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = i << 1;
            path.arcTo(new RectF(rectF.left, rectF.top, rectF.left + f, rectF.top + f), -180.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.left, rectF.top);
        } else {
            path.moveTo(rectF.left, rectF.top);
        }
    }

    private static void a(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8c2b90", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.right - i, rectF.top);
        } else {
            path.moveTo(rectF.right - i, rectF.top);
        }
    }

    private static void b(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4e4e85", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = i << 1;
            path.arcTo(new RectF(rectF.right - f, rectF.top, rectF.right, rectF.top + f), -90.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.right, rectF.top);
        } else {
            path.moveTo(rectF.right, rectF.top);
        }
    }

    private static void b(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a7aa2f", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.right, rectF.bottom - i);
        } else {
            path.moveTo(rectF.right, rectF.bottom - i);
        }
    }

    private static void c(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a2a3c6", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = i << 1;
            path.arcTo(new RectF(rectF.right - f, rectF.bottom - f, rectF.right, rectF.bottom), 0.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.right, rectF.bottom);
        } else {
            path.moveTo(rectF.right, rectF.bottom);
        }
    }

    private static void c(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c328ce", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.left + i, rectF.bottom);
        } else {
            path.moveTo(rectF.left + i, rectF.bottom);
        }
    }

    private static void d(Path path, int i, RectF rectF, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef6f907", new Object[]{path, new Integer(i), rectF, new Boolean(z), new Boolean(z2)});
        } else if (i > 0 && z && z2) {
            float f = i << 1;
            path.arcTo(new RectF(rectF.left, rectF.bottom - f, rectF.left + f, rectF.bottom), 90.0f, 90.0f);
        } else if (z) {
            path.lineTo(rectF.left, rectF.bottom);
        } else {
            path.moveTo(rectF.left, rectF.bottom);
        }
    }

    private static void d(Path path, int i, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdea76d", new Object[]{path, new Integer(i), rectF, new Boolean(z)});
        } else if (z) {
            path.lineTo(rectF.left, rectF.top + i);
        } else {
            path.moveTo(rectF.left, rectF.top + i);
        }
    }
}
