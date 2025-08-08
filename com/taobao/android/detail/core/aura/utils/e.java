package com.taobao.android.detail.core.aura.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ecf;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1912001763);
        emu.a("com.taobao.android.detail.core.aura.utils.AliDetailGoodsTagUtils");
    }

    public static void a(Context context, List<Boolean> list, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bae37bf", new Object[]{context, list, jSONObject});
            return;
        }
        try {
            if (list.size() <= 0 || jSONObject == null || jSONObject.getJSONObject("events") == null || jSONObject.getJSONObject("events").getJSONArray(AURAEventKey.exposureItem) == null) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("events").getJSONArray(AURAEventKey.exposureItem).getJSONObject(0).getJSONObject("fields").getJSONObject("args");
            String str = (String) jSONObject2.get("itemFeature");
            String a2 = a(str, (String) jSONObject2.get("itemFeatureSize"), list);
            String a3 = a(str, list);
            String a4 = a((String) jSONObject2.get("itemFeatureBizType"), list);
            Map<String, String> a5 = a(context);
            a5.put("detailVersion", "detailV3");
            a5.put("itemFeature", a3);
            a5.put("itemFeatureBizType", a4);
            a5.put("itemFeatureSize", a2);
            ecf.l(context, a5);
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a(j.a("AliDetailGoodsTagUtils"), "exposureItem 商品背书额外曝光", th);
        }
    }

    private static String a(String str, List<Boolean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e49249dd", new Object[]{str, list});
        }
        List<String> b = b(str, list);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < b.size(); i++) {
            if (i != 0) {
                stringBuffer.append(";");
            }
            stringBuffer.append(b.get(i));
        }
        return stringBuffer.toString();
    }

    private static String a(String str, String str2, List<Boolean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711bd9d3", new Object[]{str, str2, list});
        }
        List<String> b = b(str, list);
        return b.size() == 0 ? str2 : String.valueOf(b.size());
    }

    private static List<String> b(String str, List<Boolean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d997d163", new Object[]{str, list});
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(";");
        if (list.size() != split.length) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).booleanValue()) {
                arrayList.add(split[i]);
            }
        }
        return arrayList;
    }

    private static Map<String, String> a(Context context) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        if (!(context instanceof DetailCoreActivity) || (C = ((DetailCoreActivity) context).C()) == null) {
            return hashMap;
        }
        String i = C.i();
        if (!StringUtils.isEmpty(i)) {
            hashMap.put("item_id", i);
        }
        String h = C.h();
        if (!StringUtils.isEmpty(h)) {
            hashMap.put("seller_id", h);
        }
        return hashMap;
    }
}
