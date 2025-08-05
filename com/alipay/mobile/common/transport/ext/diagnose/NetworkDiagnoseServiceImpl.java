package com.alipay.mobile.common.transport.ext.diagnose;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetworkDiagnoseServiceImpl implements NetworkDiagnoseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private NetworkDiagnoseService f5537a = ExtTransportOffice.getInstance().getNetworkDiagnoseService();

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void addDiagnoseListener(NetworkDiagnoseListener networkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c72636", new Object[]{this, networkDiagnoseListener});
        } else {
            this.f5537a.addDiagnoseListener(networkDiagnoseListener);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void removeDiagnoseListener(NetworkDiagnoseListener networkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f927cd33", new Object[]{this, networkDiagnoseListener});
        } else {
            this.f5537a.removeDiagnoseListener(networkDiagnoseListener);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void startDiagnose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77e18c7", new Object[]{this});
        } else {
            this.f5537a.startDiagnose();
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else {
            this.f5537a.cancel();
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public boolean isCanDiagnose() {
        NetworkDiagnoseService networkDiagnoseService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0c690af", new Object[]{this})).booleanValue();
        }
        if (!ExtTransportOffice.getInstance().isEnableExtTransport(TransportEnvUtil.getContext()) || (networkDiagnoseService = this.f5537a) == null) {
            return false;
        }
        return networkDiagnoseService.isCanDiagnose();
    }
}
