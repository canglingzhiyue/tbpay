package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class i extends h {
    private InsetDrawable p;

    /* loaded from: classes2.dex */
    static class a extends GradientDrawable {
        a() {
        }

        @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(VisibilityAwareImageButton visibilityAwareImageButton, k kVar) {
        super(visibilityAwareImageButton, kVar);
    }

    @Override // android.support.design.widget.h
    public float a() {
        return this.n.getElevation();
    }

    @Override // android.support.design.widget.h
    void a(float f, float f2) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.n.isEnabled()) {
                this.n.setElevation(f);
                if (this.n.isFocused() || this.n.isPressed()) {
                    this.n.setTranslationZ(f2);
                }
            } else {
                this.n.setElevation(0.0f);
            }
            this.n.setTranslationZ(0.0f);
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, Constants.Name.ELEVATION, f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, f2).setDuration(100L));
            animatorSet.setInterpolator(f1212a);
            stateListAnimator.addState(j, animatorSet);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ObjectAnimator.ofFloat(this.n, Constants.Name.ELEVATION, f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, f2).setDuration(100L));
            animatorSet2.setInterpolator(f1212a);
            stateListAnimator.addState(k, animatorSet2);
            AnimatorSet animatorSet3 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.n, Constants.Name.ELEVATION, f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, this.n.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet3.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            animatorSet3.setInterpolator(f1212a);
            stateListAnimator.addState(l, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.play(ObjectAnimator.ofFloat(this.n, Constants.Name.ELEVATION, 0.0f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, 0.0f).setDuration(0L));
            animatorSet4.setInterpolator(f1212a);
            stateListAnimator.addState(m, animatorSet4);
            this.n.setStateListAnimator(stateListAnimator);
        }
        if (this.o.b()) {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.h
    public void a(int i) {
        if (this.e instanceof RippleDrawable) {
            ((RippleDrawable) this.e).setColor(ColorStateList.valueOf(i));
        } else {
            super.a(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.h
    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, int i, int i2) {
        Drawable drawable;
        this.d = DrawableCompat.wrap(k());
        DrawableCompat.setTintList(this.d, colorStateList);
        if (mode != null) {
            DrawableCompat.setTintMode(this.d, mode);
        }
        if (i2 > 0) {
            this.f = a(i2, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.f, this.d});
        } else {
            this.f = null;
            drawable = this.d;
        }
        this.e = new RippleDrawable(ColorStateList.valueOf(i), drawable, null);
        this.g = this.e;
        this.o.a(this.e);
    }

    @Override // android.support.design.widget.h
    void a(Rect rect) {
        if (!this.o.b()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        float a2 = this.o.a();
        float a3 = a() + this.i;
        int ceil = (int) Math.ceil(j.b(a3, a2, false));
        int ceil2 = (int) Math.ceil(j.a(a3, a2, false));
        rect.set(ceil, ceil2, ceil, ceil2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.h
    public void a(int[] iArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.h
    public void b() {
    }

    @Override // android.support.design.widget.h
    void b(Rect rect) {
        k kVar;
        Drawable drawable;
        if (this.o.b()) {
            this.p = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            kVar = this.o;
            drawable = this.p;
        } else {
            kVar = this.o;
            drawable = this.e;
        }
        kVar.a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.design.widget.h
    public void d() {
        e();
    }

    @Override // android.support.design.widget.h
    boolean h() {
        return false;
    }

    @Override // android.support.design.widget.h
    c i() {
        return new d();
    }

    @Override // android.support.design.widget.h
    GradientDrawable l() {
        return new a();
    }
}
