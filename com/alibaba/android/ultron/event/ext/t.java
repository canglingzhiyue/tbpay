package com.alibaba.android.ultron.event.ext;

import android.support.v4.util.ArrayMap;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class t extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2063657095);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "2612854805172685265";
    }

    public boolean f(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("332ef922", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar != null && (e(eVar) instanceof JSONObject) && (e(eVar).get("eventId") instanceof String)) {
            return "2201".equals(e(eVar).getString("eventId"));
        }
        return false;
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (eVar.d() == null) {
        } else {
            if (eVar.d().getExtMap() != null && f(eVar)) {
                ArrayMap<String, Object> extMap = eVar.d().getExtMap();
                if (extMap.get("exposureCount" + e(eVar).getString("arg1")) != null) {
                    return;
                }
                ArrayMap<String, Object> extMap2 = eVar.d().getExtMap();
                extMap2.put("exposureCount" + e(eVar).getString("arg1"), 1);
            }
            c(eVar, "userTrack", e(eVar));
        }
    }
}
