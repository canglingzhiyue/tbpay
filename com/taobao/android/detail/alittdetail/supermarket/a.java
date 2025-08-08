package com.taobao.android.detail.alittdetail.supermarket;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.TTDetailActivity;
import com.taobao.android.detail.alittdetail.supermarket.b;
import com.taobao.android.detail.ttdetail.data.meta.Vertical;
import com.taobao.android.detail.ttdetail.utils.bb;
import com.taobao.android.detail.ttdetail.utils.i;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1984123763);
    }

    public static void a(final String str, String str2, String str3, String str4) {
        String str5;
        IpChange ipChange = $ipChange;
        int i = 1;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
            return;
        }
        Vertical.d dVar = null;
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            com.taobao.android.msoa.c.a().a(str, "msoa_error_invalid_param", "invalid parameter", null);
            return;
        }
        try {
            str3 = URLDecoder.decode(str3, "utf-8");
        } catch (Throwable th) {
            i.a("AddCartUtils", "URLDecode token error with: " + str3, th);
        }
        Activity a2 = bb.a(str3);
        if (!(a2 instanceof TTDetailActivity)) {
            i.a("AddCartUtils", "not found TTDetailActivity with token: " + str3 + " in addSMCart");
            com.taobao.android.msoa.c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
            return;
        }
        TTDetailActivity tTDetailActivity = (TTDetailActivity) a2;
        JSONObject parseObject = JSON.parseObject(str4);
        HashMap hashMap = new HashMap();
        if (parseObject != null) {
            i2 = parseObject.getIntValue("quantity");
            JSONObject jSONObject = parseObject.getJSONObject("exParams");
            if (jSONObject != null) {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    hashMap.put(entry.getKey(), (String) entry.getValue());
                }
            }
            str5 = parseObject.getString("skuId");
        } else {
            str5 = null;
        }
        if (i2 > 0) {
            i = i2;
        }
        Vertical vertical = (Vertical) tTDetailActivity.g().a().a(Vertical.class);
        if (vertical != null) {
            dVar = vertical.getSupermarket();
        }
        if (dVar != null && !StringUtils.isEmpty(dVar.a())) {
            hashMap.put("tpId", dVar.a());
        }
        try {
            if (b.a(tTDetailActivity.g(), new c().a(i).b(str2).a(str5).a(hashMap), new b.a() { // from class: com.taobao.android.detail.alittdetail.supermarket.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.alittdetail.supermarket.b.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("resultCode", "1");
                    com.taobao.android.msoa.c.a().a(str, hashMap2);
                }

                @Override // com.taobao.android.detail.alittdetail.supermarket.b.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("resultCode", "0");
                    com.taobao.android.msoa.c.a().a(str, hashMap2);
                }
            })) {
                return;
            }
            a(str);
        } catch (Throwable th2) {
            i.a("AddCartUtils", "addSMCart error", th2);
            a(str);
        }
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            com.taobao.android.msoa.c.a().a(str, "msoa_error_business_fail", "provider business fail", null);
        }
    }
}
