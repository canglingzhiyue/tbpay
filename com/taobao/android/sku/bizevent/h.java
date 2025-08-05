package com.taobao.android.sku.bizevent;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.j;
import com.taobao.android.sku.utils.o;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.iyb;
import tb.iyd;
import tb.iye;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements iyd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "skuUserTrack";

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f15143a;

    static {
        kge.a(388360164);
        kge.a(-1413102650);
        f15143a = new ArrayList<String>() { // from class: com.taobao.android.sku.bizevent.SkuUserTrackHandler$1
            {
                add("buyNowWithCoupon");
                add("buyNowNormal");
                add("addCartWithJHSClicked");
                add("addCartClicked");
            }
        };
    }

    @Override // tb.iyd
    public void a(iye iyeVar, iyb iybVar) {
        JSONObject jSONObject;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0c8681", new Object[]{this, iyeVar, iybVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List c = iyeVar.c();
        if (c != null && c.size() > 0) {
            for (int i2 = 0; i2 < c.size(); i2++) {
                Object obj = c.get(i2);
                if (obj instanceof JSONObject) {
                    arrayList.add((JSONObject) obj);
                }
            }
        }
        JSONObject b = iyeVar.b();
        if (b == null || b.isEmpty() || (jSONObject = b.getJSONObject("fields")) == null || jSONObject.isEmpty()) {
            return;
        }
        JSONObject d = iyeVar.d();
        if (d == null) {
            d = new JSONObject();
        }
        j.a(d, arrayList, jSONObject);
        try {
            i = jSONObject.getInteger("eventId").intValue();
        } catch (Exception unused) {
            i = -1;
        }
        if (i < 0) {
            return;
        }
        String string = jSONObject.getString("page");
        String string2 = jSONObject.getString("arg1");
        String string3 = jSONObject.getString("arg2");
        String string4 = jSONObject.getString("arg3");
        String str = "";
        String str2 = TextUtils.isEmpty(string3) ? str : string3;
        if (!TextUtils.isEmpty(string4)) {
            str = string4;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    hashMap.put(key, String.valueOf(value));
                }
            }
        }
        String f = iybVar.f();
        if (!TextUtils.isEmpty(f)) {
            hashMap.put("skuUT", f);
        }
        String g = iybVar.g();
        if (!TextUtils.isEmpty(g)) {
            hashMap.put("skuParams", g);
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str2, str, hashMap).build());
        } catch (Throwable unused2) {
        }
        try {
            if (!f15143a.contains(string2)) {
                return;
            }
            String[] strArr = new String[hashMap.size()];
            int i3 = 0;
            for (String str3 : hashMap.keySet()) {
                strArr[i3] = String.format("%s=%s", str3, (String) hashMap.get(str3));
                i3++;
            }
            com.taobao.android.behavir.b.a().commitTap(o.PAGE_NAME, string2, null, iybVar.b().n(), strArr);
        } catch (Throwable unused3) {
        }
    }
}
