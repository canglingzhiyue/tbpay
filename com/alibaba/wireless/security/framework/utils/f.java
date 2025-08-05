package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(888806072);
    }

    public static boolean a(Context context, String str) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.ab.api.ABGlobal");
            return ((Boolean) cls.getDeclaredMethod("isFeatureOpened", Context.class, String.class).invoke(cls, context, str)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
