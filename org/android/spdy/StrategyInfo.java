package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class StrategyInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int seq;
    private StrategyStatus status;
    private String tunnelHost;
    private int tunnelPort;

    /* loaded from: classes.dex */
    public enum StrategyStatus {
        UNUSED(0),
        SUCCESS(1),
        FAIL(2);
        
        private int strategyStatus;

        StrategyStatus(int i) {
            this.strategyStatus = i;
        }

        public static StrategyStatus valueOf(int i) {
            return i != 1 ? i != 2 ? UNUSED : FAIL : SUCCESS;
        }

        public int getStrategyStatusInt() {
            return this.strategyStatus;
        }

        public void setStrategyStatus(int i) {
            this.strategyStatus = i;
        }
    }

    public StrategyInfo(String str, int i, int i2) {
        this.status = StrategyStatus.UNUSED;
        this.tunnelPort = 443;
        this.tunnelHost = str;
        if (i > 0) {
            this.tunnelPort = i;
        }
        this.seq = i2 < 0 ? -i2 : i2;
    }

    public StrategyInfo(StrategyInfo strategyInfo) {
        this.status = StrategyStatus.UNUSED;
        this.tunnelPort = 443;
        if (strategyInfo != null) {
            this.tunnelHost = strategyInfo.tunnelHost;
            this.tunnelPort = strategyInfo.tunnelPort;
            this.seq = strategyInfo.seq;
            this.status = strategyInfo.status;
        }
    }

    public String infoToString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("190009ff", new Object[]{this});
        }
        return this.tunnelHost + "_" + this.tunnelPort + "_" + this.seq;
    }

    public void setStrategyStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1913e175", new Object[]{this, new Integer(i)});
        } else {
            this.status.setStrategyStatus(i);
        }
    }

    public String getTunnelStrategyHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50137660", new Object[]{this}) : this.tunnelHost;
    }

    public int getTunnelStrategySeq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e8ed328", new Object[]{this})).intValue() : this.seq;
    }

    public int getTunnelStrategyPort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3238548c", new Object[]{this})).intValue() : this.tunnelPort;
    }

    public StrategyStatus getTunnelStrategyStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StrategyStatus) ipChange.ipc$dispatch("83e690a5", new Object[]{this}) : this.status;
    }
}
