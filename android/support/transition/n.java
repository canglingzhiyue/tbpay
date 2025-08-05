package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class n implements o {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1301a;
    private static boolean b;

    private void a() {
        if (!b) {
            try {
                Method declaredMethod = ImageView.class.getDeclaredMethod("animateTransform", Matrix.class);
                f1301a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
    }

    @Override // android.support.transition.o
    public void a(ImageView imageView) {
    }

    @Override // android.support.transition.o
    public void a(ImageView imageView, Animator animator) {
    }

    @Override // android.support.transition.o
    public void a(ImageView imageView, Matrix matrix) {
        a();
        Method method = f1301a;
        if (method != null) {
            try {
                method.invoke(imageView, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
