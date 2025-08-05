package com.taobao.android.detail.core.aura.wrapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bau;
import tb.emu;
import tb.god;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1744146402);
        emu.a("com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil");
    }

    public static IDMComponent a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("7129238c", new Object[]{jSONObject});
        }
        DMComponentWrapper dMComponentWrapper = new DMComponentWrapper();
        dMComponentWrapper.setFields(new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$1
            {
                put("locatorId", "detailHome");
                put("type", "detailHome");
            }
        });
        JSONObject e = e(jSONObject);
        JSONObject f = f(jSONObject);
        if (!bau.a(e) && !bau.a(f)) {
            dMComponentWrapper.addChildren(a(f, e.getJSONArray("detailInfoAura"), new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$2
                {
                    put("locatorId", "detailInfoAura");
                    put("type", "detailInfoAura");
                }
            }));
            JSONArray jSONArray = e.getJSONArray("divisonDesc");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                dMComponentWrapper.addChildren(a(f, jSONArray, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$3
                    {
                        put("type", "");
                    }
                }));
            }
            JSONArray jSONArray2 = e.getJSONArray("detailDesc");
            if (jSONArray2 == null) {
                jSONArray2 = e.getJSONArray("fliggyAuraDetailDesc");
            }
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                dMComponentWrapper.addChildren(a(f, jSONArray2, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$4
                    {
                        put("type", "");
                    }
                }));
            }
            JSONArray jSONArray3 = e.getJSONArray(com.taobao.android.detail.ttdetail.constant.a.DIVISION_RECOMMEND);
            if (jSONArray3 != null && !jSONArray3.isEmpty()) {
                dMComponentWrapper.addChildren(a(f, jSONArray3, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$5
                    {
                        put("type", "");
                    }
                }));
            }
            JSONArray jSONArray4 = e.getJSONArray("descRecmd");
            if (jSONArray4 == null) {
                jSONArray4 = e.getJSONArray("fliggyAuraDescRecmd");
            }
            if (jSONArray4 != null && !jSONArray4.isEmpty()) {
                dMComponentWrapper.addChildren(a(f, jSONArray4, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$6
                    {
                        put("type", "");
                    }
                }));
            }
            JSONArray jSONArray5 = e.getJSONArray("divisionEnd");
            if (jSONArray5 != null && !jSONArray5.isEmpty()) {
                dMComponentWrapper.addChildren(a(f, jSONArray5, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$7
                    {
                        put("type", "");
                    }
                }));
            }
        }
        return dMComponentWrapper;
    }

    public static IDMComponent h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("f8bf2165", new Object[]{jSONObject});
        }
        DMComponentWrapper dMComponentWrapper = new DMComponentWrapper();
        dMComponentWrapper.setFields(new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$8
            {
                put("locatorId", "detailHome");
                put("type", "detailHome");
            }
        });
        JSONObject e = e(jSONObject);
        JSONObject f = f(jSONObject);
        if (!bau.a(e) && !bau.a(f)) {
            JSONArray jSONArray = e.getJSONArray("detailInfoAura");
            if (god.n) {
                jSONArray.remove("detail3ShopSection");
                jSONArray.remove("detail3ShopDivisionSection");
                jSONArray.remove("shopSection");
            }
            dMComponentWrapper.addChildren(a(f, jSONArray, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$9
                {
                    put("locatorId", "detailInfoAura");
                    put("type", "detailInfoAura");
                }
            }));
        }
        return dMComponentWrapper;
    }

    public static IDMComponent b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("a919feab", new Object[]{jSONObject});
        }
        DMComponentWrapper dMComponentWrapper = new DMComponentWrapper();
        dMComponentWrapper.setFields(new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$10
            {
                put("type", "detailNavibar");
            }
        });
        JSONObject e = e(jSONObject);
        JSONObject f = f(jSONObject);
        if (!bau.a(e) && !bau.a(f)) {
            JSONArray jSONArray = e.getJSONArray("naviControl");
            if (jSONArray != null && !jSONArray.isEmpty()) {
                dMComponentWrapper.addChildren(a(f, jSONArray, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$11
                    {
                        put("type", "detailNavicontrol");
                    }
                }));
            }
            JSONArray jSONArray2 = e.getJSONArray("naviTabs");
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                dMComponentWrapper.addChildren(a(f, jSONArray2, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$12
                    {
                        put("type", "detailNaviTabs");
                    }
                }));
            }
        }
        return dMComponentWrapper;
    }

    public static IDMComponent c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("e10ad9ca", new Object[]{jSONObject});
        }
        JSONObject e = e(jSONObject);
        JSONObject f = f(jSONObject);
        if (!bau.a(e) && !bau.a(f)) {
            JSONArray jSONArray = e.getJSONArray("ttFloat");
            if (jSONArray != null && jSONArray.size() != 0) {
                DMComponentWrapper dMComponentWrapper = (DMComponentWrapper) a(f, jSONArray, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$13
                    {
                        put("type", "ttFloat");
                    }
                });
                String a2 = i.a("AliDetailTransformUtil", BTags.TTFloat);
                com.taobao.android.detail.core.utils.i.d(a2, "get ttFloat:" + JSON.toJSONString(dMComponentWrapper));
                return dMComponentWrapper;
            }
            com.taobao.android.detail.core.utils.i.a(i.a("AliDetailTransformUtil", BTags.TTFloat), "no ttFloat node");
        }
        return null;
    }

    public static IDMComponent d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("18fbb4e9", new Object[]{jSONObject});
        }
        JSONObject e = e(jSONObject);
        JSONObject f = f(jSONObject);
        if (!bau.a(e) && !bau.a(f)) {
            JSONArray jSONArray = e.getJSONArray("ttNaviBar");
            if (jSONArray != null && jSONArray.size() != 0) {
                DMComponentWrapper dMComponentWrapper = (DMComponentWrapper) a(f, jSONArray, new JSONObject() { // from class: com.taobao.android.detail.core.aura.wrapper.AliDetailTransformUtil$14
                    {
                        put("type", "ttNaviBar");
                    }
                });
                String a2 = i.a("AliDetailTransformUtil", BTags.TTNavBar);
                com.taobao.android.detail.core.utils.i.d(a2, "get ttNaviBar:" + JSON.toJSONString(dMComponentWrapper));
                return dMComponentWrapper;
            }
            com.taobao.android.detail.core.utils.i.a(i.a("AliDetailTransformUtil", BTags.TTNavBar), "no ttNaviBar node");
        }
        return null;
    }

    private static IDMComponent a(JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("90189844", new Object[]{jSONObject, jSONArray, jSONObject2});
        }
        DMComponentWrapper dMComponentWrapper = new DMComponentWrapper();
        dMComponentWrapper.setFields(jSONObject2);
        dMComponentWrapper.setChildren(a(jSONObject, jSONArray));
        return dMComponentWrapper;
    }

    private static JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("hierarchy");
        if (!bau.a(jSONObject2)) {
            return jSONObject2.getJSONObject("structure");
        }
        return null;
    }

    private static JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5ef769c3", new Object[]{jSONObject}) : jSONObject.getJSONObject("data");
    }

    private static List<IDMComponent> a(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cabb2797", new Object[]{jSONObject, jSONArray});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject((String) it.next());
            if (jSONObject2 != null) {
                arrayList.add(g(jSONObject2));
            }
        }
        return arrayList;
    }

    private static DMComponentWrapper g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponentWrapper) ipChange.ipc$dispatch("4d172bc1", new Object[]{jSONObject});
        }
        DMComponentWrapper dMComponentWrapper = new DMComponentWrapper();
        dMComponentWrapper.setFields(jSONObject.getJSONObject("fields"));
        dMComponentWrapper.setEvents(jSONObject.getJSONObject("events"));
        return dMComponentWrapper;
    }
}
