package com.taobao.android.detail.core.aura.utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.b;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.trade.event.Event;
import java.util.List;
import tb.atq;
import tb.bau;
import tb.elq;
import tb.elr;
import tb.emj;
import tb.emn;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PV_PATH = "pvPath";

    static {
        kge.a(1569269109);
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailSKUUtil");
    }

    public static String a(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] split2 = str2.split(":");
        if (split2.length != 2 || TextUtils.isEmpty(split2[0])) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : str.split(";")) {
            if (!TextUtils.isEmpty(str3)) {
                String[] split3 = str3.split(":");
                if (split3.length == 2 && TextUtils.equals(split3[0], split2[0])) {
                    str3 = str2;
                }
                sb.append(";");
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static boolean a(AURARenderComponent aURARenderComponent, b.a aVar, List<String> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("876ed1aa", new Object[]{aURARenderComponent, aVar, list})).booleanValue();
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null) {
            Object obj = aURARenderComponent.data.fields.get("skuContents");
            JSONObject jSONObject = null;
            JSONArray jSONArray = obj instanceof JSONArray ? (JSONArray) obj : null;
            if (jSONArray != null && !jSONArray.isEmpty()) {
                int i = -1;
                int i2 = -1;
                for (int i3 = 0; i3 < jSONArray.size(); i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    if (jSONObject2 != null) {
                        if (i2 == -1 && Boolean.parseBoolean(jSONObject2.getString("isSelected"))) {
                            i2 = i3;
                        }
                        String string = jSONObject2.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH);
                        boolean a2 = a(string, list);
                        if (a2 && aVar != null) {
                            aVar.a(string);
                        }
                        if (a2) {
                            jSONObject2.put("isSelected", (Object) Boolean.TRUE.toString());
                            i = i3;
                        } else {
                            jSONObject2.put("isSelected", (Object) Boolean.FALSE.toString());
                        }
                    }
                }
                aURARenderComponent.data.fields.put(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_SELECTED_INDEX, String.valueOf(Math.max(i, 0)));
                boolean z2 = (i != i2) | false;
                Object obj2 = aURARenderComponent.data.fields.get("mainImage");
                if (obj2 instanceof JSONObject) {
                    jSONObject = (JSONObject) obj2;
                }
                if (jSONObject == null) {
                    return z2;
                }
                boolean parseBoolean = Boolean.parseBoolean(jSONObject.getString("isSelected"));
                jSONObject.put("isSelected", (Object) (i != -1 ? Boolean.FALSE : Boolean.TRUE).toString());
                if (parseBoolean == Boolean.parseBoolean(jSONObject.getString("isSelected"))) {
                    z = false;
                }
                return z2 | z;
            }
        }
        return false;
    }

    public static boolean a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{str, list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return TextUtils.isEmpty(str);
        }
        for (String str2 : list) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        elq a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (!(context instanceof DetailCoreActivity) || (a2 = elr.a(((DetailCoreActivity) context).h)) == null || !(a2.b() instanceof RecyclerView)) {
            return false;
        }
        RecyclerView recyclerView = (RecyclerView) a2.b();
        atq atqVar = (atq) recyclerView.getAdapter();
        if (atqVar == null) {
            return false;
        }
        List<AURARenderComponent> a3 = atqVar.a();
        if (bau.a(a3)) {
            return false;
        }
        int b = emj.b(recyclerView);
        int size = a3.size();
        AURARenderComponent aURARenderComponent = null;
        if (TextUtils.equals(str, a((b < 0 || b >= size) ? null : a3.get(b)))) {
            return true;
        }
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            AURARenderComponent aURARenderComponent2 = a3.get(i);
            if (TextUtils.equals(str, a(aURARenderComponent2))) {
                aURARenderComponent = aURARenderComponent2;
                break;
            }
            i++;
        }
        int indexOf = a3.indexOf(aURARenderComponent);
        if (emj.a(recyclerView, false) != indexOf && indexOf >= 0 && indexOf < a3.size()) {
            emn.a(recyclerView, a3.get(indexOf), a3);
        }
        return true;
    }

    private static String a(AURARenderComponent aURARenderComponent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{aURARenderComponent});
        }
        if (aURARenderComponent != null && aURARenderComponent.data != null && aURARenderComponent.data.fields != null && (obj = aURARenderComponent.data.fields.get(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH)) != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public static void a(Context context, AURAEventIO aURAEventIO, String str) {
        com.taobao.android.trade.event.d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb52596", new Object[]{context, aURAEventIO, str});
        } else if (context == null || aURAEventIO == null || TextUtils.isEmpty(str) || !(context instanceof DetailCoreActivity) || aURAEventIO.getEventModel().c() == null) {
        } else {
            aURAEventIO.getEventModel().c().put(KEY_PV_PATH, (Object) str);
            Event a3 = d.a((DetailCoreActivity) context, aURAEventIO, d.ROUTE_TABLE);
            if (a3 == null || (a2 = com.taobao.android.trade.event.f.a(context)) == null) {
                return;
            }
            a2.a(a3);
        }
    }
}
