package com.taobao.message.lab.comfrm.inner2;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import tb.kge;

/* loaded from: classes7.dex */
public class DiffDispatchTransfomer implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DiffTransfomer mDiffTransformer;

    static {
        kge.a(-160017047);
        kge.a(1437606424);
    }

    public DiffDispatchTransfomer(DiffTransfomer diffTransfomer) {
        this.mDiffTransformer = diffTransfomer;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        Diff diff = sharedState.getDiff();
        DiffResult transform = this.mDiffTransformer.transform(action, sharedState, diff);
        if (transform == null) {
            return sharedState;
        }
        if (transform.getSharedState() == sharedState) {
            return transform.getSharedState();
        }
        if (transform.getDiff() == null || transform.getDiff() == diff) {
            return transform.getSharedState();
        }
        return transform.getSharedState().setDiff(transform.getDiff());
    }
}
