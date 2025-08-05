package com.taobao.themis.open.packages.downloader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.Error;
import com.taobao.zcache.PackUpdateFinishedCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class e implements PackUpdateFinishedCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ruw f22676a;

    public e(ruw ruwVar) {
        this.f22676a = ruwVar;
    }

    @Override // com.taobao.zcache.PackUpdateFinishedCallback
    public final /* synthetic */ void finish(String str, Error error) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd8ffc9", new Object[]{this, str, error});
        } else {
            q.b(this.f22676a.mo2423invoke(str, error), "invoke(...)");
        }
    }
}
