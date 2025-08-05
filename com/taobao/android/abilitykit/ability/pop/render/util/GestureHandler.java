package com.taobao.android.abilitykit.ability.pop.render.util;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.util.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.dly;
import tb.ffz;
import tb.kge;

/* loaded from: classes4.dex */
public class GestureHandler implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_TOUCH_POSITION_CHANGED = "onPositionChanged";
    private float e;
    private float f;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private VelocityTracker l;
    private final a m;
    private final b n;
    private boolean o;
    private boolean p;
    private final float b = ffz.a();
    private final float c = 0.1f;
    private int d = 0;
    private float g = 0.0f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8939a = false;
    private float q = 0.0f;
    private float r = Float.MIN_VALUE;
    private float s = Float.MIN_VALUE;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface State {
        public static final int ANIMATING = 4;
        public static final int CLOSED = 3;
        public static final int COLLAPSE = 2;
        public static final int EXPAND = 1;
        public static final int INIT = 0;
    }

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(float f, float f2, int i, int i2, boolean z, String str);

        void a(View view);

        void a(View view, int i);

        void a(dly dlyVar);

        boolean a(boolean z, float f, int i, View view);
    }

    static {
        kge.a(-802859736);
        kge.a(-1321962493);
    }

    public static /* synthetic */ int a(GestureHandler gestureHandler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7305cb27", new Object[]{gestureHandler, new Integer(i)})).intValue();
        }
        gestureHandler.d = i;
        return i;
    }

    public static /* synthetic */ a a(GestureHandler gestureHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("45c6e3b1", new Object[]{gestureHandler}) : gestureHandler.m;
    }

    public static /* synthetic */ boolean a(GestureHandler gestureHandler, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73060b09", new Object[]{gestureHandler, new Boolean(z)})).booleanValue();
        }
        gestureHandler.p = z;
        return z;
    }

    public static /* synthetic */ boolean b(GestureHandler gestureHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("79748874", new Object[]{gestureHandler})).booleanValue() : gestureHandler.p;
    }

    public GestureHandler(a aVar, b bVar, boolean z, boolean z2, boolean z3) {
        this.m = aVar;
        this.o = z;
        this.n = bVar;
        this.j = z2;
        this.k = z3;
        this.n.a(z2);
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.j = z;
        this.k = z2;
        this.n.a(this.j);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = 0;
        this.h = i;
        this.i = i2;
        if (this.k) {
            i3 = -1;
        }
        this.n.a(i * i3, i3 * i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // com.taobao.android.abilitykit.ability.pop.render.util.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(android.view.MotionEvent r13, android.view.View r14) {
        /*
            r12 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 3
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r5] = r12
            r1[r4] = r13
            r1[r2] = r14
            java.lang.String r13 = "1de83139"
            java.lang.Object r13 = r0.ipc$dispatch(r13, r1)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L1f:
            boolean r0 = r12.f8939a
            if (r0 != 0) goto L24
            return r5
        L24:
            int r0 = r13.getActionMasked()
            boolean r1 = r12.j
            if (r1 == 0) goto L33
            float r1 = r13.getRawX()
            float r6 = r12.f
            goto L39
        L33:
            float r1 = r13.getRawY()
            float r6 = r12.e
        L39:
            float r1 = r1 - r6
            if (r0 == r4) goto Lad
            if (r0 == r2) goto L42
            if (r0 == r3) goto Lad
            goto Lbc
        L42:
            r12.a(r13)
            boolean r13 = r12.k
            r0 = 0
            if (r13 == 0) goto L5a
            int r13 = r12.i
            int r13 = -r13
            float r13 = (float) r13
            float r2 = r12.g
            float r1 = r1 + r2
            float r0 = java.lang.Math.min(r0, r1)
            float r13 = java.lang.Math.max(r13, r0)
            goto L68
        L5a:
            int r13 = r12.i
            float r13 = (float) r13
            float r2 = r12.g
            float r1 = r1 + r2
            float r0 = java.lang.Math.max(r0, r1)
            float r13 = java.lang.Math.min(r13, r0)
        L68:
            float r6 = r12.s
            r0 = 1
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 == 0) goto L89
            float r7 = r12.r
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 == 0) goto L89
            com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler$a r5 = r12.m
            int r8 = r14.getWidth()
            int r9 = r14.getHeight()
            r10 = 0
            java.lang.String r11 = "onPositionChanged"
            r5.a(r6, r7, r8, r9, r10, r11)
            r12.s = r0
            r12.r = r0
        L89:
            boolean r0 = r12.j
            if (r0 == 0) goto L91
            r14.setTranslationX(r13)
            goto L94
        L91:
            r14.setTranslationY(r13)
        L94:
            com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler$a r5 = r12.m
            float r6 = r14.getX()
            float r7 = r14.getY()
            int r8 = r14.getWidth()
            int r9 = r14.getHeight()
            r10 = 0
            java.lang.String r11 = "onPositionChanged"
            r5.a(r6, r7, r8, r9, r10, r11)
            goto Lbc
        Lad:
            r12.f8939a = r5
            r12.b(r14, r1)
            android.view.VelocityTracker r13 = r12.l
            if (r13 == 0) goto Lbc
            r13.recycle()
            r13 = 0
            r12.l = r13
        Lbc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.a(android.view.MotionEvent, android.view.View):boolean");
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.util.c
    public boolean b(MotionEvent motionEvent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f91d758", new Object[]{this, motionEvent, view})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (actionMasked == 0) {
            this.q = this.j ? motionEvent.getX() : motionEvent.getY();
            this.f = rawX;
            this.e = rawY;
            this.r = view.getY();
            this.s = view.getX();
            this.g = this.j ? view.getTranslationX() : view.getTranslationY();
            this.f8939a = false;
            return false;
        }
        float f = rawX - this.f;
        float f2 = rawY - this.e;
        float f3 = this.j ? f : f2;
        if (a(view, f3)) {
            return false;
        }
        if (Math.abs(f3) >= ViewConfiguration.get(view.getContext().getApplicationContext()).getScaledTouchSlop() * ((this.i - this.h <= 0 || this.d == 1) ? 5.0f : 0.5f)) {
            if (!((Math.abs(f2) <= Math.abs(f)) ^ this.j)) {
                this.f = rawX;
                this.e = rawY;
                this.f8939a = true;
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
        if (view == null || this.m.a(this.j, this.q, (int) f, view) || this.n.a()) {
            return true;
        }
        if (this.d == 1) {
            if (this.k ^ (f < 0.0f)) {
                return true;
            }
        }
        return false;
    }

    private void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
            return;
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
    }

    private float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue();
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000);
        return this.j ? this.l.getXVelocity() : this.l.getYVelocity();
    }

    private final void b(View view, float f) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b3e97", new Object[]{this, view, new Float(f)});
            return;
        }
        float a2 = a();
        if ((this.k ^ (f > 0.0f)) && (a2 >= this.b || Math.abs(f) >= this.i * 0.1f)) {
            if (!this.o) {
                a(3, view, a2);
                return;
            }
            this.p = true;
        }
        boolean z2 = this.k;
        if (f < 0.0f) {
            z = true;
        }
        if (z2 ^ z) {
            a(1, view, a2);
        } else if (1 == this.d) {
            a(1, view, a2);
        } else {
            a(2, view, a2);
        }
    }

    private void a(final int i, final View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114f8149", new Object[]{this, new Integer(i), view, new Float(f)});
            return;
        }
        b.a aVar = new b.a() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.GestureHandler.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.abilitykit.ability.pop.render.util.b.a
            public void a(dly dlyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5637847", new Object[]{this, dlyVar});
                } else {
                    GestureHandler.a(GestureHandler.this).a(dlyVar);
                }
            }

            @Override // com.taobao.android.abilitykit.ability.pop.render.util.b.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                GestureHandler.a(GestureHandler.this).a();
                GestureHandler.a(GestureHandler.this).a(view, i);
                if (GestureHandler.b(GestureHandler.this)) {
                    GestureHandler.a(GestureHandler.this).a(view);
                    GestureHandler.a(GestureHandler.this, false);
                }
                GestureHandler.a(GestureHandler.this, i);
            }

            @Override // com.taobao.android.abilitykit.ability.pop.render.util.b.a
            public void a(float f2, float f3, boolean z, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7193c36", new Object[]{this, new Float(f2), new Float(f3), new Boolean(z), str});
                } else {
                    GestureHandler.a(GestureHandler.this).a(f2, f3, view.getWidth(), view.getHeight(), z, str);
                }
            }
        };
        if (i == 1) {
            this.n.b(view, f, aVar);
        } else if (i == 2) {
            this.n.c(view, f, aVar);
        } else if (i == 3) {
            this.n.a(view, f, aVar);
        }
        this.d = 4;
    }
}
