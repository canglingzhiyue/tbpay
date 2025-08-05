package com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1913204548);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.UTUtils");
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else {
            a(2101, str, map);
        }
    }

    public static void a(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{new Integer(i), str, map});
        } else if (map == null || str == null) {
        } else {
            epj.j().commitEvent("Page_Detail", i, str, null, null, a(map));
        }
    }

    private static String[] a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ab7e78ac", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        String[] strArr = {""};
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        int i = 0;
        for (Map.Entry<String, String> entry : entrySet) {
            if (i == entrySet.size() - 1) {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue();
            } else {
                strArr[0] = strArr[0] + entry.getKey() + "=" + entry.getValue() + ",";
            }
            i++;
        }
        return strArr;
    }
}
