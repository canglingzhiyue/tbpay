package com.alipay.mobile.common.transport.monitor;

import android.net.TrafficStats;
import com.alipay.mobile.common.transport.monitor.networkqos.DeviceTrafficManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mto;

/* loaded from: classes3.dex */
public class DeviceTrafficStateInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long mMobileRxBytes;
    public long mMobileTxBytes;
    public long mTotalRxBytes;
    public long mTotalTxBytes;
    public long mUpdateTime;

    /* loaded from: classes3.dex */
    public class DeviceTrafficStateInfoDelta {
        public double mDeltaTS;
        public long mDiffMobileRxBytes;
        public long mDiffMobileTxBytes;
        public long mDiffTotalRxBytes;
        public long mDiffTotalTxBytes;

        public DeviceTrafficStateInfoDelta(DeviceTrafficStateInfo deviceTrafficStateInfo, DeviceTrafficStateInfo deviceTrafficStateInfo2) {
            this.mDiffTotalRxBytes = 0L;
            this.mDiffMobileRxBytes = 0L;
            this.mDiffTotalTxBytes = 0L;
            this.mDiffMobileTxBytes = 0L;
            this.mDeltaTS = mto.a.GEO_NOT_SUPPORT;
            try {
                this.mDeltaTS = (deviceTrafficStateInfo2.mUpdateTime - deviceTrafficStateInfo.mUpdateTime) / 1000.0d;
                this.mDiffMobileRxBytes = deviceTrafficStateInfo2.mMobileRxBytes - deviceTrafficStateInfo.mMobileRxBytes;
                this.mDiffTotalRxBytes = deviceTrafficStateInfo2.mTotalRxBytes - deviceTrafficStateInfo.mTotalRxBytes;
                this.mDiffMobileTxBytes = deviceTrafficStateInfo2.mMobileTxBytes - deviceTrafficStateInfo.mMobileTxBytes;
                this.mDiffTotalTxBytes = deviceTrafficStateInfo2.mTotalTxBytes - deviceTrafficStateInfo.mTotalTxBytes;
                DeviceTrafficManager.getInstance().calcSpeedAndBandwidth(this.mDiffTotalRxBytes + this.mDiffTotalTxBytes, this.mDeltaTS);
                LogCatUtil.debug("DTStatInfo", "Diffs - TRX:" + this.mDiffTotalRxBytes + ",TTX:" + this.mDiffTotalTxBytes + ",TMRX:" + this.mDiffMobileRxBytes + ",TMTX:" + this.mDiffMobileTxBytes + ",TTS:" + this.mDeltaTS);
            } catch (Throwable th) {
                LogCatUtil.error("DTStatInfo", th);
            }
        }
    }

    public DeviceTrafficStateInfo() {
        this.mTotalRxBytes = 0L;
        this.mMobileRxBytes = 0L;
        this.mTotalTxBytes = 0L;
        this.mMobileTxBytes = 0L;
        this.mMobileRxBytes = TrafficStats.getMobileRxBytes();
        if (this.mMobileRxBytes == -1) {
            LogCatUtil.debug("DTStatInfo", "TrafficStats for mobile seems not supported");
        }
        this.mMobileTxBytes = TrafficStats.getMobileTxBytes();
        this.mTotalRxBytes = TrafficStats.getTotalRxBytes();
        this.mTotalTxBytes = TrafficStats.getTotalTxBytes();
        this.mUpdateTime = System.currentTimeMillis();
    }

    public DeviceTrafficStateInfoDelta getDiff(DeviceTrafficStateInfo deviceTrafficStateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceTrafficStateInfoDelta) ipChange.ipc$dispatch("93670672", new Object[]{this, deviceTrafficStateInfo});
        }
        if (deviceTrafficStateInfo != null) {
            return new DeviceTrafficStateInfoDelta(this, deviceTrafficStateInfo);
        }
        LogCatUtil.debug("DTStatInfo", "Can't calculate diff");
        return null;
    }
}
