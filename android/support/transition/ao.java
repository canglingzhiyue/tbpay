package android.support.transition;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class ao implements aq {

    /* renamed from: a  reason: collision with root package name */
    private static LayoutTransition f1282a;
    private static Field b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    private static void a(LayoutTransition layoutTransition) {
        if (!e) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }

    @Override // android.support.transition.aq
    public am a(ViewGroup viewGroup) {
        return ak.a(viewGroup);
    }

    @Override // android.support.transition.aq
    public void a(ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (f1282a == null) {
            LayoutTransition layoutTransition = new LayoutTransition() { // from class: android.support.transition.ao.1
                @Override // android.animation.LayoutTransition
                public boolean isChangingLayout() {
                    return true;
                }
            };
            f1282a = layoutTransition;
            layoutTransition.setAnimator(2, null);
            f1282a.setAnimator(0, null);
            f1282a.setAnimator(1, null);
            f1282a.setAnimator(3, null);
            f1282a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    a(layoutTransition2);
                }
                if (layoutTransition2 != f1282a) {
                    viewGroup.setTag(R.id.transition_layout_save, layoutTransition2);
                }
            }
            viewGroup.setLayoutTransition(f1282a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!c) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                    }
                }
                z2 = z3;
            } catch (IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        LayoutTransition layoutTransition3 = (LayoutTransition) viewGroup.getTag(R.id.transition_layout_save);
        if (layoutTransition3 == null) {
            return;
        }
        viewGroup.setTag(R.id.transition_layout_save, null);
        viewGroup.setLayoutTransition(layoutTransition3);
    }
}
