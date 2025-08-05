package com.taobao.mediaplay.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class LiveStreamStatsInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LiveStreamStatsNetwork network;

    static {
        kge.a(-1548804495);
        kge.a(1028243835);
    }

    public void copy(LiveStreamStatsInfo liveStreamStatsInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3126661a", new Object[]{this, liveStreamStatsInfo});
        } else {
            this.network = liveStreamStatsInfo.network;
        }
    }
}
