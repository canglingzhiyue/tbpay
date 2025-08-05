package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import tb.his;
import tb.hit;
import tb.kge;
import tb.pqj;

/* loaded from: classes5.dex */
public class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(831769190);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == -1814481661) {
            super.a((com.alibaba.android.ultron.event.base.e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.a, com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        super.a(eVar);
        JSONObject d = d(eVar);
        String valueOf = String.valueOf(d.get("eventName"));
        String string = d.getString("args");
        HashMap<String, String> hashMap2 = new HashMap<>();
        try {
            hashMap = (HashMap) JSON.parseObject(string, HashMap.class);
        } catch (Throwable unused) {
            his.b("TaoLiveTrack", "args 转译失败");
            hashMap = hashMap2;
        }
        JSONObject jSONObject = (JSONObject) d.get("ultronItemData");
        if (jSONObject != null) {
            hashMap.putAll(hit.a((com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c) null, (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class)));
        }
        int a2 = l.a(d.getString("eventId"), 0);
        if (2201 != a2) {
            if (2101 != a2) {
                return;
            }
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a(valueOf, hashMap);
        } else if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.n()) {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().c(valueOf, hashMap);
        } else {
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().b(valueOf, hashMap);
        }
    }
}
