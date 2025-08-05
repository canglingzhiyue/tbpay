package com.alibaba.ut.abtest.push;

import com.alibaba.ut.abtest.internal.util.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bwq;

/* loaded from: classes3.dex */
public class UTABPushClientImpl implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UTABPushClientImpl";

    @Override // com.alibaba.ut.abtest.push.f
    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
            return;
        }
        try {
            com.alibaba.ut.abtest.internal.util.e.a(bwq.a().b());
        } catch (Exception e) {
            h.c(TAG, "UTABPushClientImpl init fail", e);
        }
        b.a().b();
        c.a().b();
    }

    @Override // com.alibaba.ut.abtest.push.f
    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else {
            c.a().c();
        }
    }

    @Override // com.alibaba.ut.abtest.push.f
    public void syncExperiments(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2daadc", new Object[]{this, new Boolean(z), str});
        } else {
            c.a().a(str);
        }
    }

    @Override // com.alibaba.ut.abtest.push.f
    public boolean isCrowd(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8f53f8", new Object[]{this, str})).booleanValue() : b.a().a(str);
    }

    @Override // com.alibaba.ut.abtest.push.f
    public void cancelSyncCrowd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e07a99ff", new Object[]{this});
        } else {
            b.a().c();
        }
    }
}
