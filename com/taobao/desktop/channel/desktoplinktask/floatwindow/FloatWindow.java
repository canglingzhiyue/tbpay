package com.taobao.desktop.channel.desktoplinktask.floatwindow;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kgy;
import tb.kgz;

/* loaded from: classes7.dex */
public class FloatWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GESTURE_ABSORBED = 3;
    public static final int GESTURE_ABSORBING = 2;
    public static final int GESTURE_DRAG = 1;
    public static final int GESTURE_HOVER = 0;
    public static final int TRANSLATE_HIT_WALL = 4;
    public static final int TRANSLATE_MODE_SELF = 0;
    public static final int TRANSLATE_MODE_TARGET = 1;
    private View A;
    private FloatWindow B;
    private ValueAnimator C;
    private boolean D;
    private int E;
    private final a F;

    /* renamed from: a */
    private WindowManager.LayoutParams f16942a;
    private final WindowManager b;
    private final int c;
    private final int d;
    private final int e;
    private float f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private final Context k;
    private final boolean l;
    private final int m;
    private final int n;
    private final long o;
    private final boolean p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final boolean u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private FloatView z;

    /* loaded from: classes7.dex */
    public interface a {
        void onGestureStatusChange(int i, JSONObject jSONObject);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void onMoveFinish(boolean z);
    }

    static {
        kge.a(1949933315);
    }

    public static /* synthetic */ void lambda$Gyt87UgPYfijuXeug8k3f8ltG4E(FloatWindow floatWindow, int i, boolean z, float f, float f2, boolean z2, float f3, float f4, boolean z3, b bVar, ValueAnimator valueAnimator) {
        floatWindow.a(i, z, f, f2, z2, f3, f4, z3, bVar, valueAnimator);
    }

    public static /* synthetic */ float a(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62fa47c", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.f = f;
        return f;
    }

    public static /* synthetic */ View a(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bb6f0cf6", new Object[]{floatWindow}) : floatWindow.A;
    }

    public static /* synthetic */ void a(FloatWindow floatWindow, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc554b4", new Object[]{floatWindow, new Float(f), new Float(f2)});
        } else {
            floatWindow.a(f, f2);
        }
    }

    public static /* synthetic */ void a(FloatWindow floatWindow, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e200101", new Object[]{floatWindow, new Integer(i), jSONObject});
        } else {
            floatWindow.a(i, jSONObject);
        }
    }

    public static /* synthetic */ float b(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3adbe0a5", new Object[]{floatWindow})).floatValue() : floatWindow.f;
    }

    public static /* synthetic */ float b(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20a09d9b", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.g = f;
        return f;
    }

    public static /* synthetic */ float c(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e7c7a6", new Object[]{floatWindow})).floatValue() : floatWindow.g;
    }

    public static /* synthetic */ float c(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b1196ba", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.h = f;
        return f;
    }

    public static /* synthetic */ float d(FloatWindow floatWindow, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55828fd9", new Object[]{floatWindow, new Float(f)})).floatValue();
        }
        floatWindow.i = f;
        return f;
    }

    public static /* synthetic */ int d(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8f3aeaa", new Object[]{floatWindow})).intValue() : floatWindow.e;
    }

    public static /* synthetic */ boolean e(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8fff95bc", new Object[]{floatWindow})).booleanValue() : floatWindow.l;
    }

    public static /* synthetic */ float f(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("570b7ca9", new Object[]{floatWindow})).floatValue() : floatWindow.h;
    }

    public static /* synthetic */ float g(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e1763aa", new Object[]{floatWindow})).floatValue() : floatWindow.i;
    }

    public static /* synthetic */ boolean h(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e5234abf", new Object[]{floatWindow})).booleanValue() : floatWindow.u;
    }

    public static /* synthetic */ int i(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac2f31af", new Object[]{floatWindow})).intValue() : floatWindow.q;
    }

    public static /* synthetic */ FloatView j(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatView) ipChange.ipc$dispatch("4d050bc8", new Object[]{floatWindow}) : floatWindow.z;
    }

    public static /* synthetic */ int k(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a46ffb1", new Object[]{floatWindow})).intValue() : floatWindow.c;
    }

    public static /* synthetic */ int l(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("152e6b2", new Object[]{floatWindow})).intValue() : floatWindow.r;
    }

    public static /* synthetic */ int m(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c85ecdb3", new Object[]{floatWindow})).intValue() : floatWindow.s;
    }

    public static /* synthetic */ int n(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8f6ab4b4", new Object[]{floatWindow})).intValue() : floatWindow.d;
    }

    public static /* synthetic */ int o(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56769bb5", new Object[]{floatWindow})).intValue() : floatWindow.t;
    }

    public static /* synthetic */ FloatWindow p(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatWindow) ipChange.ipc$dispatch("e3dbe03f", new Object[]{floatWindow}) : floatWindow.B;
    }

    public static /* synthetic */ int q(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e48e69b7", new Object[]{floatWindow})).intValue() : floatWindow.m;
    }

    public static /* synthetic */ int r(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9a50b8", new Object[]{floatWindow})).intValue() : floatWindow.n;
    }

    public static /* synthetic */ a s(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ac130eff", new Object[]{floatWindow}) : floatWindow.F;
    }

    public static /* synthetic */ long t(FloatWindow floatWindow) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("39b21ebb", new Object[]{floatWindow})).longValue() : floatWindow.o;
    }

    private FloatWindow(d dVar) {
        this.E = 0;
        this.k = d.a(dVar);
        this.A = d.b(dVar);
        this.x = d.c(dVar);
        this.y = d.d(dVar);
        this.v = d.e(dVar);
        this.w = d.f(dVar);
        this.p = d.g(dVar);
        this.q = d.h(dVar);
        this.r = d.i(dVar);
        this.s = d.j(dVar);
        this.t = d.k(dVar);
        this.l = d.l(dVar);
        this.m = d.m(dVar);
        this.n = d.n(dVar);
        this.u = d.o(dVar);
        this.o = d.p(dVar) > 0 ? d.p(dVar) : 200L;
        this.F = d.q(dVar);
        this.e = a(this.k);
        this.b = (WindowManager) this.k.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        Pair<Integer, Integer> e = kgy.e(this.k);
        this.c = ((Integer) e.first).intValue();
        this.d = ((Integer) e.second).intValue();
        e();
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.z = new FloatView(this.k);
        if (!this.p) {
            return;
        }
        this.z.setOnTouchListener(new c());
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f16942a = new WindowManager.LayoutParams();
        WindowManager.LayoutParams layoutParams = this.f16942a;
        layoutParams.flags = 262184;
        if (!this.u) {
            layoutParams.flags |= 512;
        }
        WindowManager.LayoutParams layoutParams2 = this.f16942a;
        layoutParams2.width = this.x;
        layoutParams2.height = this.y;
        layoutParams2.gravity = 8388659;
        layoutParams2.format = 1;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f16942a.type = 2038;
        } else {
            this.f16942a.type = 2003;
        }
        WindowManager.LayoutParams layoutParams3 = this.f16942a;
        layoutParams3.x = this.v;
        layoutParams3.y = this.w;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (b()) {
        } else {
            this.b.addView(this.z, this.f16942a);
            this.j = true;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        FloatView floatView = this.z;
        if (floatView != null && floatView.getVisibility() == 0) {
            return this.j;
        }
        return false;
    }

    public void a(View view) {
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            kgz.a("FloatWindow.switchView", new Object[0]);
            if (this.D && (valueAnimator = this.C) != null && valueAnimator.isStarted()) {
                kgz.a("FloatWindow.switchView.isStarted.cancel", new Object[0]);
                this.C.cancel();
            }
            FloatWindow floatWindow = this.B;
            if (floatWindow != null) {
                floatWindow.c();
            }
            this.z.removeView(this.A);
            this.A = view;
            this.z.addView(this.A);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (b()) {
            this.z.removeView(this.A);
            this.b.removeView(this.z);
            this.j = false;
        }
        FloatWindow floatWindow = this.B;
        if (floatWindow == null) {
            return;
        }
        floatWindow.c();
    }

    public void a(final int i, final boolean z, boolean z2, final boolean z3, final float f, final boolean z4, final float f2, long j, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe7d57f", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), new Boolean(z3), new Float(f), new Boolean(z4), new Float(f2), new Long(j), bVar});
            return;
        }
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            kgz.a("FloatWindow.translate.isStarted.cancel", new Object[0]);
            this.C.cancel();
        }
        FloatWindow floatWindow = this.B;
        if (floatWindow != null) {
            floatWindow.c();
        }
        this.C = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C.setDuration(j);
        final float f3 = this.f16942a.x;
        final float f4 = this.f16942a.y;
        this.C.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.desktop.channel.desktoplinktask.floatwindow.-$$Lambda$FloatWindow$Gyt87UgPYfijuXeug8k3f8ltG4E
            {
                FloatWindow.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                FloatWindow.lambda$Gyt87UgPYfijuXeug8k3f8ltG4E(FloatWindow.this, i, z3, f3, f, z4, f4, f2, z, bVar, valueAnimator2);
            }
        });
        this.C.start();
        this.D = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x017f A[Catch: Throwable -> 0x01ba, TryCatch #0 {Throwable -> 0x01ba, blocks: (B:87:0x0070, B:90:0x007e, B:93:0x0087, B:94:0x008b, B:101:0x009b, B:104:0x00ad, B:107:0x00b6, B:123:0x00ed, B:129:0x0120, B:146:0x017f, B:148:0x019e, B:134:0x0138, B:139:0x0153, B:143:0x016b, B:149:0x01a1, B:151:0x01ab, B:153:0x01b4, B:97:0x0091, B:100:0x0098), top: B:158:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void a(int r19, boolean r20, float r21, float r22, boolean r23, float r24, float r25, boolean r26, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.b r27, android.animation.ValueAnimator r28) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.a(int, boolean, float, float, boolean, float, float, boolean, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow$b, android.animation.ValueAnimator):void");
    }

    public void a(Context context, View view, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f258f412", new Object[]{this, context, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        if (i5 < 0) {
            i7 = (this.f16942a.x + i3) - i;
        } else if (i5 == 0) {
            i7 = (this.f16942a.x + i3) - (i / 2);
        } else {
            i7 = this.f16942a.x + i3;
        }
        if (i6 < 0) {
            i8 = (this.f16942a.y + i4) - i2;
        } else if (i6 == 0) {
            i8 = (this.f16942a.y + i4) - (i2 / 2);
        } else {
            i8 = this.f16942a.y + i4;
        }
        FloatWindow floatWindow = this.B;
        if (floatWindow != null) {
            floatWindow.c();
        }
        this.B = new d(context, view).b(i).a(i2).b(i7, i8).b(false).a(false).a();
        this.B.a();
    }

    private int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    private void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
        } else if (this.E == i) {
        } else {
            this.E = i;
            a aVar = this.F;
            if (aVar == null) {
                return;
            }
            aVar.onGestureStatusChange(this.E, jSONObject);
        }
    }

    private void b(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787bdf6", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        a aVar = this.F;
        if (aVar == null) {
            return;
        }
        aVar.onGestureStatusChange(i, jSONObject);
    }

    private void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f16942a;
        layoutParams.x = (int) f;
        layoutParams.y = (int) f2;
        this.b.updateViewLayout(this.z, layoutParams);
    }

    /* loaded from: classes7.dex */
    public class FloatView extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int interceptX;
        public int interceptY;

        static {
            kge.a(1587233440);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FloatView(Context context) {
            super(context);
            FloatWindow.this = r2;
            this.interceptX = 0;
            this.interceptY = 0;
            if (FloatWindow.a(r2).getParent() != null && (FloatWindow.a(r2).getParent() instanceof ViewGroup)) {
                ((ViewGroup) FloatWindow.a(r2).getParent()).removeView(FloatWindow.a(r2));
            }
            addView(FloatWindow.a(r2));
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.interceptX = (int) motionEvent.getX();
                this.interceptY = (int) motionEvent.getY();
                FloatWindow.a(FloatWindow.this, motionEvent.getX());
                FloatWindow.b(FloatWindow.this, motionEvent.getY());
                kgz.a("FloatView.onInterceptTouchEvent.ACTION_DOWN.interceptX=%s.interceptY=%s.downX=%s.downY=%s", Integer.valueOf(this.interceptX), Integer.valueOf(this.interceptY), Float.valueOf(FloatWindow.b(FloatWindow.this)), Float.valueOf(FloatWindow.c(FloatWindow.this)));
            } else if (action == 2) {
                boolean z = Math.abs(motionEvent.getX() - ((float) this.interceptX)) > 5.0f && Math.abs(motionEvent.getY() - ((float) this.interceptY)) > 5.0f;
                kgz.a("FloatView.onInterceptTouchEvent.ACTION_MOVE.isIntercept=%s", Boolean.valueOf(z));
                return z;
            }
            return false;
        }
    }

    /* loaded from: classes7.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1014530110);
            kge.a(-468432129);
        }

        /* renamed from: lambda$8H-5T-W0fQr9tH17rdbnjN4YXDM */
        public static /* synthetic */ void m1056lambda$8H5TW0fQr9tH17rdbnjN4YXDM(c cVar, boolean z, boolean z2, boolean z3, boolean z4) {
            cVar.a(z, z2, z3, z4);
        }

        private c() {
            FloatWindow.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            kgz.a("FloatView.onTouch.action=%s", Integer.valueOf(motionEvent.getAction()));
            FloatWindow.c(FloatWindow.this, motionEvent.getRawX());
            FloatWindow.d(FloatWindow.this, motionEvent.getRawY() - FloatWindow.d(FloatWindow.this));
            int action = motionEvent.getAction();
            if (action == 1) {
                a();
            } else if (action == 2) {
                b();
            }
            return false;
        }

        private void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!FloatWindow.e(FloatWindow.this)) {
            } else {
                c();
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            float f = FloatWindow.f(FloatWindow.this) - FloatWindow.b(FloatWindow.this);
            float g = FloatWindow.g(FloatWindow.this) - FloatWindow.c(FloatWindow.this);
            if (FloatWindow.h(FloatWindow.this) && (f < FloatWindow.i(FloatWindow.this) || FloatWindow.j(FloatWindow.this).getWidth() + f > FloatWindow.k(FloatWindow.this) - FloatWindow.l(FloatWindow.this) || g < FloatWindow.m(FloatWindow.this) || FloatWindow.j(FloatWindow.this).getHeight() + g > FloatWindow.n(FloatWindow.this) - FloatWindow.o(FloatWindow.this))) {
                kgz.a("FloatView.onTouch.actionMove.outsideDragArea.stopDrag.targetX=%s.targetY=%s.rowY=%s.downY=%s", Float.valueOf(f), Float.valueOf(g));
                return;
            }
            if (FloatWindow.p(FloatWindow.this) != null) {
                FloatWindow.p(FloatWindow.this).c();
            }
            FloatWindow.a(FloatWindow.this, f, g);
            FloatWindow.a(FloatWindow.this, 1, (JSONObject) null);
        }

        /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c() {
            /*
                Method dump skipped, instructions count: 527
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.c.c():void");
        }

        public /* synthetic */ void a(boolean z, boolean z2, boolean z3, boolean z4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb100d68", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("position", (Object) (z2 ? "left" : "right"));
            } else {
                jSONObject.put("position", (Object) (z3 ? "top" : "bottom"));
            }
            FloatWindow.a(FloatWindow.this, 3, jSONObject);
        }
    }

    /* loaded from: classes7.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final Context f16944a;
        private final View b;
        private boolean c;
        private int d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private long l;
        private a m;
        private int n = -2;
        private int o = -2;
        private int p;
        private int q;

        static {
            kge.a(-1590379033);
        }

        public static /* synthetic */ Context a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b7e174ec", new Object[]{dVar}) : dVar.f16944a;
        }

        public static /* synthetic */ View b(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d93391b7", new Object[]{dVar}) : dVar.b;
        }

        public static /* synthetic */ int c(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25eb0769", new Object[]{dVar})).intValue() : dVar.o;
        }

        public static /* synthetic */ int d(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5999322a", new Object[]{dVar})).intValue() : dVar.n;
        }

        public static /* synthetic */ int e(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8d475ceb", new Object[]{dVar})).intValue() : dVar.p;
        }

        public static /* synthetic */ int f(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0f587ac", new Object[]{dVar})).intValue() : dVar.q;
        }

        public static /* synthetic */ boolean g(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4a3b27e", new Object[]{dVar})).booleanValue() : dVar.f;
        }

        public static /* synthetic */ int h(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2851dd2e", new Object[]{dVar})).intValue() : dVar.g;
        }

        public static /* synthetic */ int i(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0007ef", new Object[]{dVar})).intValue() : dVar.h;
        }

        public static /* synthetic */ int j(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8fae32b0", new Object[]{dVar})).intValue() : dVar.i;
        }

        public static /* synthetic */ int k(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c35c5d71", new Object[]{dVar})).intValue() : dVar.j;
        }

        public static /* synthetic */ boolean l(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f70a8843", new Object[]{dVar})).booleanValue() : dVar.c;
        }

        public static /* synthetic */ int m(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ab8b2f3", new Object[]{dVar})).intValue() : dVar.d;
        }

        public static /* synthetic */ int n(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5e66ddb4", new Object[]{dVar})).intValue() : dVar.e;
        }

        public static /* synthetic */ boolean o(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92150886", new Object[]{dVar})).booleanValue() : dVar.k;
        }

        public static /* synthetic */ long p(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5c33337", new Object[]{dVar})).longValue() : dVar.l;
        }

        public static /* synthetic */ a q(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("98d70f81", new Object[]{dVar}) : dVar.m;
        }

        public d(Context context, View view) {
            this.f16944a = context;
            this.b = view;
        }

        public d a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("bf76fb76", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public d a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e179959a", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            this.d = Math.max(i, 0);
            this.e = Math.max(i2, 0);
            return this;
        }

        public d b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("f3252637", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public d a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a4d9c33a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
            this.g = Math.max(i, 0);
            this.h = Math.max(i2, 0);
            this.i = Math.max(i3, 0);
            this.j = Math.max(i4, 0);
            return this;
        }

        public d b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("2390c2f9", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            this.p = i;
            this.q = i2;
            return this;
        }

        public d a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("1880f8a7", new Object[]{this, new Integer(i)});
            }
            this.n = i;
            return this;
        }

        public d b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("4c2f2368", new Object[]{this, new Integer(i)});
            }
            this.o = i;
            return this;
        }

        public d c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("26d350f8", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public d a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("9acbad86", new Object[]{this, new Long(j)});
            }
            this.l = j;
            return this;
        }

        public d a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a2647ceb", new Object[]{this, aVar});
            }
            this.m = aVar;
            return this;
        }

        public FloatWindow a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (FloatWindow) ipChange.ipc$dispatch("3ce9007a", new Object[]{this}) : new FloatWindow(this);
        }
    }
}
