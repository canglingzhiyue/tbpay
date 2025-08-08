package com.taobao.android.diagnose.common;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes5.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(871498810);
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls != null) {
            try {
                if (!StringUtils.isEmpty(str)) {
                    return Build.VERSION.SDK_INT >= 28 ? (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr) : cls.getDeclaredMethod(str, clsArr);
                }
            } catch (Throwable th) {
                v.a("ReflectUtils", "getHiddenMethod", th);
            }
        }
        return null;
    }
}
