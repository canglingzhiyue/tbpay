package com.taobao.android.purchase.aura.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import tb.dui;
import tb.fke;
import tb.kge;
import tb.tdh;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f14752a;

    static {
        kge.a(919974328);
        f14752a = null;
    }

    private static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = f14752a;
        if (jSONObject != null) {
            return jSONObject;
        }
        String a2 = e.a(e.BUY_POP_QUERY, "{\"isTBBuyFloatMode\":\"true\",\"99tm\":\"true\",\"pageType\":\"float\"}");
        if (TextUtils.isEmpty(a2)) {
            f14752a = null;
            return null;
        }
        try {
            JSONObject parseObject = JSON.parseObject(a2);
            f14752a = parseObject;
            return parseObject;
        } catch (Exception unused) {
            f14752a = null;
            return null;
        }
    }

    public static boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        Uri data = intent.getData();
        JSONObject a2 = a();
        if (a2 != null && !a2.isEmpty()) {
            for (String str : a2.keySet()) {
                String stringExtra = data == null ? intent.getStringExtra(str) : data.getQueryParameter(str);
                if (stringExtra != null && stringExtra.equals(a2.getString(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue();
        }
        Intent b = fke.b(activity);
        JSONObject c = c(b);
        return c != null && "carts".equals(dui.c(b)) && ("true".equals(c.getString(aw.PARAM_FORCE_FULL_SCREEN)) || "1".equals(c.getString("maxHeight")));
    }

    public static JSONObject c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("396b5447", new Object[]{intent});
        }
        if (intent == null) {
            tdh.b("EMPTY_INTENT_FORM_(getPopConfig)", "intent is empty");
            return null;
        }
        String stringExtra = intent.getStringExtra(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG);
        Uri data = intent.getData();
        if (data != null && TextUtils.isEmpty(stringExtra)) {
            stringExtra = data.getQueryParameter(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = d(intent);
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(stringExtra);
            if ("true".equals(parseObject.getString(aw.PARAM_FORCE_FULL_SCREEN))) {
                parseObject.put("maxHeight", (Object) "1");
                parseObject.put("cornerRadius", (Object) "0");
                parseObject.put("animation", (Object) com.taobao.android.abilitykit.ability.pop.model.d.KEY_RIGHT_IN_OUT);
            }
            return parseObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de128ff8", new Object[]{intent});
        }
        if ("carts".equals(dui.c(intent)) && "true".equals(e.a("enableNewStyle", "true"))) {
            return com.taobao.android.buy.toggle.b.c();
        }
        return null;
    }

    public static Map<String, String> b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db54185b", new Object[]{intent});
        }
        HashMap hashMap = null;
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        JSONObject a2 = a();
        if (a2 != null && !a2.isEmpty()) {
            for (String str : a2.keySet()) {
                String stringExtra = data == null ? intent.getStringExtra(str) : data.getQueryParameter(str);
                if (stringExtra != null && stringExtra.equals(a2.getString(str))) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(str, stringExtra);
                }
            }
        }
        return hashMap;
    }
}
