package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import com.taobao.taobao.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    static final Interpolator f1212a = android.support.design.widget.a.c;
    static final int[] j = {16842919, 16842910};
    static final int[] k = {16842908, 16842910};
    static final int[] l = {16842910};
    static final int[] m = new int[0];
    j c;
    Drawable d;
    Drawable e;
    android.support.design.widget.c f;
    Drawable g;
    float h;
    float i;
    final VisibilityAwareImageButton n;
    final k o;
    private float q;
    private ViewTreeObserver.OnPreDrawListener s;
    int b = 0;
    private final Rect r = new Rect();
    private final m p = new m();

    /* loaded from: classes2.dex */
    private class a extends e {
        a() {
            super();
        }

        @Override // android.support.design.widget.h.e
        protected float a() {
            return 0.0f;
        }
    }

    /* loaded from: classes2.dex */
    private class b extends e {
        b() {
            super();
        }

        @Override // android.support.design.widget.h.e
        protected float a() {
            return h.this.h + h.this.i;
        }
    }

    /* loaded from: classes2.dex */
    interface c {
    }

    /* loaded from: classes2.dex */
    private class d extends e {
        d() {
            super();
        }

        @Override // android.support.design.widget.h.e
        protected float a() {
            return h.this.h;
        }
    }

    /* loaded from: classes2.dex */
    private abstract class e extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1219a;
        private float c;
        private float d;

        private e() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.c.b(this.d);
            this.f1219a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1219a) {
                this.c = h.this.c.a();
                this.d = a();
                this.f1219a = true;
            }
            j jVar = h.this.c;
            float f = this.c;
            jVar.b(f + ((this.d - f) * valueAnimator.getAnimatedFraction()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(VisibilityAwareImageButton visibilityAwareImageButton, k kVar) {
        this.n = visibilityAwareImageButton;
        this.o = kVar;
        this.p.a(j, a(new b()));
        this.p.a(k, a(new b()));
        this.p.a(l, a(new d()));
        this.p.a(m, a(new a()));
        this.q = this.n.getRotation();
    }

    private ValueAnimator a(e eVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1212a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(eVar);
        valueAnimator.addUpdateListener(eVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private static ColorStateList b(int i) {
        return new ColorStateList(new int[][]{k, j, new int[0]}, new int[]{i, i, 0});
    }

    private void o() {
        if (this.s == null) {
            this.s = new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.design.widget.h.3
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    h.this.j();
                    return true;
                }
            };
        }
    }

    private boolean p() {
        return ViewCompat.isLaidOut(this.n) && !this.n.isInEditMode();
    }

    private void q() {
        VisibilityAwareImageButton visibilityAwareImageButton;
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.q % 90.0f != 0.0f) {
                i = 1;
                if (this.n.getLayerType() != 1) {
                    visibilityAwareImageButton = this.n;
                    visibilityAwareImageButton.setLayerType(i, null);
                }
            } else if (this.n.getLayerType() != 0) {
                visibilityAwareImageButton = this.n;
                i = 0;
                visibilityAwareImageButton.setLayerType(i, null);
            }
        }
        j jVar = this.c;
        if (jVar != null) {
            jVar.a(-this.q);
        }
        android.support.design.widget.c cVar = this.f;
        if (cVar != null) {
            cVar.b(-this.q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public android.support.design.widget.c a(int i, ColorStateList colorStateList) {
        Context context = this.n.getContext();
        android.support.design.widget.c i2 = i();
        i2.a(ContextCompat.getColor(context, R.color.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, R.color.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, R.color.design_fab_stroke_end_outer_color));
        i2.a(i);
        i2.a(colorStateList);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f) {
        if (this.h != f) {
            this.h = f;
            a(f, this.i);
        }
    }

    void a(float f, float f2) {
        j jVar = this.c;
        if (jVar != null) {
            jVar.a(f, this.i + f);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, b(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
        android.support.design.widget.c cVar = this.f;
        if (cVar != null) {
            cVar.a(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable[] drawableArr;
        this.d = DrawableCompat.wrap(k());
        DrawableCompat.setTintList(this.d, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.d, mode);
        }
        this.e = DrawableCompat.wrap(k());
        DrawableCompat.setTintList(this.e, b(i));
        if (i2 > 0) {
            this.f = a(i2, colorStateList);
            drawableArr = new Drawable[]{this.f, this.d, this.e};
        } else {
            this.f = null;
            drawableArr = new Drawable[]{this.d, this.e};
        }
        this.g = new LayerDrawable(drawableArr);
        Context context = this.n.getContext();
        Drawable drawable = this.g;
        float a2 = this.o.a();
        float f = this.h;
        this.c = new j(context, drawable, a2, f, f + this.i);
        this.c.a(false);
        this.o.a(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        Drawable drawable = this.d;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        }
    }

    void a(Rect rect) {
        this.c.getPadding(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final c cVar, final boolean z) {
        if (n()) {
            return;
        }
        this.n.animate().cancel();
        if (!p()) {
            this.n.internalSetVisibility(z ? 8 : 4, z);
            return;
        }
        this.b = 1;
        this.n.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200L).setInterpolator(android.support.design.widget.a.c).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.h.1
            private boolean d;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.d = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                h hVar = h.this;
                hVar.b = 0;
                if (!this.d) {
                    hVar.n.internalSetVisibility(z ? 8 : 4, z);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                h.this.n.internalSetVisibility(0, z);
                this.d = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr) {
        this.p.a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.p.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(float f) {
        if (this.i != f) {
            this.i = f;
            a(this.h, f);
        }
    }

    void b(Rect rect) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(final c cVar, final boolean z) {
        if (m()) {
            return;
        }
        this.n.animate().cancel();
        if (!p()) {
            this.n.internalSetVisibility(0, z);
            this.n.setAlpha(1.0f);
            this.n.setScaleY(1.0f);
            this.n.setScaleX(1.0f);
            return;
        }
        this.b = 2;
        if (this.n.getVisibility() != 0) {
            this.n.setAlpha(0.0f);
            this.n.setScaleY(0.0f);
            this.n.setScaleX(0.0f);
        }
        this.n.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200L).setInterpolator(android.support.design.widget.a.d).setListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.h.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                h.this.b = 0;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                h.this.n.internalSetVisibility(0, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable c() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Rect rect = this.r;
        a(rect);
        b(rect);
        this.o.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (h()) {
            o();
            this.n.getViewTreeObserver().addOnPreDrawListener(this.s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.s != null) {
            this.n.getViewTreeObserver().removeOnPreDrawListener(this.s);
            this.s = null;
        }
    }

    boolean h() {
        return true;
    }

    android.support.design.widget.c i() {
        return new android.support.design.widget.c();
    }

    void j() {
        float rotation = this.n.getRotation();
        if (this.q != rotation) {
            this.q = rotation;
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GradientDrawable k() {
        GradientDrawable l2 = l();
        l2.setShape(1);
        l2.setColor(-1);
        return l2;
    }

    GradientDrawable l() {
        return new GradientDrawable();
    }

    boolean m() {
        return this.n.getVisibility() != 0 ? this.b == 2 : this.b != 1;
    }

    boolean n() {
        return this.n.getVisibility() == 0 ? this.b == 1 : this.b != 2;
    }
}
