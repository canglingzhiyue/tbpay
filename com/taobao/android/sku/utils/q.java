package com.taobao.android.sku.utils;

import android.app.Application;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.kge;
import tb.rrv;

/* loaded from: classes6.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1067357020);
    }

    public static Application a() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countryCode", (Object) com.taobao.android.sku.weex.b.a(context));
        jSONObject.put("lbsInfo", (Object) com.taobao.android.sku.weex.b.b(context));
        jSONObject.put(rrv.APDIDTOKEN, (Object) com.taobao.android.sku.weex.b.c(context));
        jSONObject.put("websiteLanguage", (Object) com.taobao.android.sku.weex.b.e(context));
        jSONObject.put("user_token", (Object) com.taobao.android.sku.weex.b.d(context));
        jSONObject.put("bc_fl_src", (Object) com.taobao.android.sku.weex.b.a());
        jSONObject.put("user_token_type", (Object) "tbsid");
        return jSONObject;
    }
}
