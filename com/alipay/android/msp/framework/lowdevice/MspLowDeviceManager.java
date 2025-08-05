package com.alipay.android.msp.framework.lowdevice;

import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspLowDeviceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f4794a;
    private boolean b;

    /* loaded from: classes3.dex */
    public static final class Host {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final MspLowDeviceManager f4795a = new MspLowDeviceManager();

        private Host() {
        }

        public static /* synthetic */ MspLowDeviceManager a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MspLowDeviceManager) ipChange.ipc$dispatch("342d8c2", new Object[0]) : f4795a;
        }
    }

    private MspLowDeviceManager() {
        this.b = false;
        this.f4794a = false;
    }

    public static MspLowDeviceManager getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspLowDeviceManager) ipChange.ipc$dispatch("2c65fed8", new Object[0]) : Host.a();
    }

    public boolean isLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[]{this})).booleanValue();
        }
        if (!this.f4794a) {
            checkLowDevice();
        }
        LogUtil.record(2, "MspLowDeviceManager:isLowDevice", "lowDevice=" + this.b);
        return this.b;
    }

    public boolean checkLowDevice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f011a62d", new Object[]{this})).booleanValue();
        }
        this.f4794a = true;
        this.b = PhoneCashierMspEngine.getMspWallet().isLowDevice();
        LogUtil.record(2, "MspLowDeviceManager:checkLowDevice", "lowDevice=" + this.b);
        return this.b;
    }
}
