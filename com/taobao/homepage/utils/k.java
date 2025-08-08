package com.taobao.homepage.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;
import tb.oqc;
import tb.sqg;

/* loaded from: classes7.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(317169409);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        JSONObject d = sqg.d();
        if (d == null) {
            return;
        }
        List<JSONObject> b = sqg.b(d);
        for (int i = 0; i < b.size(); i++) {
            JSONObject jSONObject = b.get(i).getJSONObject("content");
            if (jSONObject != null) {
                boolean booleanValue = jSONObject.getBooleanValue("refreshSearchText");
                String string = jSONObject.getString("type");
                if (booleanValue && StringUtils.equals(string, str)) {
                    oqc.a().r();
                    return;
                }
            }
        }
    }
}
