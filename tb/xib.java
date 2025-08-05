package tb;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.icart.core.data.model.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class xib {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUY_PARAM = "buyParam";
    public static final String CARTIDS = "cartIds";
    public static final String PURCHASE_FROM = "purchase_from";
    public static final int PURCHASE_FROM_CART = 1;

    static {
        kge.a(632374538);
    }

    public static boolean a(List<IDMComponent> list, bcb bcbVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60f9baec", new Object[]{list, bcbVar})).booleanValue();
        }
        if (list.size() > bem.z(bcbVar)) {
            z = false;
        }
        if (z) {
            for (IDMComponent iDMComponent : list) {
                z = a(iDMComponent);
            }
        }
        return z;
    }

    private static boolean a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e66567f0", new Object[]{iDMComponent})).booleanValue() : (iDMComponent == null || iDMComponent.getFields() == null || !iDMComponent.getFields().getBooleanValue("supportModalBuy")) ? false : true;
    }

    public static boolean a(jny jnyVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efbcbb07", new Object[]{jnyVar})).booleanValue();
        }
        if (jnyVar != null && jnyVar.c() != null && (jSONObject = jnyVar.c().getJSONObject("controlParas")) != null && jSONObject.containsKey("isSettlementAlone")) {
            return jSONObject.getBoolean("isSettlementAlone").booleanValue();
        }
        return false;
    }

    public static xia a(bcb bcbVar, List<IDMComponent> list) {
        CartGlobal.ControlParas controlParas;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (xia) ipChange.ipc$dispatch("baca460e", new Object[]{bcbVar, list});
        }
        xia xiaVar = new xia();
        xiaVar.a(false);
        CartGlobal m = bcbVar.m();
        if (m != null && (controlParas = m.getControlParas()) != null && (controlParas.getOrderByH5Urls() != null || controlParas.getOrderByNative() != null)) {
            HashSet hashSet = new HashSet();
            if (list == null) {
                return xiaVar;
            }
            xia xiaVar2 = null;
            Iterator<IDMComponent> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                IDMComponent next = it.next();
                if (next != null) {
                    String str = (String) bei.a(next, (Class<Object>) String.class, "exclude");
                    if (!TextUtils.isEmpty(str)) {
                        String b = b(str, controlParas);
                        String a2 = a(str, controlParas);
                        xia xiaVar3 = new xia();
                        xiaVar3.a(false);
                        if (b != null || a2 != null) {
                            xiaVar3.a(true);
                            xiaVar3.a(a2);
                            xiaVar3.b(b);
                            xiaVar2 = xiaVar3;
                        }
                        if (hashSet.size() > 0 && !hashSet.contains(xiaVar3)) {
                            z = false;
                            break;
                        }
                        hashSet.add(xiaVar3);
                    } else {
                        continue;
                    }
                }
            }
            return (!z || xiaVar2 == null) ? xiaVar : xiaVar2;
        }
        return xiaVar;
    }

    private static String b(String str, CartGlobal.ControlParas controlParas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eaa134c7", new Object[]{str, controlParas});
        }
        JSONObject orderByH5Urls = controlParas.getOrderByH5Urls();
        if (orderByH5Urls == null) {
            return null;
        }
        return orderByH5Urls.getString(str);
    }

    public static String a(String str, CartGlobal.ControlParas controlParas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa764e06", new Object[]{str, controlParas});
        }
        JSONObject orderByNative = controlParas.getOrderByNative();
        if (orderByNative == null) {
            return null;
        }
        return orderByNative.getString(str);
    }

    public static Bundle a(jny jnyVar, a aVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("8ddf64eb", new Object[]{jnyVar, aVar, str, jSONObject});
        }
        Bundle bundle = new Bundle();
        HashMap<String, Object> a2 = a(jnyVar, aVar, str);
        if (jSONObject != null) {
            Object obj = a2.get("exParams");
            JSONObject parseObject = obj instanceof String ? JSONObject.parseObject((String) obj) : new JSONObject();
            parseObject.putAll(jSONObject);
            a2.put("exParams", parseObject.toJSONString());
        }
        bundle.putSerializable("buildOrderParams", a2);
        bundle.putInt("purchase_from", 1);
        if (!TextUtils.isEmpty(aVar.d())) {
            bundle.putString("PRELOAD", aVar.d());
        }
        if (aVar.a()) {
            bundle.putString("pageType", PopStrategy.IDENTIFIER_FLOAT);
            bundle.putString("openFrom", "carts");
        }
        return bundle;
    }

    public static JSONObject a(bcb bcbVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("533d06d7", new Object[]{bcbVar, new Boolean(z), new Boolean(z2)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject o = bem.o(bcbVar);
        if (z) {
            jSONObject.put("cartIsLoading", (Object) Boolean.valueOf(z));
        }
        if (z2) {
            jSONObject.put("cartIsLocalCalculate", (Object) Boolean.valueOf(z2));
        }
        if (o != null && o.getString("traceId") != null) {
            jSONObject.put("cartTraceId", (Object) o.getString("traceId"));
        }
        JSONObject C = bem.C(bcbVar);
        if (C != null) {
            jSONObject.putAll(C);
        }
        return jSONObject;
    }

    private static HashMap<String, Object> a(jny jnyVar, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9269ed4c", new Object[]{jnyVar, aVar, str});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        if (a(jnyVar)) {
            hashMap.put("buyParam", aVar.c());
            hashMap.put("isSettlementAlone", "true");
        } else {
            hashMap.put("cartIds", aVar.b());
        }
        if (str != null) {
            hashMap.put("exParams", "{\"novad\":\"" + str + "\"}");
        }
        return hashMap;
    }
}
