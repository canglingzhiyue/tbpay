package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pqj;

/* loaded from: classes3.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1896623187);
        kge.a(226833213);
    }

    public Map<String, String> a(NetBaseOutDo netBaseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5dae8179", new Object[]{this, netBaseOutDo});
        }
        if (!(netBaseOutDo instanceof UltronServerConfigResponse)) {
            return null;
        }
        ServerConfigs mo1437getData = ((UltronServerConfigResponse) netBaseOutDo).mo1437getData();
        HashMap hashMap = new HashMap();
        if (mo1437getData == null) {
            return hashMap;
        }
        if (!StringUtils.isEmpty(mo1437getData.taolivegoodspage)) {
            JSONObject b = pqj.b(mo1437getData.taolivegoodspage);
            if (b != null) {
                a(b);
                mo1437getData.taolivegoodspage = b.toJSONString();
            }
            hashMap.put("taolivegoodspage", mo1437getData.taolivegoodspage);
        }
        if (!StringUtils.isEmpty(mo1437getData.taolivegoodspage2)) {
            JSONObject b2 = pqj.b(mo1437getData.taolivegoodspage2);
            if (b2 != null) {
                a(b2);
                mo1437getData.taolivegoodspage2 = b2.toJSONString();
            }
            hashMap.put("taolivegoodspage2", mo1437getData.taolivegoodspage2);
        }
        return hashMap;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            if (jSONObject2 == null || jSONObject3 == null) {
                return;
            }
            String string = jSONObject3.getString("root");
            if (StringUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("__nodeCode", (Object) string);
            jSONObject4.put("tag", (Object) string);
            if (jSONObject2.containsKey(string)) {
                return;
            }
            jSONObject2.put(string, (Object) jSONObject4);
        }
    }
}
