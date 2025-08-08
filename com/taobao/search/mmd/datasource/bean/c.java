package com.taobao.search.mmd.datasource.bean;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f19163a;
    public long b;
    public List<String> c = new ArrayList();
    public String d;

    static {
        kge.a(-281341798);
    }

    public static c a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("cd15b4ca", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        c cVar = new c();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        try {
            String string = jSONObject.getString("startTime");
            String string2 = jSONObject.getString("endTime");
            cVar.f19163a = simpleDateFormat.parse(string).getTime();
            cVar.b = simpleDateFormat.parse(string2).getTime();
            JSONArray a2 = com.taobao.android.searchbaseframe.util.a.a(jSONObject, "query");
            if (a2 != null && !a2.isEmpty()) {
                for (int i = 0; i < a2.size(); i++) {
                    String string3 = a2.getString(i);
                    if (!StringUtils.isEmpty(string3)) {
                        cVar.c.add(string3);
                    }
                }
                if (cVar.c.isEmpty()) {
                    return null;
                }
                String string4 = jSONObject.getString("url");
                if (StringUtils.isEmpty(string4)) {
                    return null;
                }
                cVar.d = string4;
                return cVar;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
