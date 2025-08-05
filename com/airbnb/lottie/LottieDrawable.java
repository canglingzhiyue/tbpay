package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.airbnb.lottie.model.layer.b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import tb.agk;
import tb.ahx;
import tb.ahy;
import tb.ajl;
import tb.akh;
import tb.aki;
import tb.akk;
import tb.ako;

/* loaded from: classes2.dex */
public class LottieDrawable extends Drawable implements Animatable, Drawable.Callback {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private Canvas A;
    private Rect B;
    private RectF C;
    private Paint D;
    private Rect E;
    private Rect F;
    private RectF G;
    private RectF H;
    private Matrix I;
    private Matrix J;

    /* renamed from: a  reason: collision with root package name */
    d f1739a;
    s b;
    private g c;
    private ahy k;
    private String l;
    private e m;
    private ahx n;
    private boolean o;
    private b r;
    private boolean t;
    private boolean u;
    private boolean v;
    private Bitmap z;
    private final aki d = new aki();
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;
    private OnVisibleAction h = OnVisibleAction.NONE;
    private final ArrayList<a> i = new ArrayList<>();
    private final ValueAnimator.AnimatorUpdateListener j = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.LottieDrawable.1
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (LottieDrawable.this.r != null) {
                LottieDrawable.this.r.a(LottieDrawable.this.d.d());
            }
        }
    };
    private boolean p = false;
    private boolean q = true;
    private int s = 255;
    private RenderMode w = RenderMode.AUTOMATIC;
    private boolean x = false;
    private final Matrix y = new Matrix();
    private boolean K = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface RepeatMode {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface a {
        void run(g gVar);
    }

    public LottieDrawable() {
        this.d.addUpdateListener(this.j);
    }

    private void F() {
        g gVar = this.c;
        if (gVar == null) {
            return;
        }
        this.x = this.w.useSoftwareRendering(Build.VERSION.SDK_INT, gVar.a(), gVar.b());
    }

    private void G() {
        g gVar = this.c;
        if (gVar == null) {
            return;
        }
        this.r = new b(this, ajl.a(gVar), gVar.i(), gVar);
        if (this.u) {
            this.r.a(true);
        }
        this.r.b(this.q);
    }

    private boolean H() {
        return this.e || this.f;
    }

    private ahy I() {
        if (getCallback() == null) {
            return null;
        }
        ahy ahyVar = this.k;
        if (ahyVar != null && !ahyVar.a(K())) {
            this.k = null;
        }
        if (this.k == null) {
            this.k = new ahy(getCallback(), this.l, this.m, this.c.l());
        }
        return this.k;
    }

    private ahx J() {
        if (getCallback() == null) {
            return null;
        }
        if (this.n == null) {
            this.n = new ahx(getCallback(), this.f1739a);
        }
        return this.n;
    }

    private Context K() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private void L() {
        if (this.A != null) {
            return;
        }
        this.A = new Canvas();
        this.H = new RectF();
        this.I = new Matrix();
        this.J = new Matrix();
        this.B = new Rect();
        this.C = new RectF();
        this.D = new agk();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
    }

    private boolean M() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        return Build.VERSION.SDK_INT >= 18 && (parent instanceof ViewGroup) && !((ViewGroup) parent).getClipChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f, float f2, g gVar) {
        a(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(float f, g gVar) {
        d(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, int i2, g gVar) {
        a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, g gVar) {
        c(i);
    }

    private void a(Canvas canvas) {
        b bVar = this.r;
        g gVar = this.c;
        if (bVar == null || gVar == null) {
            return;
        }
        this.y.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float height = bounds.height() / gVar.d().height();
            this.y.preScale(bounds.width() / gVar.d().width(), height);
        }
        bVar.a(canvas, this.y, this.s);
    }

    private void a(Canvas canvas, b bVar) {
        if (this.c == null || bVar == null) {
            return;
        }
        L();
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        a(this.B, this.C);
        this.I.mapRect(this.C);
        a(this.C, this.B);
        if (this.q) {
            this.H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            bVar.a(this.H, (Matrix) null, false);
        }
        this.I.mapRect(this.H);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        a(this.H, width, height);
        if (!M()) {
            this.H.intersect(this.B.left, this.B.top, this.B.right, this.B.bottom);
        }
        int ceil = (int) Math.ceil(this.H.width());
        int ceil2 = (int) Math.ceil(this.H.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        b(ceil, ceil2);
        if (this.K) {
            this.y.set(this.I);
            this.y.preScale(width, height);
            this.y.postTranslate(-this.H.left, -this.H.top);
            this.z.eraseColor(0);
            bVar.a(this.A, this.y, this.s);
            this.I.invert(this.J);
            this.J.mapRect(this.G, this.H);
            a(this.G, this.F);
        }
        this.E.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.z, this.E, this.F, this.D);
    }

    private void a(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void a(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    private void a(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.airbnb.lottie.model.d dVar, Object obj, ako akoVar, g gVar) {
        a(dVar, (com.airbnb.lottie.model.d) obj, (ako<com.airbnb.lottie.model.d>) akoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, g gVar) {
        d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, boolean z, g gVar) {
        a(str, str2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(float f, g gVar) {
        b(f);
    }

    private void b(int i, int i2) {
        Bitmap bitmap = this.z;
        if (bitmap == null || bitmap.getWidth() < i || this.z.getHeight() < i2) {
            this.z = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.A.setBitmap(this.z);
            this.K = true;
        } else if (this.z.getWidth() <= i && this.z.getHeight() <= i2) {
        } else {
            this.z = Bitmap.createBitmap(this.z, 0, 0, i, i2);
            this.A.setBitmap(this.z);
            this.K = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(int i, g gVar) {
        b(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(g gVar) {
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, g gVar) {
        c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(float f, g gVar) {
        a(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(int i, g gVar) {
        a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(g gVar) {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, g gVar) {
        b(str);
    }

    public boolean A() {
        return this.b == null && this.c.j().size() > 0;
    }

    public g B() {
        return this.c;
    }

    public void C() {
        this.i.clear();
        this.d.cancel();
        if (!isVisible()) {
            this.h = OnVisibleAction.NONE;
        }
    }

    public void D() {
        this.i.clear();
        this.d.k();
        if (!isVisible()) {
            this.h = OnVisibleAction.NONE;
        }
    }

    public float E() {
        return this.d.d();
    }

    public Bitmap a(String str, Bitmap bitmap) {
        ahy I = I();
        if (I == null) {
            akh.b("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap a2 = I.a(str, bitmap);
        invalidateSelf();
        return a2;
    }

    public Typeface a(String str, String str2) {
        ahx J = J();
        if (J != null) {
            return J.a(str, str2);
        }
        return null;
    }

    public List<com.airbnb.lottie.model.d> a(com.airbnb.lottie.model.d dVar) {
        if (this.r == null) {
            akh.b("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.r.a(dVar, 0, arrayList, new com.airbnb.lottie.model.d(new String[0]));
        return arrayList;
    }

    public void a(final float f) {
        g gVar = this.c;
        if (gVar == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$bo8WjVlq9vOdqL5gikN5QeEhfJA
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar2) {
                    LottieDrawable.this.c(f, gVar2);
                }
            });
        } else {
            a((int) akk.a(gVar.f(), this.c.g(), f));
        }
    }

    public void a(final float f, final float f2) {
        g gVar = this.c;
        if (gVar == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$RR0gfVdNc6WgwVrFW2WLbRA6sq4
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar2) {
                    LottieDrawable.this.a(f, f2, gVar2);
                }
            });
        } else {
            a((int) akk.a(gVar.f(), this.c.g(), f), (int) akk.a(this.c.f(), this.c.g(), f2));
        }
    }

    public void a(final int i) {
        if (this.c == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$TRHf4rcpgkKIl5EJn-Y1FN1Q9jA
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.c(i, gVar);
                }
            });
        } else {
            this.d.a(i);
        }
    }

    public void a(final int i, final int i2) {
        if (this.c == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$5Fpm0sxOQj3kkLUJdO5JCed4Ykg
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.a(i, i2, gVar);
                }
            });
        } else {
            this.d.a(i, i2 + 0.99f);
        }
    }

    public void a(Animator.AnimatorListener animatorListener) {
        this.d.addListener(animatorListener);
    }

    public void a(Animator.AnimatorPauseListener animatorPauseListener) {
        this.d.addPauseListener(animatorPauseListener);
    }

    public void a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.d.addUpdateListener(animatorUpdateListener);
    }

    public void a(RenderMode renderMode) {
        this.w = renderMode;
        F();
    }

    public void a(d dVar) {
        this.f1739a = dVar;
        ahx ahxVar = this.n;
        if (ahxVar != null) {
            ahxVar.a(dVar);
        }
    }

    public void a(e eVar) {
        this.m = eVar;
        ahy ahyVar = this.k;
        if (ahyVar != null) {
            ahyVar.a(eVar);
        }
    }

    public <T> void a(final com.airbnb.lottie.model.d dVar, final T t, final ako<T> akoVar) {
        if (this.r == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$pDYvMQPogsUxKRVNJzguUcF5Lys
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.a(dVar, t, akoVar, gVar);
                }
            });
            return;
        }
        boolean z = true;
        if (dVar == com.airbnb.lottie.model.d.COMPOSITION) {
            this.r.a((b) t, (ako<b>) akoVar);
        } else if (dVar.a() != null) {
            dVar.a().a(t, akoVar);
        } else {
            List<com.airbnb.lottie.model.d> a2 = a(dVar);
            for (int i = 0; i < a2.size(); i++) {
                a2.get(i).a().a(t, akoVar);
            }
            z = true ^ a2.isEmpty();
        }
        if (!z) {
            return;
        }
        invalidateSelf();
        if (t != m.TIME_REMAP) {
            return;
        }
        d(E());
    }

    public void a(s sVar) {
        this.b = sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Boolean bool) {
        this.e = bool.booleanValue();
    }

    public void a(String str) {
        this.l = str;
    }

    public void a(final String str, final String str2, final boolean z) {
        g gVar = this.c;
        if (gVar == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$x8_kpLBNJEKKIBVZspg_SdEbCyM
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar2) {
                    LottieDrawable.this.a(str, str2, z, gVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g c = gVar.c(str);
        com.airbnb.lottie.model.g c2 = this.c.c(str2);
        if (c == null) {
            akh.c("Cannot find marker with name " + str + ".");
        } else if (c2 != null) {
            a((int) c.f1772a, (int) (c2.f1772a + (z ? 1.0f : 0.0f)));
        } else {
            akh.c("Cannot find marker with name " + str2 + ".");
        }
    }

    public void a(boolean z) {
        if (this.o == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            akh.c("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.o = z;
        if (this.c == null) {
            return;
        }
        G();
    }

    public boolean a() {
        b bVar = this.r;
        return bVar != null && bVar.g();
    }

    public boolean a(g gVar) {
        if (this.c == gVar) {
            return false;
        }
        this.K = true;
        k();
        this.c = gVar;
        G();
        this.d.a(gVar);
        d(this.d.getAnimatedFraction());
        Iterator it = new ArrayList(this.i).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.run(gVar);
            }
            it.remove();
        }
        this.i.clear();
        gVar.b(this.t);
        F();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void b(final float f) {
        g gVar = this.c;
        if (gVar == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$ISR0c0gu50KYr_9IxLjGwNEFVjA
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar2) {
                    LottieDrawable.this.b(f, gVar2);
                }
            });
        } else {
            b((int) akk.a(gVar.f(), this.c.g(), f));
        }
    }

    public void b(final int i) {
        if (this.c == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$sot91Ika0n_xhR3FDq8FicmZbSo
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.b(i, gVar);
                }
            });
        } else {
            this.d.b(i + 0.99f);
        }
    }

    public void b(Animator.AnimatorListener animatorListener) {
        this.d.removeListener(animatorListener);
    }

    public void b(Animator.AnimatorPauseListener animatorPauseListener) {
        this.d.removePauseListener(animatorPauseListener);
    }

    public void b(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.d.removeUpdateListener(animatorUpdateListener);
    }

    public void b(final String str) {
        g gVar = this.c;
        if (gVar == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$RcqqsXw1WK7QyF200tFQulGv3LY
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar2) {
                    LottieDrawable.this.c(str, gVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g c = gVar.c(str);
        if (c != null) {
            a((int) c.f1772a);
            return;
        }
        akh.c("Cannot find marker with name " + str + ".");
    }

    public void b(boolean z) {
        if (z != this.q) {
            this.q = z;
            b bVar = this.r;
            if (bVar != null) {
                bVar.b(z);
            }
            invalidateSelf();
        }
    }

    public boolean b() {
        b bVar = this.r;
        return bVar != null && bVar.h();
    }

    public void c(float f) {
        this.d.c(f);
    }

    public void c(final int i) {
        if (this.c == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$YHEyu4lB4x_dBCauXNSBxj_jKF8
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.a(i, gVar);
                }
            });
        } else {
            this.d.a(i);
        }
    }

    public void c(final String str) {
        g gVar = this.c;
        if (gVar == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$GfpFCgu7FA4NJjNEX4GCJ8SQNzY
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar2) {
                    LottieDrawable.this.b(str, gVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g c = gVar.c(str);
        if (c != null) {
            b((int) (c.f1772a + c.b));
            return;
        }
        akh.c("Cannot find marker with name " + str + ".");
    }

    public void c(boolean z) {
        this.p = z;
    }

    public boolean c() {
        return this.o;
    }

    public void d(final float f) {
        if (this.c == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$vRwD0iiAvT7cThkdUv3pli7jDrI
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.a(f, gVar);
                }
            });
            return;
        }
        f.a("Drawable#setProgress");
        this.d.a(this.c.a(f));
        f.b("Drawable#setProgress");
    }

    public void d(int i) {
        this.d.setRepeatMode(i);
    }

    public void d(final String str) {
        g gVar = this.c;
        if (gVar == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$pa9bzinsjADKeJshyuLdhRzxx1k
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar2) {
                    LottieDrawable.this.a(str, gVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g c = gVar.c(str);
        if (c != null) {
            int i = (int) c.f1772a;
            a(i, ((int) c.b) + i);
            return;
        }
        akh.c("Cannot find marker with name " + str + ".");
    }

    public void d(boolean z) {
        this.t = z;
        g gVar = this.c;
        if (gVar != null) {
            gVar.b(z);
        }
    }

    public boolean d() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        f.a("Drawable#draw");
        if (this.g) {
            try {
                if (this.x) {
                    a(canvas, this.r);
                } else {
                    a(canvas);
                }
            } catch (Throwable th) {
                akh.b("Lottie crashed in draw!", th);
            }
        } else if (this.x) {
            a(canvas, this.r);
        } else {
            a(canvas);
        }
        this.K = false;
        f.b("Drawable#draw");
    }

    public Bitmap e(String str) {
        ahy I = I();
        if (I != null) {
            return I.a(str);
        }
        return null;
    }

    public void e(int i) {
        this.d.setRepeatCount(i);
    }

    public void e(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        b bVar = this.r;
        if (bVar == null) {
            return;
        }
        bVar.a(z);
    }

    public boolean e() {
        return this.q;
    }

    public i f(String str) {
        g gVar = this.c;
        if (gVar == null) {
            return null;
        }
        return gVar.l().get(str);
    }

    public String f() {
        return this.l;
    }

    public void f(boolean z) {
        this.v = z;
    }

    public void g(boolean z) {
        this.g = z;
    }

    public boolean g() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        g gVar = this.c;
        if (gVar == null) {
            return -1;
        }
        return gVar.d().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        g gVar = this.c;
        if (gVar == null) {
            return -1;
        }
        return gVar.d().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public RenderMode h() {
        return this.x ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public void h(boolean z) {
        this.f = z;
    }

    public q i() {
        g gVar = this.c;
        if (gVar != null) {
            return gVar.c();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.K) {
            return;
        }
        this.K = true;
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return x();
    }

    public boolean j() {
        return this.v;
    }

    public void k() {
        if (this.d.isRunning()) {
            this.d.cancel();
            if (!isVisible()) {
                this.h = OnVisibleAction.NONE;
            }
        }
        this.c = null;
        this.r = null;
        this.k = null;
        this.d.f();
        invalidateSelf();
    }

    public void l() {
        if (this.r == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$nUW51it50EIjJDpyDvan0L-t3Rg
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.c(gVar);
                }
            });
            return;
        }
        F();
        if (H() || w() == 0) {
            if (isVisible()) {
                this.d.i();
            } else {
                this.h = OnVisibleAction.PLAY;
            }
        }
        if (H()) {
            return;
        }
        c((int) (r() < 0.0f ? o() : p()));
        this.d.j();
        if (isVisible()) {
            return;
        }
        this.h = OnVisibleAction.NONE;
    }

    public void m() {
        this.i.clear();
        this.d.j();
        if (!isVisible()) {
            this.h = OnVisibleAction.NONE;
        }
    }

    public void n() {
        if (this.r == null) {
            this.i.add(new a() { // from class: com.airbnb.lottie.-$$Lambda$LottieDrawable$nxNwL22qR3ZtXVuiey7VDzvkbLQ
                @Override // com.airbnb.lottie.LottieDrawable.a
                public final void run(g gVar) {
                    LottieDrawable.this.b(gVar);
                }
            });
            return;
        }
        F();
        if (H() || w() == 0) {
            if (isVisible()) {
                this.d.l();
            } else {
                this.h = OnVisibleAction.RESUME;
            }
        }
        if (H()) {
            return;
        }
        c((int) (r() < 0.0f ? o() : p()));
        this.d.j();
        if (isVisible()) {
            return;
        }
        this.h = OnVisibleAction.NONE;
    }

    public float o() {
        return this.d.m();
    }

    public float p() {
        return this.d.n();
    }

    public void q() {
        this.d.g();
    }

    public float r() {
        return this.d.h();
    }

    public void s() {
        this.d.removeAllUpdateListeners();
        this.d.addUpdateListener(this.j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.s = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        akh.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        OnVisibleAction onVisibleAction;
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            if (this.d.isRunning()) {
                D();
                onVisibleAction = OnVisibleAction.RESUME;
            } else if (!z3) {
                onVisibleAction = OnVisibleAction.NONE;
            }
            this.h = onVisibleAction;
        } else if (this.h == OnVisibleAction.PLAY) {
            l();
        } else if (this.h == OnVisibleAction.RESUME) {
            n();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        l();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m();
    }

    public void t() {
        this.d.removeAllListeners();
    }

    public int u() {
        return (int) this.d.e();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public int v() {
        return this.d.getRepeatMode();
    }

    public int w() {
        return this.d.getRepeatCount();
    }

    public boolean x() {
        aki akiVar = this.d;
        if (akiVar == null) {
            return false;
        }
        return akiVar.isRunning();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean y() {
        return isVisible() ? this.d.isRunning() : this.h == OnVisibleAction.PLAY || this.h == OnVisibleAction.RESUME;
    }

    public s z() {
        return this.b;
    }
}
