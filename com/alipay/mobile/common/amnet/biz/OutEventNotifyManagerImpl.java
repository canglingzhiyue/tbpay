package com.alipay.mobile.common.amnet.biz;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.api.AmnetUserInfo;
import com.alipay.mobile.common.amnet.api.OutEventNotifyManager;
import com.alipay.mobile.common.amnet.api.model.AppEvent;
import com.alipay.mobile.common.amnet.api.monitor.TrafficMonitorService;
import com.alipay.mobile.common.amnet.biz.inner.AmnetNetInfoReceiver;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.amnet.Baggage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class OutEventNotifyManagerImpl implements OutEventNotifyManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void access$000(OutEventNotifyManagerImpl outEventNotifyManagerImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134619d6", new Object[]{outEventNotifyManagerImpl});
        } else {
            outEventNotifyManagerImpl.a();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifyAppLeaveEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf400562", new Object[]{this});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 1;
        appEvent.major = "background";
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifyAppResumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4205f3c", new Object[]{this});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 1;
        appEvent.major = "foreground";
        b().notifyAppEvent(appEvent);
        TrafficMonitorService.getInstance().setScene(TrafficMonitorService.SCENE_APP_BACKTOFG);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifySeceenOnEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9434889c", new Object[]{this});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 2;
        appEvent.major = "enable";
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifySeceenOffEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b113b18", new Object[]{this});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 2;
        appEvent.major = "disable";
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifyLoginOrLogoutEvent(String str, String str2, byte[] bArr) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d384136f", new Object[]{this, str, str2, bArr});
            return;
        }
        AmnetUserInfo.setUserInfo(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append("notifyLoginOrLogoutEvent,uid:");
        sb.append(str);
        sb.append(" ,sid:");
        sb.append(str2);
        sb.append(" ,syncExtParam:");
        if (bArr == null) {
            str3 = "is null";
        } else {
            str3 = bArr.length + " byte ";
        }
        sb.append(str3);
        LogCatUtil.debug("OutEventNotifyManager", sb.toString());
        if (!b().isNotifyLoginOut()) {
            LogCatUtil.debug("OutEventNotifyManager", "need't report login|logout event");
        } else if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            a(1, str, str2, bArr);
        } else {
            a(2, null, null, null);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifyMainProcExistStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e8bb5a", new Object[]{this, new Integer(i)});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 3;
        if (i == 1) {
            appEvent.major = "live";
        } else {
            appEvent.major = Baggage.Amnet.PROCESS_O;
        }
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifySwitchSmartHeartBeat(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f112cc", new Object[]{this, new Integer(i)});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 5;
        if (i == 2) {
            appEvent.major = "static";
        } else {
            appEvent.major = "dynamic";
        }
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifySwitchOrtt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7294663c", new Object[]{this, new Integer(i)});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 7;
        if (i == 1) {
            appEvent.major = "fast";
        } else {
            appEvent.major = "normal";
        }
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifySwitchDelayHandshake(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c83a30b", new Object[]{this, new Integer(i)});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 6;
        if (i == 1) {
            appEvent.major = Baggage.Amnet.SECURITY_DELAYED;
        } else {
            appEvent.major = Baggage.Amnet.SECURITY_INSTANT;
        }
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifyUpdateDnsInfo(byte b, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7e565a", new Object[]{this, new Byte(b), str});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 8;
        if (b == 1) {
            appEvent.major = Baggage.Amnet.ADDRESS_LONG;
            appEvent.minor = str;
        } else if (b == 2) {
            appEvent.major = Baggage.Amnet.ADDRESS_SHORT;
            appEvent.minor = str;
        } else if (b == 3) {
            appEvent.major = Baggage.Amnet.ADDRESS_ALL;
            appEvent.minor = str;
        } else if (b == 4) {
            appEvent.major = Baggage.Amnet.ADDRESS_MULTIPLEX;
            appEvent.minor = str;
        } else {
            LogCatUtil.info("OutEventNotifyManager", "Unknow dnsType=" + ((int) b));
        }
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void receiveNetInfo(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1a6cc", new Object[]{this, intent});
            return;
        }
        try {
            if (!AmnetNetInfoReceiver.started) {
                return;
            }
            LogCatUtil.debug("OutEventNotifyManager", "AmnetNetInfoReceiver already init,receiveNetInfo");
            AmnetNetInfoReceiver.getNetworkReceiver().onReceive(AmnetEnvHelper.getAppContext(), intent);
        } catch (Exception e) {
            LogCatUtil.error("OutEventNotifyManager", "receiveNetInfo exception", e);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifySceneEvent(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6433e2ec", new Object[]{this, str, new Boolean(z)});
            return;
        }
        try {
            LogCatUtil.debug("OutEventNotifyManager", "notifySceneEvent,scene:" + str + ",pass:" + z);
            AppEvent appEvent = new AppEvent();
            appEvent.id = 1L;
            appEvent.status = 11;
            appEvent.major = str;
            appEvent.minor = String.valueOf(z);
            b().notifyAppEvent(appEvent);
        } catch (Throwable th) {
            LogCatUtil.error("OutEventNotifyManager", "notifySceneEvent exception", th);
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifyResendInitInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b365d8", new Object[]{this});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 14;
        b().notifyAppEvent(appEvent);
    }

    @Override // com.alipay.mobile.common.amnet.api.OutEventNotifyManager
    public void notifyResendSessionid(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7f3ec8", new Object[]{this, str, str2});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 15;
        appEvent.major = str;
        appEvent.minor = str2;
        b().notifyAppEvent(appEvent);
    }

    public void notifyNetWorkEvent(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad4b63d8", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        b().notifyAppEvent(convert2AppEvent(z, i, i2));
        NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.amnet.biz.OutEventNotifyManagerImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    OutEventNotifyManagerImpl.access$000(OutEventNotifyManagerImpl.this);
                }
            }
        });
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LogCatUtil.info("OutEventNotifyManager", "notifyNetWorkEvent,notify update dns");
        String amnetDnsInfos = ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getAmnetDnsInfos();
        String amnetDnsInfosForShort = ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getAmnetDnsInfosForShort();
        String amnetDnsInfoForMultiplex = ((AmnetOperationManager) NetBeanFactory.getBean(AmnetOperationManager.class)).getAmnetDnsInfoForMultiplex();
        if (!StringUtils.isEmpty(amnetDnsInfos)) {
            LogCatUtil.debug("OutEventNotifyManager", "notifyNetWorkEvent,ipinfos:" + amnetDnsInfos);
            notifyUpdateDnsInfo((byte) 1, amnetDnsInfos);
        }
        if (!StringUtils.isEmpty(amnetDnsInfosForShort)) {
            LogCatUtil.debug("OutEventNotifyManager", "notifyNetWorkEvent,ipInfosForShort:" + amnetDnsInfosForShort);
            notifyUpdateDnsInfo((byte) 2, amnetDnsInfosForShort);
        }
        if (StringUtils.isEmpty(amnetDnsInfoForMultiplex)) {
            return;
        }
        LogCatUtil.debug("OutEventNotifyManager", "notifyNetWorkEvent,ipInfosForMultiplex:" + amnetDnsInfoForMultiplex);
        notifyUpdateDnsInfo((byte) 4, amnetDnsInfoForMultiplex);
    }

    private AmnetManagerImpl b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetManagerImpl) ipChange.ipc$dispatch("4383e156", new Object[]{this}) : (AmnetManagerImpl) NetBeanFactory.getBean(AmnetManagerImpl.class);
    }

    private void a(int i, String str, String str2, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d71bc36", new Object[]{this, new Integer(i), str, str2, bArr});
            return;
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 4;
        HashMap hashMap = new HashMap(1);
        if (bArr != null && bArr.length > 0) {
            hashMap.put((byte) 2, bArr);
        }
        if (i == 1) {
            appEvent.major = "login";
            appEvent.minor = str + "," + str2;
            appEvent.extMap = hashMap;
        } else {
            appEvent.major = Baggage.Amnet.USER_O;
            appEvent.minor = null;
            appEvent.extMap = hashMap;
        }
        b().notifyAppEvent(appEvent);
    }

    public static final AppEvent convert2AppEvent(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppEvent) ipChange.ipc$dispatch("ca073d86", new Object[]{new Boolean(z), new Integer(i), new Integer(i2)});
        }
        AppEvent appEvent = new AppEvent();
        appEvent.id = 1L;
        appEvent.status = 0;
        appEvent.major = "";
        appEvent.minor = "";
        if (!z) {
            appEvent.major = "none";
        } else {
            if (i == 1) {
                appEvent.major = "2g";
            } else if (i == 2) {
                appEvent.major = "3g";
            } else if (i == 3) {
                appEvent.major = "wifi";
            } else if (i == 4) {
                appEvent.major = "4g";
            } else {
                appEvent.major = "unknown";
            }
            if (i == 0) {
                return appEvent;
            }
            if (i != 3) {
                String connTypeName = ConnectionUtil.getConnTypeName(i2);
                if (!StringUtils.isEmpty(connTypeName)) {
                    appEvent.minor = connTypeName;
                }
            } else {
                try {
                    if (!MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext())) {
                        appEvent.minor = "unknow-ssid-unknow-bssid";
                    }
                } catch (Exception e) {
                    LogCatUtil.warn("OutEventNotifyManager", e);
                }
            }
        }
        return appEvent;
    }
}
