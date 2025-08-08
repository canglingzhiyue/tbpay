package com.loc;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class by {

    /* renamed from: a  reason: collision with root package name */
    static int f7711a = 1000;
    static boolean b = false;
    static int c = 20;
    static int d = 0;
    private static WeakReference<bv> e = null;
    private static int f = 10;

    /* loaded from: classes4.dex */
    static class a extends cs {

        /* renamed from: a  reason: collision with root package name */
        private int f7712a;
        private Context b;
        private bx c;

        a(Context context, int i) {
            this.b = context;
            this.f7712a = i;
        }

        a(Context context, bx bxVar) {
            this(context, 1);
            this.c = bxVar;
        }

        @Override // com.loc.cs
        public final void a() {
            int i = this.f7712a;
            if (i == 1) {
                try {
                    synchronized (by.class) {
                        String l = Long.toString(System.currentTimeMillis());
                        bv a2 = cb.a(by.e);
                        cb.a(this.b, a2, at.i, by.f7711a, 2097152, "6");
                        if (a2.e == null) {
                            a2.e = new bg(new bi(new bj(new bi())));
                        }
                        bw.a(l, this.c.a(), a2);
                    }
                } catch (Throwable th) {
                    av.b(th, "ofm", "aple");
                }
            } else if (i != 2) {
            } else {
                try {
                    bv a3 = cb.a(by.e);
                    cb.a(this.b, a3, at.i, by.f7711a, 2097152, "6");
                    a3.h = 14400000;
                    if (a3.g == null) {
                        a3.g = new cf(new ce(this.b, new cj(), new bg(new bi(new bj())), new String(ag.a()), l.f(this.b), o.k(), o.h(), o.f(this.b), o.a(), Build.MANUFACTURER, Build.DEVICE, o.n(), l.c(this.b), Build.MODEL, l.d(this.b), l.b(this.b), o.e(this.b), o.a(this.b), String.valueOf(Build.VERSION.SDK_INT), ac.a(this.b).a()));
                    }
                    if (StringUtils.isEmpty(a3.i)) {
                        a3.i = "fKey";
                    }
                    a3.f = new cn(this.b, a3.h, a3.i, new cl(this.b, by.b, by.f << 10, by.c << 10, "offLocKey", by.d << 10));
                    bw.a(a3);
                } catch (Throwable th2) {
                    av.b(th2, "ofm", "uold");
                }
            }
        }
    }

    public static synchronized void a(int i, boolean z, int i2, int i3) {
        synchronized (by.class) {
            f7711a = i;
            b = z;
            if (i2 < 10 || i2 > 100) {
                i2 = 20;
            }
            c = i2;
            if (i2 / 5 > f) {
                f = c / 5;
            }
            d = i3;
        }
    }

    public static void a(Context context) {
        cr.a().b(new a(context, 2));
    }

    public static synchronized void a(bx bxVar, Context context) {
        synchronized (by.class) {
            cr.a().b(new a(context, bxVar));
        }
    }
}
