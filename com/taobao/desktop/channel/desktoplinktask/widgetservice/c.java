package com.taobao.desktop.channel.desktoplinktask.widgetservice;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.b;
import java.util.List;
import tb.kge;
import tb.kgz;
import tb.khm;
import tb.khw;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f16955a;

        static {
            kge.a(-1743356242);
            f16955a = new c();
        }

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8e9d4b3e", new Object[0]) : f16955a;
        }
    }

    static {
        kge.a(325315547);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8e9d4b3e", new Object[0]) : a.a();
    }

    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            for (JSONObject jSONObject : list) {
                a(jSONObject);
            }
        }
    }

    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!jSONObject.getBooleanValue("success") || (jSONObject2 = jSONObject.getJSONObject(b.TAK_ABILITY_MATCH_CONTENT)) == null) {
        } else {
            String string = jSONObject2.getString("bizCode");
            if (StringUtils.isEmpty(string) || !c(jSONObject2)) {
                return;
            }
            khw.a(khm.a().b()).a(b(string), jSONObject.toJSONString());
        }
    }

    public JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        Object b = khw.a(khm.a().b()).b(b(str), "");
        if (b instanceof String) {
            String str2 = (String) b;
            if (!StringUtils.isEmpty(str2)) {
                JSONObject parseObject = JSONObject.parseObject(str2);
                if (!parseObject.isEmpty()) {
                    return parseObject;
                }
            }
        }
        return null;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return "float_window_data_" + str;
    }

    public JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            kgz.a("Fetcher.fetchDSL.Mtop.responseContent=%s", jSONObject);
            JSONObject jSONObject3 = jSONObject.getJSONObject("contentMap");
            if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("androidFloatWindow")) != null && jSONObject2.getBooleanValue("success") && (jSONArray = jSONObject2.getJSONArray("content")) != null && !jSONArray.isEmpty()) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(0);
                if (jSONObject4.getBooleanValue("success")) {
                    return jSONObject4;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            kgz.a("DSLFetcher.fetchDSL.MTOP.parseObject.responseContent.error.", th);
            return null;
        }
    }

    private boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue() : jSONObject != null && jSONObject.containsKey("bizCode") && jSONObject.containsKey("dslContent") && jSONObject.containsKey("style");
    }
}
