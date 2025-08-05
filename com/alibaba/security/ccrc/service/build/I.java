package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.enums.RunState;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class I implements InterfaceC1257vb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f3246a;

    public I(M m) {
        this.f3246a = m;
    }

    @Override // com.alibaba.security.ccrc.service.build.InterfaceC1257vb
    public void a(boolean z, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2499ee8f", new Object[]{this, new Boolean(z), str, map});
        } else {
            M.a(this.f3246a, z ? RunState.PREPARE_SUCCESS : RunState.INITIAL);
        }
    }
}
