package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import java.util.Map;
import tb.eaz;
import tb.eyz;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLICK_UT_TYPE = 2101;
    public static final int CUSTOM_UT_TYPE = 19999;
    public static final int EXPOSE_UT_TYPE = 2201;
    public static final String PAGE_NAME = "Page_Detail";

    static {
        kge.a(-619087711);
    }

    public static JSONObject a(eyz eyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6daed9f2", new Object[]{eyzVar});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("detailVersion", (Object) "detailV3");
        if (eyzVar != null) {
            Params params = (Params) eyzVar.a(Params.class);
            if (params != null) {
                JSONObject trackEventParams = params.getTrackEventParams();
                if (trackEventParams != null) {
                    jSONObject.putAll(trackEventParams);
                }
                JSONObject umbParams = params.getUmbParams();
                if (umbParams != null) {
                    jSONObject.putAll(umbParams);
                    jSONObject.put("bizIdentifyParams", (Object) umbParams.getString("aliBizCode"));
                }
            }
            Item item = (Item) eyzVar.a(Item.class);
            if (item != null) {
                jSONObject.put("item_id", (Object) item.getItemId());
            }
            Seller seller = (Seller) eyzVar.a(Seller.class);
            if (seller != null) {
                jSONObject.put("seller_id", (Object) seller.getUserId());
                jSONObject.put("shop_id", (Object) seller.getShopId());
            }
        }
        jSONObject.put("user_id", (Object) ao.a());
        jSONObject.put("container_type", (Object) eaz.DINAMIC_MODULE_NAME);
        jSONObject.put("native_detail_v", (Object) "newArch");
        return jSONObject;
    }

    public static JSONObject a(Context context) {
        Intent intent;
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("58b28f80", new Object[]{context});
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null || (data = intent.getData()) == null) {
            return null;
        }
        final String queryParameter = data.getQueryParameter("fromtorelation");
        if (StringUtils.isEmpty(queryParameter)) {
            return null;
        }
        return new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.UtUtils$1
            {
                put("fromtorelation", (Object) queryParameter);
            }
        };
    }

    public static boolean a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb0bf6ef", new Object[]{new Integer(i), str, jSONObject})).booleanValue();
        }
        if (i == 2101) {
            str = "Page_Detail_Button_" + str;
        } else if (i == 2201) {
            str = "Page_Detail_Show_" + str;
        }
        return b(i, str, jSONObject);
    }

    public static boolean b(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f09ffff0", new Object[]{new Integer(i), str, jSONObject})).booleanValue() : a(i, str, null, null, jSONObject);
    }

    public static boolean a(int i, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fa992db", new Object[]{new Integer(i), str, str2, str3, jSONObject})).booleanValue();
        }
        AliUserTrackerInterface a2 = com.taobao.android.u.a();
        if (a2 == null) {
            return false;
        }
        a2.a("Page_Detail", i, str, str2, str3, a(jSONObject));
        if (i != 2101) {
            if (i == 2201) {
                odg.l().a("Page_Detail", str, null, null, a((Map<String, ? extends Object>) jSONObject));
            }
            return true;
        }
        odg.l().a("Page_Detail", str, (String) null, a((Map<String, ? extends Object>) jSONObject));
        return true;
    }

    public static String a(JSONObject jSONObject) {
        String key;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15c87a18", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && (key = entry.getKey()) != null) {
                Object value = entry.getValue();
                String valueOf = value != null ? String.valueOf(value) : "";
                sb.append(",");
                sb.append(key);
                sb.append("=");
                sb.append(valueOf);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public static String[] a(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        String[] strArr = new String[map.size()];
        int i = 0;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            strArr[i] = String.format("%s=%s", str, obj == null ? "" : obj.toString());
            i++;
        }
        return strArr;
    }
}
