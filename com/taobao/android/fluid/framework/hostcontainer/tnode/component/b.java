package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.spz;

/* loaded from: classes5.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-153152811);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = null;
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getQueryParameter("extParams");
        }
        if (TextUtils.isEmpty(str2) || !str2.contains("default")) {
            z = false;
        }
        spz.a("TBVideoListComponentUtils", "isDefaultGuangguangtab3WithUrl:" + z);
        return z;
    }

    public static boolean a(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0efabcc", new Object[]{map, map2})).booleanValue();
        }
        List<Pair<String, Object>> list = null;
        List<Pair<String, Object>> a2 = map != null ? a(map) : null;
        if (map2 != null) {
            list = a(map2);
        }
        boolean z2 = map == null || map.isEmpty();
        boolean z3 = map2 == null || map2.isEmpty();
        if (!z2 || !z3) {
            z = false;
        }
        if (!z && map != null && map2 != null) {
            z = map.equals(map2);
        }
        if (a2 != null) {
            a(map, a2);
        }
        if (list != null) {
            a(map2, list);
        }
        return z;
    }

    private static List<Pair<String, Object>> a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{map});
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String[] split = a2.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            if (map.containsKey(str)) {
                arrayList.add(new Pair(str, map.remove(str)));
            }
        }
        return arrayList;
    }

    private static void a(Map map, List<Pair<String, Object>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560ac50e", new Object[]{map, list});
            return;
        }
        for (Pair<String, Object> pair : list) {
            map.put(pair.first, pair.second);
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : oeb.a("ShortVideo.detailRequestIgnoreParams", "switchMode,dataSource,refreshMode,globalUtParams");
    }
}
