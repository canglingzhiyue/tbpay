package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class Explode extends Visibility {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeInterpolator f1253a = new DecelerateInterpolator();
    private static final TimeInterpolator b = new AccelerateInterpolator();
    private int[] c;

    public Explode() {
        this.c = new int[2];
        setPropagation(new g());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[2];
        setPropagation(new g());
    }

    private static float a(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    private static float a(View view, int i, int i2) {
        return a(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    private void a(ah ahVar) {
        View view = ahVar.b;
        view.getLocationOnScreen(this.c);
        int[] iArr = this.c;
        int i = iArr[0];
        int i2 = iArr[1];
        ahVar.f1277a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    private void a(View view, Rect rect, int[] iArr) {
        int centerY;
        int i;
        view.getLocationOnScreen(this.c);
        int[] iArr2 = this.c;
        int i2 = iArr2[0];
        int i3 = iArr2[1];
        Rect epicenter = getEpicenter();
        if (epicenter == null) {
            i = (view.getWidth() / 2) + i2 + Math.round(view.getTranslationX());
            centerY = (view.getHeight() / 2) + i3 + Math.round(view.getTranslationY());
        } else {
            int centerX = epicenter.centerX();
            centerY = epicenter.centerY();
            i = centerX;
        }
        float centerX2 = rect.centerX() - i;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float a2 = a(centerX2, centerY2);
        float a3 = a(view, i - i2, centerY - i3);
        iArr[0] = Math.round((centerX2 / a2) * a3);
        iArr[1] = Math.round(a3 * (centerY2 / a2));
    }

    @Override // android.support.transition.Visibility
    public Animator a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar2 == null) {
            return null;
        }
        Rect rect = (Rect) ahVar2.f1277a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        a(viewGroup, rect, this.c);
        int[] iArr = this.c;
        return aj.a(view, ahVar2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f1253a);
    }

    @Override // android.support.transition.Visibility
    public Animator b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        float f;
        float f2;
        if (ahVar == null) {
            return null;
        }
        Rect rect = (Rect) ahVar.f1277a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) ahVar.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        a(viewGroup, rect, this.c);
        int[] iArr2 = this.c;
        return aj.a(view, ahVar, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], b);
    }

    @Override // android.support.transition.Visibility, android.support.transition.Transition
    public void captureEndValues(ah ahVar) {
        super.captureEndValues(ahVar);
        a(ahVar);
    }

    @Override // android.support.transition.Visibility, android.support.transition.Transition
    public void captureStartValues(ah ahVar) {
        super.captureStartValues(ahVar);
        a(ahVar);
    }
}
