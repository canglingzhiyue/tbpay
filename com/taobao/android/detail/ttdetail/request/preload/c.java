package com.taobao.android.detail.ttdetail.request.preload;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.l;
import tb.ado;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f10790a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-599014426);
    }

    public static c a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7a609e13", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            String string = jSONObject.getString("url");
            if (string != null && string.startsWith(ado.URL_SEPARATOR)) {
                string = com.taobao.vessel.utils.b.HTTPS_SCHEMA + string;
            }
            jSONObject2.putAll(l.c(Uri.parse(string)));
        }
        c cVar = new c();
        cVar.f10790a = jSONObject2;
        cVar.b = b(jSONObject2);
        return cVar;
    }

    private static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String string = jSONObject.getString("id");
        return TextUtils.isEmpty(string) ? jSONObject.getString("itemId") : string;
    }
}
