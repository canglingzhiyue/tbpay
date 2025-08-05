package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class Slide extends Visibility {

    /* renamed from: a  reason: collision with root package name */
    private static final TimeInterpolator f1258a = new DecelerateInterpolator();
    private static final TimeInterpolator b = new AccelerateInterpolator();
    private static final a e = new b() { // from class: android.support.transition.Slide.1
        @Override // android.support.transition.Slide.a
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final a f = new b() { // from class: android.support.transition.Slide.2
        @Override // android.support.transition.Slide.a
        public float a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.getLayoutDirection(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final a g = new c() { // from class: android.support.transition.Slide.3
        @Override // android.support.transition.Slide.a
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };
    private static final a h = new b() { // from class: android.support.transition.Slide.4
        @Override // android.support.transition.Slide.a
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final a i = new b() { // from class: android.support.transition.Slide.5
        @Override // android.support.transition.Slide.a
        public float a(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (ViewCompat.getLayoutDirection(viewGroup) != 1) {
                z = false;
            }
            return z ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final a j = new c() { // from class: android.support.transition.Slide.6
        @Override // android.support.transition.Slide.a
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };
    private a c;
    private int d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface GravityFlag {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface a {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* loaded from: classes2.dex */
    private static abstract class b implements a {
        private b() {
        }

        @Override // android.support.transition.Slide.a
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* loaded from: classes2.dex */
    private static abstract class c implements a {
        private c() {
        }

        @Override // android.support.transition.Slide.a
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.c = j;
        this.d = 80;
        a(80);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = j;
        this.d = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.h);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        a(namedInt);
    }

    private void a(ah ahVar) {
        int[] iArr = new int[2];
        ahVar.b.getLocationOnScreen(iArr);
        ahVar.f1277a.put("android:slide:screenPosition", iArr);
    }

    @Override // android.support.transition.Visibility
    public Animator a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) ahVar2.f1277a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return aj.a(view, ahVar2, iArr[0], iArr[1], this.c.a(viewGroup, view), this.c.b(viewGroup, view), translationX, translationY, f1258a);
    }

    public void a(int i2) {
        a aVar;
        if (i2 == 3) {
            aVar = e;
        } else if (i2 == 5) {
            aVar = h;
        } else if (i2 == 48) {
            aVar = g;
        } else if (i2 == 80) {
            aVar = j;
        } else if (i2 == 8388611) {
            aVar = f;
        } else if (i2 != 8388613) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            aVar = i;
        }
        this.c = aVar;
        this.d = i2;
        ab abVar = new ab();
        abVar.a(i2);
        setPropagation(abVar);
    }

    @Override // android.support.transition.Visibility
    public Animator b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar == null) {
            return null;
        }
        int[] iArr = (int[]) ahVar.f1277a.get("android:slide:screenPosition");
        return aj.a(view, ahVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.c.a(viewGroup, view), this.c.b(viewGroup, view), b);
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
