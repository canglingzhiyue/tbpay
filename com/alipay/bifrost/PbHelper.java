package com.alipay.bifrost;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PbHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final StrStrItem newStrStrItem(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrStrItem) ipChange.ipc$dispatch("f9309e23", new Object[]{str, str2});
        }
        StrStrItem strStrItem = new StrStrItem();
        strStrItem.key = str;
        strStrItem.val = str2;
        return strStrItem;
    }
}
