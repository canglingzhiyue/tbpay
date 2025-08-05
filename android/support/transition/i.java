package android.support.transition;

import android.graphics.Matrix;
import android.support.transition.j;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f1297a;
    private static boolean b;
    private static Method c;
    private static boolean d;
    private static Method e;
    private static boolean f;
    private final View g;

    /* loaded from: classes2.dex */
    static class a implements j.a {
        @Override // android.support.transition.j.a
        public j a(View view, ViewGroup viewGroup, Matrix matrix) {
            i.f();
            if (i.c != null) {
                try {
                    return new i((View) i.c.invoke(null, view, viewGroup, matrix));
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            return null;
        }

        @Override // android.support.transition.j.a
        public void a(View view) {
            i.g();
            if (i.e != null) {
                try {
                    i.e.invoke(null, view);
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }
    }

    private i(View view) {
        this.g = view;
    }

    private static void e() {
        if (!b) {
            try {
                f1297a = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f() {
        if (!d) {
            try {
                e();
                Method declaredMethod = f1297a.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        if (!f) {
            try {
                e();
                Method declaredMethod = f1297a.getDeclaredMethod("removeGhost", View.class);
                e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f = true;
        }
    }

    @Override // android.support.transition.j
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
    }

    @Override // android.support.transition.j
    public void setVisibility(int i) {
        this.g.setVisibility(i);
    }
}
