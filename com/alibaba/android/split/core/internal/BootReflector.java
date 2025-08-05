package com.alibaba.android.split.core.internal;

import android.content.Context;
import android.util.Log;
import com.alibaba.android.split.core.plugin.d;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.bid;
import tb.kge;

/* loaded from: classes2.dex */
public class BootReflector {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Class<?> bootClassLoader_Clazz;

    static {
        kge.a(-1123447306);
        try {
            bootClassLoader_Clazz = Class.forName("java.lang.BootClassLoader");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Log.e("BootReflector", FlexaClassLoader.class.getName());
        Log.e("BootReflector", bid.class.getName());
    }

    public static void reflect(Context context, ClassLoader classLoader) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be374e66", new Object[]{context, classLoader});
            return;
        }
        while (classLoader.getParent().getClass() != bootClassLoader_Clazz) {
            classLoader = classLoader.getParent();
        }
        injectParent(context, classLoader);
    }

    private static void injectParent(Context context, ClassLoader classLoader) throws Exception {
        Field declaredField = ClassLoader.class.getDeclaredField(c.MSG_SOURCE_PARENT);
        declaredField.setAccessible(true);
        declaredField.set(classLoader, new d(context, classLoader.getParent(), true, new d.a() { // from class: com.alibaba.android.split.core.internal.BootReflector.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.split.core.plugin.d.a
            public int whereFindClass(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2927e9c", new Object[]{this, str})).intValue() : bid.a(str) ? 1 : 0;
            }
        }));
    }
}
