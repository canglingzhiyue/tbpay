package com.alibaba.security.realidentity.ui.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.security.realidentity.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RPDetectCoreView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float A = 0.4f;
    public static final int B = -1;
    public static final String z = "RPDetectCoreView";

    /* renamed from: a  reason: collision with root package name */
    public c f3582a;
    public Paint b;
    public Path c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public boolean k;
    public int l;
    public float m;
    public int n;
    public int o;
    public Paint p;
    public ValueAnimator q;
    public int r;
    public Paint s;
    public ValueAnimator t;
    public int u;
    public RectF v;
    public Paint w;
    public int x;
    public int y;

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            RPDetectCoreView.a(RPDetectCoreView.this).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            RPDetectCoreView.this.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            RPDetectCoreView.a(RPDetectCoreView.this, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            RPDetectCoreView.this.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a();

        void b();
    }

    public RPDetectCoreView(Context context) {
        super(context);
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = -1L;
        this.h = -1L;
        this.i = -1.0f;
        this.j = -1.0f;
        this.k = false;
        b();
    }

    public static /* synthetic */ Paint a(RPDetectCoreView rPDetectCoreView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Paint) ipChange.ipc$dispatch("fbc3b1ad", new Object[]{rPDetectCoreView}) : rPDetectCoreView.p;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        setLayerType(1, null);
        int a2 = e.a(getContext());
        if (e.i(getContext())) {
            a2 = (a2 << 1) / 3;
        }
        this.d = a2;
        this.x = e.d(getContext());
        this.y = e.b(getContext());
        this.f = this.x / 2;
        this.e = getDisplayCenterY();
        this.l = -1;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-1);
        this.c = new Path();
        this.o = e.a(getContext(), 7.0f);
        Paint paint2 = new Paint(1);
        this.p = paint2;
        paint2.setColor(-65536);
        this.p.setStyle(Paint.Style.STROKE);
        this.p.setStrokeWidth(e.a(getContext(), 5.0f));
        Paint paint3 = new Paint(1);
        this.s = paint3;
        paint3.setColor(-16776961);
        this.s.setStyle(Paint.Style.STROKE);
        this.s.setStrokeWidth(e.a(getContext(), 5.0f));
        Paint paint4 = new Paint(1);
        this.w = paint4;
        paint4.setColor(-16777216);
        this.w.setAlpha(127);
        this.w.setStyle(Paint.Style.FILL);
    }

    private float getCurrentScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bb8babe", new Object[]{this})).floatValue();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.h;
        if (j != -1) {
            long j2 = this.g;
            if (j2 != -1) {
                float f = this.j;
                if (f != -1.0f) {
                    float f2 = this.i;
                    if (f2 != -1.0f) {
                        long j3 = uptimeMillis - j2;
                        if (j3 <= j) {
                            float f3 = ((float) j3) / ((float) j);
                            return f3 > 0.4f ? f : f2 + (f3 * (f - f2));
                        }
                    }
                }
            }
        }
        return -1.0f;
    }

    private int getDisplayCenterY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a95594f2", new Object[]{this})).intValue();
        }
        return e.a(getContext(), e.i(getContext()) ? 90.0f : 125.0f) + this.d;
    }

    public static /* synthetic */ Object ipc$super(RPDetectCoreView rPDetectCoreView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.q == null) {
            ValueAnimator duration = ValueAnimator.ofInt(100, 0).setDuration(1000L);
            this.q = duration;
            duration.setRepeatCount(-1);
            this.q.addUpdateListener(new a());
            this.q.start();
        }
        invalidate();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.t != null) {
        } else {
            ValueAnimator duration = ValueAnimator.ofInt(0, 360).setDuration(2000L);
            this.t = duration;
            duration.setRepeatCount(-1);
            this.t.addUpdateListener(new b());
            this.t.start();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.p.setAlpha(0);
        this.q = null;
        invalidate();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.cancel();
        this.t = null;
        invalidate();
    }

    public int getCircleBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9f514d8b", new Object[]{this})).intValue() : this.e + this.d;
    }

    public int getCircleCenterY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d52ea178", new Object[]{this})).intValue() : this.e;
    }

    public int getRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9581002", new Object[]{this})).intValue() : this.d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        try {
            if (getWidth() != 0 && getWidth() != this.x) {
                this.f = getWidth() / 2;
                int width = getWidth();
                String str = z;
                com.alibaba.security.realidentity.a.a(str, "mViewWidth:" + width);
                this.d = (Math.min(e.b(getContext()), width) / 2) - e.a(getContext(), 50.0f);
                this.e = getDisplayCenterY();
            }
            if (this.v == null) {
                this.v = new RectF((this.f - this.d) - this.o, (this.e - this.d) - this.o, this.f + this.d + this.o, this.e + this.d + this.o);
            }
            this.m = getCurrentScale();
            this.c.addCircle(this.f, this.e, this.d, Path.Direction.CW);
            canvas.drawColor(this.l);
            if (this.q != null && this.q.isStarted()) {
                canvas.drawCircle(this.f, this.e, this.d + this.o, this.p);
            }
            this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawPath(this.c, this.b);
            this.b.setXfermode(null);
            if (this.t != null && this.t.isStarted()) {
                canvas.drawArc(this.v, this.u - 90, 45.0f, false, this.s);
                canvas.drawCircle(this.f, this.e, this.d, this.w);
            }
            if (this.m != -1.0f) {
                invalidate();
                if (this.k || this.f3582a == null) {
                    return;
                }
                this.f3582a.a();
                this.k = true;
            } else if (this.f3582a == null) {
            } else {
                this.f3582a.b();
                this.f3582a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.l = i;
        invalidate();
    }

    public void setBreatheColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e00a77c", new Object[]{this, new Integer(i)});
            return;
        }
        this.n = i;
        this.p.setColor(i);
    }

    public void setWaitingColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2475bfc4", new Object[]{this, new Integer(i)});
            return;
        }
        this.r = i;
        this.s.setColor(i);
    }

    public static /* synthetic */ int a(RPDetectCoreView rPDetectCoreView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5184eb8", new Object[]{rPDetectCoreView, new Integer(i)})).intValue();
        }
        rPDetectCoreView.u = i;
        return i;
    }

    public void a(float f, float f2, long j, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57134eeb", new Object[]{this, new Float(f), new Float(f2), new Long(j), cVar});
            return;
        }
        this.i = f;
        this.j = f2;
        this.h = j;
        this.f3582a = cVar;
        this.k = false;
        this.g = SystemClock.uptimeMillis();
        invalidate();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e();
        f();
    }

    public RPDetectCoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = -1L;
        this.h = -1L;
        this.i = -1.0f;
        this.j = -1.0f;
        this.k = false;
        b();
    }

    public RPDetectCoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = -1L;
        this.h = -1L;
        this.i = -1.0f;
        this.j = -1.0f;
        this.k = false;
        b();
    }
}
