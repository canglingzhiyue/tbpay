package android.support.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.transition.ag;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

/* loaded from: classes2.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1246a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    private static final TypeEvaluator<Matrix> b = new TypeEvaluator<Matrix>() { // from class: android.support.transition.ChangeImageTransform.1
        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    };
    private static final Property<ImageView, Matrix> c = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") { // from class: android.support.transition.ChangeImageTransform.2
        @Override // android.util.Property
        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(ImageView imageView, Matrix matrix) {
            l.a(imageView, matrix);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.transition.ChangeImageTransform$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1247a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f1247a[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1247a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ObjectAnimator a(ImageView imageView) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) c, (TypeEvaluator) b, (Object[]) new Matrix[]{null, null});
    }

    private ObjectAnimator a(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) c, (TypeEvaluator) new ag.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    private void a(ah ahVar) {
        View view = ahVar.b;
        if (!(view instanceof ImageView) || view.getVisibility() != 0) {
            return;
        }
        ImageView imageView = (ImageView) view;
        if (imageView.getDrawable() == null) {
            return;
        }
        Map<String, Object> map = ahVar.f1277a;
        map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeImageTransform:matrix", b(imageView));
    }

    private static Matrix b(ImageView imageView) {
        int i = AnonymousClass3.f1247a[imageView.getScaleType().ordinal()];
        return i != 1 ? i != 2 ? new Matrix(imageView.getImageMatrix()) : d(imageView) : c(imageView);
    }

    private static Matrix c(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    private static Matrix d(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
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
        ObjectAnimator a2;
        if (ahVar != null && ahVar2 != null) {
            Rect rect = (Rect) ahVar.f1277a.get("android:changeImageTransform:bounds");
            Rect rect2 = (Rect) ahVar2.f1277a.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) ahVar.f1277a.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) ahVar2.f1277a.get("android:changeImageTransform:matrix");
                boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z) {
                    return null;
                }
                ImageView imageView = (ImageView) ahVar2.b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                l.a(imageView);
                if (intrinsicWidth == 0 || intrinsicHeight == 0) {
                    a2 = a(imageView);
                } else {
                    if (matrix == null) {
                        matrix = p.f1302a;
                    }
                    if (matrix2 == null) {
                        matrix2 = p.f1302a;
                    }
                    c.set(imageView, matrix);
                    a2 = a(imageView, matrix, matrix2);
                }
                l.a(imageView, a2);
                return a2;
            }
        }
        return null;
    }

    @Override // android.support.transition.Transition
    public String[] getTransitionProperties() {
        return f1246a;
    }
}
