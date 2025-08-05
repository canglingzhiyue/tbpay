package com.alipay.android.msp.core.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.sys.NetConnectionType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspNetWorkStateReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f4528a;

    public MspNetWorkStateReceiver(int i) {
        this.f4528a = i;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f4528a);
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                LogUtil.record(8, "MspNetWorkStateReceiver:onReceive", "isAvailable false , mspContext=".concat(String.valueOf(mspContextByBizId)));
                AlertIntelligenceEngine.startAction(mspContextByBizId, "sys", "ne_disconnected", "", "");
                return;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    return;
                }
                LogUtil.record(8, "MspNetWorkStateReceiver:onReceive", "wifi , mspContext=".concat(String.valueOf(mspContextByBizId)));
                AlertIntelligenceEngine.startAction(mspContextByBizId, "sys", "ne_wifi", "", "");
                return;
            }
            NetConnectionType typeByCode = NetConnectionType.getTypeByCode(activeNetworkInfo.getSubtype());
            LogUtil.record(8, "MspNetWorkStateReceiver:onReceive", typeByCode.getName() + " , mspContext=" + mspContextByBizId);
            if (mspContextByBizId == null) {
                return;
            }
            AlertIntelligenceEngine.startAction(mspContextByBizId, "sys", "ne_" + typeByCode.getName(), "", "");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
