package com.taobao.message.kit.util;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import com.taobao.tao.log.TLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class ConfigUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SP_NAME = "msg_base_orange";
    private static final Map<String, Boolean> isSamplingRateCache;

    public static /* synthetic */ String access$000(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7a953ef5", new Object[]{str, str2}) : ofSPKey(str, str2);
    }

    static {
        kge.a(-704846499);
        isSamplingRateCache = new ConcurrentHashMap();
    }

    public static boolean getSamplingValue(String str, String str2, Long l) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b075fe72", new Object[]{str, str2, l})).booleanValue();
        }
        String utdid = ApplicationUtil.getUTDID();
        String str3 = str + "_" + str2;
        if (isSamplingRateCache.containsKey(str3)) {
            return isSamplingRateCache.get(str3).booleanValue();
        }
        long hashDeviceId = (hashDeviceId(utdid) % 5000) + 5000;
        long j = 0;
        try {
            j = Long.parseLong(getValue(str, str2, String.valueOf(l == null ? 0L : l.longValue())));
        } catch (Throwable unused) {
        }
        long j2 = 10000 - j;
        if (j2 > hashDeviceId) {
            z = false;
        }
        TLog.loge("ConfigUtil", "isSamplingRate(" + str + "," + str2 + "," + l + "," + j2 + "," + hashDeviceId);
        isSamplingRateCache.put(str3, Boolean.valueOf(z));
        return z;
    }

    private static long hashDeviceId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9a65284", new Object[]{str})).longValue();
        }
        long j = 0;
        if (str == null) {
            return 0L;
        }
        char[] charArray = str.toCharArray();
        if (charArray.length > 0) {
            for (char c : charArray) {
                j = (j * 31) + c;
            }
        }
        return j;
    }

    public static String getValue(final String str, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d85580", new Object[]{str, str2, str3});
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, "");
        if (!StringUtils.isEmpty(config)) {
            return config;
        }
        OrangeConfig.getInstance().registerListener(new String[]{str}, new d() { // from class: com.taobao.message.kit.util.ConfigUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str4, Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str4, map});
                    return;
                }
                OrangeConfig.getInstance().unregisterListener(new String[]{str}, this);
                if (!StringUtils.equals(str4, str)) {
                    return;
                }
                String config2 = OrangeConfig.getInstance().getConfig(str, str2, "");
                SharedPreferences sharedPreferences = ApplicationUtil.getApplication().getSharedPreferences(ConfigUtil.SP_NAME, 0);
                if (!StringUtils.isEmpty(config2)) {
                    if (StringUtils.equals(sharedPreferences.getString(ConfigUtil.access$000(str, str2), null), config2)) {
                        return;
                    }
                    sharedPreferences.edit().putString(ConfigUtil.access$000(str, str2), config2).apply();
                } else if (!sharedPreferences.contains(ConfigUtil.access$000(str, str2))) {
                } else {
                    sharedPreferences.edit().remove(ConfigUtil.access$000(str, str2)).apply();
                }
            }
        }, true);
        return ApplicationUtil.getApplication().getSharedPreferences(SP_NAME, 0).getString(ofSPKey(str, str2), str3);
    }

    private static String ofSPKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7267cefa", new Object[]{str, str2});
        }
        return str + ":" + str2;
    }
}
