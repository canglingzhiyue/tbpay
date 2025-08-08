package com.taobao.search.rainbow;

import android.app.Application;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SEARCH_PREFERENCE_KEY = "tbsearch_preference";

    public static final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        SharedPreferences d = d("tbsearch_rainbow");
        if (d == null) {
            return;
        }
        d.edit().putString("cfg_v", str).apply();
    }

    public static final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        SharedPreferences d = d("tbsearch_rainbow");
        return d == null ? "" : d.getString("cfg_v", "");
    }

    public static final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        SharedPreferences d = d("tbsearch_rainbow");
        if (d == null) {
            return;
        }
        d.edit().putString("app_v", str).apply();
    }

    public static final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        SharedPreferences d = d("tbsearch_rainbow");
        return d == null ? "" : d.getString("app_v", "");
    }

    public static final void a(String str, BucketDO bucketDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64e1cdf", new Object[]{str, bucketDO});
            return;
        }
        SharedPreferences d = d("tbsearch_rainbow");
        if (d == null) {
            return;
        }
        SharedPreferences.Editor edit = d.edit();
        edit.putString("tc_" + str, JSON.toJSONString(bucketDO));
        edit.apply();
    }

    public static final BucketDO c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BucketDO) ipChange.ipc$dispatch("6986fb4f", new Object[]{str});
        }
        SharedPreferences d = d("tbsearch_rainbow");
        if (d == null) {
            return null;
        }
        String string = d.getString("tc_" + str, "");
        if (!StringUtils.isEmpty(string)) {
            return (BucketDO) JSON.parseObject(string, BucketDO.class);
        }
        return null;
    }

    public static final Map<String, BucketDO> c() {
        Map<String, ?> all;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        SharedPreferences d = d("tbsearch_rainbow");
        if (d != null && (all = d.getAll()) != null && !all.isEmpty()) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (!StringUtils.isEmpty(key) && key.startsWith("tc_")) {
                    String str = (String) entry.getValue();
                    if (!StringUtils.isEmpty(str)) {
                        hashMap.put(key.substring(2), JSON.parseObject(str, BucketDO.class));
                    }
                }
            }
        }
        return hashMap;
    }

    public static final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        SharedPreferences d = d("tbsearch_rainbow");
        if (d == null) {
            return;
        }
        SharedPreferences.Editor edit = d.edit();
        String string = d.getString("app_v", "");
        String string2 = d.getString("cfg_v", "");
        edit.clear().apply();
        edit.putString("app_v", string).putString("cfg_v", string2).apply();
    }

    public static JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("79d3cd5a", new Object[0]);
        }
        SharedPreferences d = d("tbsearch_preference");
        if (d == null) {
            return null;
        }
        String string = d.getString(TBSearchChiTuJSBridge.ABTEST, "");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static SharedPreferences d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("c5d68b89", new Object[]{str});
        }
        Application a2 = a.a();
        if (a2 == null) {
            Log.e("RainbowCache", "Application为空，获取SharedPreferences失败");
            return null;
        }
        return a2.getSharedPreferences(str, 0);
    }
}
