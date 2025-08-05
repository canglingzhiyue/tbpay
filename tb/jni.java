package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;

/* loaded from: classes6.dex */
public class jni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1266913379);
    }

    public static jnd a(String str, jnc jncVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnd) ipChange.ipc$dispatch("661690e3", new Object[]{str, jncVar}) : a(str, jncVar, null);
    }

    public static jnd a(String str, jnc jncVar, jnf jnfVar) {
        Class<? extends jnd> a2 = jmn.a(str);
        if (a2 == null) {
            return null;
        }
        try {
            Constructor<? extends jnd> constructor = jnfVar == null ? a2.getConstructor(jnc.class) : a2.getConstructor(jnc.class, jnf.class);
            return jnfVar == null ? constructor.newInstance(jncVar) : constructor.newInstance(jncVar, jnfVar);
        } catch (Throwable unused) {
            return null;
        }
    }
}
