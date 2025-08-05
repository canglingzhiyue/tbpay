package com.alibaba.security.realidentity;

import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class q0 extends s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public q0(t0 t0Var) {
        super(t0Var);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a(ABDetectPhase.ADJUST_BEGIN);
        this.c.a(ABDetectType.KEEP_STILL, false, false);
        this.c.e(3);
    }

    public static /* synthetic */ Object ipc$super(q0 q0Var, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        if (message.what != 2) {
            return false;
        }
        f();
        return true;
    }

    @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            super.b();
        }
    }
}
