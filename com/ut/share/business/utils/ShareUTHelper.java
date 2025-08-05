package com.ut.share.business.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareUTHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "TB-Share";

    static {
        kge.a(-1091579439);
    }

    public static void traceExpose(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f916c10b", new Object[]{str, map});
        } else {
            TBS.Ext.commitEvent(MODULE_NAME, 2201, str, null, null, map2List(map));
        }
    }

    public static void traceClick(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f58371", new Object[]{str, map});
        } else {
            TBS.Ext.commitEvent(MODULE_NAME, 2101, str, null, null, map2List(map));
        }
    }

    private static String[] map2List(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("1b4f4cd9", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        String[] strArr = new String[map.size()];
        for (String str : map.keySet()) {
            strArr[i] = str + "=" + map.get(str);
            i++;
        }
        return strArr;
    }
}
