package com.taobao.android.live.plugin.atype.flexalocal.rank;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.goodlist.l;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f14001a;

    static {
        kge.a(919331839);
        f14001a = "";
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        HashMap<String, String> c = c(jSONObject);
        l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
        if (j == null) {
            return;
        }
        j.b("liveroom_banner", c);
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
            return;
        }
        HashMap<String, String> c = c(jSONObject);
        l j = com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j();
        if (j == null) {
            return;
        }
        j.a("liveroom_banner", c);
    }

    private static HashMap<String, String> c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("154a04a9", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return new HashMap<>();
        }
        String string = jSONObject.getString("bannerTag");
        String string2 = jSONObject.getString("businessId");
        String string3 = jSONObject.getString("jumpUrl");
        String string4 = jSONObject.getString("activityType");
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(string4)) {
            hashMap.put("type", string4);
        }
        if (TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string)) {
            hashMap.put("type", string);
        }
        if (!TextUtils.isEmpty(string2)) {
            hashMap.put("typeid", string2);
        }
        if (("event".equals(string) || "others".equals(string)) && !TextUtils.isEmpty(string3)) {
            hashMap.put("typeid", string3);
        }
        return hashMap;
    }
}
