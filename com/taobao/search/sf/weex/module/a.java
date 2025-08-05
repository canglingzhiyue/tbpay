package com.taobao.search.sf.weex.module;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.datasource.c;
import com.taobao.weex.WXSDKInstance;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Map;
import tb.isr;
import tb.jzf;
import tb.kge;
import tb.nye;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1620588905);
    }

    public void a(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bf052e", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            a(wXSDKInstance, context, "search", jSONObject);
        }
    }

    public void b(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67f38cd", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            a(wXSDKInstance, context, "searchOption", jSONObject);
        }
    }

    public void a(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78ce486", new Object[]{this, wXSDKInstance, context, jSONObject, aVar, aVar2});
        } else {
            a(wXSDKInstance, "searchOptionWithCallback", jSONObject, aVar, aVar2);
        }
    }

    public void c(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763f6c6c", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            a(wXSDKInstance, context, "refreshAuction", jSONObject);
        }
    }

    public void d(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ffa00b", new Object[]{this, wXSDKInstance, context, jSONObject});
            return;
        }
        a(wXSDKInstance, context, "tagSearch", jSONObject);
        a(wXSDKInstance, context);
    }

    public void e(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15bfd3aa", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            a(wXSDKInstance, context, "updateStorage", jSONObject);
        }
    }

    public void f(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5800749", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            a(wXSDKInstance, context, "goToSrp", jSONObject);
        }
    }

    public void g(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5403ae8", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else {
            a(wXSDKInstance, context, "openTaobaoExperience", jSONObject);
        }
    }

    public void h(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85006e87", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
            k.a("XSearchEventImpl", "options参数为空");
        } else {
            a(wXSDKInstance, context, "jumpToTab", jSONObject);
        }
    }

    public void i(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c0a226", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
            k.a("XSearchEventImpl", "options参数为空");
        } else {
            a(wXSDKInstance, context, "jumpToTimeline", jSONObject);
        }
    }

    public void j(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2480d5c5", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
            k.a("XSearchEventImpl", "options参数为空");
        } else {
            a(wXSDKInstance, context, "operateSearchList", jSONObject);
        }
    }

    public void k(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4410964", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
        } else {
            a(wXSDKInstance, context, "removeDynamicCard", jSONObject);
        }
    }

    public void l(WXSDKInstance wXSDKInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4013d03", new Object[]{this, wXSDKInstance, context, jSONObject});
        } else if (jSONObject == null) {
        } else {
            a(wXSDKInstance, context, "prepareCompassRequest", jSONObject);
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
            q.b("XSearchEventImpl", "options为空");
        } else {
            String string = jSONObject.getString("controlName");
            if (TextUtils.isEmpty(string)) {
                q.b("XSearchEventImpl", "controlName为空");
                return;
            }
            String string2 = jSONObject.getString("spm");
            ArrayMap<String, String> a2 = nye.a(jSONObject, "args");
            String string3 = jSONObject.getString("pageName");
            if (TextUtils.equals(jSONObject.getString("withoutPageName"), "true")) {
                a2.put("spm", string2);
                a2.put("rainbow", com.taobao.search.rainbow.a.c());
                UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(string);
                uTControlHitBuilder.setProperties(a2);
                uTControlHitBuilder.setProperty(UTHitBuilders.a.FIELD_ARG1, string);
                UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
                return;
            }
            e.a(string3, string, a2, string2);
        }
    }

    public void a(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b9086", new Object[]{this, wXSDKInstance});
        } else {
            a(wXSDKInstance, "removeSelf", (JSONObject) null);
        }
    }

    public void a(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e5532a", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            a(wXSDKInstance, "setParams", jSONObject);
        }
    }

    public void b(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea36e2ab", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            a(wXSDKInstance, "addParams", jSONObject);
        }
    }

    public void c(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db88722c", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            a(wXSDKInstance, "removeParams", jSONObject);
        }
    }

    public void d(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccda01ad", new Object[]{this, wXSDKInstance, jSONObject});
        } else {
            a(wXSDKInstance, "clearParams", jSONObject);
        }
    }

    private void a(WXSDKInstance wXSDKInstance, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63e3020", new Object[]{this, wXSDKInstance, str, jSONObject});
        } else {
            a(wXSDKInstance, str, jSONObject, (isr.c.a) null, (isr.c.a) null);
        }
    }

    private void a(WXSDKInstance wXSDKInstance, String str, JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        h b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c56d978", new Object[]{this, wXSDKInstance, str, jSONObject, aVar, aVar2});
        } else if (!(wXSDKInstance instanceof d) || (b = ((d) wXSDKInstance).b()) == null) {
        } else {
            b.b(str, jSONObject, aVar, aVar2);
        }
    }

    private d.a a(WXSDKInstance wXSDKInstance, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d.a) ipChange.ipc$dispatch("f3a94691", new Object[]{this, wXSDKInstance, context});
        }
        d.a aVar = null;
        if (wXSDKInstance instanceof d) {
            aVar = ((d) wXSDKInstance).a();
        }
        return (aVar == null && (context instanceof d.a)) ? (d.a) context : aVar;
    }

    public Map<String, String> b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2d4e65a", new Object[]{this, wXSDKInstance});
        }
        if (!(wXSDKInstance instanceof d)) {
            return null;
        }
        h b = ((d) wXSDKInstance).b();
        if (b instanceof jzf) {
            return ((c) ((jzf) b).getModel().d()).getParamsSnapShot();
        }
        return null;
    }

    private void a(WXSDKInstance wXSDKInstance, Context context, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e78e924", new Object[]{this, wXSDKInstance, context, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
            k.a("XSearchEventImpl", "event为空");
        } else {
            d.a a2 = a(wXSDKInstance, context);
            if (a2 == null) {
                k.a("XSearchEventImpl", str + ": eventListener为空");
                return;
            }
            a2.a(str, jSONObject, null, null);
        }
    }
}
