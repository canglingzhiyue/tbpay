package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public final class csn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Field f26492a;

    static {
        kge.a(98063723);
    }

    public static final void a() {
        if (f26492a == null) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                f26492a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception unused) {
            }
        }
        try {
            Field field = f26492a;
            if (field == null) {
                return;
            }
            field.set(null, Float.valueOf(1.0f));
        } catch (Exception unused2) {
        }
    }
}
