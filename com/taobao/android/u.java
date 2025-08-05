package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes4.dex */
public class u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AliUserTrackerInterface f15692a;

    static {
        kge.a(1947680564);
    }

    private static <T> T b(Class<T> cls) {
        String str;
        Class cls2;
        String name = cls.getName();
        if (name.endsWith("Interface")) {
            str = name.replace("Interface", "Imp");
        } else {
            str = name + "Imp";
        }
        try {
            try {
                Method declaredMethod = Class.forName(str).getDeclaredMethod("getInstance", new Class[0]);
                if (declaredMethod == null) {
                    return null;
                }
                return (T) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    return (T) cls2.newInstance();
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

    public static <T> T a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{cls});
        }
        T t = (T) f15692a;
        if (t != null) {
            return t;
        }
        T t2 = (T) b(cls);
        if (t2 != null) {
            f15692a = (AliUserTrackerInterface) t2;
        }
        return t2;
    }

    public static AliUserTrackerInterface a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliUserTrackerInterface) ipChange.ipc$dispatch("e116d6c6", new Object[0]);
        }
        Object a2 = a(AliUserTrackerInterface.class);
        if (!(a2 instanceof AliUserTrackerInterface)) {
            return null;
        }
        return (AliUserTrackerInterface) a2;
    }
}
