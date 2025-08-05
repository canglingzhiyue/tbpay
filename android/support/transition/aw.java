package android.support.transition;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class aw extends av {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1288a;
    private static boolean b;
    private static Method c;
    private static boolean d;

    private void a() {
        if (!b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f1288a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
    }

    private void b() {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
    }

    @Override // android.support.transition.au, android.support.transition.az
    public void a(View view, float f) {
        a();
        Method method = f1288a;
        if (method == null) {
            view.setAlpha(f);
            return;
        }
        try {
            method.invoke(view, Float.valueOf(f));
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    @Override // android.support.transition.au, android.support.transition.az
    public float c(View view) {
        b();
        Method method = c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.c(view);
    }

    @Override // android.support.transition.au, android.support.transition.az
    public void d(View view) {
    }

    @Override // android.support.transition.au, android.support.transition.az
    public void e(View view) {
    }
}
