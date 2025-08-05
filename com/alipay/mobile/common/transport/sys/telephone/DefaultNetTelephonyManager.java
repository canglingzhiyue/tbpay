package com.alipay.mobile.common.transport.sys.telephone;

import android.content.Context;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DefaultNetTelephonyManager extends NetTelephonyManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private TelephonyManager f5615a;

    public DefaultNetTelephonyManager() {
        this.f5615a = (TelephonyManager) TransportEnvUtil.getContext().getSystemService("phone");
    }

    public DefaultNetTelephonyManager(Context context) {
        this.f5615a = (TelephonyManager) context.getSystemService("phone");
    }

    @Override // com.alipay.mobile.common.transport.sys.telephone.NetTelephonyManagerAdapter, com.alipay.mobile.common.transport.sys.telephone.NetTelephonyManager
    public CellLocation getCellLocation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CellLocation) ipChange.ipc$dispatch("ded9583", new Object[]{this});
        }
        try {
            if (MiscUtils.isAtFrontDesk(TransportEnvUtil.getContext())) {
                return this.f5615a.getCellLocation();
            }
            return null;
        } catch (Throwable th) {
            LogCatUtil.error("DefaultNetTelephonyManager", "getCellLocation ex= " + th.toString());
            return null;
        }
    }
}
