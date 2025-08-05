package com.etao.feimagesearch.nn;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnkit.alinn.AliNNNetInstance;
import com.taobao.android.alinnkit.alinn.AliNNNetNative;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes3.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Method f6897a;
    private static Constructor b;

    static {
        kge.a(1568791168);
    }

    public static AliNNNetInstance a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNNetInstance) ipChange.ipc$dispatch("dfcae268", new Object[]{context, str, str2});
        }
        if (f6897a == null) {
            try {
                Method declaredMethod = AliNNNetNative.class.getDeclaredMethod("nativeCreateNetFromFile", String.class);
                f6897a = declaredMethod;
                declaredMethod.setAccessible(true);
                Constructor declaredConstructor = AliNNNetInstance.class.getDeclaredConstructor(Long.TYPE);
                b = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (Exception unused) {
            }
        }
        if (f6897a == null || b == null) {
            return AliNNNetInstance.a(context, str, str2);
        }
        AliNNNetInstance a2 = a(str);
        return a2 == null ? AliNNNetInstance.a(context, str, str2) : a2;
    }

    private static AliNNNetInstance a(String str) {
        try {
            return (AliNNNetInstance) b.newInstance(Long.valueOf(((Long) f6897a.invoke(null, str)).longValue()));
        } catch (Exception unused) {
            return null;
        }
    }
}
