package com.taobao.android.address.wrapper;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.f;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NEEDFULLADDRESSINFO = "needFullAddressInfo";
    public static final String K_COMMON_ADDRESS_DATA = "data";
    public static final String K_COMMON_ADDRESS_URL = "common_address_url";
    public static final String K_DELIVERY_ID = "deliverId";
    public static final String K_SOURCE = "source";

    /* renamed from: a  reason: collision with root package name */
    public static Context f8984a = null;
    public static String b = "https://market.m.taobao.com/app/vip/receiver-address/pages/change?wh_weex=true";
    public static String c = "https://market.m.taobao.com/app/vip/receiver-address-weex/pages/v6-list?wh_weex=true&wx_navbar_hidden=true&switch=0220100";
    public static String d = "https://market.m.taobao.com/app/vip/receiver-address/pages/address?wh_weex=true&wx_navbar_hidden=true&newuser=true&voiceMode=true&isUnfrequent=true";
    public static String e = "https://market.m.taobao.com/app/vip/receiver-address-weex/pages/v6-map?first=true";
    public static String f = "https://market.m.taobao.com/app/vip/receiver-address-weex/pages/v6-list2?wh_weex=true&wx_navbar_hidden=true";
    public static String g = "agencyReceive";
    public static String h = "agencyReceiveH5Url";
    public static String i = "agencyReceiveHelpUrl";
    public static String j = "supportStation";
    public static String k = "abroadStation";
    public static String l = "sites";
    public static String m = "needChangeKinship";
    public static String n = "relationId";
    public static String o = "sellerID";
    public static String p = "deliverAddrList";
    public static String q = "accurateAddressInfo";
    public static String r = "bizcode";
    public static AddressParams s = null;
    public static boolean t = false;
    public static Map<String, Object> u = null;
    public static String v = null;
    public static String w = "extNativeJson";
    public static String x = "extUrlJson";

    public static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        u = map;
        v = null;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        u = null;
        v = str;
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (s != null) {
                jSONObject.put(K_DELIVERY_ID, s.deliverId);
                jSONObject.put(g, s.agencyReceive);
                jSONObject.put(h, s.agencyReceiveH5Url);
                jSONObject.put(i, s.agencyReceiveHelpUrl);
                jSONObject.put(k, s.abroadStation);
                jSONObject.put(j, s.supportStation);
                jSONObject.put(m, s.needChangeKinship);
                jSONObject.put(n, s.relationId);
                jSONObject.put("source", s.source);
                jSONObject.put(l, s.sites);
                jSONObject.put("extMap", s.extMap);
                jSONObject.put(o, s.sellerID);
                jSONObject.put(p, s.deliverAddrList);
                jSONObject.put(q, s.accurateAddressInfo);
                jSONObject.put(r, s.bizcode);
                if (s.extNativeJson != null) {
                    jSONObject.put(w, s.extNativeJson);
                }
                if (s.extUrlJson != null) {
                    jSONObject.put(x, s.extUrlJson);
                }
            }
        } catch (Throwable th) {
            AdapterForTLog.loge(f.TAG, "getAddressParamsJson fail", th);
        }
        return jSONObject;
    }
}
