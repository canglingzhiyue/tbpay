package com.taobao.tbpoplayer.track.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.util.e;
import tb.kge;
import tb.qnz;

/* loaded from: classes8.dex */
public class TrackAppMonitorConfig extends TrackUTConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean useConfigCheckFail = false;
    public volatile boolean onePopOnlyResult = false;
    public volatile int jumpLoseJumpCount = 3;

    static {
        kge.a(-126990162);
    }

    @Override // com.taobao.tbpoplayer.track.model.TrackUTConfig
    public boolean getCategoryHit(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79248f08", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (!z) {
            return this.hitResultMap != null && (!this.hitResultMap.containsKey(str) || this.hitResultMap.get(str).booleanValue());
        }
        return e.a(this.percentMap.get(str).intValue(), e.b(qnz.a().b() + System.currentTimeMillis()));
    }
}
