package com.taobao.android.launcher.bootstrap.tao.biz.touch;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.sxs;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static void a(Field field) {
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            field.setAccessible(true);
            declaredField.setInt(field, field.getModifiers() & (-17));
        } catch (Throwable unused) {
        }
    }

    public static boolean a(sxs sxsVar) {
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Field declaredField = cls.getDeclaredField("mViews");
            a(declaredField);
            declaredField.set(cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new ViewListDelegate(sxsVar));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
