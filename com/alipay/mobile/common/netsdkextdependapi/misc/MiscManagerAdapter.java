package com.alipay.mobile.common.netsdkextdependapi.misc;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class MiscManagerAdapter implements MiscManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.netsdkextdependapi.misc.MiscManager
    public ArrayList<String> getHighAvailUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("e06aa6ad", new Object[]{this, str, str2});
        }
        return null;
    }
}
