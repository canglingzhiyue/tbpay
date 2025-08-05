package com.taobao.search.jarvis.rcmd;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslSearchResult;
import com.taobao.android.weex_ability.mtop.a;
import java.util.HashMap;
import java.util.Map;
import tb.isv;
import tb.kge;

/* loaded from: classes7.dex */
public class d implements a.InterfaceC0616a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1618440563);
        kge.a(674870314);
    }

    public static /* synthetic */ void a(d dVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5b70a6", new Object[]{dVar, jSONObject, jSONObject2});
        } else {
            dVar.a(jSONObject, jSONObject2);
        }
    }

    @Override // com.taobao.android.weex_ability.mtop.a.InterfaceC0616a
    public a.b a(String str, final JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("42053fdf", new Object[]{this, str, jSONObject});
        }
        final a.b bVar = null;
        if (!TextUtils.isEmpty(str) && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && jSONObject2.containsKey("appId")) {
            HashMap hashMap = new HashMap();
            hashMap.put("appId", jSONObject2.getString("appId"));
            String string = jSONObject2.getString("params");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            JSONObject parseObject = JSONObject.parseObject(string);
            HashMap hashMap2 = new HashMap();
            Map<String, Object> innerMap = parseObject.getInnerMap();
            if (innerMap == null) {
                return null;
            }
            for (Map.Entry<String, Object> entry : innerMap.entrySet()) {
                if (entry.getValue() instanceof String) {
                    hashMap2.put(entry.getKey(), (String) entry.getValue());
                }
            }
            final XslDatasource a2 = com.taobao.android.searchbaseframe.xsl.f.a().a(str, jSONObject.getString("api"), jSONObject.getString("v"), hashMap, hashMap2);
            if (a2 == null) {
                return null;
            }
            bVar = new a.b();
            if (a2.getTotalSearchResult() != 0) {
                if (((XslSearchResult) a2.getTotalSearchResult()).getCurrentData() != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("data", (Object) ((XslSearchResult) a2.getTotalSearchResult()).getCurrentData());
                    a(jSONObject3, jSONObject);
                    bVar.f15946a = jSONObject3;
                }
            } else {
                a2.subscribe(new Object() { // from class: com.taobao.search.jarvis.rcmd.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public void onEventMainThread(isv.a aVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4a0bf04c", new Object[]{this, aVar});
                        } else if (bVar.a() == null) {
                        } else {
                            if (((XslSearchResult) a2.getTotalSearchResult()).getCurrentData() == null) {
                                bVar.a().a(null);
                                return;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("data", (Object) ((XslSearchResult) a2.getTotalSearchResult()).getCurrentData());
                            d.a(d.this, jSONObject4, jSONObject);
                            bVar.a().a(jSONObject4);
                        }
                    }
                });
            }
        }
        return bVar;
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        jSONObject.put("code", "200");
        jSONObject.put("v", (Object) jSONObject2.getString("v"));
        jSONObject.put("api", jSONObject2.get("api"));
        jSONObject.put("isPreload", "true");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("SUCCESS::调用成功");
        jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, (Object) jSONArray);
    }
}
