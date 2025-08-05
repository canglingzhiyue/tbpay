package com.alibaba.android.aura;

import com.android.alibaba.ip.runtime.IpChange;
import tb.arl;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class n implements arl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private f mExtensionManager;
    private q mUserContext;

    static {
        kge.a(-872533273);
        kge.a(-299618871);
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.mUserContext = qVar;
        this.mExtensionManager = fVar;
    }

    public final q getUserContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("7fa6d4aa", new Object[]{this}) : this.mUserContext;
    }

    public f getExtensionManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("9e303cdf", new Object[]{this}) : this.mExtensionManager;
    }
}
