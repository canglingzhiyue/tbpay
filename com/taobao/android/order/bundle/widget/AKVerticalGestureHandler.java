package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.bxd;
import tb.kge;
import tb.ksk;
import tb.osd;

/* loaded from: classes6.dex */
public class AKVerticalGestureHandler implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int j;
    private int k;
    private int l;
    private VelocityTracker m;
    private final a n;
    private final d o;
    private boolean p;
    private boolean q;
    private float r;
    private final float c = 900.0f;
    private final float d = 0.1f;
    private int e = 1;
    private final float f = -1.0f;
    private float g = -1.0f;
    private float h = -1.0f;
    private float i = 0.0f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14583a = false;
    public boolean b = false;
    private float s = 0.0f;
    private osd t = osd.a(ksk.REC_ORDER_DETAIL);

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface State {
        public static final int ANIMATING = 4;
        public static final int CLOSED = 3;
        public static final int COLLAPSE = 2;
        public static final int EXPAND = 1;
        public static final int INIT = 0;
        public static final int MAX_OFFSET = 5;
    }

    /* loaded from: classes6.dex */
    public interface a {
        void a(View view);

        void a(View view, int i);

        boolean a();

        boolean a(int i);
    }

    static {
        kge.a(-944424013);
        kge.a(-1311284712);
    }

    public static /* synthetic */ int a(AKVerticalGestureHandler aKVerticalGestureHandler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fdbb3f0", new Object[]{aKVerticalGestureHandler, new Integer(i)})).intValue();
        }
        aKVerticalGestureHandler.e = i;
        return i;
    }

    public static /* synthetic */ a a(AKVerticalGestureHandler aKVerticalGestureHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("edb7af47", new Object[]{aKVerticalGestureHandler}) : aKVerticalGestureHandler.n;
    }

    public static /* synthetic */ boolean a(AKVerticalGestureHandler aKVerticalGestureHandler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdbf3d2", new Object[]{aKVerticalGestureHandler, new Boolean(z)})).booleanValue();
        }
        aKVerticalGestureHandler.q = z;
        return z;
    }

    public static /* synthetic */ boolean b(AKVerticalGestureHandler aKVerticalGestureHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7c1869", new Object[]{aKVerticalGestureHandler})).booleanValue() : aKVerticalGestureHandler.q;
    }

    public AKVerticalGestureHandler(a aVar, d dVar, boolean z, Context context) {
        this.n = aVar;
        this.p = z;
        this.o = dVar;
        this.r = ViewConfiguration.get(context.getApplicationContext()).getScaledTouchSlop();
    }

    public void a(int i, int i2, int i3, View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a507b7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), view});
            return;
        }
        osd osdVar = this.t;
        if (osdVar == null || Boolean.parseBoolean(osdVar.a("optimizeRecommend", "false"))) {
            z = false;
        }
        if (!bxd.b() || z) {
            this.e = 0;
        }
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.o.a(i, i2, i3, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0 != 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MotionEvent r7, android.view.View r8) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            r1[r2] = r6
            r1[r4] = r7
            r1[r3] = r8
            java.lang.String r7 = "1de83139"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1f:
            int r0 = r7.getActionMasked()
            float r1 = r7.getRawY()
            float r5 = r6.g
            float r1 = r1 - r5
            if (r0 == r4) goto L3c
            if (r0 == r3) goto L31
            if (r0 == r2) goto L3c
            goto L4d
        L31:
            r6.a(r7)
            boolean r7 = r6.b
            if (r7 == 0) goto L4d
            r6.b(r8, r1)
            goto L4d
        L3c:
            boolean r7 = r6.b
            if (r7 == 0) goto L4d
            r6.c(r8, r1)
            r7 = 0
            r6.h = r7
            r6.g = r7
            r8 = 0
            r6.m = r8
            r6.s = r7
        L4d:
            boolean r7 = r6.b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.a(android.view.MotionEvent, android.view.View):boolean");
    }

    public boolean b(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91d758", new Object[]{this, motionEvent, view})).booleanValue();
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = motionEvent.getRawY();
            this.h = motionEvent.getRawX();
            this.i = view.getTranslationY();
            this.f14583a = false;
            this.b = false;
            return false;
        }
        boolean z = this.k - this.j > 0 && this.e != 1;
        float rawY = motionEvent.getRawY() - this.g;
        float rawX = motionEvent.getRawX() - this.h;
        if (!this.f14583a && !a(view, rawY)) {
            if (z && motionEvent.getPointerCount() > 1) {
                return true;
            }
            float f = 0.5f;
            if (z) {
                f = 0.1f;
            }
            float f2 = 0.0f;
            if (this.o.a()) {
                f2 = this.r;
            }
            if (Math.abs(rawY) + f2 >= this.r * f && (Math.abs(rawY) + f2 >= Math.abs(rawX) || Math.abs(rawY) + f2 >= this.r * 3.0f * f)) {
                this.b = true;
                return true;
            }
        }
        return false;
    }

    private boolean a(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3af19a", new Object[]{this, view, new Float(f)})).booleanValue();
        }
        if (view == null || !this.n.a() || this.n.a((int) f)) {
            return true;
        }
        return this.e == 1 && f < 0.0f;
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        } else {
            this.f14583a = z;
        }
    }

    private void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            return;
        }
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent);
    }

    private int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.l;
    }

    private void b(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b3e97", new Object[]{this, view, new Float(f)});
            return;
        }
        view.setTranslationY(Math.min(b(), Math.max(0.0f, f + this.i)));
        a aVar = this.n;
        if (aVar == null) {
            return;
        }
        aVar.a(view);
    }

    private float c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000);
        return this.m.getYVelocity();
    }

    private void c(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("139b8b98", new Object[]{this, view, new Float(f)});
            return;
        }
        float c = c();
        float f2 = this.i + f;
        if (c >= 900.0f && f > 0.0f) {
            if (f2 > this.j) {
                a(3, view, c);
            } else {
                a(2, view, c);
            }
        } else if (c >= -900.0f && f < 0.0f) {
            if (f2 > this.j) {
                a(2, view, c);
            } else {
                a(1, view, c);
            }
        } else if (f < 0.0f) {
            int i = this.j;
            if (f2 < i / 2.0f) {
                a(1, view, c);
                return;
            }
            if (f2 > i / 2.0f) {
                int i2 = this.l;
                if (f2 < i2 - ((i2 - i) / 2.0f)) {
                    a(2, view, c);
                    return;
                }
            }
            a(3, view, c);
        } else {
            int i3 = this.l;
            int i4 = this.j;
            if (f2 > i3 - ((i3 - i4) / 2.0f)) {
                a(3, view, c);
            } else if (f2 > i4 / 4.0f) {
                a(2, view, c);
            } else {
                a(1, view, c);
            }
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        osd osdVar = this.t;
        if (osdVar == null) {
            return;
        }
        osdVar.e();
    }

    public void a(final int i, final View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114f8149", new Object[]{this, new Integer(i), view, new Float(f)});
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AKVerticalGestureHandler.a(AKVerticalGestureHandler.this).a(view, i);
                if (AKVerticalGestureHandler.b(AKVerticalGestureHandler.this)) {
                    AKVerticalGestureHandler.a(AKVerticalGestureHandler.this);
                    AKVerticalGestureHandler.a(AKVerticalGestureHandler.this, false);
                }
                AKVerticalGestureHandler.a(AKVerticalGestureHandler.this, i);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: com.taobao.android.order.bundle.widget.AKVerticalGestureHandler.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AKVerticalGestureHandler.a(AKVerticalGestureHandler.this).a(view);
                }
            }
        };
        this.e = 4;
        if (i == 0) {
            this.o.d(view, f, runnable, runnable2);
        } else if (i == 1) {
            this.o.b(view, f, runnable, runnable2);
        } else if (i == 2) {
            this.o.c(view, f, runnable, runnable2);
        } else if (i != 3 && i != 5) {
        } else {
            this.o.a(view, f, runnable, runnable2);
        }
    }
}
