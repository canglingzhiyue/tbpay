package com.loc;

import android.content.Context;
import anet.channel.util.HttpConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class af extends r {
    public Context k;

    public af(Context context) {
        this.k = context;
        a(5000);
        b(5000);
    }

    @Override // com.loc.bt
    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put(HttpConstant.USER_AGENT, "AMAP SDK Android core 4.3.3");
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "4.3.3", "core"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    @Override // com.loc.bt
    public final String b() {
        return q.a().b() ? "https://restapi.amap.com/rest/aaid/get" : "http://restapi.amap.com/rest/aaid/get";
    }

    @Override // com.loc.bt
    public final String c_() {
        return "core";
    }

    @Override // com.loc.bt
    public final Map<String, String> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("key", l.f(this.k));
        String a2 = n.a();
        String a3 = n.a(this.k, a2, x.b(hashMap));
        hashMap.put("ts", a2);
        hashMap.put("scode", a3);
        return hashMap;
    }
}
