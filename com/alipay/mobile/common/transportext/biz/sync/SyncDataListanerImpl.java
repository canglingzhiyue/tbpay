package com.alipay.mobile.common.transportext.biz.sync;

import com.alipay.mobile.common.amnet.api.AmnetListenerAdpter;
import com.alipay.mobile.common.amnet.api.model.AcceptedData;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SyncDataListanerImpl extends AmnetListenerAdpter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile SyncDataListanerImpl f5700a;

    private SyncDataListanerImpl() {
    }

    public static SyncDataListanerImpl getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SyncDataListanerImpl) ipChange.ipc$dispatch("12494217", new Object[0]);
        }
        LogUtilAmnet.d("amnet_SyncDataListanerImpl", "SyncDataListanerImpl: getInstance ");
        if (f5700a == null) {
            synchronized (SyncDataListanerImpl.class) {
                f5700a = new SyncDataListanerImpl();
            }
        }
        return f5700a;
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetListenerAdpter, com.alipay.mobile.common.amnet.api.AcceptDataListener
    public void onAcceptedDataEvent(AcceptedData acceptedData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4098", new Object[]{this, acceptedData});
            return;
        }
        LogUtilAmnet.d("amnet_SyncDataListanerImpl", "onAcceptedDataEvent: ");
        SyncManager.onAcceptedDataEvent(acceptedData);
    }
}
