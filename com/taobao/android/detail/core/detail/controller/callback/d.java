package com.taobao.android.detail.core.detail.controller.callback;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.ju.track.server.JTrackParams;
import com.ut.share.utils.Constants;
import java.net.URLEncoder;
import java.util.HashMap;
import tb.emu;
import tb.eqb;
import tb.god;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2082052965);
    }

    public d() {
        emu.a("com.taobao.android.detail.core.detail.controller.callback.DowngradeHandler");
    }

    public static void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, boolean z, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9bb95c", new Object[]{bVar, new Boolean(z), str});
            return;
        }
        final JSONObject a2 = bVar.a();
        final String str2 = eqb.c(bVar).categoryId;
        final long j = eqb.c(bVar).rootCategoryId;
        final String valueOf = String.valueOf(z);
        final String d = com.taobao.android.detail.core.ultronengine.b.d(bVar);
        final String e = e(a2);
        emu.a("detail-DataSdk-DetailV1.0-Run", new HashMap<String, String>() { // from class: com.taobao.android.detail.core.detail.controller.callback.DowngradeHandler$1
            {
                put("itemId", d.b(JSONObject.this));
                put("categoryId", str2);
                put("rootCategoryId", String.valueOf(j));
                put("isException", valueOf);
                put("exceptionStack", str);
                put("traceId", d.a(JSONObject.this));
                put("isPreload", String.valueOf(d.c(JSONObject.this)));
                put("is302", (!StringUtils.isEmpty(e) ? Boolean.TRUE : Boolean.FALSE).toString());
                try {
                    put(Constants.WEIBO_REDIRECTURL_KEY, !StringUtils.isEmpty(e) ? URLEncoder.encode(e, "UTF-8") : "");
                } catch (Throwable unused) {
                    put(Constants.WEIBO_REDIRECTURL_KEY, "encode exception");
                }
                put("dataVersion", d);
            }
        });
    }

    public static String a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null && (jSONObject3 = jSONObject2.getJSONObject(JTrackParams.TRACK_PARAMS)) != null) {
            return jSONObject3.getString("traceId");
        }
        return null;
    }

    public static String b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("item")) != null) {
            return jSONObject2.getString("itemId");
        }
        return null;
    }

    public static boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return "true".equalsIgnoreCase(jSONObject.getString("preload"));
        }
        return false;
    }

    public String a(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c45eb86", new Object[]{this, context, jSONObject, str});
        }
        boolean b = b(context);
        if (!d(jSONObject) && !b) {
            return null;
        }
        return a(str, jSONObject, b);
    }

    public String b(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f37537a5", new Object[]{this, context, jSONObject, str});
        }
        boolean c = c(context);
        if (!g(jSONObject) && !c) {
            return null;
        }
        return a(str, jSONObject, c);
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        return a2 != null && !Boolean.parseBoolean(a2.a("android_detail", "disableDetail1Downgrade", "false"));
    }

    private boolean b(Context context) {
        AliConfigInterface a2;
        String a3;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        String a4 = a(context);
        if (StringUtils.isEmpty(a4) || (a2 = com.taobao.android.e.a()) == null || (a3 = a2.a("android_detail", "tcloud_downgrade_black_list", "")) == null || (split = a3.split("/")) == null) {
            return false;
        }
        for (String str : split) {
            if (str != null && a4.equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    private boolean g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a56a746", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null) {
            return jSONObject2.getBooleanValue("disableDetail1");
        }
        return false;
    }

    private boolean d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("feature")) != null) {
            return jSONObject2.getBooleanValue("tcloudToH5");
        }
        return false;
    }

    private String a(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d30e7dca", new Object[]{this, str, jSONObject, new Boolean(z)});
        }
        String e = e(jSONObject);
        if (StringUtils.isEmpty(e)) {
            e = f(jSONObject);
        }
        if (!StringUtils.isEmpty(e)) {
            return e;
        }
        return z ? b(str) : a(str);
    }

    private static String e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb19cf1c", new Object[]{jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("trade")) != null) {
            return jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
        }
        return null;
    }

    private String f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e46e245d", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("item")) != null) {
            return jSONObject2.getString("h5ItemUrl");
        }
        return null;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (god.t) {
            return god.q + str;
        }
        return "https://h5.m.taobao.com/awp/core/detail.htm?id=" + str + "&hybrid=true";
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (god.t) {
            return god.q + str;
        }
        return "https://new.m.taobao.com/detail.htm?id=" + str + "&hybrid=true";
    }
}
