package com.etao.feimagesearch.regionedit;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class e implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MaskView m;
    private boolean n;
    private boolean o;
    private final a.b p;
    private ValueAnimator r;
    private int s;
    private boolean t;

    /* renamed from: a  reason: collision with root package name */
    private Paint f6964a = new Paint(1);
    private Paint b = new Paint(1);
    private final float c = com.etao.feimagesearch.util.g.b(17.0f);
    private float d = com.etao.feimagesearch.util.g.b(4.0f);
    private final float e = com.etao.feimagesearch.util.g.b(3.0f);
    private float f = com.etao.feimagesearch.util.g.b(7.0f);
    private float g = com.etao.feimagesearch.util.g.b(12.0f);
    private final RectF h = new RectF();
    private final RectF i = new RectF();
    private final RectF j = new RectF();
    private final RectF k = new RectF();
    private final RectF l = new RectF();
    private boolean q = true;
    private float u = 1.0f;

    /* loaded from: classes3.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animation});
                return;
            }
            e eVar = e.this;
            q.a((Object) animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            e.a(eVar, ((Integer) animatedValue).intValue());
            e.a(e.this);
        }
    }

    static {
        kge.a(1638421129);
        kge.a(1132942606);
    }

    public e(a.b bVar) {
        this.p = bVar;
        this.f6964a.setStyle(Paint.Style.STROKE);
        this.f6964a.setColor(-1);
        this.f6964a.setStrokeWidth(this.e);
        this.b.setStyle(Paint.Style.FILL);
        a(1.0f);
    }

    public static final /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebcf436", new Object[]{eVar});
        } else {
            eVar.j();
        }
    }

    public static final /* synthetic */ void a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e2058d", new Object[]{eVar, new Integer(i)});
        } else {
            eVar.s = i;
        }
    }

    public final void a(RectF percentRegion) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, percentRegion});
            return;
        }
        q.c(percentRegion, "percentRegion");
        this.j.set(percentRegion);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.t) {
        } else {
            this.t = true;
            this.k.set(this.j);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.t) {
        } else {
            this.j.set(this.k);
            this.t = false;
            this.k.setEmpty();
            e();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        MaskView maskView = this.m;
        if (maskView == null) {
            return;
        }
        if (maskView == null) {
            q.a();
        }
        int realWidth = maskView.getRealWidth();
        MaskView maskView2 = this.m;
        if (maskView2 == null) {
            q.a();
        }
        float f = realWidth;
        float realHeight = maskView2.getRealHeight();
        this.l.set(this.j.left * f, this.j.top * realHeight, this.j.right * f, this.j.bottom * realHeight);
        j();
    }

    private final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.h.set(this.l);
        this.h.left *= this.u;
        this.h.top *= this.u;
        this.h.right *= this.u;
        this.h.bottom *= this.u;
        float centerX = this.h.centerX();
        float centerY = this.h.centerY();
        float f = this.s / 100.0f;
        float width = (this.h.width() * f) / 2.0f;
        float height = (this.h.height() * f) / 2.0f;
        this.h.set(centerX - width, centerY - height, centerX + width, centerY + height);
        this.i.set(this.h);
        RectF rectF = this.i;
        float f2 = this.e;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        MaskView maskView = this.m;
        if (maskView == null) {
            return;
        }
        maskView.invalidate();
    }

    public final RectF f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("abec9cda", new Object[]{this}) : this.j;
    }

    private final void a(boolean z, long j) {
        ValueAnimator ofInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        if (z) {
            ofInt = ValueAnimator.ofInt(0, 100);
        } else {
            ofInt = ValueAnimator.ofInt(100, 0);
        }
        this.r = ofInt;
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator == null) {
            q.a();
        }
        valueAnimator.addUpdateListener(new a());
        ValueAnimator valueAnimator2 = this.r;
        if (valueAnimator2 == null) {
            q.a();
        }
        valueAnimator2.setDuration(j);
        ValueAnimator valueAnimator3 = this.r;
        if (valueAnimator3 == null) {
            q.a();
        }
        valueAnimator3.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r8.isRunning() != false) goto L22;
     */
    @Override // com.etao.feimagesearch.regionedit.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.etao.feimagesearch.regionedit.MaskView r8, android.graphics.Canvas r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.regionedit.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 3
            if (r1 == 0) goto L18
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r3 = 0
            r1[r3] = r7
            r3 = 1
            r1[r3] = r8
            r1[r2] = r9
            java.lang.String r8 = "73073e1"
            r0.ipc$dispatch(r8, r1)
            return
        L18:
            java.lang.String r0 = "targetView"
            kotlin.jvm.internal.q.c(r8, r0)
            java.lang.String r8 = "canvas"
            kotlin.jvm.internal.q.c(r9, r8)
            boolean r8 = r7.q
            if (r8 != 0) goto L28
            return
        L28:
            boolean r8 = r7.o
            if (r8 != 0) goto L45
            android.animation.ValueAnimator r8 = r7.r
            if (r8 == 0) goto L3c
            if (r8 != 0) goto L35
            kotlin.jvm.internal.q.a()
        L35:
            boolean r8 = r8.isRunning()
            if (r8 == 0) goto L3c
            goto L45
        L3c:
            boolean r8 = r7.n
            if (r8 == 0) goto L41
            return
        L41:
            r7.a(r9)
            return
        L45:
            android.graphics.RectF r8 = r7.h
            float r8 = r8.width()
            android.graphics.RectF r0 = r7.h
            float r0 = r0.height()
            float r8 = tb.rwf.b(r8, r0)
            float r0 = r7.c
            float r1 = r7.e
            float r1 = r1 + r0
            float r2 = (float) r2
            float r1 = r1 * r2
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L64
            float r0 = (float) r3
            float r0 = r8 / r0
        L64:
            android.graphics.RectF r8 = r7.h
            float r3 = r8.left
            android.graphics.RectF r8 = r7.h
            float r4 = r8.top
            android.graphics.RectF r8 = r7.h
            float r8 = r8.left
            float r5 = r8 + r0
            android.graphics.RectF r8 = r7.h
            float r8 = r8.top
            float r6 = r8 + r0
            r1 = r7
            r2 = r9
            r1.a(r2, r3, r4, r5, r6)
            android.graphics.RectF r8 = r7.h
            float r8 = r8.right
            float r3 = r8 - r0
            android.graphics.RectF r8 = r7.h
            float r4 = r8.top
            android.graphics.RectF r8 = r7.h
            float r5 = r8.right
            android.graphics.RectF r8 = r7.h
            float r8 = r8.top
            float r6 = r8 + r0
            r1.a(r2, r3, r4, r5, r6)
            android.graphics.RectF r8 = r7.h
            float r3 = r8.left
            android.graphics.RectF r8 = r7.h
            float r8 = r8.bottom
            float r4 = r8 - r0
            android.graphics.RectF r8 = r7.h
            float r8 = r8.left
            float r5 = r8 + r0
            android.graphics.RectF r8 = r7.h
            float r6 = r8.bottom
            r1.a(r2, r3, r4, r5, r6)
            android.graphics.RectF r8 = r7.h
            float r8 = r8.right
            float r3 = r8 - r0
            android.graphics.RectF r8 = r7.h
            float r8 = r8.bottom
            float r4 = r8 - r0
            android.graphics.RectF r8 = r7.h
            float r5 = r8.right
            android.graphics.RectF r8 = r7.h
            float r6 = r8.bottom
            r1.a(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.regionedit.e.a(com.etao.feimagesearch.regionedit.MaskView, android.graphics.Canvas):void");
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    private final void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        float centerX = this.h.centerX();
        float centerY = this.h.centerY();
        this.b.setColor(f.b());
        canvas.drawCircle(centerX, centerY, this.g, this.b);
        this.b.setColor(f.a());
        canvas.drawCircle(centerX, centerY, this.f, this.b);
    }

    private final void a(Canvas canvas, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc6c3b7d", new Object[]{this, canvas, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        RectF rectF = this.i;
        float f5 = this.d;
        canvas.drawRoundRect(rectF, f5, f5, this.f6964a);
        canvas.restore();
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        this.u = f;
        e();
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public void a(MaskView view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b09d204", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        this.m = view;
        e();
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public void b(MaskView view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a936c05", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        this.m = null;
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.n = true;
        }
    }

    public final void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.o == z) {
        } else {
            this.o = z;
            if (z2) {
                a(z, 300L);
            } else {
                a(z, 0L);
            }
        }
    }

    @Override // com.etao.feimagesearch.regionedit.b
    public RectF a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("f7d777ff", new Object[]{this}) : this.h;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            if (valueAnimator == null) {
                q.a();
            }
            if (valueAnimator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public RectF i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("7e5fb2f7", new Object[]{this}) : this.l;
    }
}
