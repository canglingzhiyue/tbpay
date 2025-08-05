package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.sa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1247sa implements OnRemoteSoLoadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnRemoteSoLoadListener f3326a;
    public final /* synthetic */ C1250ta b;

    public C1247sa(C1250ta c1250ta, OnRemoteSoLoadListener onRemoteSoLoadListener) {
        this.b = c1250ta;
        this.f3326a = onRemoteSoLoadListener;
    }

    @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
    public void onResult(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3180a11", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        this.b.f3328a.put(str, Boolean.valueOf(z));
        this.f3326a.onResult(str, z, str2);
    }
}
