package com.taobao.android.detail.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.evb;
import tb.kge;
import tb.riy;
import tb.tpc;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1521282522);
        tpc.a("com.taobao.android.detail.sdk.utils.DetailMonitorUtils");
    }

    public static void a(ArrayList<MainViewModel> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{arrayList});
        } else if (arrayList == null || arrayList.isEmpty()) {
        } else {
            StringBuilder sb = new StringBuilder("componentList=");
            Iterator<MainViewModel> it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                MainViewModel next = it.next();
                String str = next.component.key + riy.PLUS + next.component.ruleId;
                if (next.mNodeBundle != null && next.mNodeBundle.traceDatasNode != null) {
                    Iterator<String> it2 = next.mNodeBundle.traceDatasNode.trackData.keySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (str.equalsIgnoreCase(it2.next())) {
                                sb.append(str);
                                sb.append(";");
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (!z) {
                return;
            }
            evb.a("Page_Detail", 19999, "Page_Detail-Monitor", null, null, sb.toString());
        }
    }

    public static String[] a(Map<String, String> map) {
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
