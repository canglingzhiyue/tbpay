package com.taobao.homepage.business.permission;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.tao.homepage.launcher.g;
import tb.kge;
import tb.sft;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f17234a;

    static {
        kge.a(2116029811);
    }

    private static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]) : g.a().getSharedPreferences("homepage_common", 0);
    }

    public static boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee2b494", new Object[]{str, str2, str3, str4})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str3) && "LBS".equals(str)) {
            e.d("homepage.LBSSharedPreferenceUtils", "updateCache", str, str2, str3);
            if (f17234a == null) {
                b();
            }
            JSONObject jSONObject = f17234a;
            if (jSONObject != null && !StringUtils.isEmpty(str2) && jSONObject.containsKey(str2)) {
                jSONObject.put(str2, (Object) str3);
                String jSONString = f17234a.toJSONString();
                SharedPreferences a2 = a();
                if (a2 != null) {
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putString("tb_homepage_clientCache_lbs", jSONString);
                    edit.commit();
                    e.d("homepage.LBSSharedPreferenceUtils", "updateCache complete", jSONString);
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        JSONObject jSONObject = f17234a;
        if (jSONObject != null && str.equals(jSONObject.toJSONString())) {
            return false;
        }
        try {
            f17234a = JSONObject.parseObject(str);
        } catch (Exception unused) {
        }
        if (f17234a == null) {
            return false;
        }
        e.d("homepage.LBSSharedPreferenceUtils", "setCacheValue complete", str);
        SharedPreferences.Editor edit = a().edit();
        edit.putString("tb_homepage_clientCache_lbs", f17234a.toJSONString());
        edit.commit();
        return true;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!StringUtils.isEmpty(str) && "LBS".equals(str)) {
            if (f17234a == null) {
                b();
            }
            JSONObject jSONObject = f17234a;
            if (jSONObject != null && !StringUtils.isEmpty(str2)) {
                String string = jSONObject.getString(str2);
                e.d("homepage.LBSSharedPreferenceUtils", "getCacheValue", str, str2, string);
                return string;
            } else if (jSONObject != null) {
                String jSONString = jSONObject.toJSONString();
                e.d("homepage.LBSSharedPreferenceUtils", "getCacheValue", str, str2, jSONString);
                return jSONString;
            } else {
                e.d("homepage.LBSSharedPreferenceUtils", "getCacheValue", str, str2, sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            }
        }
        return null;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        String string = a().getString("tb_homepage_clientCache_lbs", null);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        try {
            f17234a = JSONObject.parseObject(string);
        } catch (Exception unused) {
            e.d("homepage.LBSSharedPreferenceUtils", "getCacheValue exception read local data wrong");
        }
    }
}
