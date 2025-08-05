package com.alibaba.android.ultron.event.ext;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jpr;
import tb.jpt;
import tb.kge;

/* loaded from: classes2.dex */
public class v extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "orderJSTrackerReport";

    static {
        kge.a(1387879482);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "734081694296469013";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        float parseFloat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        JSONObject e = e(eVar);
        if (e == null) {
            return;
        }
        String string = e.getString("code");
        String string2 = e.getString("pageName");
        String string3 = e.getString("success");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            return;
        }
        String string4 = e.getString("message");
        String string5 = e.getString("uniqueId");
        String string6 = e.getString("sampling");
        jpt a2 = jpt.a(string2, string);
        a2.a(Boolean.parseBoolean(string3));
        String str = "";
        if (string4 == null) {
            string4 = str;
        }
        a2.a(string4);
        if (string5 != null) {
            str = string5;
        }
        a2.e(str);
        if (string6 != null) {
            try {
                parseFloat = Float.parseFloat(string6);
            } catch (Throwable unused) {
                a2.a(1.0f);
            }
        } else {
            parseFloat = 1.0f;
        }
        a2.a(parseFloat);
        jpr.a(a2);
    }
}
