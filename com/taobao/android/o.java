package com.taobao.android;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AliLoginInterface f14479a;

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
        T t = (T) f14479a;
        if (t != null) {
            return t;
        }
        T t2 = (T) b(cls);
        if (t2 != null) {
            f14479a = (AliLoginInterface) t2;
        }
        return t2;
    }

    public static AliLoginInterface a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLoginInterface) ipChange.ipc$dispatch("4d048f82", new Object[0]);
        }
        Object a2 = a(AliLoginInterface.class);
        if (!(a2 instanceof AliLoginInterface)) {
            return null;
        }
        return (AliLoginInterface) a2;
    }
}
