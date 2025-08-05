package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.utils.al;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.eaz;
import tb.ecd;
import tb.eyx;
import tb.eyz;
import tb.kge;
import tb.odg;
import tb.sdc;

/* loaded from: classes5.dex */
public class al {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(210672723);
    }

    public static void a(Context context, String str) {
        AliUserTrackerInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (TextUtils.isEmpty(str) || context == null || (a2 = com.taobao.android.u.a()) == null) {
        } else {
            a2.a(context, str);
            a2.b(context, str);
        }
    }

    public static void a(Context context) {
        AliUserTrackerInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null || (a2 = com.taobao.android.u.a()) == null) {
        } else {
            a2.a(context);
        }
    }

    public static void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{context, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                hashMap.put(entry.getKey(), value != null ? String.valueOf(value) : "");
            }
        }
        a(context, hashMap);
    }

    public static void a(Context context, Map<String, String> map) {
        AliUserTrackerInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (context == null || (a2 = com.taobao.android.u.a()) == null) {
        } else {
            if (map == null) {
                map = new HashMap<>();
            }
            b(context, map);
            map.put("container_type", eaz.DINAMIC_MODULE_NAME);
            map.put("native_detail_v", "newArch");
            map.put("spm-cnt", odg.s().a());
            a2.a(context, map);
            try {
                odg.l().a("Page_Detail", context, map);
            } catch (Throwable unused) {
            }
        }
    }

    private static void b(Context context, Map<String, String> map) {
        eyx c;
        eyz a2;
        Params params;
        JSONObject umbParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
        } else if ((context instanceof sdc) && (c = ((sdc) context).c()) != null && (a2 = c.a()) != null && (params = (Params) a2.a(Params.class)) != null && (umbParams = params.getUmbParams()) != null) {
            map.put("bizIdentifyParams", umbParams.getString("aliBizCode"));
            for (Map.Entry<String, Object> entry : umbParams.entrySet()) {
                Object value = entry.getValue();
                map.put(entry.getKey(), value != null ? String.valueOf(value) : "");
            }
        }
    }

    public static void a(Context context, com.taobao.android.detail.ttdetail.request.params.a aVar) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdca6556", new Object[]{context, aVar});
        } else if (aVar == null || (b = aVar.b()) == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(b);
            jSONObject.put("object_type", (Object) "item_id");
            jSONObject.put(ecd.K_EFFECT_AD_TYPE, (Object) ecd.V_EFFECT_AD_TYPE);
            jSONObject.put("item_id", (Object) aVar.e());
            jSONObject.put("object_id", (Object) aVar.e());
            jSONObject.put("clickid", (Object) aVar.c());
            jSONObject.put("list_param", (Object) b.getString("list_param"));
            jSONObject.put("list_type", (Object) b.getString("list_type"));
            jSONObject.put(ecd.K_EFFECT_BDID, (Object) b.getString(ecd.K_EFFECT_BDID));
            jSONObject.put("carrier_id", (Object) b.getString("carrier_id"));
            if (aVar.d()) {
                jSONObject.put("action", (Object) ecd.V_EFFECT_ACTION_SECKILL);
            } else {
                jSONObject.put("action", (Object) "ipv");
            }
            a(context, jSONObject);
        }
    }

    public static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{str, context});
        } else {
            odg.g().a(str, context);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10957a;
        public String b;
        public String c;
        public boolean d;
        public String e;
        public Map<String, String> f;

        static {
            kge.a(1695121480);
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f9096c6a", new Object[]{this, str});
            }
            this.f10957a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ea5afbeb", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dbac8b6c", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("161d5e24", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ccfe1aed", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("def58f15", new Object[]{this, map});
            }
            this.f = map;
            return this;
        }
    }

    private static a b(JSONObject jSONObject, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d63117b8", new Object[]{jSONObject, uri});
        }
        a aVar = new a();
        Seller seller = (Seller) aj.a(jSONObject, Seller.class);
        aVar.b(d.b(seller, ""));
        aVar.c(d.a(seller, ""));
        aVar.a(d.b((Item) aj.a(jSONObject, Item.class), ""));
        aVar.a(d.a(seller));
        aVar.d(uri == null ? null : uri.toString());
        Params params = (Params) aj.a(jSONObject, Params.class);
        if (params != null) {
            final String cpsParams = params.getCpsParams();
            if (!TextUtils.isEmpty(cpsParams)) {
                aVar.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.utils.IpvUtils$1
                    {
                        put("cpsParams", cpsParams);
                    }
                });
            }
        }
        return aVar;
    }

    public static void a(JSONObject jSONObject, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17741abf", new Object[]{jSONObject, uri});
        } else {
            a(b(jSONObject, uri));
        }
    }

    private static a b(eyz eyzVar, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("73abbd0c", new Object[]{eyzVar, uri});
        }
        a aVar = new a();
        Seller seller = (Seller) eyzVar.a(Seller.class);
        aVar.b(d.b(seller, ""));
        aVar.c(d.a(seller, ""));
        aVar.a(d.b((Item) eyzVar.a(Item.class), ""));
        aVar.a(d.a(seller));
        aVar.d(uri == null ? null : uri.toString());
        Params params = (Params) eyzVar.a(Params.class);
        if (params != null) {
            final String cpsParams = params.getCpsParams();
            if (!TextUtils.isEmpty(cpsParams)) {
                aVar.a(new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.utils.IpvUtils$2
                    {
                        put("cpsParams", cpsParams);
                    }
                });
            }
        }
        return aVar;
    }

    public static void a(eyz eyzVar, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ebdcb5", new Object[]{eyzVar, uri});
        } else {
            a(b(eyzVar, uri));
        }
    }

    private static void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ef26e0", new Object[]{aVar});
        } else if (TextUtils.isEmpty(aVar.c)) {
        } else {
            i.a("IpvUtils", "sendDuJuanInfo() itemId = " + aVar.f10957a + " ,shopId = " + aVar.b + " ,sellerId = " + aVar.c + " ,isTmall = " + aVar.d + " ,url = " + aVar.e);
            HashMap hashMap = new HashMap();
            if (aVar.f != null) {
                hashMap.putAll(aVar.f);
            }
            hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, "");
            try {
                String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
                if (!TextUtils.isEmpty(globalProperty)) {
                    hashMap.put(com.taobao.flowcustoms.afc.utils.b.AFC_ID, globalProperty);
                }
            } catch (Throwable unused) {
            }
            try {
                AlimamaAdvertising.instance().commitTaokeInfo(aVar.e, aVar.c, aVar.f10957a, aVar.d, hashMap);
            } catch (Throwable unused2) {
            }
            try {
                AlimamaAdvertising.instance().uploadUDTrack(aVar.e, aVar.c, aVar.f10957a, aVar.d, hashMap);
            } catch (Throwable unused3) {
            }
            m.b(2101, "Page_Detail_Advert-SDKCall", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.utils.IpvUtils$3
                {
                    put("shop_id", (Object) al.a.this.b);
                    put("seller_id", (Object) al.a.this.c);
                    put("item_id", (Object) al.a.this.f10957a);
                    put("is_tmall", (Object) ("" + al.a.this.d));
                    put("native_detail_v", "newArch");
                }
            });
        }
    }
}
