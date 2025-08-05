package com.taobao.android.weex_uikit.widget.border;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.m;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends m<b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Path[] f16162a = new Path[4];
    private final Path[] b = new Path[4];
    private final BorderProp c;

    static {
        kge.a(1169415482);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(BorderProp borderProp) {
        this.c = borderProp;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f16162a[1] = c.e(this.c, i, i2);
        this.f16162a[2] = c.f(this.c, i, i2);
        this.f16162a[3] = c.g(this.c, i, i2);
        this.f16162a[0] = c.h(this.c, i, i2);
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c(i, i2);
        d(i, i2);
        e(i, i2);
        f(i, i2);
    }

    private Path b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Path) ipChange.ipc$dispatch("b31b33e2", new Object[]{this, new Integer(i)});
        }
        if (i != 4) {
            return this.f16162a[i];
        }
        return null;
    }

    public int a(Canvas canvas, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa7f2099", new Object[]{this, canvas, new Integer(i)})).intValue();
        }
        Path a2 = a(i);
        Path b = b(i);
        if (b != null) {
            i2 = canvas.save();
            canvas.clipPath(b);
        } else {
            i2 = -1;
        }
        if (a2 != null) {
            if (i2 == -1) {
                i2 = canvas.save();
            }
            canvas.clipPath(a2);
        }
        return i2;
    }

    private boolean a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2619793f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue() : (this.c.c(i) == this.c.c(i2) && this.c.c(i3) == this.c.c(i2) && this.c.c(i) == 0 && this.c.c(i2) == 0 && this.c.c(i3) == 0 && this.c.e(i) == this.c.e(i2) && this.c.e(i3) == this.c.e(i2) && Color.alpha(this.c.e(i2)) >= 255 && this.c.b(i) == this.c.b(i2) && this.c.b(i3) == this.c.b(i2)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(int r10, int r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.widget.border.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L22
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r9
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r10)
            r1[r3] = r4
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            r1[r2] = r10
            java.lang.String r10 = "c5ddc94a"
            r0.ipc$dispatch(r10, r1)
            return
        L22:
            boolean r0 = r9.a(r4, r5, r3)
            if (r0 != 0) goto L2d
            r10 = 0
            r9.a(r5, r10)
            return
        L2d:
            com.taobao.android.weex_uikit.widget.border.BorderProp r0 = r9.c
            int r0 = r0.b(r2)
            float r0 = (float) r0
            com.taobao.android.weex_uikit.widget.border.BorderProp r1 = r9.c
            int r1 = r1.b(r5)
            float r1 = (float) r1
            com.taobao.android.weex_uikit.widget.border.BorderProp r2 = r9.c
            int r2 = r2.b(r3)
            float r2 = (float) r2
            com.taobao.android.weex_uikit.widget.border.BorderProp r3 = r9.c
            int r3 = r3.b(r4)
            float r3 = (float) r3
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L51
            float r10 = (float) r10
            float r10 = r10 + r1
            int r10 = (int) r10
        L51:
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L59
            float r6 = (float) r11
            float r6 = r6 + r2
        L57:
            int r6 = (int) r6
            goto L61
        L59:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L60
            float r6 = (float) r11
            float r6 = r6 + r3
            goto L57
        L60:
            r6 = r11
        L61:
            int r10 = java.lang.Math.min(r10, r6)
            float r10 = (float) r10
            r6 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r6
            com.taobao.android.weex_uikit.widget.border.a r6 = new com.taobao.android.weex_uikit.widget.border.a
            r6.<init>()
            r6.a(r4, r4)
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 != 0) goto L7d
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 != 0) goto L7d
            r6.b(r4, r10)
            goto L8f
        L7d:
            int r8 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r8 > 0) goto L89
            float r2 = r1 / r2
            float r2 = r2 * r10
            r6.b(r2, r10)
            goto L8f
        L89:
            float r2 = r2 / r1
            float r2 = r2 * r10
            r6.b(r10, r2)
        L8f:
            r6.c(r10, r10)
            float r11 = (float) r11
            r6.d(r4, r11)
            if (r7 != 0) goto La0
            if (r0 != 0) goto La0
            float r0 = r11 - r10
            r6.e(r4, r0)
            goto Lb5
        La0:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto Lad
            float r1 = r1 / r3
            float r1 = r1 * r10
            float r0 = r11 - r10
            r6.e(r1, r0)
            goto Lb5
        Lad:
            float r3 = r3 / r1
            float r3 = r3 * r10
            float r0 = r11 - r3
            r6.e(r10, r0)
        Lb5:
            float r11 = r11 - r10
            r6.f(r10, r11)
            r9.a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.border.b.c(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d(int r8, int r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_uikit.widget.border.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L22
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r8)
            r1[r5] = r2
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r9)
            r1[r3] = r8
            java.lang.String r8 = "fac4048b"
            r0.ipc$dispatch(r8, r1)
            return
        L22:
            boolean r0 = r7.a(r4, r5, r3)
            if (r0 != 0) goto L2d
            r8 = 0
            r7.a(r5, r8)
            return
        L2d:
            com.taobao.android.weex_uikit.widget.border.BorderProp r0 = r7.c
            int r0 = r0.b(r4)
            float r0 = (float) r0
            com.taobao.android.weex_uikit.widget.border.BorderProp r1 = r7.c
            int r1 = r1.b(r5)
            float r1 = (float) r1
            com.taobao.android.weex_uikit.widget.border.BorderProp r4 = r7.c
            int r3 = r4.b(r3)
            float r3 = (float) r3
            com.taobao.android.weex_uikit.widget.border.BorderProp r4 = r7.c
            int r2 = r4.b(r2)
            float r2 = (float) r2
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L51
            float r9 = (float) r9
            float r9 = r9 + r1
            int r9 = (int) r9
        L51:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L59
            float r6 = (float) r8
            float r6 = r6 + r3
        L57:
            int r6 = (int) r6
            goto L61
        L59:
            int r6 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r6 != 0) goto L60
            float r6 = (float) r8
            float r6 = r6 + r0
            goto L57
        L60:
            r6 = r8
        L61:
            int r9 = java.lang.Math.min(r6, r9)
            float r9 = (float) r9
            r6 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r6
            com.taobao.android.weex_uikit.widget.border.a r6 = new com.taobao.android.weex_uikit.widget.border.a
            r6.<init>()
            r6.a(r4, r4)
            if (r2 != 0) goto L7b
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 != 0) goto L7b
            r6.b(r9, r4)
            goto L8d
        L7b:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L86
            float r0 = r0 / r1
            float r0 = r0 * r9
            r6.b(r0, r9)
            goto L8d
        L86:
            float r0 = r1 / r0
            float r0 = r0 * r9
            r6.b(r9, r0)
        L8d:
            r6.c(r9, r9)
            float r8 = (float) r8
            r6.d(r8, r4)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto La2
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto La2
            float r0 = r8 - r9
            r6.e(r0, r4)
            goto Lb7
        La2:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto Laf
            float r0 = r8 - r9
            float r1 = r1 / r3
            float r1 = r1 * r9
            r6.e(r0, r1)
            goto Lb7
        Laf:
            float r3 = r3 * r9
            float r3 = r3 / r1
            float r0 = r8 - r3
            r6.e(r0, r9)
        Lb7:
            float r8 = r8 - r9
            r6.f(r8, r9)
            r7.a(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.border.b.d(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.border.b.e(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_uikit.widget.border.b.f(int, int):void");
    }

    private void a(int i, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7150a3b5", new Object[]{this, new Integer(i), aVar});
        } else if (i == 4) {
        } else {
            if (aVar == null) {
                this.b[i] = null;
                return;
            }
            this.b[i] = new Path();
            aVar.a(this.b[i]);
        }
    }

    public Path a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Path) ipChange.ipc$dispatch("c24a2c83", new Object[]{this, new Integer(i)}) : this.b[i];
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9edfa7", new Object[]{this, bVar});
            return;
        }
        for (int i = 0; i < 4; i++) {
            this.f16162a[i] = bVar.f16162a[i];
            this.b[i] = bVar.b[i];
        }
    }
}
