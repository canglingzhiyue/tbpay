package android.support.transition;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class ap extends ao {

    /* renamed from: a  reason: collision with root package name */
    private static Method f1284a;
    private static boolean b;

    private void a() {
        if (!b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                f1284a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
    }

    @Override // android.support.transition.ao, android.support.transition.aq
    public am a(ViewGroup viewGroup) {
        return new al(viewGroup);
    }

    @Override // android.support.transition.ao, android.support.transition.aq
    public void a(ViewGroup viewGroup, boolean z) {
        a();
        Method method = f1284a;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z));
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
