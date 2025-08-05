package com.alipay.mobile.common.transportext.biz.mmtp;

import android.content.Context;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcDataListenService;
import com.alipay.mobile.common.amnet.ipcapi.mainproc.MainProcGeneralListenService;
import com.alipay.mobile.common.ipc.api.IPCApiFactory;
import com.alipay.mobile.common.ipc.api.ServiceBeanManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportClient;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transportext.biz.appevent.AppEventManager;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetAppEventListener;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.AcceptDataListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.foreign.GeneralEventListenServiceImpl;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.MRpcClient;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerAdapter;
import com.alipay.mobile.common.transportext.biz.sync.SyncDataListanerImpl;
import com.alipay.mobile.common.transportext.biz.sync.SyncDataListanerImplDirect;
import com.alipay.mobile.common.transportext.biz.sync.SyncGeneralListenerImpl;
import com.alipay.mobile.common.transportext.biz.sync.SyncManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MMTPTransportManager extends ExtTransportManagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f5675a = false;
    private Context b;

    public static /* synthetic */ Object ipc$super(MMTPTransportManager mMTPTransportManager, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerAdapter, com.alipay.mobile.common.transportext.api.ExtTransportManager
    public synchronized void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.b = context;
        if (this.f5675a) {
            return;
        }
        this.f5675a = true;
        if (MiscUtils.isOtherProcess(context)) {
            LogCatUtil.info("MMTPTransportManager", "init.  Other process don't init mmtp");
            return;
        }
        AmnetEnvHelper.setAppContext(ExtTransportEnv.getAppContext());
        AppEventManager.register(AmnetAppEventListener.getInstance());
        AmnetHelper.getAmnetManager().addGeneraEventListener(MMTPGeneralListenerImpl.getInstance());
        SyncManager.onInitialize();
        AmnetHelper.getAmnetManager().addSyncAcceptDataListener(SyncDataListanerImpl.getInstance());
        AmnetHelper.getAmnetManager().addSyncDirectAcceptDataListener(SyncDataListanerImplDirect.getInstance());
        AmnetHelper.getAmnetManager().addGeneraEventListener(SyncGeneralListenerImpl.getInstance());
        MRpcConnection.getInstance();
        a();
        LogCatUtil.info("MMTPTransportManager", "Main Process init finish!!");
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ServiceBeanManager singletonServiceBeanManager = IPCApiFactory.getSingletonServiceBeanManager();
        singletonServiceBeanManager.register(MainProcDataListenService.class.getName(), AcceptDataListenServiceImpl.getInstance());
        singletonServiceBeanManager.register(MainProcGeneralListenService.class.getName(), GeneralEventListenServiceImpl.getInstance());
    }

    @Override // com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerAdapter, com.alipay.mobile.common.transportext.api.ExtTransportManager
    public ExtTransportClient getExtTransportClient(Context context, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExtTransportClient) ipChange.ipc$dispatch("a5b8e4cb", new Object[]{this, context, transportContext});
        }
        if (!this.f5675a) {
            synchronized (this) {
                if (!this.f5675a) {
                    init(context);
                }
            }
        }
        return MRpcClient.getInstance(context);
    }

    @Override // com.alipay.mobile.common.transportext.biz.shared.ExtTransportManagerAdapter, com.alipay.mobile.common.transportext.api.ExtTransportManager
    public boolean isInited() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[]{this})).booleanValue() : this.f5675a;
    }
}
