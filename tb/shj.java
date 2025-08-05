package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.tao.homepage.windvane.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class shj implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1569467308);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Arrays.asList(WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE, "updateCache");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(WindvanePluginRegister.WVTNodeCachePlugin.ACTION_GET_CACHE, str)) {
            return a(str2, wVCallBackContext);
        }
        if (!TextUtils.equals("updateCache", str)) {
            return false;
        }
        return b(str2, wVCallBackContext);
    }

    public boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String a2 = com.taobao.homepage.business.permission.b.a(str, null);
        r rVar = new r();
        rVar.a("cacheValue", a2);
        wVCallBackContext.success(rVar);
        lap.a("Bridge", "getCacheValue", "homepage.HomePageWVPlugin.getCacheValue; success");
        return true;
    }

    public boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        laq c = laq.a().a("Bridge").b("updateCacheValue").c("homepage.HomePageWVPlugin.updateCacheValue");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    String string = parseObject.getString("scene");
                    String string2 = parseObject.getString("subScene");
                    String string3 = parseObject.getString("value");
                    z = com.taobao.homepage.business.permission.b.a(string, string2, string3, "JSBRIDGE");
                    c.a("scene", string).a("subScene", string2).a("value", string3);
                }
            } catch (Exception unused) {
                c.a("exception", "json parse exception");
            }
        }
        if (z) {
            wVCallBackContext.success();
            c.c("success");
        } else {
            wVCallBackContext.error("update cache fail");
            c.c("fail");
        }
        c.b();
        return true;
    }
}
