package com.taobao.android.detail.ttdetail.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.skr;

/* loaded from: classes5.dex */
public class ae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(582178828);
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("featureType", str);
        }
        skr.a(map);
    }

    public static void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else {
            skr.a(i, str);
        }
    }

    public static void a(Map<String, String> map, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be93f8d0", new Object[]{map, new Integer(i), str});
        } else {
            skr.a(map, i, str);
        }
    }
}
