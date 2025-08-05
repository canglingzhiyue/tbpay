package com.taobao.android.weex_uikit.widget.border;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes6.dex */
public class BorderProp extends m<BorderProp> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 4;
    public static final int BOTTOM_LEFT = 3;
    public static final int BOTTOM_RIGHT = 2;
    public static final int DASHED = 2;
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final int DOTTED = 1;
    public static final int EDGE_ALL = 4;
    public static final int EDGE_BOTTOM = 3;
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_TOP = 1;
    public static final int SET = 0;
    public static final int SOLID = 0;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    public static final int UNSET = -1;
    private Path f;
    private Path g;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    /* renamed from: a  reason: collision with root package name */
    private final PathEffect[] f16160a = new PathEffect[4];
    private int[] b = {-1, 0, -1, 0, -1, 0, -1, 0, -1, 0};
    private int[] c = {-1, 0, -1, 0, -1, 0, -1, 0, -1, 0};
    private int[] d = {-1, -16777216, -1, -16777216, -1, -16777216, -1, -16777216, -1, -16777216};
    private int[] e = {-1, 0, -1, 0, -1, 0, -1, 0, -1, 0};
    private final Path[] h = new Path[4];
    private final boolean[] i = new boolean[4];
    private final b j = new b(this);

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface BorderStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Corner {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Edge {
    }

    static {
        kge.a(-817751425);
    }

    public static /* synthetic */ Object ipc$super(BorderProp borderProp, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private static boolean a(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27172051", new Object[]{iArr, new Integer(i)})).booleanValue() : iArr[i << 1] == 0;
    }

    private static void a(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcd5c56", new Object[]{iArr, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = i << 1;
        iArr[i3] = 0;
        iArr[i3 + 1] = i2;
    }

    private static void b(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef84d2c", new Object[]{iArr, new Integer(i)});
            return;
        }
        int i2 = i << 1;
        iArr[i2] = -1;
        iArr[i2 + 1] = 0;
    }

    private static int c(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f6d979fe", new Object[]{iArr, new Integer(i)})).intValue() : iArr[(i << 1) + 1];
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(this.b, i, Math.max(0, i2));
        this.o = true;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b(this.b, i);
        this.o = true;
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border width array with @Edge.EDGE_ALL");
        }
        if (a(this.b, i)) {
            return c(this.b, i);
        }
        if (!a(this.b, 4)) {
            return 0;
        }
        return c(this.b, 4);
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border style array with @Edge.EDGE_ALL");
        }
        if (a(this.c, i)) {
            return c(this.c, i);
        }
        if (!a(this.c, 4)) {
            return 0;
        }
        return c(this.c, 4);
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(this.c, i, i2);
        this.p = true;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        b(this.c, i);
        this.p = true;
    }

    public int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aef4f60a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border color array with @Edge.EDGE_ALL");
        }
        if (a(this.d, i)) {
            return c(this.d, i);
        }
        if (!a(this.d, 4)) {
            return -16777216;
        }
        return c(this.d, 4);
    }

    public void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(this.d, i, i2);
        this.q = true;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        b(this.d, i);
        this.q = true;
    }

    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac4048b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        a(this.e, i, Math.max(0, i2));
        this.n = true;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        b(this.e, i);
        this.n = true;
    }

    public int h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4137fe7", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i == 4) {
            throw new RuntimeException("can't access border radius array with @Corner.ALL");
        }
        if (a(this.e, i)) {
            return c(this.e, i);
        }
        if (!a(this.e, 4)) {
            return 0;
        }
        return c(this.e, 4);
    }

    public void e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2faa3fcc", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.k == i && this.l == i2) {
        } else {
            this.m = true;
            this.k = i;
            this.l = i2;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        boolean z2 = this.m;
        boolean z3 = this.q;
        if (this.k == 0 || this.l == 0) {
            this.m = false;
            return false;
        }
        if (this.n || z2) {
            d();
        }
        if (this.m || this.n || this.p || this.o) {
            e();
            z3 = true;
        }
        if (this.n || this.o || z2) {
            this.j.a(this.k, this.l);
        }
        if (this.o || z2) {
            this.j.b(this.k, this.l);
        }
        if (this.o || this.p || this.n || z2) {
            c.a(this, this.k, this.l);
            c.c(this, this.k, this.l);
            c.b(this, this.k, this.l);
            c.d(this, this.k, this.l);
        }
        if (this.n || this.o) {
            int b = b(0);
            int b2 = b(1);
            int b3 = b(3);
            int b4 = b(2);
            float h = h(0);
            float h2 = h(1);
            float h3 = h(3);
            float h4 = h(2);
            this.i[0] = b > 0 || ((b2 > 0 || b3 > 0) && (h > 0.0f || h3 > 0.0f));
            this.i[1] = b2 > 0 || ((b > 0 || b4 > 0) && (h > 0.0f || h2 > 0.0f));
            this.i[2] = b4 > 0 || ((b2 > 0 || b3 > 0) && (h2 > 0.0f || h4 > 0.0f));
            boolean[] zArr = this.i;
            if (b3 <= 0 && ((b <= 0 && b4 <= 0) || (h3 <= 0.0f && h4 <= 0.0f))) {
                z = false;
            }
            zArr[3] = z;
        }
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.m = false;
        return z3;
    }

    private void d() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f = null;
        this.r = false;
        int i = 0;
        while (true) {
            if (i >= 4) {
                z = false;
                break;
            } else if (h(i) > 0) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return;
        }
        float[] fArr = new float[8];
        int min = Math.min(this.k, this.l) / 2;
        boolean z2 = false;
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int min2 = Math.min(min, h(i3));
            int i4 = i3 * 2;
            float f = min2;
            fArr[i4] = f;
            fArr[i4 + 1] = f;
            if (i3 == 0) {
                i2 = min2;
            } else if (!z2) {
                z2 = i2 != min2;
            }
        }
        this.r = !z2;
        RectF rectF = new RectF(0.0f, 0.0f, this.k, this.l);
        this.f = new Path();
        this.f.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.g = null;
        int c = c(0);
        if (c != 0) {
            return;
        }
        if (!(c == c(1) && c == c(2) && c == c(3))) {
            return;
        }
        int b = b(0);
        if (!(b == b(1) && b == b(2) && b == b(3))) {
            return;
        }
        int e = e(0);
        if (e != e(1) || e != e(2) || e != e(3)) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.g = new Path();
        Path path = this.f;
        if (path != null) {
            this.g.addPath(path);
        } else {
            this.g.addRect(0.0f, 0.0f, this.k, this.l, Path.Direction.CW);
        }
    }

    public Path b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Path) ipChange.ipc$dispatch("286bce51", new Object[]{this}) : this.f;
    }

    public void a(Canvas canvas, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80533312", new Object[]{this, canvas, paint});
        } else if (this.g != null) {
            if (b(0) <= 0) {
                return;
            }
            paint.setColor(e(0));
            paint.setPathEffect(null);
            paint.setStrokeWidth(b(0) << 1);
            canvas.drawPath(this.g, paint);
        } else {
            a(canvas, 0, paint);
            a(canvas, 1, paint);
            a(canvas, 2, paint);
            a(canvas, 3, paint);
        }
    }

    private boolean j(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b77d3136", new Object[]{this, new Integer(i)})).booleanValue() : this.i[i];
    }

    private PathEffect k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PathEffect) ipChange.ipc$dispatch("2ee09028", new Object[]{this, new Integer(i)});
        }
        if (i == 4) {
            throw new RuntimeException("can't access effect array with @Edge.EDGE_ALL");
        }
        return this.f16160a[i];
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.r;
    }

    private int l(int i) {
        int b;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bae6e263", new Object[]{this, new Integer(i)})).intValue();
        }
        int b2 = b(i);
        if (i == 0) {
            i2 = b(1);
            b = b(3);
        } else if (i == 1) {
            i2 = b(0);
            b = b(2);
        } else if (i == 2) {
            i2 = b(1);
            b = b(3);
        } else if (i != 3) {
            b = 0;
        } else {
            i2 = b(0);
            b = b(2);
        }
        return Math.max(i2, Math.max(b, b2));
    }

    private void a(Canvas canvas, int i, Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("347796bb", new Object[]{this, canvas, new Integer(i), paint});
        } else if (!j(i)) {
        } else {
            int a2 = this.j.a(canvas, i);
            if (c(i) == 0) {
                paint.setPathEffect(null);
            } else {
                paint.setPathEffect(k(i));
            }
            paint.setColor(e(i));
            if (c(i) == 1) {
                paint.setStrokeWidth(b(i));
            } else {
                paint.setStrokeWidth(l(i) << 1);
            }
            canvas.drawPath(i(i), paint);
            if (a2 == -1) {
                return;
            }
            canvas.restoreToCount(a2);
        }
    }

    public void a(int i, Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8c02bd", new Object[]{this, new Integer(i), path});
        } else if (i == 0 || i == 1 || i == 2 || i == 3) {
            this.h[i] = path;
        } else if (i == 4) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.h[i2] = path;
            }
        }
    }

    public Path i(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Path) ipChange.ipc$dispatch("48d2677b", new Object[]{this, new Integer(i)}) : this.h[i];
    }

    public void a(int i, PathEffect pathEffect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb627ac", new Object[]{this, new Integer(i), pathEffect});
        } else {
            this.f16160a[i] = pathEffect;
        }
    }

    public void a(BorderProp borderProp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b957b38", new Object[]{this, borderProp});
        } else if (borderProp != null) {
            int length = this.b.length;
            for (int i = 0; i < length; i++) {
                this.b[i] = borderProp.b[i];
                this.d[i] = borderProp.d[i];
                this.e[i] = borderProp.e[i];
                this.c[i] = borderProp.c[i];
            }
            this.j.a(borderProp.j);
            for (int i2 = 0; i2 < 4; i2++) {
                this.h[i2] = borderProp.h[i2];
                this.f16160a[i2] = borderProp.f16160a[i2];
                this.i[i2] = borderProp.i[i2];
            }
            this.k = borderProp.k;
            this.l = borderProp.l;
            this.f = borderProp.f;
            this.g = borderProp.g;
            this.r = borderProp.r;
        }
    }
}
