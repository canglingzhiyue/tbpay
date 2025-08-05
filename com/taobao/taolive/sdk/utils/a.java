package com.taobao.taolive.sdk.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pmf;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ABTestUtils";

    static {
        kge.a(-466921449);
    }

    public static void a(Map<String, List<String>> map, Object obj) {
        String str = "mtop-mdepyixiu";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3294b9", new Object[]{map, obj});
        } else if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                if (map.get(str) == null) {
                    str = "MTOP-mdepYixiu";
                }
                List<String> list = map.get(str);
                if (list != null && !list.isEmpty()) {
                    for (String str2 : list) {
                        JSONArray parseArray = JSON.parseArray(str2);
                        if (parseArray != null && !parseArray.isEmpty()) {
                            for (int i = 0; i < parseArray.size(); i++) {
                                Object obj2 = parseArray.get(i);
                                pmf t = pmd.a().t();
                                if (t != null && obj2 != null) {
                                    t.a(obj2.toString(), obj);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
