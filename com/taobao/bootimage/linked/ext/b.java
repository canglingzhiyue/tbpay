package com.taobao.bootimage.linked.ext;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.bootimage.f;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.util.HashMap;
import java.util.Map;
import tb.kej;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1714916822);
    }

    public static boolean a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a792850", new Object[]{jSONObject, new Boolean(z)})).booleanValue() : a(jSONObject, z, (Map<String, String>) null);
    }

    public static boolean a(JSONObject jSONObject, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eb191bd", new Object[]{jSONObject, new Boolean(z), map})).booleanValue();
        }
        JSONObject a2 = c.a(jSONObject, "args");
        if (a2 != null && !a2.isEmpty()) {
            return a(a2.getString("advImpTracking"), z) || b(a2.getString("advClickTracking"), z) || a(a2.getString("advEventTracking"), z, map);
        }
        kej.a("AdvHelper", "args is empty");
        return false;
    }

    private static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            kej.a("AdvHelper", "impJsonStr is empty");
            return false;
        }
        kej.a("AdvHelper", "commitAdvImp, buildTanxImpTracking, impJsonStr = " + str);
        AlimamaAdvertising.instance().buildTanxImpTracking(f.b(), str).a("tb_splash").b(a(z)).a(b(z)).a();
        return true;
    }

    private static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            kej.a("AdvHelper", "clickJsonStr is empty");
            return false;
        }
        kej.a("AdvHelper", "commitAdvClick, buildTanxClickTracking, clickJsonStr = " + str);
        AlimamaAdvertising.instance().buildTanxClickTracking(f.b(), str).a("tb_splash").b(a(z)).a(b(z)).a();
        return true;
    }

    private static boolean a(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881e4e67", new Object[]{str, new Boolean(z), map})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            kej.a("AdvHelper", "interactJsonStr is empty");
            return false;
        }
        kej.a("AdvHelper", "commitAdvEvent, buildTanxEventTracking, interactJsonStr = " + str);
        AlimamaAdvertising.instance().buildTanxEventTracking(f.b(), str).a("tb_splash").b(a(z)).a(b(z)).c(map).a();
        return true;
    }

    private static Map<String, String> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913778a1", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("is_cold", Boolean.toString(z));
        return hashMap;
    }

    private static Map<String, String> b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78d94f00", new Object[]{new Boolean(z)});
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("is_cold", Boolean.toString(z));
        hashMap.put("scene", PopStrategy.IDENTIFIER_SPLASH);
        return hashMap;
    }
}
