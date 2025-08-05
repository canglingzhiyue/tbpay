package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class ChangeTransform extends Transition {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1249a = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<PathAnimatorMatrix, float[]> b = new Property<PathAnimatorMatrix, float[]>(float[].class, "nonTranslations") { // from class: android.support.transition.ChangeTransform.1
        @Override // android.util.Property
        /* renamed from: a */
        public void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            pathAnimatorMatrix.setValues(fArr);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }
    };
    private static final Property<PathAnimatorMatrix, PointF> c = new Property<PathAnimatorMatrix, PointF>(PointF.class, "translations") { // from class: android.support.transition.ChangeTransform.2
        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            pathAnimatorMatrix.setTranslation(pointF);
        }
    };
    private static final boolean d;
    private boolean e;
    private boolean f;
    private Matrix g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class PathAnimatorMatrix {
        private final Matrix mMatrix = new Matrix();
        private float mTranslationX;
        private float mTranslationY;
        private final float[] mValues;
        private final View mView;

        PathAnimatorMatrix(View view, float[] fArr) {
            this.mView = view;
            this.mValues = (float[]) fArr.clone();
            float[] fArr2 = this.mValues;
            this.mTranslationX = fArr2[2];
            this.mTranslationY = fArr2[5];
            setAnimationMatrix();
        }

        private void setAnimationMatrix() {
            float[] fArr = this.mValues;
            fArr[2] = this.mTranslationX;
            fArr[5] = this.mTranslationY;
            this.mMatrix.setValues(fArr);
            at.c(this.mView, this.mMatrix);
        }

        Matrix getMatrix() {
            return this.mMatrix;
        }

        void setTranslation(PointF pointF) {
            this.mTranslationX = pointF.x;
            this.mTranslationY = pointF.y;
            setAnimationMatrix();
        }

        void setValues(float[] fArr) {
            System.arraycopy(fArr, 0, this.mValues, 0, fArr.length);
            setAnimationMatrix();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a extends ad {

        /* renamed from: a  reason: collision with root package name */
        private View f1251a;
        private j b;

        a(View view, j jVar) {
            this.f1251a = view;
            this.b = jVar;
        }

        @Override // android.support.transition.ad, android.support.transition.Transition.d
        public void b(Transition transition) {
            transition.removeListener(this);
            k.a(this.f1251a);
            this.f1251a.setTag(R.id.transition_transform, null);
            this.f1251a.setTag(R.id.parent_matrix, null);
        }

        @Override // android.support.transition.ad, android.support.transition.Transition.d
        public void c(Transition transition) {
            this.b.setVisibility(4);
        }

        @Override // android.support.transition.ad, android.support.transition.Transition.d
        public void d(Transition transition) {
            this.b.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final float f1252a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        final float g;
        final float h;

        b(View view) {
            this.f1252a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = ViewCompat.getTranslationZ(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }

        public void a(View view) {
            ChangeTransform.b(view, this.f1252a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f1252a == this.f1252a && bVar.b == this.b && bVar.c == this.c && bVar.d == this.d && bVar.e == this.e && bVar.f == this.f && bVar.g == this.g && bVar.h == this.h;
        }

        public int hashCode() {
            float f = this.f1252a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    static {
        d = Build.VERSION.SDK_INT >= 21;
    }

    public ChangeTransform() {
        this.e = true;
        this.f = true;
        this.g = new Matrix();
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        this.f = true;
        this.g = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.e = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    private ObjectAnimator a(ah ahVar, ah ahVar2, final boolean z) {
        Matrix matrix = (Matrix) ahVar.f1277a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) ahVar2.f1277a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = p.f1302a;
        }
        if (matrix2 == null) {
            matrix2 = p.f1302a;
        }
        final Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        final b bVar = (b) ahVar2.f1277a.get("android:changeTransform:transforms");
        final View view = ahVar2.b;
        b(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        final PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(b, new h(new float[9]), fArr, fArr2), v.a(c, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: android.support.transition.ChangeTransform.3
            private boolean g;
            private Matrix h = new Matrix();

            private void a(Matrix matrix4) {
                this.h.set(matrix4);
                view.setTag(R.id.transition_transform, this.h);
                bVar.a(view);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.g = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!this.g) {
                    if (!z || !ChangeTransform.this.e) {
                        view.setTag(R.id.transition_transform, null);
                        view.setTag(R.id.parent_matrix, null);
                    } else {
                        a(matrix3);
                    }
                }
                at.c(view, null);
                bVar.a(view);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator) {
                a(pathAnimatorMatrix.getMatrix());
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator) {
                ChangeTransform.b(view);
            }
        };
        ofPropertyValuesHolder.addListener(animatorListenerAdapter);
        c.a(ofPropertyValuesHolder, animatorListenerAdapter);
        return ofPropertyValuesHolder;
    }

    private void a(ah ahVar) {
        View view = ahVar.b;
        if (view.getVisibility() == 8) {
            return;
        }
        ahVar.f1277a.put("android:changeTransform:parent", view.getParent());
        ahVar.f1277a.put("android:changeTransform:transforms", new b(view));
        Matrix matrix = view.getMatrix();
        ahVar.f1277a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (!this.f) {
            return;
        }
        Matrix matrix2 = new Matrix();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        at.a(viewGroup, matrix2);
        matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
        ahVar.f1277a.put("android:changeTransform:parentMatrix", matrix2);
        ahVar.f1277a.put("android:changeTransform:intermediateMatrix", view.getTag(R.id.transition_transform));
        ahVar.f1277a.put("android:changeTransform:intermediateParentMatrix", view.getTag(R.id.parent_matrix));
    }

    private void a(ah ahVar, ah ahVar2) {
        Matrix matrix = (Matrix) ahVar2.f1277a.get("android:changeTransform:parentMatrix");
        ahVar2.b.setTag(R.id.parent_matrix, matrix);
        Matrix matrix2 = this.g;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) ahVar.f1277a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            ahVar.f1277a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) ahVar.f1277a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    private void a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        View view = ahVar2.b;
        Matrix matrix = new Matrix((Matrix) ahVar2.f1277a.get("android:changeTransform:parentMatrix"));
        at.b(viewGroup, matrix);
        j a2 = k.a(view, viewGroup, matrix);
        if (a2 == null) {
            return;
        }
        a2.reserveEndViewTransition((ViewGroup) ahVar.f1277a.get("android:changeTransform:parent"), ahVar.b);
        Transition transition = this;
        while (transition.mParent != null) {
            transition = transition.mParent;
        }
        transition.addListener(new a(view, a2));
        if (!d) {
            return;
        }
        if (ahVar.b != ahVar2.b) {
            at.a(ahVar.b, 0.0f);
        }
        at.a(view, 1.0f);
    }

    private boolean a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (isValidTarget(viewGroup) && isValidTarget(viewGroup2)) {
            ah matchedTransitionValues = getMatchedTransitionValues(viewGroup, true);
            if (matchedTransitionValues == null || viewGroup2 != matchedTransitionValues.b) {
                return false;
            }
        } else if (viewGroup != viewGroup2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view) {
        b(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        ViewCompat.setTranslationZ(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // android.support.transition.Transition
    public void captureEndValues(ah ahVar) {
        a(ahVar);
    }

    @Override // android.support.transition.Transition
    public void captureStartValues(ah ahVar) {
        a(ahVar);
        if (!d) {
            ((ViewGroup) ahVar.b.getParent()).startViewTransition(ahVar.b);
        }
    }

    @Override // android.support.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (ahVar == null || ahVar2 == null || !ahVar.f1277a.containsKey("android:changeTransform:parent") || !ahVar2.f1277a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) ahVar.f1277a.get("android:changeTransform:parent");
        boolean z = this.f && !a(viewGroup2, (ViewGroup) ahVar2.f1277a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) ahVar.f1277a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            ahVar.f1277a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) ahVar.f1277a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            ahVar.f1277a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            a(ahVar, ahVar2);
        }
        ObjectAnimator a2 = a(ahVar, ahVar2, z);
        if (z && a2 != null && this.e) {
            a(viewGroup, ahVar, ahVar2);
        } else if (!d) {
            viewGroup2.endViewTransition(ahVar.b);
        }
        return a2;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f1249a;
    }
}
