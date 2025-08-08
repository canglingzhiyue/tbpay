package com.alipay.mobile.common.amnet.service;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.amnet.service.ipcservice.OutEventNotifyServiceImpl;
import com.alipay.mobile.common.amnet.service.util.AmnetManagerFactory;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetBeanFactory;
import com.alipay.mobile.common.utils.config.ConfigureChangedListener;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;

/* loaded from: classes3.dex */
public class AmnetLinkStrategy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b = "";
    private String c = "";
    private String d = "";

    /* renamed from: a  reason: collision with root package name */
    private TransportConfigureManager f5371a = TransportConfigureManager.getInstance();

    /* loaded from: classes3.dex */
    public class AmnetLinkConfigureChangedListener implements ConfigureChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AmnetLinkConfigureChangedListener() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
                return;
            }
            try {
                if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
                    LogCatUtil.printInfo("AmnetLinkStrategy", "Can't use amnet, return.");
                    return;
                }
                String stringValue = AmnetLinkStrategy.access$000(AmnetLinkStrategy.this).getStringValue(TransportConfigureItem.AMNET_SMART_HEARTBEAT);
                String stringValue2 = AmnetLinkStrategy.access$000(AmnetLinkStrategy.this).getStringValue(TransportConfigureItem.AMNET_ORTT);
                String stringValue3 = AmnetLinkStrategy.access$000(AmnetLinkStrategy.this).getStringValue(TransportConfigureItem.AMNET_DELAY_HANDSHAKE);
                if (!StringUtils.equals(stringValue, AmnetLinkStrategy.access$100(AmnetLinkStrategy.this))) {
                    AmnetLinkStrategy.access$102(AmnetLinkStrategy.this, stringValue);
                    AmnetLinkStrategy.this.notifySwitchSmartHeartBeat();
                }
                if (!StringUtils.equals(stringValue2, AmnetLinkStrategy.access$200(AmnetLinkStrategy.this))) {
                    AmnetLinkStrategy.access$202(AmnetLinkStrategy.this, stringValue2);
                    AmnetLinkStrategy.this.notifySwitchOrtt();
                }
                if (StringUtils.equals(stringValue3, AmnetLinkStrategy.access$300(AmnetLinkStrategy.this))) {
                    return;
                }
                AmnetLinkStrategy.access$302(AmnetLinkStrategy.this, stringValue3);
                AmnetLinkStrategy.this.notifySwitchDelayHandshake();
            } catch (Throwable th) {
                LogCatUtil.error("AmnetLinkStrategy", th);
            }
        }
    }

    public static /* synthetic */ TransportConfigureManager access$000(AmnetLinkStrategy amnetLinkStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportConfigureManager) ipChange.ipc$dispatch("642472c8", new Object[]{amnetLinkStrategy}) : amnetLinkStrategy.f5371a;
    }

    public static /* synthetic */ String access$100(AmnetLinkStrategy amnetLinkStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("53a0c811", new Object[]{amnetLinkStrategy}) : amnetLinkStrategy.b;
    }

    public static /* synthetic */ String access$102(AmnetLinkStrategy amnetLinkStrategy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3742985", new Object[]{amnetLinkStrategy, str});
        }
        amnetLinkStrategy.b = str;
        return str;
    }

    public static /* synthetic */ String access$200(AmnetLinkStrategy amnetLinkStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("82523230", new Object[]{amnetLinkStrategy}) : amnetLinkStrategy.c;
    }

    public static /* synthetic */ String access$202(AmnetLinkStrategy amnetLinkStrategy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c00e9e4", new Object[]{amnetLinkStrategy, str});
        }
        amnetLinkStrategy.c = str;
        return str;
    }

    public static /* synthetic */ String access$300(AmnetLinkStrategy amnetLinkStrategy) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b1039c4f", new Object[]{amnetLinkStrategy}) : amnetLinkStrategy.d;
    }

    public static /* synthetic */ String access$302(AmnetLinkStrategy amnetLinkStrategy, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("348daa43", new Object[]{amnetLinkStrategy, str});
        }
        amnetLinkStrategy.d = str;
        return str;
    }

    public static final AmnetLinkStrategy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AmnetLinkStrategy) ipChange.ipc$dispatch("436e35fb", new Object[0]) : (AmnetLinkStrategy) NetBeanFactory.getBean(AmnetLinkStrategy.class);
    }

    public AmnetLinkStrategy() {
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = this.f5371a.getStringValue(TransportConfigureItem.AMNET_SMART_HEARTBEAT);
        this.c = this.f5371a.getStringValue(TransportConfigureItem.AMNET_ORTT);
        this.d = this.f5371a.getStringValue(TransportConfigureItem.AMNET_DELAY_HANDSHAKE);
        this.f5371a.addConfigureChangedListener(new AmnetLinkConfigureChangedListener());
    }

    public boolean isUseSmartHeartBeat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f869533b", new Object[]{this})).booleanValue() : MiscUtils.grayscale(this.b);
    }

    public boolean isUseOrtt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5de579cb", new Object[]{this})).booleanValue() : MiscUtils.grayscale(this.c);
    }

    public boolean isUseDelayHandshake() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a343f1c", new Object[]{this})).booleanValue() : MiscUtils.grayscale(this.d);
    }

    public void notifySwitchSmartHeartBeat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc07c317", new Object[]{this});
            return;
        }
        OutEventNotifyServiceImpl outEventNotifyServiceImpl = (OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance();
        if (isUseSmartHeartBeat()) {
            outEventNotifyServiceImpl.notifySwitchSmartHeartBeat(1);
        } else {
            outEventNotifyServiceImpl.notifySwitchSmartHeartBeat(2);
        }
    }

    public void notifySwitchOrtt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf441a7", new Object[]{this});
            return;
        }
        OutEventNotifyServiceImpl outEventNotifyServiceImpl = (OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance();
        if (isUseOrtt()) {
            outEventNotifyServiceImpl.notifySwitchOrtt(1);
        } else {
            outEventNotifyServiceImpl.notifySwitchOrtt(2);
        }
    }

    public void notifySwitchDelayHandshake() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd2aef8", new Object[]{this});
            return;
        }
        OutEventNotifyServiceImpl outEventNotifyServiceImpl = (OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance();
        if (isUseDelayHandshake()) {
            outEventNotifyServiceImpl.notifySwitchDelayHandshake(1);
        } else {
            outEventNotifyServiceImpl.notifySwitchDelayHandshake(2);
        }
    }

    public void notifyUpdateAllDnsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9435e02f", new Object[]{this});
            return;
        }
        OutEventNotifyServiceImpl outEventNotifyServiceImpl = (OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance();
        String amnetDnsInfos = AmnetManagerFactory.getInstance().getAmnetDnsInfos();
        String amnetDnsInfosForShort = AmnetManagerFactory.getInstance().getAmnetDnsInfosForShort();
        String amnetDnsInfosForMultiplex = AmnetManagerFactory.getInstance().getAmnetDnsInfosForMultiplex();
        if (!StringUtils.isEmpty(amnetDnsInfos)) {
            LogCatUtil.debug("AmnetLinkStrategy", "notifyUpdateAllDnsInfo,ipinfos:" + amnetDnsInfos);
            outEventNotifyServiceImpl.notifyUpdateDnsInfo((byte) 1, amnetDnsInfos);
        }
        if (!StringUtils.isEmpty(amnetDnsInfosForShort)) {
            LogCatUtil.debug("AmnetLinkStrategy", "notifyUpdateAllDnsInfo,ipInfosForShort:" + amnetDnsInfosForShort);
            outEventNotifyServiceImpl.notifyUpdateDnsInfo((byte) 2, amnetDnsInfosForShort);
        }
        if (StringUtils.isEmpty(amnetDnsInfosForMultiplex)) {
            return;
        }
        LogCatUtil.debug("AmnetLinkStrategy", "notifyUpdateAllDnsInfo,ipInfosForMultiplex:" + amnetDnsInfosForMultiplex);
        outEventNotifyServiceImpl.notifyUpdateDnsInfo((byte) 4, amnetDnsInfosForMultiplex);
    }
}
