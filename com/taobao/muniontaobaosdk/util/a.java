package com.taobao.muniontaobaosdk.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MACROS_TANX_MONITOR_PLACEHOLDER = "__EXT_MAP__";

    static {
        kge.a(-1110302873);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.contains(MACROS_TANX_MONITOR_PLACEHOLDER)) ? str : str.replace(MACROS_TANX_MONITOR_PLACEHOLDER, str2);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value) && str.contains(key)) {
                        str = str.replace(key, value);
                    }
                }
            }
        }
        return str;
    }
}
