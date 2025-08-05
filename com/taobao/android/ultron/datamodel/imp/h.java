package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-3852331);
    }

    public static boolean a(JSONObject jSONObject, b bVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6c8dd96", new Object[]{jSONObject, bVar})).booleanValue();
        }
        if (jSONObject == null || bVar == null || !bVar.I()) {
            return false;
        }
        String string = jSONObject.getString("type");
        return !TextUtils.isEmpty(string) && (jSONObject2 = bVar.j().get(string)) != null && "popup_window".equals(jSONObject2.getString("name"));
    }

    public static void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0def87e", new Object[]{bVar, jSONObject});
        } else if (bVar == null || jSONObject == null) {
        } else {
            a(jSONObject, c(bVar, jSONObject), true);
        }
    }

    public static void b(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1584e7f", new Object[]{bVar, jSONObject});
        } else if (bVar == null || jSONObject == null || !a(jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT))) {
        } else {
            a(jSONObject, c(bVar, jSONObject), false);
            b(jSONObject);
        }
    }

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue() : jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("protocolVersion")) && jSONObject.getString("protocolVersion").compareTo("4.0") >= 0 && jSONObject.getJSONObject("umfVersions") != null;
    }

    private static void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("hierarchy");
        if (jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("structure")) == null || TextUtils.isEmpty(jSONObject4.getString("root")) || (jSONObject3 = jSONObject.getJSONObject("data")) == null) {
            return;
        }
        for (String str : jSONObject2.keySet()) {
            JSONArray jSONArray = jSONObject2.getJSONArray(str);
            if (jSONArray != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        String str2 = (String) next;
                        if (!jSONObject3.keySet().contains(str2)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("tag", (Object) str2);
                            jSONObject5.put("id", (Object) str2);
                            String[] split = str2.split("_");
                            if (split != null && split.length <= 2) {
                                if (split.length > 0) {
                                    jSONObject5.put("tag", (Object) split[0]);
                                }
                                if (split.length > 1) {
                                    jSONObject5.put("id", (Object) split[1]);
                                }
                            }
                            jSONObject3.put(str2, (Object) jSONObject5);
                        }
                    }
                }
            }
        }
    }

    private static void a(JSONObject jSONObject, JSONArray jSONArray, boolean z) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73029424", new Object[]{jSONObject, jSONArray, new Boolean(z)});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("data");
        if (jSONObject3 == null) {
            return;
        }
        for (String str : jSONObject3.keySet()) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject(str);
            if (jSONObject4 != null) {
                if (!z) {
                    a(jSONObject4, str);
                }
                JSONObject jSONObject5 = jSONObject4.getJSONObject("features");
                if (jSONObject5 != null && (jSONObject2 = jSONObject5.getJSONObject("linkage")) != null) {
                    if (!z) {
                        JSONObject jSONObject6 = jSONObject.getJSONObject("linkage");
                        if (jSONObject6 == null) {
                            jSONObject.put("linkage", (Object) new JSONObject());
                        }
                        if (jSONObject6.getJSONArray("input") == null) {
                            jSONObject6.put("input", (Object) new JSONArray());
                        }
                        JSONArray jSONArray2 = jSONObject6.getJSONArray("input");
                        if (!jSONArray2.contains(str) && jSONObject2.getBooleanValue("input")) {
                            jSONArray2.add(str);
                        }
                    }
                    if (jSONObject2.getBooleanValue("submit")) {
                        jSONObject4.put("submit", "true");
                    }
                    if (jSONObject2.containsKey("ref")) {
                        jSONObject4.put("ref", (Object) jSONObject2.getString("ref"));
                    }
                    if (jSONObject2.containsKey("validate")) {
                        jSONObject4.put("validate", (Object) JSONObject.parseObject(jSONObject2.getJSONObject("validate").toJSONString()));
                    }
                    if (jSONObject2.containsKey("hidden")) {
                        jSONObject4.put("hidden", (Object) JSONObject.parseObject(jSONObject2.getJSONObject("hidden").toJSONString()));
                    }
                    a(jSONObject4, str);
                    if (jSONArray != null && jSONArray.contains(jSONObject4.getString("type"))) {
                        jSONObject4.put("cardGroup", "true");
                    }
                }
            }
        }
    }

    private static void a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{jSONObject, str});
        } else if (!TextUtils.isEmpty(jSONObject.getString("tag")) && !TextUtils.isEmpty(jSONObject.getString("id"))) {
        } else {
            jSONObject.put("tag", (Object) str);
            jSONObject.put("id", (Object) str);
            String[] split = str.split("_");
            if (split == null || split.length > 2) {
                return;
            }
            if (split.length > 0) {
                jSONObject.put("tag", (Object) split[0]);
            }
            if (split.length <= 1) {
                return;
            }
            jSONObject.put("id", (Object) split[1]);
        }
    }

    private static JSONArray c(b bVar, JSONObject jSONObject) {
        List<com.taobao.android.ultron.common.model.a> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("5598e5be", new Object[]{bVar, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("container");
        if (jSONObject2 != null) {
            JSONArray jSONArray = jSONObject2.getJSONArray("data");
            d = jSONArray != null ? JSONObject.parseArray(jSONArray.toJSONString(), com.taobao.android.ultron.common.model.a.class) : null;
        } else {
            d = bVar.d();
        }
        if (d != null) {
            for (com.taobao.android.ultron.common.model.a aVar : d) {
                if (aVar != null && "card".equalsIgnoreCase(aVar.c)) {
                    return aVar.f15730a;
                }
            }
        }
        return null;
    }
}
