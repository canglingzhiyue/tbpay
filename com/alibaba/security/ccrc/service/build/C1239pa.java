package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.client.smart.core.core.WuKongNativeManager;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.android.alibaba.ip.runtime.IpChange;

/* renamed from: com.alibaba.security.ccrc.service.build.pa  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1239pa implements OnRemoteSoLoadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OnRemoteSoLoadListener f3319a;
    public final /* synthetic */ WuKongNativeManager b;

    public C1239pa(WuKongNativeManager wuKongNativeManager, OnRemoteSoLoadListener onRemoteSoLoadListener) {
        this.b = wuKongNativeManager;
        this.f3319a = onRemoteSoLoadListener;
    }

    @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
    public void onResult(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3180a11", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        if (!z) {
            Logging.w(WuKongNativeManager.f3341a, "load wukong so fail: " + str2);
            WuKongNativeManager.a(this.b, str, str2);
        } else {
            Logging.d(WuKongNativeManager.f3341a, "load wukong so success");
        }
        this.f3319a.onResult(str, z, str2);
    }
}
