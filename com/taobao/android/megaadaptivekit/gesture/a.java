package com.taobao.android.megaadaptivekit.gesture;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.alibaba.ability.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.WeakHashMap;
import tb.jao;
import tb.jzb;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MegaScaleGesture";
    private static WeakHashMap<a, b> b;
    private static boolean q;
    private static final jao r;

    /* renamed from: a  reason: collision with root package name */
    private ScaleGestureDetector f14245a;
    private b d;
    private boolean g;
    private boolean h;
    private boolean i;
    private Context j;
    private C0547a o;
    private c p;
    private ScaleBreakPoint c = ScaleBreakPoint.Default;
    private final String e = "mega_scale_gesture";
    private final String f = "cloConfig";
    private final String k = "不能再放大了";
    private final String l = "不能再缩小了";
    private final String m = "已显示更少内容";
    private final String n = "已显示更多内容";

    public static /* synthetic */ ScaleBreakPoint a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScaleBreakPoint) ipChange.ipc$dispatch("8e12c774", new Object[]{aVar}) : aVar.c;
    }

    public static /* synthetic */ void a(a aVar, Context context, C0547a c0547a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37bb1183", new Object[]{aVar, context, c0547a});
        } else {
            aVar.a(context, c0547a);
        }
    }

    public static /* synthetic */ void a(a aVar, C0547a c0547a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29bdb1b", new Object[]{aVar, c0547a});
        } else {
            aVar.a(c0547a);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af011324", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    public static /* synthetic */ b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("183bff6c", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ C0547a c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0547a) ipChange.ipc$dispatch("c06861cf", new Object[]{aVar}) : aVar.o;
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64ebaef7", new Object[]{aVar})).booleanValue() : aVar.h;
    }

    public static /* synthetic */ boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a876ccb8", new Object[]{aVar})).booleanValue() : aVar.g;
    }

    public static /* synthetic */ c f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("9a431f07", new Object[]{aVar}) : aVar.p;
    }

    static {
        kge.a(-1849090799);
        b = new WeakHashMap<>();
        q = true;
        r = jao.a();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        jao jaoVar = r;
        if (jaoVar == null) {
            return;
        }
        jaoVar.a(str, (jzb) null);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4aca0f", new Object[]{this, bVar});
            return;
        }
        this.d = bVar;
        b.put(this, bVar);
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4b3e6e", new Object[]{this, cVar});
        } else {
            this.p = cVar;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeakHashMap<a, b> weakHashMap = b;
        if (weakHashMap == null) {
            return;
        }
        weakHashMap.remove(this);
    }

    private void a(Context context, C0547a c0547a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f974c9cb", new Object[]{this, context, c0547a});
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("mega_scale_gesture", 0).edit();
            edit.putString("cloConfig", c0547a.g());
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public a(final Context context) {
        this.o = C0547a.a(context);
        this.g = l.b(context);
        this.h = l.d(context);
        this.i = this.h || this.g;
        this.j = context;
        this.f14245a = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.taobao.android.megaadaptivekit.gesture.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private boolean c = false;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -1949747311) {
                    return new Boolean(super.onScaleBegin((ScaleGestureDetector) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                this.c = false;
                return super.onScaleBegin(scaleGestureDetector);
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                if (scaleGestureDetector.getScaleFactor() > a.a(a.this).getScaleFactorMax() && !this.c) {
                    a.a(a.this, false);
                    if (a.b(a.this) != null) {
                        a.b(a.this).a(a.c(a.this));
                    }
                    a aVar = a.this;
                    a.a(aVar, a.c(aVar));
                    this.c = true;
                    TLog.loge(a.TAG, a.TAG, "on zoom in = " + a.c(a.this).toString());
                } else if (scaleGestureDetector.getScaleFactor() < a.a(a.this).getScaleFactorMin() && !this.c) {
                    a.a(a.this, true);
                    if (a.b(a.this) != null) {
                        a.b(a.this).a(a.c(a.this));
                    }
                    a aVar2 = a.this;
                    a.a(aVar2, a.c(aVar2));
                    this.c = true;
                    TLog.loge(a.TAG, a.TAG, "on zoom out = " + a.c(a.this).toString());
                } else if (!this.c) {
                    a.b(a.this).a(scaleGestureDetector);
                }
                return false;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                    return;
                }
                a aVar = a.this;
                a.a(aVar, context, a.c(aVar));
                e.c(new Runnable() { // from class: com.taobao.android.megaadaptivekit.gesture.a.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        WindowType b2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        if (a.c(a.this) == null) {
                            return;
                        }
                        hashMap.put("maxColNum", String.valueOf(C0547a.a(a.c(a.this))));
                        hashMap.put("largeColNum", String.valueOf(C0547a.c(a.c(a.this))));
                        hashMap.put("mediumColNum", String.valueOf(C0547a.e(a.c(a.this))));
                        hashMap.put("expandColNum", String.valueOf(C0547a.g(a.c(a.this))));
                        hashMap.put("smallColNum", String.valueOf(C0547a.m(a.c(a.this))));
                        hashMap.put("minColNum", String.valueOf(2));
                        hashMap.put("isFold", String.valueOf(a.d(a.this)));
                        hashMap.put("isTablet", String.valueOf(a.e(a.this)));
                        if (a.e(a.this)) {
                            if (a.f(a.this) != null && a.f(a.this).a() != null) {
                                b2 = a.f(a.this).a();
                            } else if (context instanceof Activity) {
                                b2 = h.a().b((Activity) context);
                            }
                            hashMap.put("windowType", b2.name());
                        }
                        d.a("GestureOnScale", hashMap);
                    }
                });
            }
        });
        if (!q || this.o == null) {
            return;
        }
        e.c(new Runnable() { // from class: com.taobao.android.megaadaptivekit.gesture.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                WindowType b2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("maxColNum", String.valueOf(C0547a.a(a.c(a.this))));
                hashMap.put("largeColNum", String.valueOf(C0547a.c(a.c(a.this))));
                hashMap.put("mediumColNum", String.valueOf(C0547a.e(a.c(a.this))));
                hashMap.put("expandColNum", String.valueOf(C0547a.g(a.c(a.this))));
                hashMap.put("smallColNum", String.valueOf(C0547a.m(a.c(a.this))));
                hashMap.put("minColNum", String.valueOf(2));
                hashMap.put("isFold", String.valueOf(a.d(a.this)));
                hashMap.put("isTablet", String.valueOf(a.e(a.this)));
                if (a.f(a.this) == null || a.f(a.this).a() == null) {
                    if (context instanceof Activity) {
                        b2 = h.a().b((Activity) context);
                    }
                    d.a("GestureConfiguration", hashMap);
                }
                b2 = a.f(a.this).a();
                hashMap.put("windowType", b2.name());
                d.a("GestureConfiguration", hashMap);
            }
        });
        q = false;
    }

    private void a(C0547a c0547a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe0a1d3", new Object[]{this, c0547a});
            return;
        }
        for (b bVar : b.values()) {
            if (bVar != this.d) {
                bVar.a(c0547a);
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            return;
        }
        ScaleGestureDetector scaleGestureDetector = this.f14245a;
        if (scaleGestureDetector == null || !this.i) {
            return;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            c();
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.h) {
            if (C0547a.g(this.o) > 2) {
                C0547a.h(this.o);
                c cVar = this.p;
                if (cVar == null || !cVar.b()) {
                    return;
                }
                a("已显示更少内容");
                return;
            }
            c cVar2 = this.p;
            if (cVar2 == null || !cVar2.b()) {
                return;
            }
            a("不能再放大了");
        } else if (!this.g) {
        } else {
            if (C0547a.a(this.o) > 3) {
                C0547a.b(this.o);
                c cVar3 = this.p;
                if (cVar3 != null && cVar3.a() == WindowType.MAX) {
                    a("已显示更少内容");
                }
            } else {
                c cVar4 = this.p;
                if (cVar4 != null && cVar4.a() == WindowType.MAX) {
                    a("不能再放大了");
                }
            }
            if (C0547a.c(this.o) > 3) {
                C0547a.d(this.o);
                c cVar5 = this.p;
                if (cVar5 != null && cVar5.a() == WindowType.LARGE) {
                    a("已显示更少内容");
                }
            } else {
                c cVar6 = this.p;
                if (cVar6 != null && cVar6.a() == WindowType.LARGE) {
                    a("不能再放大了");
                }
            }
            if (C0547a.e(this.o) > 2) {
                C0547a.f(this.o);
                c cVar7 = this.p;
                if (cVar7 == null || cVar7.a() != WindowType.MEDIUM) {
                    return;
                }
                a("已显示更少内容");
                return;
            }
            c cVar8 = this.p;
            if (cVar8 == null || cVar8.a() != WindowType.MEDIUM) {
                return;
            }
            a("不能再放大了");
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.g) {
            if (C0547a.a(this.o) < 5) {
                C0547a.l(this.o);
                c cVar = this.p;
                if (cVar != null && cVar.a() == WindowType.MAX) {
                    a("已显示更多内容");
                }
            } else {
                c cVar2 = this.p;
                if (cVar2 != null && cVar2.a() == WindowType.MAX) {
                    a("不能再缩小了");
                }
            }
            if (C0547a.c(this.o) < 5) {
                C0547a.i(this.o);
                c cVar3 = this.p;
                if (cVar3 != null && cVar3.a() == WindowType.LARGE) {
                    a("已显示更多内容");
                }
            } else {
                c cVar4 = this.p;
                if (cVar4 != null && cVar4.a() == WindowType.LARGE) {
                    a("不能再缩小了");
                }
            }
            if (C0547a.e(this.o) < 4) {
                C0547a.j(this.o);
                c cVar5 = this.p;
                if (cVar5 == null || cVar5.a() != WindowType.MEDIUM) {
                    return;
                }
                a("已显示更多内容");
                return;
            }
            c cVar6 = this.p;
            if (cVar6 == null || cVar6.a() != WindowType.MEDIUM) {
                return;
            }
            a("不能再缩小了");
        } else if (!this.h) {
        } else {
            if (C0547a.g(this.o) < 4) {
                C0547a.k(this.o);
                c cVar7 = this.p;
                if (cVar7 == null || !cVar7.b()) {
                    return;
                }
                a("已显示更多内容");
                return;
            }
            c cVar8 = this.p;
            if (cVar8 == null || !cVar8.b()) {
                return;
            }
            a("不能再缩小了");
        }
    }

    /* renamed from: com.taobao.android.megaadaptivekit.gesture.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0547a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static C0547a c;

        /* renamed from: a  reason: collision with root package name */
        private final String f14249a = "mega_scale_gesture";
        private final String b = "cloConfig";
        private int d = 4;
        private int e = 3;
        private int f = 3;
        private int g = 2;
        private final int h = 2;
        private final int i = 2;
        private int j = 3;

        static {
            kge.a(1200199525);
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
            }
            return 2;
        }

        public static /* synthetic */ int a(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2fe0a1c6", new Object[]{c0547a})).intValue() : c0547a.d;
        }

        public static /* synthetic */ int b(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bd1b5347", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.d;
            c0547a.d = i - 1;
            return i;
        }

        public static /* synthetic */ int c(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a5604c8", new Object[]{c0547a})).intValue() : c0547a.e;
        }

        public static /* synthetic */ int d(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d790b649", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.e;
            c0547a.e = i - 1;
            return i;
        }

        public static /* synthetic */ int e(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64cb67ca", new Object[]{c0547a})).intValue() : c0547a.f;
        }

        public static /* synthetic */ int f(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f206194b", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.f;
            c0547a.f = i - 1;
            return i;
        }

        public static /* synthetic */ int g(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7f40cacc", new Object[]{c0547a})).intValue() : c0547a.j;
        }

        public static /* synthetic */ int h(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c7b7c4d", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.j;
            c0547a.j = i - 1;
            return i;
        }

        public static /* synthetic */ int i(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("99b62dce", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.e;
            c0547a.e = i + 1;
            return i;
        }

        public static /* synthetic */ int j(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("26f0df4f", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.f;
            c0547a.f = i + 1;
            return i;
        }

        public static /* synthetic */ int k(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b42b90d0", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.j;
            c0547a.j = i + 1;
            return i;
        }

        public static /* synthetic */ int l(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("41664251", new Object[]{c0547a})).intValue();
            }
            int i = c0547a.d;
            c0547a.d = i + 1;
            return i;
        }

        public static /* synthetic */ int m(C0547a c0547a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cea0f3d2", new Object[]{c0547a})).intValue() : c0547a.g;
        }

        private C0547a(Context context) {
            b(context);
        }

        private void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
                return;
            }
            try {
                String string = context.getApplicationContext().getSharedPreferences("mega_scale_gesture", 0).getString("cloConfig", null);
                if (StringUtils.isEmpty(string)) {
                    return;
                }
                String[] split = string.split(":");
                if (split.length != 4) {
                    return;
                }
                this.d = Integer.parseInt(split[0]);
                if (this.d < 3 || this.d > 5) {
                    this.d = 4;
                }
                this.e = Integer.parseInt(split[1]);
                if (this.e < 3 || this.e > 5) {
                    this.e = 3;
                }
                this.f = Integer.parseInt(split[2]);
                if (this.f < 2 || this.f > 4) {
                    this.f = 3;
                }
                this.j = Integer.parseInt(split[3]);
                if (this.j >= 2 && this.j <= 4) {
                    return;
                }
                this.j = 3;
            } catch (Throwable unused) {
            }
        }

        public static C0547a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0547a) ipChange.ipc$dispatch("a0044e1", new Object[]{context});
            }
            if (c == null) {
                synchronized (C0547a.class) {
                    if (c == null) {
                        c = new C0547a(context);
                    }
                }
            }
            TLog.loge(a.TAG, a.TAG, "config = " + c.toString());
            return c;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.j;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.e;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.f;
        }

        public int f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.g;
        }

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
            }
            return this.d + ":" + this.e + ":" + this.f + ":" + this.j;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Config{maxColNum=" + this.d + ", largeColNum=" + this.e + ", mediumColNum=" + this.f + ", smallColNum=" + this.g + ", minColNum=2, foldColNum=2, expandColNum=" + this.j + '}';
        }
    }
}
