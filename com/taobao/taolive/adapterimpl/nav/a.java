package com.taobao.taolive.adapterimpl.nav;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.taolive.room.utils.n;
import java.util.HashMap;
import java.util.Map;
import tb.cgl;
import tb.ddw;
import tb.kge;
import tb.noa;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SOURCE_TYPE = "sourceType";
    public static final String SKU_ADD_CART = "5";
    public static final String SKU_ADD_CART_AND_DETAIL = "4";
    public static final String SKU_ADD_CART_WITH_SURE = "1";
    public static final String SKU_BUY = "2";
    public static final String SKU_RESULT_ADDCART_SUCCESS = "1";
    public static final String SKU_RESULT_QUERAYDATA_FAIL = "8";
    public static final String SKU_SURE_AND_DETAIL = "3";

    static {
        kge.a(436848107);
    }

    public static /* synthetic */ String a(Map map, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str}) : b(map, str);
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{str, str2, jSONObject});
        } else if (!StringUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", str);
            if (!StringUtils.isEmpty(str2)) {
                hashMap.put("sourceType", str2);
            } else {
                hashMap.put("sourceType", "4");
            }
            if (jSONObject != null) {
                String str3 = "";
                for (String str4 : jSONObject.keySet()) {
                    if (z) {
                        str3 = str3 + str4;
                        z = false;
                    } else {
                        str3 = str3 + "," + str4;
                    }
                }
                jSONObject.put(noa.KEY_MSOA_TRANS_KEY, (Object) str3);
                jSONObject.put("bizName", "taobaolive_msoa");
                hashMap.put("exParams", jSONObject);
            }
            try {
                com.taobao.android.msoa.c.a().a(new h("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "taobaolive_msoa", hashMap), new MSOAServiceListener() { // from class: com.taobao.taolive.adapterimpl.nav.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onFail(String str5, String str6, boolean z2, Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str5, str6, new Boolean(z2), map});
                        }
                    }

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onSuccess(Map<String, Object> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        } else if (map == null) {
                        } else {
                            String a2 = a.a(map, "resultCode");
                            if ("1".equals(a2)) {
                                String a3 = a.a(map, "itemId");
                                if (StringUtils.isEmpty(a3)) {
                                    return;
                                }
                                com.taobao.alilive.aliliveframework.frame.a a4 = n.a();
                                String str5 = null;
                                if (a4 != null) {
                                    str5 = a4.G();
                                }
                                ddw.a().a("com.taobao.taolive.room.addcart", a3, str5);
                            } else if (!"8".equals(a2)) {
                            } else {
                                Toast.makeText(cgl.g().a(), "加购失败", 0).show();
                            }
                        }
                    }
                });
            } catch (Exception e) {
                Log.e("SkuHelper", e.getMessage());
            }
        }
    }

    private static String b(Map<String, Object> map, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("365abe1a", new Object[]{map, str}) : (map == null || (obj = map.get(str)) == null || !(obj instanceof String)) ? "" : (String) obj;
    }
}
