package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.transition.Transition;
import android.support.transition.d;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public abstract class Visibility extends Transition {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1266a = {"android:visibility:visibility", "android:visibility:parent"};
    private int b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Mode {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a extends AnimatorListenerAdapter implements Transition.d, d.a {

        /* renamed from: a  reason: collision with root package name */
        boolean f1268a = false;
        private final View b;
        private final int c;
        private final ViewGroup d;
        private final boolean e;
        private boolean f;

        a(View view, int i, boolean z) {
            this.b = view;
            this.c = i;
            this.d = (ViewGroup) view.getParent();
            this.e = z;
            a(true);
        }

        private void a() {
            if (!this.f1268a) {
                at.a(this.b, this.c);
                ViewGroup viewGroup = this.d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (!this.e || this.f == z || (viewGroup = this.d) == null) {
                return;
            }
            this.f = z;
            an.a(viewGroup, z);
        }

        @Override // android.support.transition.Transition.d
        public void a(Transition transition) {
        }

        @Override // android.support.transition.Transition.d
        public void b(Transition transition) {
            a();
            transition.removeListener(this);
        }

        @Override // android.support.transition.Transition.d
        public void c(Transition transition) {
            a(false);
        }

        @Override // android.support.transition.Transition.d
        public void d(Transition transition) {
            a(true);
        }

        @Override // android.support.transition.Transition.d
        public void e(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1268a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, android.support.transition.d.a
        public void onAnimationPause(Animator animator) {
            if (!this.f1268a) {
                at.a(this.b, this.c);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, android.support.transition.d.a
        public void onAnimationResume(Animator animator) {
            if (!this.f1268a) {
                at.a(this.b, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f1269a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        private b() {
        }
    }

    public Visibility() {
        this.b = 3;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.e);
        int namedInt = TypedArrayUtils.getNamedInt(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (namedInt != 0) {
            b(namedInt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (r0.d == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if (r0.e == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r0.c == 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.support.transition.Visibility.b a(android.support.transition.ah r8, android.support.transition.ah r9) {
        /*
            r7 = this;
            android.support.transition.Visibility$b r0 = new android.support.transition.Visibility$b
            r1 = 0
            r0.<init>()
            r2 = 0
            r0.f1269a = r2
            r0.b = r2
            java.lang.String r3 = "android:visibility:parent"
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1277a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1277a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f1277a
            java.lang.Object r6 = r6.get(r3)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r1
        L37:
            if (r9 == 0) goto L58
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f1277a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L58
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f1277a
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.d = r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f1277a
            java.lang.Object r1 = r1.get(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L5a
        L58:
            r0.d = r4
        L5a:
            r0.f = r1
            r1 = 1
            if (r8 == 0) goto L88
            if (r9 == 0) goto L88
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L6e
            android.view.ViewGroup r8 = r0.e
            android.view.ViewGroup r9 = r0.f
            if (r8 != r9) goto L6e
            return r0
        L6e:
            int r8 = r0.c
            int r9 = r0.d
            if (r8 == r9) goto L7e
            int r8 = r0.c
            if (r8 != 0) goto L79
            goto L99
        L79:
            int r8 = r0.d
            if (r8 != 0) goto L9c
            goto L8e
        L7e:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L83
            goto L99
        L83:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9c
            goto L8e
        L88:
            if (r8 != 0) goto L93
            int r8 = r0.d
            if (r8 != 0) goto L93
        L8e:
            r0.b = r1
        L90:
            r0.f1269a = r1
            goto L9c
        L93:
            if (r9 != 0) goto L9c
            int r8 = r0.c
            if (r8 != 0) goto L9c
        L99:
            r0.b = r2
            goto L90
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Visibility.a(android.support.transition.ah, android.support.transition.ah):android.support.transition.Visibility$b");
    }

    private void a(ah ahVar) {
        ahVar.f1277a.put("android:visibility:visibility", Integer.valueOf(ahVar.b.getVisibility()));
        ahVar.f1277a.put("android:visibility:parent", ahVar.b.getParent());
        int[] iArr = new int[2];
        ahVar.b.getLocationOnScreen(iArr);
        ahVar.f1277a.put("android:visibility:screenLocation", iArr);
    }

    public int a() {
        return this.b;
    }

    public Animator a(ViewGroup viewGroup, ah ahVar, int i, ah ahVar2, int i2) {
        if ((this.b & 1) != 1 || ahVar2 == null) {
            return null;
        }
        if (ahVar == null) {
            View view = (View) ahVar2.b.getParent();
            if (a(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f1269a) {
                return null;
            }
        }
        return a(viewGroup, ahVar2.b, ahVar, ahVar2);
    }

    public Animator a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator b(android.view.ViewGroup r7, android.support.transition.ah r8, int r9, android.support.transition.ah r10, int r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.transition.Visibility.b(android.view.ViewGroup, android.support.transition.ah, int, android.support.transition.ah, int):android.animation.Animator");
    }

    public Animator b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        return null;
    }

    public void b(int i) {
        if ((i & (-4)) == 0) {
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(ah ahVar) {
        a(ahVar);
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(ah ahVar) {
        a(ahVar);
    }

    @Override // android.support.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        b a2 = a(ahVar, ahVar2);
        if (a2.f1269a) {
            if (a2.e == null && a2.f == null) {
                return null;
            }
            return a2.b ? a(viewGroup, ahVar, a2.c, ahVar2, a2.d) : b(viewGroup, ahVar, a2.c, ahVar2, a2.d);
        }
        return null;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f1266a;
    }

    @Override // android.support.transition.Transition
    public boolean isTransitionRequired(ah ahVar, ah ahVar2) {
        if (ahVar == null && ahVar2 == null) {
            return false;
        }
        if (ahVar != null && ahVar2 != null && ahVar2.f1277a.containsKey("android:visibility:visibility") != ahVar.f1277a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b a2 = a(ahVar, ahVar2);
        return a2.f1269a && (a2.c == 0 || a2.d == 0);
    }
}
