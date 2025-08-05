package com.meizu.flyme.openidsdk;

import android.content.Context;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static Method f8020a;

    static {
        kge.a(34095810);
    }

    public static String a(Context context) {
        f a2 = f.a();
        return a2.a(context.getApplicationContext(), a2.b);
    }

    public static final boolean a() {
        Context context = null;
        try {
            if (f8020a == null) {
                Method method = Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]);
                f8020a = method;
                method.setAccessible(true);
            }
            context = (Context) f8020a.invoke(null, new Object[0]);
        } catch (Exception e) {
            Log.e("OpenIdHelper", "ActivityThread:currentApplication --> " + e.toString());
        }
        if (context == null) {
            return false;
        }
        return f.a().a(context, false);
    }
}
