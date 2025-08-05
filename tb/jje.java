package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class jje {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int PrivateTagKey = -9001;

    static {
        kge.a(24083048);
    }

    public static jjd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjd) ipChange.ipc$dispatch("f066e7a", new Object[0]);
        }
        jjd jjdVar = new jjd();
        try {
            Class<?> cls = Class.forName("android.view.View");
            if (cls != null) {
                Method declaredMethod = cls.getDeclaredMethod("getListenerInfo", new Class[0]);
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    jjdVar.f29579a = true;
                    jjdVar.b = declaredMethod;
                    jjdVar.d = "";
                }
            } else {
                jjdVar.f29579a = false;
                jjdVar.b = null;
                jjdVar.d = "cls null";
            }
        } catch (Exception e) {
            jjdVar.b = null;
            jjdVar.d = e.getMessage();
        }
        return jjdVar;
    }

    public static jjd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jjd) ipChange.ipc$dispatch("16b813d9", new Object[0]);
        }
        jjd jjdVar = new jjd();
        try {
            Class<?> cls = Class.forName("android.view.View$ListenerInfo");
            if (cls != null) {
                Field declaredField = cls.getDeclaredField("mOnClickListener");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    jjdVar.f29579a = true;
                    jjdVar.c = declaredField;
                    jjdVar.d = "";
                }
            } else {
                jjdVar.f29579a = false;
                jjdVar.c = null;
                jjdVar.d = "cls null";
            }
        } catch (Exception e) {
            jjdVar.c = null;
            jjdVar.d = e.getMessage();
        }
        return jjdVar;
    }
}
