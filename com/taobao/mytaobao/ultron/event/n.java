package com.taobao.mytaobao.ultron.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes7.dex */
public class n implements com.alibaba.android.ultron.event.base.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "removePathData";

    static {
        kge.a(1151542118);
        kge.a(-750523774);
    }

    @Override // com.alibaba.android.ultron.event.base.d
    public void b(e eVar) {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            JSONObject a2 = a(eVar);
            IDMComponent d = eVar.d();
            if (a2 == null || d == null || !a2.containsKey("path") || (fields = d.getFields()) == null || !a(fields, b(a2.getString("path")))) {
                return;
            }
            d.writeBackFields(fields, true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(d);
            eVar.h().a(arrayList);
        }
    }

    private boolean a(JSONObject jSONObject, String[] strArr) {
        Object obj;
        boolean z;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b724c9b", new Object[]{this, jSONObject, strArr})).booleanValue();
        }
        if (strArr != null && strArr.length > 0) {
            Object obj3 = jSONObject;
            int i = 0;
            while (i < strArr.length) {
                String str = strArr[i];
                if (i == strArr.length - 1) {
                    if (obj3 instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj3;
                        if (jSONObject2.containsKey(str)) {
                            jSONObject2.remove(str);
                            return true;
                        }
                    }
                    if (!(obj3 instanceof JSONArray)) {
                        return false;
                    }
                    int a2 = a(str);
                    JSONArray jSONArray = (JSONArray) obj3;
                    if (a2 == -1) {
                        return false;
                    }
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                        if (jSONObject3 != null && jSONObject3.containsKey("index") && a2 == jSONObject3.getInteger("index").intValue()) {
                            jSONArray.remove(jSONObject3);
                            return true;
                        }
                    }
                    jSONArray.mo1572remove(a2);
                    return true;
                }
                if (obj3 instanceof JSONObject) {
                    obj2 = ((JSONObject) obj3).get(str);
                } else if (!(obj3 instanceof JSONArray)) {
                    break;
                } else {
                    int a3 = a(str);
                    JSONArray jSONArray2 = (JSONArray) obj3;
                    if (a3 == -1) {
                        return false;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= jSONArray2.size()) {
                            obj = obj3;
                            z = false;
                            break;
                        }
                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                        if (jSONObject4 != null && jSONObject4.containsKey("index") && a3 == jSONObject4.getInteger("index").intValue()) {
                            z = true;
                            obj = jSONObject4;
                            break;
                        }
                        i3++;
                    }
                    if (!z) {
                        obj = ((JSONArray) obj).get(a3);
                    }
                    obj2 = obj;
                }
                i++;
                obj3 = obj2;
            }
        }
        return false;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return -1;
        }
    }

    private String[] b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("39a26282", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
            return str.split("\\.");
        }
        return null;
    }

    private JSONObject a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8b1423", new Object[]{this, eVar});
        }
        Object i = eVar.i();
        if (i instanceof com.taobao.android.ultron.common.model.b) {
            return ((com.taobao.android.ultron.common.model.b) i).getFields();
        }
        if (!(i instanceof JSONObject)) {
            return null;
        }
        return ((JSONObject) i).getJSONObject("fields");
    }

    public static void a(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5bb8b5a", new Object[]{jSONArray, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", (Object) EVENT_TYPE);
        jSONObject.put("type", (Object) EVENT_TYPE);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("path", (Object) str);
        jSONObject.put("fields", (Object) jSONObject2);
        jSONArray.add(jSONObject);
    }
}
