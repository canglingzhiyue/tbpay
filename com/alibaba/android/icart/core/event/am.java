package com.alibaba.android.icart.core.event;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;
import tb.bea;
import tb.dcm;
import tb.kge;

/* loaded from: classes2.dex */
public class am {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1203124150);
    }

    public static String a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48770d63", new Object[]{iDMComponent, list});
        }
        if (!bea.o() || list.size() != 1) {
            return null;
        }
        try {
            JSONObject b = b(iDMComponent, list);
            if (b == null) {
                UnifyLog.d("PurchasePreload", "preloadProtocol is empty !!");
                return null;
            }
            String a2 = a();
            dcm.a().a(a2, b);
            return a2;
        } catch (Throwable th) {
            UnifyLog.d("PurchasePreload", "buildPurchasePreloadProtocol exception" + th.toString());
            return null;
        }
    }

    private static JSONObject b(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e3b7511c", new Object[]{iDMComponent, list});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            IDMComponent a2 = a(iDMComponent);
            if (a2 == null) {
                UnifyLog.d("PurchasePreload", "headComponent is empty !!");
                return null;
            }
            jSONObject.put("header", (Object) a(a2, true));
            JSONArray jSONArray = new JSONArray();
            for (IDMComponent iDMComponent2 : list) {
                jSONArray.add(a(iDMComponent2, false));
            }
            jSONObject.put("item", (Object) jSONArray);
            jSONObject.put("submit", (Object) a(iDMComponent, false));
            return jSONObject;
        } catch (Throwable th) {
            UnifyLog.d("PurchasePreload", "buildPurchasePreloadProtocol exception" + th.toString());
            return null;
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        return "iCart_" + System.currentTimeMillis();
    }

    private static JSONObject a(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8b0b5388", new Object[]{iDMComponent, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fields", (Object) iDMComponent.getFields());
        if (z) {
            jSONObject.put("events", (Object) iDMComponent.getEvents());
        }
        return jSONObject;
    }

    private static IDMComponent a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("dff6e5f0", new Object[]{iDMComponent});
        }
        List<IDMComponent> children = b(iDMComponent).getChildren();
        IDMComponent a2 = a(children, "headerCard_1");
        if (a2 != null) {
            return a(a2.getChildren(), "header_1");
        }
        return a(children, "iCartHeader_1");
    }

    private static IDMComponent a(List<IDMComponent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("14b9cf67", new Object[]{list, str});
        }
        if (list == null || list.size() == 0) {
            UnifyLog.d("PurchasePreload", "allList is empty !!");
            return null;
        }
        for (IDMComponent iDMComponent : list) {
            if (str.equals(iDMComponent.getKey())) {
                return iDMComponent;
            }
        }
        return null;
    }

    private static IDMComponent b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("2071fb8f", new Object[]{iDMComponent});
        }
        IDMComponent parent = iDMComponent.getParent();
        return parent != null ? b(parent) : iDMComponent;
    }
}
