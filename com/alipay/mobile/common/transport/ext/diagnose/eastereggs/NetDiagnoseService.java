package com.alipay.mobile.common.transport.ext.diagnose.eastereggs;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetDiagnoseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static NetDiagnoseService f5538a;

    public static NetDiagnoseService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetDiagnoseService) ipChange.ipc$dispatch("f6637b61", new Object[0]);
        }
        NetDiagnoseService netDiagnoseService = f5538a;
        if (netDiagnoseService != null) {
            return netDiagnoseService;
        }
        synchronized (NetDiagnoseService.class) {
            if (f5538a != null) {
                return f5538a;
            }
            f5538a = new NetDiagnoseService();
            return f5538a;
        }
    }

    private NetDiagnoseService() {
    }

    public void launch(DiagnoseResult diagnoseResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f166bec4", new Object[]{this, diagnoseResult});
        } else {
            ExtTransportOffice.getInstance().diagnoseForEasterEggs(diagnoseResult);
        }
    }
}
