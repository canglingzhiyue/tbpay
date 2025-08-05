package com.taobao.mediaplay.playercontrol;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class f extends Drawable implements Animatable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MIN_SWEEP_ANGLE = 30;

    /* renamed from: a  reason: collision with root package name */
    private static final Interpolator f18065a;
    private static final Interpolator b;
    private ObjectAnimator d;
    private ObjectAnimator e;
    private boolean f;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private final RectF c = new RectF();
    private Property<f, Float> m = new Property<f, Float>(Float.class, "angle") { // from class: com.taobao.mediaplay.playercontrol.f.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Float, java.lang.Object] */
        @Override // android.util.Property
        public /* synthetic */ Float get(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, fVar}) : a(fVar);
        }

        @Override // android.util.Property
        public /* synthetic */ void set(f fVar, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f806021", new Object[]{this, fVar, f});
            } else {
                a(fVar, f);
            }
        }

        public Float a(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("196ebed7", new Object[]{this, fVar}) : Float.valueOf(fVar.a());
        }

        public void a(f fVar, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("917c4b0b", new Object[]{this, fVar, f});
            } else {
                fVar.a(f.floatValue());
            }
        }
    };
    private Property<f, Float> n = new Property<f, Float>(Float.class, "arc") { // from class: com.taobao.mediaplay.playercontrol.f.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Float, java.lang.Object] */
        @Override // android.util.Property
        public /* synthetic */ Float get(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("83ba8cd9", new Object[]{this, fVar}) : a(fVar);
        }

        @Override // android.util.Property
        public /* synthetic */ void set(f fVar, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f806021", new Object[]{this, fVar, f});
            } else {
                a(fVar, f);
            }
        }

        public Float a(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("196ebed7", new Object[]{this, fVar}) : Float.valueOf(fVar.b());
        }

        public void a(f fVar, Float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("917c4b0b", new Object[]{this, fVar, f});
            } else {
                fVar.b(f.floatValue());
            }
        }
    };
    private Paint g = new Paint();

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -2;
    }

    public static /* synthetic */ void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f668e", new Object[]{fVar});
        } else {
            fVar.c();
        }
    }

    static {
        kge.a(1240097949);
        kge.a(-310707797);
        f18065a = new LinearInterpolator();
        b = new DecelerateInterpolator();
    }

    public f(int i, float f) {
        this.k = f;
        this.g.setAntiAlias(true);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setStrokeWidth(f);
        this.g.setColor(i);
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        float f2 = this.i - this.h;
        float f3 = this.j;
        if (!this.f) {
            f2 += f3;
            f = (360.0f - f3) - 30.0f;
        } else {
            f = f3 + 30.0f;
        }
        canvas.drawArc(this.c, f2, f, false, this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.g.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.g.setColorFilter(colorFilter);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f = !this.f;
        if (!this.f) {
            return;
        }
        this.h = (this.h + 60.0f) % 360.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.c.left = rect.left + (this.k / 2.0f) + 0.5f;
        this.c.right = (rect.right - (this.k / 2.0f)) - 0.5f;
        this.c.top = rect.top + (this.k / 2.0f) + 0.5f;
        this.c.bottom = (rect.bottom - (this.k / 2.0f)) - 0.5f;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = ObjectAnimator.ofFloat(this, this.m, 360.0f);
        this.e.setInterpolator(f18065a);
        this.e.setDuration(2000L);
        this.e.setRepeatMode(1);
        this.e.setRepeatCount(-1);
        this.d = ObjectAnimator.ofFloat(this, this.n, 300.0f);
        this.d.setInterpolator(b);
        this.d.setDuration(600L);
        this.d.setRepeatMode(1);
        this.d.setRepeatCount(-1);
        this.d.addListener(new Animator.AnimatorListener() { // from class: com.taobao.mediaplay.playercontrol.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    f.a(f.this);
                }
            }
        });
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (isRunning()) {
        } else {
            this.l = true;
            this.e.start();
            this.d.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else if (!isRunning()) {
        } else {
            this.l = false;
            this.e.cancel();
            this.d.cancel();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue() : this.l;
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        this.i = f;
        invalidateSelf();
    }

    public float a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : this.i;
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        this.j = f;
        invalidateSelf();
    }

    public float b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.j;
    }
}
