package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.LinkageType;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bga;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DMContextAction";

    static {
        kge.a(1667131224);
    }

    public static DMComponent a(b bVar, JSONObject jSONObject, String str) {
        boolean z;
        String[] a2;
        String F;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("3201be40", new Object[]{bVar, jSONObject, str});
        }
        if (jSONObject == null || bVar == null) {
            return null;
        }
        try {
            F = bVar.F();
        } catch (Exception e) {
            UnifyLog.a("Ultron-sdk", TAG, "parseComponents exception", e.getMessage());
            bga.a.a(TextUtils.isEmpty(bVar.h()) ? "ultron" : bVar.h(), "DMComponentUtils.createDMComponent", e);
        }
        if (F != null) {
            z = i.a(new BigInteger(F), i.FEATURE_TAG_ID);
            if (str != null && z && (a2 = com.taobao.android.ultron.datamodel.imp.delta.i.a(str)) != null && a2.length == 2) {
                jSONObject.put("tag", (Object) a2[0]);
                jSONObject.put("id", (Object) a2[1]);
            }
            String string = jSONObject.getString("type");
            jSONObject.getString("tag");
            DMComponent dMComponent = new DMComponent(jSONObject, b(bVar, string), bVar.j().get(string), a(bVar, jSONObject.getJSONObject("events")));
            dMComponent.setComponentKey(str);
            return dMComponent;
        }
        z = false;
        if (str != null) {
            jSONObject.put("tag", (Object) a2[0]);
            jSONObject.put("id", (Object) a2[1]);
        }
        String string2 = jSONObject.getString("type");
        jSONObject.getString("tag");
        DMComponent dMComponent2 = new DMComponent(jSONObject, b(bVar, string2), bVar.j().get(string2), a(bVar, jSONObject.getJSONObject("events")));
        dMComponent2.setComponentKey(str);
        return dMComponent2;
    }

    public static Map<String, List<com.taobao.android.ultron.common.model.b>> a(b bVar, JSONObject jSONObject) {
        com.taobao.android.ultron.common.model.b b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("32fd5633", new Object[]{bVar, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty() || bVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && (value instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) value;
                ArrayList arrayList = new ArrayList(jSONArray.size());
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof JSONObject) && (b = b(bVar, (JSONObject) next)) != null) {
                        arrayList.add(b);
                    }
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    public static com.taobao.android.ultron.common.model.b b(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.b) ipChange.ipc$dispatch("7a1b7806", new Object[]{bVar, jSONObject});
        }
        List<IDMComponent> list = null;
        if (jSONObject == null || jSONObject.isEmpty() || bVar == null) {
            return null;
        }
        String string = jSONObject.getString("type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        String string2 = jSONObject2 == null ? "" : jSONObject2.getString("nextRenderRoot");
        c t = bVar.t();
        if (!TextUtils.isEmpty(string2) && a(t)) {
            list = a(bVar, string2);
        }
        return new DMEvent(string, jSONObject2, list, jSONObject.getIntValue("option"));
    }

    public static List<IDMComponent> a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f6f358cb", new Object[]{bVar, str});
        }
        try {
            List<IDMComponent> a2 = a(bVar, str, (DMComponent) null);
            if (a2 == null || a2.isEmpty()) {
                UnifyLog.a(b.LOG_TAG, TAG, "getComponentsByRoot output is empty", "rootComponentKey:" + str);
            } else {
                com.taobao.android.ultron.datamodel.imp.delta.i.a(a2);
                a(bVar);
            }
            return a2;
        } catch (Throwable th) {
            bga.a.a(bVar == null ? "Ultron" : bVar.h(), "DMComponentUtils.getComponentsByRoot", th);
            return null;
        }
    }

    private static List<IDMComponent> a(b bVar, String str, DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7417bf7b", new Object[]{bVar, str, dMComponent});
        }
        ExtendBlock extendBlock = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject o = bVar.o();
        JSONObject w = bVar.w();
        JSONObject jSONObject = o != null ? o.getJSONObject(str) : null;
        Map<String, DMComponent> u = bVar.u();
        Map<String, DMComponent> v = bVar.v();
        DMComponent dMComponent2 = u.get(str);
        DMComponent dMComponent3 = (jSONObject == null || bVar.f("data")) ? dMComponent2 : null;
        if (!bVar.l() || jSONObject == null || dMComponent2 == null || !jSONObject.equals(dMComponent2.getData())) {
            dMComponent2 = dMComponent3;
        }
        if (dMComponent2 == null) {
            try {
                dMComponent2 = a(bVar, jSONObject, str);
            } catch (Throwable th) {
                UnifyLog.a(bVar.h(), TAG, "createDMComponent error", th.getMessage());
                bga.a.a(TextUtils.isEmpty(bVar.h()) ? "ultron" : bVar.h(), "DMComponentUtils.resolve", th);
            }
        } else {
            dMComponent2.getChildren().clear();
        }
        if (dMComponent2 != null) {
            dMComponent2.setParent(dMComponent);
            u.put(str, dMComponent2);
            v.put(str, dMComponent2);
        }
        String b = com.taobao.android.ultron.datamodel.imp.delta.i.b(dMComponent2, dMComponent);
        String a2 = com.taobao.android.ultron.datamodel.imp.delta.i.a(dMComponent2, dMComponent);
        if (dMComponent2 != null && dMComponent2.isExtendBlock()) {
            extendBlock = bVar.A().get(str);
            if (extendBlock == null) {
                extendBlock = new ExtendBlock(dMComponent2);
                bVar.A().put(str, extendBlock);
            } else {
                extendBlock.updateExtendBlock(dMComponent2);
            }
        }
        JSONArray jSONArray = w.getJSONArray(str);
        if (jSONArray == null) {
            if (dMComponent2 != null && dMComponent2.getFields() != null) {
                arrayList.add(dMComponent2);
                dMComponent2.setComponentCardGroupTag(b);
                dMComponent2.setComponentPosition(a2);
            }
        } else {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (dMComponent2 != null) {
                    String str2 = (String) next;
                    dMComponent2.setComponentCardGroupTag(b);
                    dMComponent2.setComponentPosition(a2);
                    List<IDMComponent> a3 = a(bVar, str2, dMComponent2);
                    if (extendBlock != null) {
                        extendBlock.addBlock(str2, a3);
                        extendBlock.addHierarchy(str2, bVar);
                    }
                    if (a3 != null) {
                        if (extendBlock == null) {
                            arrayList.addAll(a3);
                        }
                        if (u != null) {
                            DMComponent dMComponent4 = u.get(str2);
                            if (dMComponent2 != null && dMComponent4 != null) {
                                dMComponent2.addChild(dMComponent4);
                            }
                        }
                    }
                }
            }
            if (extendBlock != null) {
                arrayList.addAll(extendBlock.getblockComponentList());
            }
        }
        return arrayList;
    }

    public static String b(b bVar, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c1dbc3e5", new Object[]{bVar, str}) : (str == null || (jSONObject = bVar.j().get(str)) == null) ? "native" : jSONObject.getString("containerType");
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a0b2", new Object[]{bVar});
            return;
        }
        Map<String, DMComponent> u = bVar.u();
        JSONArray r = bVar.r();
        if (r == null) {
            r = new JSONArray();
            bVar.p().put("request", (Object) r);
        }
        Iterator<Object> it = r.iterator();
        while (it.hasNext()) {
            DMComponent dMComponent = u.get((String) it.next());
            if (dMComponent != null) {
                dMComponent.setLinkageType(LinkageType.REQUEST);
            }
        }
    }

    private static boolean a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9a1515", new Object[]{cVar})).booleanValue();
        }
        if (cVar != null) {
            return cVar.c();
        }
        return true;
    }
}
