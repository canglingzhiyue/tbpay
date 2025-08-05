package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mfj;
import tb.pmd;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-618968269);
    }

    public static void a(Map<String, List<String>> map, Object obj) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3294b9", new Object[]{map, obj});
        } else if (map != null) {
            try {
                if (!map.isEmpty() && (list = map.get("mtop-mdepyixiu")) != null && !list.isEmpty()) {
                    for (String str : list) {
                        JSONArray parseArray = JSON.parseArray(str);
                        if (parseArray != null && !parseArray.isEmpty()) {
                            for (int i = 0; i < parseArray.size(); i++) {
                                Object obj2 = parseArray.get(i);
                                if (obj2 != null) {
                                    UTABTest.activateServer(obj2.toString(), obj);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                mfj.c(com.taobao.taolive.sdk.utils.a.TAG, e.getMessage());
            }
        }
    }

    private static String a(String str, String str2, String str3, String str4) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4});
        }
        if (i.h() && pmd.a().t() != null) {
            return pmd.a().t().b(str, str2, str3, str4);
        }
        try {
            VariationSet activateSync = EVO.activateSync(str, str2, null, null);
            if (activateSync != null && (variation = activateSync.getVariation(str3)) != null) {
                return variation.getValueAsString(str4);
            }
        } catch (Throwable unused) {
        }
        return str4;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : l.a(a("taolive", "channelHomeTabClickedToRefreshData", "value", "true"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : a("taolive", "enableDXABTest", "value", "normal");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : l.a(a("taolive", "enableH5Search1", "value", "false"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : l.a(a("taolive", "enableWalle4Back", "value", "false"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : l.a(a("tao_live_home_new_search_ab_component", "tao_live_home_new_search_ab_module", "tao_live_home_new_search_bar", "false"));
    }
}
