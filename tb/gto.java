package tb;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.c;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public class gto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            c.a(str, null);
        }
    }

    public static void a(String str, Application application, HashMap hashMap) {
        try {
            Object newInstance = Class.forName(str).newInstance();
            Method declaredMethod = newInstance.getClass().getDeclaredMethod("init", Application.class, HashMap.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(newInstance, application, hashMap);
        } catch (Exception e) {
            Log.e("MethodInvoker", "failed to invoke: " + str, e);
        }
    }
}
