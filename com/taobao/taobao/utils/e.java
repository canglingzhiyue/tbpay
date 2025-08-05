package com.taobao.taobao.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65cbb30e", new Object[]{obj, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(obj, str);
        }
    }

    public static void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a("2101", str, str2, str3);
        }
    }

    private static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else if (str4 == null) {
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, (Object) null, (Object) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("args", str4);
            TBS.Ext.commitEvent(str2, Integer.parseInt(str), str3, null, null, b(hashMap));
        }
    }

    private static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder("");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry == null || entry.getKey() == null) {
                return sb.toString();
            }
            if (entry.getKey().toLowerCase().equals("args")) {
                if (entry.getValue() != null) {
                    sb.append(entry.getValue().toString());
                } else {
                    sb.append(entry.getValue());
                }
            } else if (entry.getValue() != null) {
                sb.append(riy.ARRAY_START_STR);
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue().toString());
                sb.append(riy.ARRAY_END_STR);
            } else {
                sb.append(riy.ARRAY_START_STR);
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append(riy.ARRAY_END_STR);
            }
        }
        return sb.toString();
    }

    public static void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{str, str2, str3, str4, str5, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append("spm=" + str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(",scm=" + str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            sb.append(",extra=" + str5);
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    sb.append("," + key + "=" + value);
                }
            }
        }
        a(str, str2, sb.toString());
        if (str3 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-url", str3);
        if (map != null && map.containsKey(aw.PARAM_UT_PARAMS)) {
            hashMap.put(ag.KEY_UTPARAM_URL, map.get(aw.PARAM_UT_PARAMS));
        }
        a(hashMap);
    }
}
