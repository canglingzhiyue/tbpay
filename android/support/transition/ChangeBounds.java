package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* loaded from: classes2.dex */
public class ChangeBounds extends Transition {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1237a = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> b = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") { // from class: android.support.transition.ChangeBounds.1

        /* renamed from: a  reason: collision with root package name */
        private Rect f1238a = new Rect();

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f1238a);
            return new PointF(this.f1238a.left, this.f1238a.top);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f1238a);
            this.f1238a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f1238a);
        }
    };
    private static final Property<a, PointF> c = new Property<a, PointF>(PointF.class, "topLeft") { // from class: android.support.transition.ChangeBounds.3
        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(a aVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(a aVar, PointF pointF) {
            aVar.a(pointF);
        }
    };
    private static final Property<a, PointF> d = new Property<a, PointF>(PointF.class, "bottomRight") { // from class: android.support.transition.ChangeBounds.4
        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(a aVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(a aVar, PointF pointF) {
            aVar.b(pointF);
        }
    };
    private static final Property<View, PointF> e = new Property<View, PointF>(PointF.class, "bottomRight") { // from class: android.support.transition.ChangeBounds.5
        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, PointF pointF) {
            at.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    private static final Property<View, PointF> f = new Property<View, PointF>(PointF.class, "topLeft") { // from class: android.support.transition.ChangeBounds.6
        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, PointF pointF) {
            at.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    private static final Property<View, PointF> g = new Property<View, PointF>(PointF.class, "position") { // from class: android.support.transition.ChangeBounds.7
        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            at.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };
    private static z k = new z();
    private int[] h;
    private boolean i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f1243a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;

        a(View view) {
            this.e = view;
        }

        private void a() {
            at.a(this.e, this.f1243a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void a(PointF pointF) {
            this.f1243a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            this.f++;
            if (this.f == this.g) {
                a();
            }
        }

        void b(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            this.g++;
            if (this.f == this.g) {
                a();
            }
        }
    }

    public ChangeBounds() {
        this.h = new int[2];
        this.i = false;
        this.j = false;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new int[2];
        this.i = false;
        this.j = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.d);
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        a(namedBoolean);
    }

    private void a(ah ahVar) {
        View view = ahVar.b;
        if (!ViewCompat.isLaidOut(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        ahVar.f1277a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        ahVar.f1277a.put("android:changeBounds:parent", ahVar.b.getParent());
        if (this.j) {
            ahVar.b.getLocationInWindow(this.h);
            ahVar.f1277a.put("android:changeBounds:windowX", Integer.valueOf(this.h[0]));
            ahVar.f1277a.put("android:changeBounds:windowY", Integer.valueOf(this.h[1]));
        }
        if (!this.i) {
            return;
        }
        ahVar.f1277a.put("android:changeBounds:clip", ViewCompat.getClipBounds(view));
    }

    private boolean a(View view, View view2) {
        if (this.j) {
            ah matchedTransitionValues = getMatchedTransitionValues(view, true);
            if (matchedTransitionValues == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == matchedTransitionValues.b) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void a(boolean z) {
        this.i = z;
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
    public Animator createAnimator(final ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        int i;
        final View view;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator a2;
        Path path;
        Property<View, PointF> property;
        if (ahVar == null || ahVar2 == null) {
            return null;
        }
        Map<String, Object> map = ahVar.f1277a;
        Map<String, Object> map2 = ahVar2.f1277a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        final View view2 = ahVar2.b;
        if (!a(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) ahVar.f1277a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) ahVar.f1277a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) ahVar2.f1277a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) ahVar2.f1277a.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.h);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            final BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            final float c2 = at.c(view2);
            at.a(view2, 0.0f);
            at.a(viewGroup).a(bitmapDrawable);
            PathMotion pathMotion = getPathMotion();
            int[] iArr = this.h;
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, v.a(b, pathMotion.getPath(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
            ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.ChangeBounds.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    at.a(viewGroup).b(bitmapDrawable);
                    at.a(view2, c2);
                }
            });
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) ahVar.f1277a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) ahVar2.f1277a.get("android:changeBounds:bounds");
        int i3 = rect2.left;
        final int i4 = rect3.left;
        int i5 = rect2.top;
        final int i6 = rect3.top;
        int i7 = rect2.right;
        final int i8 = rect3.right;
        int i9 = rect2.bottom;
        final int i10 = rect3.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect4 = (Rect) ahVar.f1277a.get("android:changeBounds:clip");
        final Rect rect5 = (Rect) ahVar2.f1277a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i = 0;
        } else {
            i = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        if (!this.i) {
            view = view2;
            at.a(view, i3, i5, i7, i9);
            if (i == 2) {
                if (i11 == i13 && i12 == i14) {
                    path = getPathMotion().getPath(i3, i5, i4, i6);
                    property = g;
                } else {
                    final a aVar = new a(view);
                    ObjectAnimator a3 = q.a(aVar, c, getPathMotion().getPath(i3, i5, i4, i6));
                    ObjectAnimator a4 = q.a(aVar, d, getPathMotion().getPath(i7, i9, i8, i10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a3, a4);
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.ChangeBounds.8
                        private a c;

                        {
                            this.c = aVar;
                        }
                    });
                    a2 = animatorSet;
                }
            } else if (i3 == i4 && i5 == i6) {
                path = getPathMotion().getPath(i7, i9, i8, i10);
                property = e;
            } else {
                path = getPathMotion().getPath(i3, i5, i4, i6);
                property = f;
            }
            a2 = q.a(view, property, path);
        } else {
            view = view2;
            at.a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
            ObjectAnimator a5 = (i3 == i4 && i5 == i6) ? null : q.a(view, g, getPathMotion().getPath(i3, i5, i4, i6));
            if (rect4 == null) {
                i2 = 0;
                rect = new Rect(0, 0, i11, i12);
            } else {
                i2 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
            if (!rect.equals(rect6)) {
                ViewCompat.setClipBounds(view, rect);
                z zVar = k;
                Object[] objArr = new Object[2];
                objArr[i2] = rect;
                objArr[1] = rect6;
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", zVar, objArr);
                objectAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.transition.ChangeBounds.9
                    private boolean h;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.h = true;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (!this.h) {
                            ViewCompat.setClipBounds(view, rect5);
                            at.a(view, i4, i6, i8, i10);
                        }
                    }
                });
            } else {
                objectAnimator = null;
            }
            a2 = ag.a(a5, objectAnimator);
        }
        if (view.getParent() instanceof ViewGroup) {
            final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            an.a(viewGroup4, true);
            addListener(new ad() { // from class: android.support.transition.ChangeBounds.10

                /* renamed from: a  reason: collision with root package name */
                boolean f1239a = false;

                @Override // android.support.transition.ad, android.support.transition.Transition.d
                public void a(Transition transition) {
                    an.a(viewGroup4, false);
                    this.f1239a = true;
                }

                @Override // android.support.transition.ad, android.support.transition.Transition.d
                public void b(Transition transition) {
                    if (!this.f1239a) {
                        an.a(viewGroup4, false);
                    }
                    transition.removeListener(this);
                }

                @Override // android.support.transition.ad, android.support.transition.Transition.d
                public void c(Transition transition) {
                    an.a(viewGroup4, false);
                }

                @Override // android.support.transition.ad, android.support.transition.Transition.d
                public void d(Transition transition) {
                    an.a(viewGroup4, true);
                }
            });
        }
        return a2;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f1237a;
    }
}
