package com.alibaba.security.realidentity;

import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ALBiometricsResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class r0 extends s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public r0(t0 t0Var) {
        super(t0Var);
    }

    public static /* synthetic */ Object ipc$super(r0 r0Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        if (message.what != 3) {
            return false;
        }
        a((c0) message.obj);
        return true;
    }

    private void a(c0 c0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26afe85", new Object[]{this, c0Var});
        } else if (d() != ABDetectPhase.ADJUST_BEGIN) {
        } else {
            a(ABDetectPhase.ADJUST_END);
            this.c.a(c0Var);
            ALBiometricsResult r = this.c.r();
            if (r != null) {
                r.adjustAction.ecResult = c0Var.b();
            }
            this.c.e(4);
            if (this.e.getBiometricsConfig().actionCount == 0) {
                this.c.b(x0.k);
            }
            if (this.e.getBiometricsConfig().actionCount != 0 || !this.e.getBiometricsConfig().needDisplayWaitingView || this.e.getBiometricsConfig().imageCount <= 1) {
                return;
            }
            this.c.a(System.currentTimeMillis());
            this.c.d(1);
            this.c.a(true);
        }
    }
}
