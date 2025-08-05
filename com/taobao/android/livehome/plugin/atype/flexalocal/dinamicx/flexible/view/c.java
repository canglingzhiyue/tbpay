package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class c implements View.OnAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f14168a;
    private AbsFlexibleMarqueeGallery b;
    private boolean i;
    private final Handler c = new Handler(Looper.getMainLooper());
    private long d = 3000;
    private boolean e = false;
    private boolean f = false;
    private int g = 0;
    private int h = 0;
    private Map<String, Integer> j = new HashMap();
    private final Runnable k = new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if ((c.a(c.this) > 0 && c.a(c.this) <= c.b(c.this)) || !c.c(c.this)) {
                AbsFlexibleMarqueeGallery d = c.d(c.this);
                c.this.a();
                if (d == null) {
                    return;
                }
                d.setAutoRunner(null);
            } else if (!c.c(c.this) || !c.e(c.this)) {
                c.g(c.this).removeCallbacks(c.f(c.this), this);
            } else {
                c.d(c.this).autoScrollToNext();
                c.g(c.this).removeCallbacks(this);
                if ((c.a(c.this) <= 0 || c.a(c.this) > c.b(c.this)) && c.c(c.this)) {
                    if (!c.c(c.this) || !c.e(c.this)) {
                        return;
                    }
                    c.g(c.this).postAtTime(this, SystemClock.uptimeMillis() + c.h(c.this));
                    return;
                }
                AbsFlexibleMarqueeGallery d2 = c.d(c.this);
                c.this.a();
                if (d2 == null) {
                    return;
                }
                d2.setAutoRunner(null);
            }
        }
    };

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
        }
    }

    public static /* synthetic */ int a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("963bd0e6", new Object[]{cVar})).intValue() : cVar.g;
    }

    public static /* synthetic */ int b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3db7aaa7", new Object[]{cVar})).intValue() : cVar.f();
    }

    public static /* synthetic */ boolean c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5338479", new Object[]{cVar})).booleanValue() : cVar.e;
    }

    public static /* synthetic */ AbsFlexibleMarqueeGallery d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AbsFlexibleMarqueeGallery) ipChange.ipc$dispatch("19c5c4e1", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ boolean e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("342b37fb", new Object[]{cVar})).booleanValue() : cVar.f;
    }

    public static /* synthetic */ Runnable f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("42ea08dc", new Object[]{cVar}) : cVar.k;
    }

    public static /* synthetic */ Handler g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("25b936ad", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ long h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a9ec52e", new Object[]{cVar})).longValue() : cVar.d;
    }

    static {
        kge.a(-311370621);
        kge.a(-1859085092);
        f14168a = c.class.getSimpleName();
    }

    public c(AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery) {
        boolean z = false;
        this.i = false;
        this.b = absFlexibleMarqueeGallery;
        AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery2 = this.b;
        if (absFlexibleMarqueeGallery2 != null) {
            if (absFlexibleMarqueeGallery2.getAutoRunner() != null) {
                this.b.getAutoRunner().a();
            }
            this.b.setAutoRunner(this);
            this.b.addOnAttachStateChangeListener(this);
            AccessibilityManager accessibilityManager = (AccessibilityManager) absFlexibleMarqueeGallery.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                z = true;
            }
            this.i = z;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery = this.b;
        if (absFlexibleMarqueeGallery != null) {
            absFlexibleMarqueeGallery.removeOnAttachStateChangeListener(this);
        }
        e();
        AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery2 = this.b;
        if (absFlexibleMarqueeGallery2 == null) {
            return;
        }
        absFlexibleMarqueeGallery2.setAutoRunner(null);
        this.b = null;
    }

    public c a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("a278f145", new Object[]{this, new Long(j)});
        }
        this.d = j;
        return this;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.i || !this.e) {
        } else {
            this.f = true;
            this.c.removeCallbacks(this.k, this);
            if (z) {
                this.c.postAtTime(this.k, this, SystemClock.uptimeMillis());
            } else {
                this.c.postAtTime(this.k, this, SystemClock.uptimeMillis() + this.d);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f = false;
        this.c.removeCallbacks(this.k, this);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.i) {
        } else {
            this.e = true;
            this.f = true;
            this.c.removeCallbacks(this.k, this);
            this.c.postAtTime(this.k, this, SystemClock.uptimeMillis() + this.d);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.e = false;
        this.f = false;
        this.c.removeCallbacks(this.k, this);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int i3 = this.h;
        if (i3 > 0) {
            i2 = i3;
        } else {
            AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery = this.b;
            if (absFlexibleMarqueeGallery != null) {
                i2 = absFlexibleMarqueeGallery.mExpectedAdapterCount;
            }
        }
        String valueOf = String.valueOf(i % i2);
        Integer num = this.j.get(valueOf);
        if (num != null) {
            this.j.put(valueOf, Integer.valueOf(num.intValue() + 1));
        } else {
            this.j.put(valueOf, 1);
        }
        int f = f();
        int i4 = this.g;
        if (i4 <= 0 || f < i4) {
            return;
        }
        a();
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        int i = this.h;
        if (i <= 0) {
            AbsFlexibleMarqueeGallery absFlexibleMarqueeGallery = this.b;
            i = absFlexibleMarqueeGallery != null ? absFlexibleMarqueeGallery.mExpectedAdapterCount : 0;
        }
        if (this.b != null && this.j.size() >= i) {
            return ((Integer) Collections.min(this.j.values())).intValue();
        }
        return 0;
    }
}
