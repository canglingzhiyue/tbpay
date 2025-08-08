package com.taobao.android.detail.ttdetail.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2120342145);
    }

    public static boolean a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{str, list})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return str == null;
        }
        for (String str2 : list) {
            if (StringUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
