package com.taobao.android.tstudio;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, TStudioInterface> f15689a = new HashMap();

    private static <T> T a(Class<T> cls, String str) {
        String str2;
        String name = cls.getName();
        if (name.endsWith("Interface")) {
            str2 = name.replace("Interface", "Imp");
        } else {
            str2 = name + "Imp";
        }
        try {
            Class<?> cls2 = Class.forName(str2);
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getInstance", String.class);
                if (declaredMethod == null) {
                    return null;
                }
                return (T) declaredMethod.invoke(null, str);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(String.class);
                    declaredConstructor.setAccessible(true);
                    return (T) declaredConstructor.newInstance(str);
                } catch (Exception unused) {
                    e.printStackTrace();
                    return null;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static <T> T b(Class<T> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e23bc3b4", new Object[]{cls, str});
        }
        if (f15689a.containsKey(str)) {
            return (T) f15689a.get(str);
        }
        T t = (T) a(cls, str);
        if (t != null) {
            f15689a.put(str, (TStudioInterface) t);
        }
        return t;
    }

    public static TStudioInterface a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TStudioInterface) ipChange.ipc$dispatch("6e56fe3c", new Object[]{str});
        }
        Object b = b(TStudioInterface.class, str);
        if (!(b instanceof TStudioInterface)) {
            return null;
        }
        return (TStudioInterface) b;
    }
}
