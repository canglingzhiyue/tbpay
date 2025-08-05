package com.taobao.android.opencart.msoa;

import android.app.Application;
import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.android.opencart.AddBagModel;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import tb.hvf;
import tb.noa;
import tb.tfu;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ JSONObject a(a aVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("74024b4a", new Object[]{aVar, map}) : aVar.b(map);
    }

    public static /* synthetic */ JSONObject b(a aVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d65d6229", new Object[]{aVar, map}) : aVar.a(map);
    }

    public void a(final String str, String str2, Integer num, String str3, String str4, String str5, Boolean bool, Map<String, Object> map, Context context) {
        HashMap hashMap = map;
        Application application = context;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ecbf77", new Object[]{this, str, str2, num, str3, str4, str5, bool, hashMap, application});
            return;
        }
        hvf.c("AddBagServiceProxy", "addbag start", "requestId==" + str + ",itemId=" + str2 + ",quantity=" + num + ",skuId=" + str3 + ",exParams=" + str4 + ",cartFrom=" + str5 + ",showSku=" + bool + ",clientExParams=" + hashMap + ",context=" + application);
        if (bool != null && bool.booleanValue()) {
            HashMap hashMap2 = new HashMap(3);
            hashMap2.put("itemId", str2);
            hashMap2.put("sourceType", 5);
            JSONObject parseObject = str4 != null ? JSONObject.parseObject(str4) : new JSONObject();
            parseObject.put("openFrom", (Object) "OpenCart");
            StringBuilder sb = new StringBuilder();
            for (String str6 : parseObject.keySet()) {
                sb.append(str6);
                sb.append(",");
            }
            if (sb.toString().endsWith(",")) {
                sb.delete(sb.length() - 1, sb.length());
            }
            parseObject.put(noa.KEY_MSOA_TRANS_KEY, (Object) sb.toString());
            if (hashMap != null) {
                parseObject.putAll(hashMap);
            }
            parseObject.put("bizName", (Object) "minidetail");
            if (str3 != null) {
                parseObject.put("skuId", (Object) str3);
            }
            if (num != null) {
                parseObject.put("quantity", (Object) num);
            }
            hashMap2.put("exParams", parseObject);
            try {
                c.a().a(new h("msoa.taobao.cart.sdk", "msoa.taobao.detail.showsku", "2.0", "cart", hashMap2), new MSOAServiceListener() { // from class: com.taobao.android.opencart.msoa.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onSuccess(Map<String, Object> map2) {
                        IpChange ipChange2 = $ipChange;
                        boolean z2 = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map2});
                            return;
                        }
                        JSONObject a2 = a.a(a.this, map2);
                        if (map2 == null || !"1".equals(map2.get("resultCode"))) {
                            z2 = false;
                        }
                        if (z2) {
                            c.a().a(str, a2);
                        } else {
                            c.a().a(str, "", "", a.b(a.this, map2));
                        }
                    }

                    @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                    public void onFail(String str7, String str8, boolean z2, Map<String, Object> map2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str7, str8, new Boolean(z2), map2});
                        } else {
                            c.a().a(str, str7, str8, a.b(a.this, map2));
                        }
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        com.taobao.android.opencart.c cVar = new com.taobao.android.opencart.c();
        AddBagModel.a c = new AddBagModel.a().e(str).a(str2).a(num == null ? 1 : num.intValue()).b(str3).d(str4).c(str5);
        if (bool != null) {
            z = bool.booleanValue();
        }
        AddBagModel.a a2 = c.a(z);
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        AddBagModel a3 = a2.a(hashMap).a();
        if (application == null) {
            application = Globals.getApplication();
        }
        cVar.a(application, a3);
    }

    private JSONObject a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3729093d", new Object[]{this, map});
        }
        JSONObject b = b(map);
        b.put("MSOAErrorWVUserInfo", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userInfo", (Object) b);
        if (map != null) {
            jSONObject.put("resultCode", map.get("resultCode"));
        }
        return jSONObject;
    }

    private JSONObject b(Map<String, Object> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6501a39c", new Object[]{this, map});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && (jSONObject = new JSONObject(map).getJSONObject(tfu.ADD_CART)) != null && (jSONObject2 = jSONObject.getJSONObject("addCartResult")) != null) {
            jSONObject3.put("addCartResult", (Object) jSONObject2);
        }
        return jSONObject3;
    }
}
