package com.taobao.taolive.sdk.business.interact.favor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.phg;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f21809a;
    private long e;

    static {
        kge.a(1994342234);
    }

    public a(d dVar) {
        super(dVar);
        this.f21809a = 0L;
        this.e = 0L;
    }

    public void a(long j, long j2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624d3809", new Object[]{this, new Long(j), new Long(j2), str, str2, map});
            return;
        }
        FavorRequest favorRequest = new FavorRequest();
        this.f21809a = j;
        this.e = j2;
        favorRequest.count = j;
        favorRequest.topic = str;
        favorRequest.relatedTopic = str2;
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            if (map.keySet() != null && map.keySet().size() > 0) {
                for (String str3 : map.keySet()) {
                    jSONObject.put(str3, (Object) map.get(str3));
                }
            }
            favorRequest.extraFlag = JSON.toJSONString(jSONObject);
        }
        a(1, favorRequest, FavorResponse.class);
        phg.a().a("like_test", (Map<String, String>) new HashMap());
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.f21809a;
    }

    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.e;
    }
}
