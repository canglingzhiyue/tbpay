package com.alipay.mobile.common.transportext.biz.sync;

import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SyncDataListanerImplDirect extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile SyncDataListanerImplDirect f5701a;

    private SyncDataListanerImplDirect() {
    }

    public static synchronized SyncDataListanerImplDirect getInstance() {
        synchronized (SyncDataListanerImplDirect.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SyncDataListanerImplDirect) ipChange.ipc$dispatch("2939e62e", new Object[0]);
            }
            LogUtilAmnet.d("amnet_SyncDataListanerImplDirect", "SyncDataListanerImpl: getInstance ");
            if (f5701a == null) {
                f5701a = new SyncDataListanerImplDirect();
            }
            return f5701a;
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void onAcceptedDataEvent(AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
            return;
        }
        LogUtilAmnet.d("amnet_SyncDataListanerImplDirect", "onAcceptedDataEvent: ");
        SyncManager.onAcceptedDataEvent(acceptedData);
    }
}
