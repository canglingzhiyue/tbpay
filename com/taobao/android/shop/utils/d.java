package com.taobao.android.shop.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(111189208);
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else if (str == null || str2 == null || str3 == null || str4 == null) {
        } else {
            TBS.Adv.ctrlClickedOnPage(str, CT.valueOf(str2), str3, str4);
        }
    }
}
