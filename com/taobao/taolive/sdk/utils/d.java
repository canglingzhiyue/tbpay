package com.taobao.taolive.sdk.utils;

import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f21961a;
    private Handler b;
    private long c;
    private long d;
    private long e;
    private float f;
    private float g;
    private long h;
    private float i;
    private float j;
    private int k;
    private int l;
    private a m;
    private b n;
    private Runnable o;
    private int p;
    private Runnable q;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();

        void a(int i, PointF pointF);
    }

    static {
        kge.a(521253827);
    }

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcee9e5a", new Object[]{dVar});
        } else {
            dVar.a();
        }
    }

    public static /* synthetic */ b b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("3659a6cf", new Object[]{dVar}) : dVar.n;
    }

    public static /* synthetic */ int c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e43e454f", new Object[]{dVar})).intValue();
        }
        int i = dVar.p;
        dVar.p = i + 1;
        return i;
    }

    public static /* synthetic */ int d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7e618d0", new Object[]{dVar})).intValue() : dVar.p;
    }

    public static /* synthetic */ float e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b8dec4e", new Object[]{dVar})).floatValue() : dVar.i;
    }

    public static /* synthetic */ float f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f35bfcf", new Object[]{dVar})).floatValue() : dVar.j;
    }

    public d(Context context, a aVar) {
        this.f21961a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.m = aVar;
    }

    public d(Context context, b bVar) {
        this.f21961a = context;
        this.b = new Handler(Looper.getMainLooper());
        this.n = bVar;
        this.o = new Runnable() { // from class: com.taobao.taolive.sdk.utils.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d.a(d.this);
                if (d.b(d.this) == null) {
                    return;
                }
                d.b(d.this).a();
            }
        };
        this.q = new Runnable() { // from class: com.taobao.taolive.sdk.utils.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d.c(d.this);
                if (d.b(d.this) == null) {
                    return;
                }
                d.b(d.this).a(d.d(d.this), new PointF(d.e(d.this), d.f(d.this)));
            }
        };
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.c = this.e;
        this.e = System.currentTimeMillis();
        this.f = f;
        this.g = f2;
        if (this.e - this.d > 250) {
            this.p = 0;
        }
        this.b.removeCallbacks(this.o);
    }

    public boolean b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f625ad", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        this.d = this.h;
        this.h = System.currentTimeMillis();
        this.i = f;
        this.j = f2;
        if (this.h - this.e < 200 && Math.abs(this.f - this.i) < 10.0f && Math.abs(this.g - this.j) < 10.0f) {
            float f3 = this.j;
            if (f3 > this.k && f3 < com.taobao.taolive.sdk.utils.b.c(this.f21961a) - this.l) {
                if (this.n != null) {
                    if (this.e - this.d < 250) {
                        this.b.post(this.q);
                    } else {
                        this.b.postDelayed(this.o, 250L);
                    }
                    return true;
                }
                a aVar = this.m;
                if (aVar != null) {
                    aVar.a();
                    return true;
                }
                return false;
            }
        }
        a();
        return false;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0L;
        this.i = 0.0f;
        this.j = 0.0f;
    }
}
