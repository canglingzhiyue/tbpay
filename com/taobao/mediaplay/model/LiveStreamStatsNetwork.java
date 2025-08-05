package com.taobao.mediaplay.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class LiveStreamStatsNetwork implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LiveStreamStatsNetworkVatsb vatsb;

    static {
        kge.a(297117067);
        kge.a(1028243835);
    }

    public void copy(LiveStreamStatsNetwork liveStreamStatsNetwork) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d86b1a", new Object[]{this, liveStreamStatsNetwork});
        } else {
            this.vatsb = liveStreamStatsNetwork.vatsb;
        }
    }
}
