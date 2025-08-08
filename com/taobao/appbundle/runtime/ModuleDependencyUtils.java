package com.taobao.appbundle.runtime;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class ModuleDependencyUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(937167940);
    }

    public static List<String> getDependencies(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("78a11b57", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return new ArrayList();
        }
        if (b.a().c(str) == null) {
            return new ArrayList();
        }
        ArrayList<String> arrayList = new ArrayList(b.a().c(str).dependencies);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            if (b.a().c(str2) == null) {
                arrayList2.add(str2);
            }
        }
        arrayList.removeAll(arrayList2);
        return arrayList;
    }
}
