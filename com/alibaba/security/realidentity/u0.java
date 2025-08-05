package com.alibaba.security.realidentity;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class u0 extends s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public u0(t0 t0Var) {
        super(t0Var);
    }

    @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        return true;
    }
}
