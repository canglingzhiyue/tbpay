package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.alibaba.secutiry.mnn.pykit.PythonKitManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class Xb implements OnRemoteSoLoadListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener
    public void onResult(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3180a11", new Object[]{this, str, new Boolean(z), str2});
        } else if (!z) {
        } else {
            PythonKitManager.nPyKitInit();
        }
    }
}
