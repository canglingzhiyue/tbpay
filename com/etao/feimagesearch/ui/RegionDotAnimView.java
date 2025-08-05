package com.etao.feimagesearch.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.g;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import tb.kge;

/* loaded from: classes3.dex */
public class RegionDotAnimView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DOT_MAX_DISTANCE;
    private static final int DOT_RADIUS;
    public static final int DURATION = 400;
    private static final int MAX_START_DELAY = 100;
    private boolean animated;
    private ValueAnimator animator;
    private b dotLogic;
    private List<a> mDots;
    private Paint paint;
    private List<RectF> rects;

    public static /* synthetic */ Object ipc$super(RegionDotAnimView regionDotAnimView, String str, Object... objArr) {
        if (str.hashCode() == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List access$000(RegionDotAnimView regionDotAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c1f6e59c", new Object[]{regionDotAnimView}) : regionDotAnimView.mDots;
    }

    public static /* synthetic */ int access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b88b92d", new Object[0])).intValue() : DOT_RADIUS;
    }

    static {
        kge.a(435644031);
        DOT_MAX_DISTANCE = g.a(80.0f);
        DOT_RADIUS = g.a(3.5f);
    }

    public RegionDotAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDots = new LinkedList();
        this.paint = new Paint(1);
        this.animator = ValueAnimator.ofInt(0, 500);
        init();
    }

    public RegionDotAnimView(Context context) {
        super(context);
        this.mDots = new LinkedList();
        this.paint = new Paint(1);
        this.animator = ValueAnimator.ofInt(0, 500);
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.dotLogic = new b(this, 200);
        this.paint.setColor(-1);
        this.animator.setDuration(500L);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.etao.feimagesearch.ui.RegionDotAnimView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                } else if (!RegionDotAnimView.access$000(RegionDotAnimView.this).isEmpty()) {
                    for (a aVar : RegionDotAnimView.access$000(RegionDotAnimView.this)) {
                        a.a(aVar);
                    }
                    RegionDotAnimView.this.invalidate();
                }
            }
        });
        this.animator.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
        } else if (!this.mDots.isEmpty()) {
            if (!this.mDots.isEmpty()) {
                for (a aVar : this.mDots) {
                    a.a(aVar, canvas, this.paint);
                }
                if (!this.animated) {
                    this.animated = true;
                    this.animator.start();
                    this.dotLogic.b();
                }
            }
            if (this.dotLogic.a()) {
                return;
            }
            this.dotLogic.a(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.rects == null) {
            return;
        }
        this.mDots.clear();
        this.dotLogic.c();
        this.animated = true;
        this.dotLogic.a(this.rects);
        for (RectF rectF : this.rects) {
            try {
                initDots(this.mDots, rectF.left * getWidth(), rectF.top * getHeight(), 10, (int) (getWidth() * rectF.width()), (int) (getHeight() * rectF.height()));
            } catch (Exception unused) {
            }
        }
        this.animated = false;
        this.rects = null;
        invalidate();
    }

    public void setRegion(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da800a6e", new Object[]{this, list});
        } else {
            this.rects = list;
        }
    }

    private void initDots(List<a> list, float f, float f2, int i, int i2, int i3) {
        int i4;
        float nextInt;
        int nextInt2;
        int i5;
        int i6;
        int i7;
        float nextInt3;
        int i8;
        IpChange ipChange = $ipChange;
        int i9 = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb67b5f1", new Object[]{this, list, new Float(f), new Float(f2), new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        Random random = new Random(System.currentTimeMillis());
        int i10 = 0;
        while (i10 < i) {
            int nextInt4 = random.nextInt(50);
            int nextInt5 = random.nextInt(50);
            boolean z = random.nextInt(100) % i9 == 0;
            boolean z2 = random.nextInt(100) % i9 == 0;
            boolean z3 = random.nextInt(100) % i9 == 0;
            if (z) {
                nextInt4 = -nextInt4;
            }
            if (z2) {
                nextInt5 = -nextInt5;
            }
            float f3 = i2;
            int i11 = (int) (f + (f3 / 2.0f));
            float f4 = i3;
            int i12 = (int) ((f4 / 2.0f) + f2);
            boolean z4 = nextInt4 < 0;
            boolean z5 = nextInt5 < 0;
            if (z3) {
                i5 = (int) (z4 ? f - random.nextInt(DOT_MAX_DISTANCE) : f + f3 + random.nextInt(DOT_MAX_DISTANCE));
                if (z5) {
                    nextInt3 = ((i3 / 2) + f2) - random.nextInt(i8);
                } else {
                    nextInt3 = (i3 / 2) + f2 + random.nextInt(i7);
                }
                nextInt2 = (int) nextInt3;
            } else {
                if (z4) {
                    nextInt = ((i2 / 2) + f) - random.nextInt(i6);
                } else {
                    nextInt = (i2 / 2) + f + random.nextInt(i4);
                }
                int i13 = (int) nextInt;
                nextInt2 = (int) (z5 ? f2 - random.nextInt(DOT_MAX_DISTANCE) : f4 + f2 + random.nextInt(DOT_MAX_DISTANCE));
                i5 = i13;
            }
            a aVar = new a();
            aVar.f6992a = i11;
            aVar.b = i12;
            aVar.c = i5;
            aVar.d = nextInt2;
            aVar.a(i5 > i11);
            list.add(aVar);
            i10++;
            i9 = 2;
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f6992a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public int j = new Random(System.currentTimeMillis()).nextInt(100);
        public int k;
        public long l;
        public float m;
        public float n;

        static {
            kge.a(-1715415581);
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93059d9d", new Object[]{aVar});
            } else {
                aVar.b();
            }
        }

        public static /* synthetic */ void a(a aVar, Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cc5867d", new Object[]{aVar, canvas, paint});
            } else {
                aVar.a(canvas, paint);
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            float f = this.d;
            float f2 = this.b;
            float f3 = this.c;
            float f4 = this.f6992a;
            this.e = (f - f2) / (f3 - f4);
            this.f = f2 - (this.e * f4);
            this.g = Math.abs(f4 - f3) / 400.0f;
            this.n = 0.002f;
            if (!z) {
                return;
            }
            this.g = -this.g;
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.k >= this.j;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.l == 0) {
                this.l = System.currentTimeMillis();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.l;
                this.l = currentTimeMillis;
                this.k = (int) (this.k + j);
                int i = this.k;
                if (i < this.j) {
                    return;
                }
                if (i > 400) {
                    this.k = 400;
                }
                float f = this.g;
                int i2 = this.k;
                this.h = this.c + ((int) (f * (i2 - this.j)));
                this.i = (this.e * this.h) + this.f;
                this.m = 1.0f - (this.n * i2);
                if (this.m >= 0.2f) {
                    return;
                }
                this.m = 0.2f;
            }
        }

        private void a(Canvas canvas, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80533312", new Object[]{this, canvas, paint});
            } else if (!a()) {
            } else {
                paint.setAlpha((int) (this.m * 255.0f));
                canvas.drawCircle(this.h, this.i, RegionDotAnimView.access$300(), paint);
            }
        }
    }
}
