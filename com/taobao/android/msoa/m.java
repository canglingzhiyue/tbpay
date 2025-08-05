package com.taobao.android.msoa;

import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_MSOA_PERMISSION = "msoa_service_map";

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f14438a = Collections.synchronizedSet(new HashSet());
    private static Map<String, Set<String>> b = new ConcurrentHashMap();

    public static void a() {
        String config;
        String config2;
        JSONObject parseObject;
        JSONObject parseObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        f14438a.clear();
        b.clear();
        JSONObject parseObject3 = JSONObject.parseObject(PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getString(MSOAWVService.SP_NAME, null));
        if (parseObject3 != null) {
            config = parseObject3.getString("global");
            config2 = parseObject3.getString("scene");
        } else {
            config = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_MSOA_PERMISSION, "global", "");
            config2 = OrangeConfig.getInstance().getConfig(ORANGE_GROUP_MSOA_PERMISSION, "scene", "");
        }
        if (!TextUtils.isEmpty(config) && (parseObject2 = JSONObject.parseObject(config)) != null) {
            for (String str : parseObject2.keySet()) {
                Boolean bool = parseObject2.getBoolean(str);
                if (bool != null && !bool.booleanValue()) {
                    f14438a.add(str);
                }
            }
        }
        if (TextUtils.isEmpty(config2) || (parseObject = JSONObject.parseObject(config2)) == null) {
            return;
        }
        for (String str2 : parseObject.keySet()) {
            JSONObject jSONObject = parseObject.getJSONObject(str2);
            if (jSONObject != null) {
                HashSet hashSet = new HashSet();
                b.put(str2, hashSet);
                for (String str3 : jSONObject.keySet()) {
                    Boolean bool2 = jSONObject.getBoolean(str3);
                    if (bool2 != null && !bool2.booleanValue()) {
                        hashSet.add(str3);
                    }
                }
            }
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (f14438a.contains(str)) {
            return false;
        }
        return !b.containsKey(str) || !b.get(str).contains(str2);
    }
}
