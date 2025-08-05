package com.alipay.mobile.common.transport.sys.telephone;

import android.telephony.CellLocation;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetTelephonyManagerAdapter implements NetTelephonyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.sys.telephone.NetTelephonyManager
    public CellLocation getCellLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CellLocation) ipChange.ipc$dispatch("ded9583", new Object[]{this});
        }
        return null;
    }
}
