package com.taobao.taolive.room.ui.swipeback;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.widget.ScrollerCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.kge;
import tb.riy;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    public static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final Interpolator v;

    /* renamed from: a  reason: collision with root package name */
    private int f21734a;
    private int b;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private int[] h;
    private int[] i;
    private int[] j;
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private ScrollerCompat q;
    private final a r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private int c = -1;
    private final Runnable w = new Runnable() { // from class: com.taobao.taolive.room.ui.swipeback.e.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.this.d(0);
            }
        }
    };

    /* loaded from: classes8.dex */
    public static abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1139859897);
        }

        public int a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9501e35d", new Object[]{this, view})).intValue();
            }
            return 0;
        }

        public int a(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c25113d", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return 0;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        public void a(View view, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c23a8ea", new Object[]{this, view, new Float(f), new Float(f2)});
            }
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            }
        }

        public abstract boolean a(View view, int i);

        public int b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9103723c", new Object[]{this, view})).intValue();
            }
            return 0;
        }

        public int b(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5dfe645c", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return 0;
        }

        public boolean b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return false;
        }

        public int c(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue() : i;
        }
    }

    private int f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64907b00", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        return 1;
    }

    static {
        kge.a(-832689968);
        v = new Interpolator() { // from class: com.taobao.taolive.room.ui.swipeback.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
                }
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
    }

    public static e a(ViewGroup viewGroup, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("e654deec", new Object[]{viewGroup, aVar}) : new e(viewGroup.getContext(), viewGroup, aVar);
    }

    private e(Context context, ViewGroup viewGroup, a aVar) {
        if (viewGroup != null) {
            if (aVar == null) {
                throw new IllegalArgumentException("Callback may not be null");
            }
            this.u = viewGroup;
            this.r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.q = ScrollerCompat.create(context, v);
            return;
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.n = f;
        }
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else {
            this.m = f;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f21734a;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
        } else if (view.getParent() != this.u) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.u + riy.BRACKET_END_STR);
        } else {
            this.s = view;
            this.c = i;
            d(1);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = -1;
        c();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
        this.l = null;
    }

    public boolean a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c25114e", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue();
        }
        this.s = view;
        this.c = -1;
        return a(i, i2, 0, 0);
    }

    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!this.t) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return a(i, i2, (int) VelocityTrackerCompat.getXVelocity(this.l, this.c), (int) VelocityTrackerCompat.getYVelocity(this.l, this.c));
    }

    private boolean a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d16212c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).booleanValue();
        }
        int left = this.s.getLeft();
        int top = this.s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.q.abortAnimation();
            d(0);
            return false;
        }
        this.q.startScroll(left, top, i5, i6, a(this.s, i5, i6, i3, i4));
        d(2);
        return true;
    }

    private int a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e734471d", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        int b = b(i3, (int) this.n, (int) this.m);
        int b2 = b(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (b2 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((a(i, b, this.r.a(view)) * f5) + (a(i2, b2, this.r.b(view)) * (f3 / f4)));
    }

    private int a(int i, int i2, int i3) {
        int abs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i == 0) {
            return 0;
        }
        int width = this.u.getWidth();
        float f = width / 2;
        float c = f + (c(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(c / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8dfaa60d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private float a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25edca48", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).floatValue();
        }
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private float c(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{this, new Float(f)})).floatValue() : (float) Math.sin((float) ((f - 0.5f) * 0.4712389167638204d));
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.f21734a == 2) {
            boolean computeScrollOffset = this.q.computeScrollOffset();
            int currX = this.q.getCurrX();
            int currY = this.q.getCurrY();
            int left = currX - this.s.getLeft();
            int top = currY - this.s.getTop();
            if (left != 0) {
                this.s.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.s.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.r.a(this.s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.q.getFinalX() && currY == this.q.getFinalY()) {
                this.q.abortAnimation();
                computeScrollOffset = this.q.isFinished();
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.u.post(this.w);
                } else {
                    d(0);
                }
            }
        }
        return this.f21734a == 2;
    }

    private void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.t = true;
        this.r.a(this.s, f, f2);
        this.t = false;
        if (this.f21734a != 1) {
            return;
        }
        d(0);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        float[] fArr = this.d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        float[] fArr = this.d;
        if (fArr == null) {
            return;
        }
        fArr[i] = 0.0f;
        this.e[i] = 0.0f;
        this.f[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0;
        this.i[i] = 0;
        this.j[i] = 0;
        this.k = (~(1 << i)) & this.k;
    }

    private void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        float[] fArr = this.d;
        if (fArr != null && fArr.length > i) {
            return;
        }
        int i2 = i + 1;
        float[] fArr2 = new float[i2];
        float[] fArr3 = new float[i2];
        float[] fArr4 = new float[i2];
        float[] fArr5 = new float[i2];
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        float[] fArr6 = this.d;
        if (fArr6 != null) {
            System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
            float[] fArr7 = this.e;
            System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
            float[] fArr8 = this.f;
            System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
            float[] fArr9 = this.g;
            System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
            int[] iArr4 = this.h;
            System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
            int[] iArr5 = this.i;
            System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
            int[] iArr6 = this.j;
            System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
        }
        this.d = fArr2;
        this.e = fArr3;
        this.f = fArr4;
        this.g = fArr5;
        this.h = iArr;
        this.i = iArr2;
        this.j = iArr3;
    }

    private void a(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25edd59b", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        f(i);
        float[] fArr = this.d;
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.e;
        this.g[i] = f2;
        fArr2[i] = f2;
        this.h[i] = f((int) f, (int) f2);
        this.k |= 1 << i;
    }

    private void c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890944ff", new Object[]{this, motionEvent});
            return;
        }
        int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = MotionEventCompat.getPointerId(motionEvent, i);
            float x = MotionEventCompat.getX(motionEvent, i);
            float y = MotionEventCompat.getY(motionEvent, i);
            this.f[pointerId] = x;
            this.g[pointerId] = y;
        }
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue() : ((1 << i) & this.k) != 0;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (this.f21734a == i) {
        } else {
            this.f21734a = i;
            this.r.a(i);
            if (i != 0) {
                return;
            }
            this.s = null;
        }
    }

    public boolean b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6b49de", new Object[]{this, view, new Integer(i)})).booleanValue();
        }
        if (view == this.s && this.c == i) {
            return true;
        }
        if (view == null || !this.r.a(view, i)) {
            return false;
        }
        this.c = i;
        a(view, i);
        return true;
    }

    public boolean a(MotionEvent motionEvent) {
        View e;
        View e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            a(x, y, pointerId);
            View e3 = e((int) x, (int) y);
            if (e3 == this.s && this.f21734a == 2) {
                b(e3, pointerId);
            }
            int i = this.h[pointerId] & this.p;
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = MotionEventCompat.getPointerId(motionEvent, i2);
                        float x2 = MotionEventCompat.getX(motionEvent, i2);
                        float y2 = MotionEventCompat.getY(motionEvent, i2);
                        float f = x2 - this.d[pointerId2];
                        float f2 = y2 - this.e[pointerId2];
                        b(f, f2, pointerId2);
                        if (this.f21734a == 1 || ((e = e((int) x2, (int) y2)) != null && y2 * 3.0f < (e.getHeight() << 1) && a(e, f, f2) && b(e, pointerId2))) {
                            break;
                        }
                    }
                    c(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId3 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                        float x3 = MotionEventCompat.getX(motionEvent, actionIndex);
                        float y3 = MotionEventCompat.getY(motionEvent, actionIndex);
                        a(x3, y3, pointerId3);
                        int i3 = this.f21734a;
                        if (i3 != 0 && i3 == 2 && (e2 = e((int) x3, (int) y3)) == this.s) {
                            b(e2, pointerId3);
                        }
                    } else if (actionMasked == 6) {
                        e(MotionEventCompat.getPointerId(motionEvent, actionIndex));
                    }
                }
            }
            b();
        }
        return this.f21734a == 1;
    }

    public void b(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
            return;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (actionMasked == 0) {
            b();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            View e = e((int) x, (int) y);
            a(x, y, pointerId);
            b(e, pointerId);
            if ((this.h[pointerId] & this.p) != 0) {
            }
        } else if (actionMasked == 1) {
            if (this.f21734a == 1) {
                d();
            }
            b();
        } else if (actionMasked == 2) {
            if (this.f21734a == 1) {
                int findPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.c);
                float x2 = MotionEventCompat.getX(motionEvent, findPointerIndex);
                float y2 = MotionEventCompat.getY(motionEvent, findPointerIndex);
                float[] fArr = this.f;
                int i3 = this.c;
                int i4 = (int) (x2 - fArr[i3]);
                int i5 = (int) (y2 - this.g[i3]);
                b(this.s.getLeft() + i4, this.s.getTop() + i5, i4, i5);
                c(motionEvent);
                return;
            }
            int pointerCount = MotionEventCompat.getPointerCount(motionEvent);
            while (i2 < pointerCount) {
                int pointerId2 = MotionEventCompat.getPointerId(motionEvent, i2);
                float x3 = MotionEventCompat.getX(motionEvent, i2);
                float y3 = MotionEventCompat.getY(motionEvent, i2);
                float f = x3 - this.d[pointerId2];
                float f2 = y3 - this.e[pointerId2];
                b(f, f2, pointerId2);
                if (this.f21734a == 1) {
                    break;
                }
                View e2 = e((int) x3, (int) y3);
                if (a(e2, f, f2) && b(e2, pointerId2)) {
                    break;
                }
                i2++;
            }
            c(motionEvent);
        } else if (actionMasked == 3) {
            if (this.f21734a == 1) {
                a(0.0f, 0.0f);
            }
            b();
        } else if (actionMasked == 5) {
            int pointerId3 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
            float x4 = MotionEventCompat.getX(motionEvent, actionIndex);
            float y4 = MotionEventCompat.getY(motionEvent, actionIndex);
            a(x4, y4, pointerId3);
            if (this.f21734a == 0) {
                b(e((int) x4, (int) y4), pointerId3);
            } else if (!d((int) x4, (int) y4)) {
            } else {
                b(this.s, pointerId3);
            }
        } else if (actionMasked != 6) {
        } else {
            int pointerId4 = MotionEventCompat.getPointerId(motionEvent, actionIndex);
            if (this.f21734a == 1 && pointerId4 == this.c) {
                int pointerCount2 = MotionEventCompat.getPointerCount(motionEvent);
                while (true) {
                    if (i2 >= pointerCount2) {
                        i = -1;
                        break;
                    }
                    int pointerId5 = MotionEventCompat.getPointerId(motionEvent, i2);
                    if (pointerId5 != this.c) {
                        View e3 = e((int) MotionEventCompat.getX(motionEvent, i2), (int) MotionEventCompat.getY(motionEvent, i2));
                        View view = this.s;
                        if (e3 == view && b(view, pointerId5)) {
                            i = this.c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    d();
                }
            }
            e(pointerId4);
        }
    }

    private void b(float f, float f2, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcf027a", new Object[]{this, new Float(f), new Float(f2), new Integer(i)});
            return;
        }
        if (a(f, f2, i, 1)) {
            i2 = 1;
        }
        if (a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.i;
        iArr[i] = iArr[i] | i2;
    }

    private boolean a(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97cd50cc", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)})).booleanValue();
        }
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) == i2 && (this.p & i2) != 0 && (this.j[i] & i2) != i2 && (this.i[i] & i2) != i2) {
            int i3 = this.b;
            if (abs > i3 || abs2 > i3) {
                if (abs < abs2 * 0.5f && this.r.b(i2)) {
                    int[] iArr = this.j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.i[i] & i2) == 0 && abs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c23a8ee", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (view == null) {
            return false;
        }
        boolean z = this.r.a(view) > 0;
        boolean z2 = this.r.b(view) > 0;
        if (!z || !z2) {
            return z ? f > ((float) this.b) && Math.abs(f2) <= ((float) this.b) : z2 && Math.abs(f2) > ((float) this.b);
        }
        int i = this.b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    public boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!c(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f[i2] - this.d[i2];
        float f2 = this.g[i2] - this.e[i2];
        if (!z || !z2) {
            return z ? f > ((float) this.b) && Math.abs(f2) <= ((float) this.b) : z2 && Math.abs(f2) > ((float) this.b);
        }
        int i3 = this.b;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    public boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c5ddc94e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : c(i2) && (i & this.h[i2]) != 0;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.l.computeCurrentVelocity(1000, this.m);
        a(a(VelocityTrackerCompat.getXVelocity(this.l, this.c), this.n, this.m), a(VelocityTrackerCompat.getYVelocity(this.l, this.c), this.n, this.m));
    }

    private void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9029", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int left = this.s.getLeft();
        int top = this.s.getTop();
        if (i3 != 0) {
            i = this.r.a(this.s, i, i3);
            this.s.offsetLeftAndRight(i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.r.b(this.s, i2, i4);
            this.s.offsetTopAndBottom(i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.r.a(this.s, i5, i6, i5 - left, i6 - top);
    }

    public boolean d(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fac4048f", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : b(this.s, i, i2);
    }

    public boolean b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dfe646d", new Object[]{this, view, new Integer(i), new Integer(i2)})).booleanValue() : view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public View e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d37cfd0e", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        for (int childCount = this.u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.u.getChildAt(this.r.c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }
}
