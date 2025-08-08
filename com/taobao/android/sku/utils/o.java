package com.taobao.android.sku.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.android.AliUserTrackerInterface;
import com.taobao.android.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bga;
import tb.bpp;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASS_NAME = "com.taobao.android.sku.utils.SkuLogUtils";
    public static final String DEFAULT_BIZ_NAME = "taobao_sku";
    public static final String KEY_BUNDLE_URL = "bundleUrl";
    public static final String KEY_COST_TIME = "costTime";
    public static final String KEY_INSTANCE_ID = "instanceId";
    public static final String LOG_TRACE_MODULE = "new_buy";
    public static final String LOG_TRACE_MODULE_SKU_V3 = "sku3";
    public static final String PAGE_NAME = "Page_New_SKU";
    public static final String P_BUY_BTN_CLICK = "buyBtnClick";
    public static final String P_CART_BTN_CLICK = "cartBtnClick";
    public static final String P_SKUBAR_BTN_CLICK = "skuBarBtnClick";
    public static final String P_SKU_INIT = "skuInit";
    public static final String P_WEEX_NEW = "weexNew";
    public static final String P_WEEX_RENDER = "weexRender";
    public static final String SPM = "a2141.7631564.newsku";
    public static final String TYPE_SKU_H5 = "web";
    public static final String TYPE_SKU_NATIVE = "native";
    public static final String TYPE_SKU_NEWBUY = "newbuy";
    public static final String TYPE_SKU_UNKNOWN = "unknown";
    public static final String TYPE_SKU_V3 = "v3";
    public static final String UM_DOWNGRADE_E = "UME_SKU_001";
    public static final String UM_HEAD_GALLERY_E = "UME_HEAD_GALLERY";
    public static final String UM_NEWBUY_E_PREFIX = "UME_NEWBUY_E_";
    public static final String UM_PATCH_BASE_E = "UME_PATCH_BASE";
    public static final String UM_PATCH_EXCEPTION_E = "UME_PATCH_EXCEPTION";
    public static final String UM_PATCH_FAILED_E = "UME_PATCH_FAILED";
    public static final String UM_PATCH_LOAD_TIME_E = "UME_PATCH_LOAD_TIME";
    public static final String UM_PATCH_NOT_USE_E = "UME_PATCH_NOT_USE";
    public static final String UM_PATCH_SUCCESS_E = "UME_PATCH_SUCCESS";
    public static final String UM_PATCH_USE_E = "UME_PATCH_USE";
    public static final String UM_PERFORMANCE_M = "UPM_SKU_000";
    public static final String UM_SHOW_PRESENTER_E = "UME_SKU_SHOW_PRESENTER";
    public static final String UM_SKU_SILENT = "UM_SKU_SILENT";
    public static final String UM_SKU_SILENT_CALL = "silentActionCall";
    public static final String UM_SKU_SILENT_TIMEOUT = "silentActionTimeOut";
    public static final String UM_SKU_SILENT_WEEX_RESET = "silentActionWeexCallVisible";
    public static final String UM_SKU_V3_E_PREFIX = "UME_SKU_V3_E_";
    public static final String UM_URL_DOWNGRADE_INIT_E = "UME_SKU_URL_001";
    public static final String UM_URL_DOWNGRADE_JSI_E = "UME_SKU_URL_003";
    public static final String UM_URL_DOWNGRADE_MTOP_E = "UME_SKU_URL_002";
    public static final String UM_URL_DOWNGRADE_REDIRECT_URL_E = "UME_SKU_URL_004";
    public static final String UM_WEEX2_E_PREFIX = "UME_WEEX2_E_";
    public static final String UM_WEEX2_E_SKU_V3_PREFIX = "UME_SKU_V3_WEEX2_E_";
    public static final String UM_WEEX_E_PREFIX = "UME_WEEX_E_";
    public static final String UM_WEEX_E_SERVICE_ID = "WEEX_Errors_Dimension";
    public static final String UM_WEEX_E_SKU_V3_PREFIX = "UME_SKU_V3_WEEX_E_";
    public static final String UM_WEEX_SKU_PRELOAD = "UME_WEEX_SKU_PRELOAD";

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f15207a;

    static {
        kge.a(-1454617049);
        f15207a = new ArrayList<String>() { // from class: com.taobao.android.sku.utils.SkuLogUtils$1
            {
                add(o.UM_PERFORMANCE_M);
                add(o.UM_PATCH_LOAD_TIME_E);
                add(o.UM_PATCH_USE_E);
                add(o.UM_PATCH_BASE_E);
                add(o.UM_PATCH_SUCCESS_E);
            }
        };
    }

    public static void a(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{new Integer(i), str, map});
            return;
        }
        AliUserTrackerInterface a2 = u.a();
        if (a2 == null) {
            return;
        }
        a2.a(PAGE_NAME, i, "Page_New_SKU_" + str, null, null, a((String) null, (String) null, (String) null, (String) null, map));
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (z) {
                bga.c.b("sku_v3", "sku", "E_SKU_V3", "default");
            } else {
                bga.c.b("sku_v3", "sku", "E_N_SKU_V3", "default");
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{new Boolean(z)});
            return;
        }
        try {
            if (z) {
                bga.c.b("new_buy_sku", "sku", "E_SKU_BUY", "default");
            } else {
                bga.c.b("new_buy_sku", "sku", "E_N_SKU_BUY", "default");
            }
        } catch (Throwable unused) {
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            bga.c.b("new_buy_sku", "sku", "E_SKU_BUY", "back");
        } catch (Throwable unused) {
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            c(DEFAULT_BIZ_NAME, str, "", UM_SKU_SILENT);
        }
    }

    private static String d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2ee58ced", new Object[]{str, str2, str3, str4}) : a(str, str2, str3, str4, (Map<String, String>) null);
    }

    private static String a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b0684b", new Object[]{str, str2, str3, str4, map});
        }
        String str5 = "";
        String str6 = StringUtils.isEmpty(str3) ? str5 : ",skuUT=" + str3;
        String str7 = StringUtils.isEmpty(str4) ? str5 : ",skuParams=" + str4;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(key)) {
                    str5 = str5 + "," + key + "=" + value;
                }
            }
        }
        return "itemId=" + str + ",sellerId=" + str2 + str6 + str7 + str5 + ",spm=a2141.7631564.newsku";
    }

    public static void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{str, str2, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", str);
        hashMap.put("bundleUrl", str2);
        hashMap.put("costTime", String.valueOf(j));
        a("sku_weex_preload_execute", hashMap);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", str);
        hashMap.put("bundleUrl", str2);
        a("sku_weex_preload_begin_fetch", hashMap);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("instanceId", str);
        hashMap.put("bundleUrl", str2);
        a("sku_weex_preload_hit", hashMap);
    }

    public static void a(String str, Map<String, String> map) {
        AliUserTrackerInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (StringUtils.isEmpty(str) || (a2 = u.a()) == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                jSONObject.putAll(map);
            }
            a2.a(PAGE_NAME, 2101, str, null, null, String.valueOf(jSONObject));
        }
    }

    public static void b(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba640454", new Object[]{str, str2, str3, str4, map});
            return;
        }
        AliUserTrackerInterface a2 = u.a();
        if (a2 == null) {
            return;
        }
        a2.a(PAGE_NAME, 2201, "showSKU", null, null, a(str, str2, str3, str4, map));
    }

    public static void a(String str, String str2, long j, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cf09dc", new Object[]{str, str2, new Long(j), str3, str4});
            return;
        }
        AliUserTrackerInterface a2 = u.a();
        if (a2 == null) {
            return;
        }
        a2.a(PAGE_NAME, 2201, "closeSKU", null, null, d(str, str2, str3, str4) + (",userViewTime=" + j));
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        AliUserTrackerInterface a2 = u.a();
        if (a2 == null) {
            return;
        }
        a2.a(PAGE_NAME, 2101, "Page_New_SKU_Slide_updown", null, null, d(str, str2, str3, str4));
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        a(riy.ARRAY_START_STR + str + "] " + str2);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        Log.e(com.taobao.android.sku.c.LOG_TAG, str);
        AliLogInterface a2 = com.taobao.android.n.a();
        if (a2 == null) {
            return;
        }
        a2.d(com.taobao.android.sku.c.LOG_TAG, str);
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        b(riy.ARRAY_START_STR + str + "] " + str2);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        a(str);
        UMLinkLogInterface a2 = bpp.a();
        if (a2 == null) {
            return;
        }
        a2.logError("New_Sku", "Main", "Main", null, "UME_SKU_LOG_E", str, null, null);
    }

    public static void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{str, str2, str3, str4});
            return;
        }
        AliLogInterface a2 = com.taobao.android.n.a();
        if (a2 != null) {
            try {
                a2.d(com.taobao.android.sku.c.LOG_TAG, "module: " + str + " step: " + str2 + " stepMsg: " + str3 + " content: " + str4);
            } catch (Throwable unused) {
            }
        }
        UMLinkLogInterface a3 = bpp.a();
        if (a3 == null) {
            return;
        }
        try {
            a3.trace("New_Sku", str, CLASS_NAME, str2, "0", str3, TraceLogEventType.COMMON, str4);
        } catch (Throwable unused2) {
        }
    }

    public static void b(String str, String str2, final String str3, final String str4, final String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2001a9b", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        AliLogInterface a2 = com.taobao.android.n.a();
        if (a2 != null) {
            a2.d(com.taobao.android.sku.c.LOG_TAG, "msg: " + str3 + " itemId: " + str4 + " url: " + str5);
        }
        UMLinkLogInterface a3 = bpp.a();
        if (a3 == null) {
            return;
        }
        a3.commitFailure("Main", str4, "", "New_Sku", str, new HashMap<String, String>() { // from class: com.taobao.android.sku.utils.SkuLogUtils$2
            {
                put("errorMsg", str3);
                put("itemId", str4);
                put("url", str5);
            }
        }, str2, str3);
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return f15207a.contains(str);
        }
        return false;
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            c(str, str2, str3, "");
        }
    }

    public static void c(String str, String str2, final String str3, String str4) {
        UMLinkLogInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107fb192", new Object[]{str, str2, str3, str4});
            return;
        }
        AliLogInterface a3 = com.taobao.android.n.a();
        if (a3 != null) {
            a3.d(com.taobao.android.sku.c.LOG_TAG, str3);
        }
        if (c(str2) || (a2 = bpp.a()) == null) {
            return;
        }
        if (StringUtils.isEmpty(str4)) {
            str4 = "";
        }
        a2.commitFailure("Main", str4, "", "New_Sku", str, new HashMap<String, String>() { // from class: com.taobao.android.sku.utils.SkuLogUtils$3
            {
                put("errorMsg", str3);
            }
        }, str2, str3);
    }
}
