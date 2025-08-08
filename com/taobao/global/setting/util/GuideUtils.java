package com.taobao.global.setting.util;

import android.taobao.util.k;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class GuideUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f17218a = new HashMap();
    private static final Set<String> b = new HashSet();

    /* loaded from: classes7.dex */
    public static class FatigueObject {
        public int fatigue;
        public String key;

        private FatigueObject() {
        }
    }

    public static synchronized boolean a(String str, String str2, boolean z) {
        synchronized (GuideUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue();
            }
            AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_NEED_SHOW_GUIDE, h.a(str, str2, z), 1.0d);
            if ("muteCountDown".equals(str2) && com.taobao.global.setting.d.a().b()) {
                return false;
            }
            int i = d.a().getInt(a(str2), -1);
            if (f17218a.size() == 0) {
                a();
            }
            if (i == -1 && f17218a.containsKey(str2)) {
                i = f17218a.get(str2).intValue();
            }
            if (b.contains(str2)) {
                return false;
            }
            if (i <= 0) {
                return false;
            }
            if (z) {
                a(str, str2, i - 1);
            }
            return true;
        }
    }

    private static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i)});
            return;
        }
        AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_GET_CONSUME_FATIGUE, h.a(str, str2, i), 1.0d);
        b.add(str2);
        d.a().edit().putInt(a(str2), i).apply();
    }

    private static void a() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "settingExt", "{\"fatigue\":[{\"key\":\"muteCountDown\",\"fatigue\":\"5\"},{\"key\":\"muteOpenTip\",\"fatigue\":\"1\"},{\"key\":\"muteOnPop\",\"fatigue\":\"1\"},{\"key\":\"muteOffPop\",\"fatigue\":\"1\"}]}");
        if (StringUtils.isEmpty(config)) {
            return;
        }
        try {
            JSONObject parseObject = JSONObject.parseObject(config);
            if (parseObject == null || (jSONArray = parseObject.getJSONArray("fatigue")) == null || jSONArray.size() <= 0) {
                return;
            }
            for (int i = 0; i < jSONArray.size(); i++) {
                FatigueObject fatigueObject = (FatigueObject) jSONArray.getObject(i, FatigueObject.class);
                if (fatigueObject != null) {
                    f17218a.put(fatigueObject.key, Integer.valueOf(fatigueObject.fatigue));
                    int i2 = d.a().getInt(b(fatigueObject.key), -1);
                    if (i2 == -1 && fatigueObject.fatigue >= 0) {
                        d.a().edit().putInt(b(fatigueObject.key), fatigueObject.fatigue).apply();
                    } else if (i2 != fatigueObject.fatigue && fatigueObject.fatigue >= 0) {
                        d.a().edit().putInt(a(fatigueObject.key), fatigueObject.fatigue).commit();
                    }
                }
            }
        } catch (Exception e) {
            k.a("GuideUtils", Log.getStackTraceString(e));
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "mytao_guide_" + str;
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        return "mytao_guide_remote_" + str;
    }
}
