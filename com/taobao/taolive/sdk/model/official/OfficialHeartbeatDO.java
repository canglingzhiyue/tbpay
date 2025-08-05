package com.taobao.taolive.sdk.model.official;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class OfficialHeartbeatDO implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public HeartBeatConfig heartBeatConfig;

    static {
        kge.a(-2023344377);
        kge.a(-540945145);
    }

    /* loaded from: classes8.dex */
    public class HeartBeatConfig implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final long DEFAULT_INTERVAL = 15000;
        public long interval;

        static {
            kge.a(1427194817);
            kge.a(-540945145);
        }

        public HeartBeatConfig() {
        }

        public long getInterval() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34e1136", new Object[]{this})).longValue();
            }
            long j = this.interval;
            if (j > 0) {
                return j * 1000;
            }
            return 15000L;
        }
    }

    public HeartBeatConfig getHeartBeatConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HeartBeatConfig) ipChange.ipc$dispatch("9ebc5c1f", new Object[]{this}) : this.heartBeatConfig;
    }

    public void setHeartBeatConfig(HeartBeatConfig heartBeatConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c87fd", new Object[]{this, heartBeatConfig});
        } else {
            this.heartBeatConfig = heartBeatConfig;
        }
    }
}
