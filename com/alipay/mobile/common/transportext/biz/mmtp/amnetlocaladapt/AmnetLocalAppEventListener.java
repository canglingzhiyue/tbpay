package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import android.content.Intent;
import com.alipay.mobile.common.amnet.api.OutEventNotifyManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.util.SecureRunnable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AmnetLocalAppEventListener extends EventInterfaceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetLocalAppEventListener f5683a;

    public static /* synthetic */ Object ipc$super(AmnetLocalAppEventListener amnetLocalAppEventListener, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSyncInitChanged(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
        }
    }

    public static /* synthetic */ OutEventNotifyManager access$000(AmnetLocalAppEventListener amnetLocalAppEventListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutEventNotifyManager) ipChange.ipc$dispatch("f29bc380", new Object[]{amnetLocalAppEventListener}) : amnetLocalAppEventListener.a();
    }

    public static final AmnetLocalAppEventListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalAppEventListener) ipChange.ipc$dispatch("57a76667", new Object[0]);
        }
        AmnetLocalAppEventListener amnetLocalAppEventListener = f5683a;
        if (amnetLocalAppEventListener != null) {
            return amnetLocalAppEventListener;
        }
        synchronized (AmnetLocalAppEventListener.class) {
            if (f5683a != null) {
                return f5683a;
            }
            f5683a = new AmnetLocalAppEventListener();
            return f5683a;
        }
    }

    private AmnetLocalAppEventListener() {
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f150c6", new Object[]{this});
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onSeceenOnEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifySeceenOnEvent();
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onSeceenOffEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ed782e", new Object[]{this});
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onSeceenOffEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifySeceenOffEvent();
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppLeaveEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfccd8c", new Object[]{this});
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onAppLeaveEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifyAppLeaveEvent();
                }
            });
        }
    }

    @Override // com.alipay.mobile.common.transportext.biz.appevent.EventInterfaceAdapter, com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
    public void onAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
        } else {
            NetworkAsyncTaskExecutor.execute(new SecureRunnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt.AmnetLocalAppEventListener.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.common.transportext.biz.util.SecureRunnable
                public void call() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f5a39fe5", new Object[]{this});
                        return;
                    }
                    LogCatUtil.printInfo("AmnetLocalAppEventListener", "onAppResumeEvent");
                    AmnetLocalAppEventListener.access$000(AmnetLocalAppEventListener.this).notifyAppResumeEvent();
                }
            });
        }
    }

    public void onNetworkChanged(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7be629", new Object[]{this, intent});
        } else if (!AmnetHelper.getAmnetManager().isActivated()) {
        } else {
            LogCatUtil.printInfo("AmnetLocalAppEventListener", "onNetworkChanged");
            a().receiveNetInfo(intent);
        }
    }

    private OutEventNotifyManager a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OutEventNotifyManager) ipChange.ipc$dispatch("d23dcb26", new Object[]{this}) : AmnetHelper.getAmnetManager().getOutEventNotifyManager();
    }
}
