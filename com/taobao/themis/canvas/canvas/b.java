package com.taobao.themis.canvas.canvas;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Object f22323a;
    private static Method b;

    static {
        kge.a(-1684631043);
        try {
            Constructor<?> declaredConstructor = Class.forName("com.taobao.aboat.ReceivePerformance").getDeclaredConstructor(Context.class);
            IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
            if (iEnvironmentService != null) {
                f22323a = declaredConstructor.newInstance(iEnvironmentService.getApplicationContext());
            }
            b = f22323a.getClass().getDeclaredMethod("onReceiveWindmillPerformanceLog", String.class, String.class);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, int i, int i2, Map<String, String> map) {
        try {
            if (f22323a == null || b == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str);
            jSONObject.put("imageWidth", (Object) Integer.valueOf(i));
            jSONObject.put("imageHeight", (Object) Integer.valueOf(i2));
            jSONObject.put(ImageStatistics.KEY_READ_LOCAL_FILE, map == null ? false : map.get("local_file"));
            b.invoke(f22323a, "fcanvas_resources", jSONObject.toJSONString());
        } catch (Throwable unused) {
            TMSLogger.d("AtsPerformanceUtils", "send fcanvas resources error!");
        }
    }
}
