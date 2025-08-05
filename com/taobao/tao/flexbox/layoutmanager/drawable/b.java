package com.taobao.tao.flexbox.layoutmanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ogk;
import tb.ogl;
import tb.ogu;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f20382a;

    /* loaded from: classes8.dex */
    public static class a extends ColorDrawable {
        static {
            kge.a(-804796956);
        }
    }

    static {
        kge.a(1348615492);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            f20382a = context.getApplicationContext();
        }
    }

    public static Drawable a(Drawable drawable, ogl oglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("93544cd2", new Object[]{drawable, oglVar}) : a(drawable, oglVar, false);
    }

    public static Drawable b(Drawable drawable, ogl oglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("db53ab31", new Object[]{drawable, oglVar}) : a(drawable, oglVar, true);
    }

    public static Drawable a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("89afa1f2", new Object[]{new Integer(i), new Integer(i2)});
        }
        GradientDrawable d = ogu.d();
        GradientDrawable gradientDrawable = d;
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(i2);
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.drawable.Drawable a(tb.ogl.b r6, int r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.drawable.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r2] = r6
            java.lang.String r6 = "95d3091d"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            return r6
        L1d:
            r0 = 0
            if (r6 == 0) goto L76
            int[] r1 = new int[r4]
            int r5 = r6.b
            r1[r3] = r5
            int r3 = r6.c
            r1[r2] = r3
            int r2 = r6.f32035a
            r3 = 16
            if (r2 != 0) goto L4d
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L44
            android.graphics.drawable.GradientDrawable r6 = tb.ogu.d()
            r0 = r6
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r0.setOrientation(r2)
            r0.setColors(r1)
            goto L4b
        L44:
            com.taobao.tao.flexbox.layoutmanager.drawable.b$b r6 = new com.taobao.tao.flexbox.layoutmanager.drawable.b$b
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            r6.<init>(r0, r1)
        L4b:
            r0 = r6
            goto L6d
        L4d:
            int r6 = r6.f32035a
            if (r6 != r4) goto L6d
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L65
            android.graphics.drawable.GradientDrawable r6 = tb.ogu.d()
            r0 = r6
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            android.graphics.drawable.GradientDrawable$Orientation r2 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r0.setOrientation(r2)
            r0.setColors(r1)
            goto L4b
        L65:
            com.taobao.tao.flexbox.layoutmanager.drawable.b$b r6 = new com.taobao.tao.flexbox.layoutmanager.drawable.b$b
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r6.<init>(r0, r1)
            goto L4b
        L6d:
            if (r7 <= 0) goto L76
            r6 = r0
            android.graphics.drawable.GradientDrawable r6 = (android.graphics.drawable.GradientDrawable) r6
            float r7 = (float) r7
            r6.setCornerRadius(r7)
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.drawable.b.a(tb.ogl$b, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.drawable.Drawable a(android.graphics.drawable.Drawable r9, tb.ogl r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.drawable.b.a(android.graphics.drawable.Drawable, tb.ogl, boolean):android.graphics.drawable.Drawable");
    }

    private static boolean a(ogl oglVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7dc68c8", new Object[]{oglVar})).booleanValue() : oglVar == null || (oglVar instanceof ogk) || oglVar.aG == null || oglVar.aE == 1 || oglVar.aG.c < 0 || (oglVar.aG.c == 0 && oglVar.aG.f32034a == 0 && oglVar.aG.b == 0);
    }

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.drawable.b$b  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0848b extends GradientDrawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float[] f20383a;
        public float b;
        public int c;

        /* renamed from: com.taobao.tao.flexbox.layoutmanager.drawable.b$b$a */
        /* loaded from: classes8.dex */
        public interface a {
            void onBoundChanged(C0848b c0848b);
        }

        static {
            kge.a(1153240139);
        }

        public static /* synthetic */ Object ipc$super(C0848b c0848b, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -2117630736:
                    super.setCornerRadius(((Number) objArr[0]).floatValue());
                    return null;
                case -2054040210:
                    super.onBoundsChange((Rect) objArr[0]);
                    return null;
                case -1862206224:
                    super.setCornerRadii((float[]) objArr[0]);
                    return null;
                case -1665133574:
                    super.draw((Canvas) objArr[0]);
                    return null;
                case 1718516699:
                    super.setColor(((Number) objArr[0]).intValue());
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public C0848b(GradientDrawable.Orientation orientation, int[] iArr) {
            super(orientation, iArr);
            this.c = 1;
        }

        public C0848b() {
            this.c = 1;
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setCornerRadii(float[] fArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9100fcf0", new Object[]{this, fArr});
                return;
            }
            super.setCornerRadii(fArr);
            this.f20383a = fArr;
            this.b = 0.0f;
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setColor(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
                return;
            }
            super.setColor(i);
            this.c = i;
        }

        @Override // android.graphics.drawable.GradientDrawable
        public void setCornerRadius(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
                return;
            }
            super.setCornerRadius(f);
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.b = f;
            this.f20383a = null;
        }

        public float[] a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("a8212179", new Object[]{this}) : this.f20383a;
        }

        public float b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.b;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            } else {
                super.draw(canvas);
            }
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
                return;
            }
            super.onBoundsChange(rect);
            if (getCallback() == null || !(getCallback() instanceof a)) {
                return;
            }
            ((a) getCallback()).onBoundChanged(this);
        }

        public Path a(Path path, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Path) ipChange.ipc$dispatch("af9d8ad8", new Object[]{this, path, new Integer(i), new Integer(i2)});
            }
            if (path != null) {
                path.reset();
            }
            float[] a2 = a();
            if (a2 != null) {
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, i, i2);
                if (path == null) {
                    path = new Path();
                }
                path.addRoundRect(rectF, a2, Path.Direction.CW);
            } else {
                float b = b();
                if (b > 0.0f) {
                    RectF rectF2 = new RectF();
                    rectF2.set(0.0f, 0.0f, i, i2);
                    if (path == null) {
                        path = new Path();
                    }
                    path.addRoundRect(rectF2, b, b, Path.Direction.CW);
                }
            }
            return path;
        }
    }
}
