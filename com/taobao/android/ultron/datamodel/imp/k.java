package com.taobao.android.ultron.datamodel.imp;

import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.ErrorConstants;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bga;
import tb.joe;
import tb.joo;
import tb.kge;

/* loaded from: classes6.dex */
public class k implements joe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2069915391);
        kge.a(1834840501);
    }

    @Override // tb.joe
    public JSONObject a(b bVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a841f102", new Object[]{this, bVar, iDMComponent});
        }
        if (bVar == null) {
            return null;
        }
        try {
            Map<String, DMComponent> v = bVar.v();
            if (v == null) {
                bga.a.a(bVar.h(), "SubmitModule.asyncRequestData", ErrorConstants.SUBMIT_COMPONENT_MAP_NULL.errorCode(), ErrorConstants.SUBMIT_COMPONENT_MAP_NULL.errorMessage());
                return null;
            }
            HashSet hashSet = new HashSet();
            if (iDMComponent != null) {
                hashSet.add(iDMComponent);
            }
            JSONArray s = bVar.s();
            if (s != null && !s.isEmpty()) {
                Iterator<Object> it = s.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (v.get(str) != null) {
                        hashSet.add(v.get(str));
                    }
                }
                return a(bVar, hashSet, iDMComponent, true);
            }
            return a(bVar, hashSet, iDMComponent, true);
        } catch (Throwable th) {
            bga.a.a(TextUtils.isEmpty(bVar.h()) ? "ultron" : bVar.h(), "SubmitModule.asyncRequestData", th);
            return null;
        }
    }

    @Override // tb.joe
    public JSONObject a(b bVar) {
        Map<String, DMComponent> v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b95903d2", new Object[]{this, bVar});
        }
        if (bVar == null || (v = bVar.v()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(v.size());
        for (DMComponent dMComponent : v.values()) {
            if (dMComponent.shouldSubmit()) {
                arrayList.add(dMComponent);
            }
        }
        return a(bVar, arrayList, null, false);
    }

    public JSONObject a(b bVar, Collection<?> collection, IDMComponent iDMComponent, boolean z) {
        JSONObject adjustData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("67a12dc3", new Object[]{this, bVar, collection, iDMComponent, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        boolean z2 = iDMComponent instanceof DMComponent;
        DMComponent dMComponent = z2 ? (DMComponent) iDMComponent : null;
        JSONObject b = b(bVar);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            DMComponent dMComponent2 = (DMComponent) it.next();
            if (!z) {
                adjustData = dMComponent2.submitData();
            } else {
                adjustData = dMComponent2.adjustData();
            }
            if (adjustData != null) {
                if (b != null) {
                    adjustData = joo.a(dMComponent, b, dMComponent2, adjustData);
                }
                jSONObject.put(dMComponent2.getKey(), (Object) adjustData);
            }
        }
        if (z2 && iDMComponent.getExtMap() != null && iDMComponent.getExtMap().containsKey("popupWindowNodes")) {
            Object obj = iDMComponent.getExtMap().get("popupWindowNodes");
            if (obj instanceof Map) {
                Map map = (Map) obj;
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject q = bVar.q();
        if (q != null) {
            JSONObject jSONObject3 = new JSONObject();
            String string = q.getString("validateParams");
            boolean booleanValue = q.getBooleanValue("compress");
            if (!z) {
                String string2 = q.getString("submitParams");
                if (string2 != null || string != null) {
                    if (string2 != null && !string2.isEmpty()) {
                        jSONObject3.put("submitParams", (Object) string2);
                    }
                    if (string != null && !string.isEmpty()) {
                        jSONObject3.put("validateParams", (Object) string);
                    }
                    jSONObject3.put("compress", (Object) Boolean.valueOf(booleanValue));
                    q = jSONObject3;
                }
                jSONObject2.put("common", (Object) q);
            } else {
                String string3 = q.getString("queryParams");
                if (string3 != null || string != null) {
                    if (string3 != null && !string3.isEmpty()) {
                        jSONObject3.put("queryParams", (Object) string3);
                    }
                    if (string != null && !string.isEmpty()) {
                        jSONObject3.put("validateParams", (Object) string);
                    }
                    jSONObject3.put("compress", (Object) Boolean.valueOf(booleanValue));
                    q = jSONObject3;
                }
                jSONObject2.put("common", (Object) q);
            }
        }
        String string4 = bVar.p().getString(SimpleProfile.KEY_SIGNATURE);
        if (string4 != null && !string4.isEmpty()) {
            jSONObject2.put(SimpleProfile.KEY_SIGNATURE, (Object) string4);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("structure", (Object) bVar.w());
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("data", (Object) jSONObject);
        jSONObject5.put("linkage", (Object) jSONObject2);
        jSONObject5.put("hierarchy", (Object) jSONObject4);
        JSONObject z3 = bVar.z();
        a(bVar, z3);
        jSONObject5.put(AURASubmitEvent.RPC_ENDPOINT, (Object) z3);
        if (iDMComponent != null) {
            jSONObject5.put("operator", (Object) iDMComponent.getKey());
            if (z2) {
                DMComponent dMComponent3 = (DMComponent) iDMComponent;
                if (!TextUtils.isEmpty(dMComponent3.getTriggerEvent())) {
                    jSONObject5.put("operatorEvent", (Object) dMComponent3.getTriggerEvent());
                }
            }
            if (z2 && !TextUtils.isEmpty(iDMComponent.getAdjustOperatorAction())) {
                jSONObject5.put("operatorAction", (Object) iDMComponent.getAdjustOperatorAction());
            }
            if (z2 && iDMComponent.getExtMap().containsKey("subOperator")) {
                jSONObject5.put("subOperator", iDMComponent.getExtMap().get("subOperator"));
            }
            jSONObject5.put("operatorTime", (Object) Long.valueOf(System.currentTimeMillis()));
        }
        return jSONObject5;
    }

    private void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0def87e", new Object[]{this, bVar, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("meta");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                jSONObject.put("meta", (Object) jSONObject2);
            }
            Object remove = jSONObject2.remove("template");
            if (remove instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) remove;
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("id", jSONObject3.get("id"));
                jSONObject4.put("version", jSONObject3.get("version"));
                jSONArray.add(jSONObject4);
                jSONObject2.put("templates", (Object) jSONArray.toJSONString());
                return;
            }
            List<ParseResponseHelper.TemplateInfo> a2 = ParseResponseHelper.a(bVar.E(), bVar.h());
            if (a2 == null) {
                return;
            }
            jSONObject2.put("templates", (Object) JSON.toJSONString(a2));
        }
    }

    private JSONObject b(b bVar) {
        JSONObject p;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("974c69b1", new Object[]{this, bVar});
        }
        if (bVar != null && (p = bVar.p()) != null && (jSONObject = p.getJSONObject("features")) != null && (jSONObject2 = jSONObject.getJSONObject("simplifyRules")) != null) {
            return jSONObject2.getJSONObject("data");
        }
        return null;
    }
}
