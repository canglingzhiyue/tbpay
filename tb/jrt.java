package tb;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class jrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1688715012);
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            c();
        }
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (jst.a()) {
            c();
        } else {
            b();
        }
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            jst.a(new jss() { // from class: tb.jrt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jss
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        jrt.a();
                    }
                }
            });
        }
    }

    private static void c() {
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.AssistantState").getDeclaredMethod("isElderHome", new Class[0]);
            declaredMethod.setAccessible(true);
            if (!((Boolean) declaredMethod.invoke(null, new Object[0])).booleanValue()) {
                return;
            }
            Class<?> cls = Class.forName("com.taobao.android.voiceassistant.context.AssistantContext");
            Method declaredMethod2 = cls.getDeclaredMethod("get", new Class[0]);
            declaredMethod2.setAccessible(true);
            cls.getDeclaredMethod("fetchConfiguration", new Class[0]).invoke(declaredMethod2.invoke(null, new Object[0]), new Object[0]);
        } catch (Exception e) {
            Log.e("IdleLauncher", "IdleLauncher exception " + e);
            e.printStackTrace();
        }
    }
}
