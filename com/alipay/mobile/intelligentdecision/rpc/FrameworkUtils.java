package com.alipay.mobile.intelligentdecision.rpc;

import android.text.TextUtils;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FrameworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        String currentUid = DecisionContext.getInstance().getCurrentUid();
        return TextUtils.isEmpty(currentUid) ? "" : currentUid;
    }
}
