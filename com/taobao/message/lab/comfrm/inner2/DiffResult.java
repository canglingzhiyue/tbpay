package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public final class DiffResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Diff diff;
    private final SharedState sharedState;

    static {
        kge.a(-378865757);
    }

    public DiffResult(SharedState sharedState, Diff diff) {
        this.sharedState = sharedState;
        this.diff = diff;
    }

    public SharedState getSharedState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedState) ipChange.ipc$dispatch("7043125d", new Object[]{this}) : this.sharedState;
    }

    public Diff getDiff() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Diff) ipChange.ipc$dispatch("e180228d", new Object[]{this}) : this.diff;
    }
}
