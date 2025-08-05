package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.remote.c;
import com.taobao.tao.homepage.d;
import com.taobao.tao.homepage.windvane.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class sqf implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(622033195);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Arrays.asList("addTrackProperties", "removeTrackProperties", "getTrackProperties");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "addTrackProperties")) {
            return a(str2, wVCallBackContext);
        }
        if (TextUtils.equals(str, "removeTrackProperties")) {
            return b(str2, wVCallBackContext);
        }
        if (!TextUtils.equals(str, "getTrackProperties")) {
            return false;
        }
        return c(str2, wVCallBackContext);
    }

    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        ope f;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            f = d.f(null);
        } catch (Exception unused) {
            wVCallBackContext.error();
            lap.a("Bridge", "addTrackProperties", "exception:params parse exception");
        }
        if (f == null) {
            wVCallBackContext.error();
            lap.a("Bridge", "addTrackProperties", "error:dataSource=null");
            return true;
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject != null && !parseObject.isEmpty() && (jSONObject = parseObject.getJSONObject("props")) != null && !jSONObject.isEmpty()) {
            for (String str2 : jSONObject.keySet()) {
                f.a(str2, (Object) jSONObject.getString(str2));
            }
        }
        wVCallBackContext.success();
        lap.a("Bridge", "addTrackProperties", "success");
        return true;
    }

    private boolean b(String str, WVCallBackContext wVCallBackContext) {
        ope a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            a2 = d.a();
        } catch (Exception unused) {
            wVCallBackContext.error();
            lap.a("Bridge", "removeTrackProperties", "exception:params parse exception;");
        }
        if (a2 == null) {
            wVCallBackContext.error();
            lap.a("Bridge", "removeTrackProperties", "homepage.HomePageWVPlugin.removeTrackProperties;error: dataSource=null;");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            a2.b();
            wVCallBackContext.success();
            return true;
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                if (parseObject.isEmpty()) {
                    a2.b();
                    wVCallBackContext.success();
                    return true;
                }
                JSONArray jSONArray = parseObject.getJSONArray("props");
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        a2.a(jSONArray.getString(i));
                    }
                }
            }
            wVCallBackContext.success();
            lap.a("Bridge", "removeTrackProperties", "success");
            return true;
        }
    }

    private boolean c(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ab3f5", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        laq c = laq.a().a("Bridge").b("getTrackProperties").c("homepage.HomePageWVPlugin.getTrackProperties");
        ope f = d.f(null);
        if (f == null) {
            wVCallBackContext.error("当前dataSource为null");
            c.a(c.KEY_DATA_SOURCE, "null").b();
            return true;
        }
        JSONObject g = f.g();
        if (g == null) {
            wVCallBackContext.error("当前无参数");
            c.a("埋点信息", "null").b();
            return true;
        }
        r rVar = new r();
        rVar.a("props", g);
        wVCallBackContext.success(rVar);
        c.c("success").b();
        return true;
    }
}
