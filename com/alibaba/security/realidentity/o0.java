package com.alibaba.security.realidentity;

import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABActionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class o0 extends s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public o0(t0 t0Var) {
        super(t0Var);
    }

    public static /* synthetic */ Object ipc$super(o0 o0Var, String str, Object... objArr) {
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
        if (message.what != 4) {
            return false;
        }
        Object obj = message.obj;
        if (obj != null) {
            a((ABDetectType) obj);
        }
        return true;
    }

    @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        if (d() == ABDetectPhase.ACTION_END) {
            return;
        }
        e().actionList.clear();
    }

    private void a(ABDetectType aBDetectType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e7836b", new Object[]{this, aBDetectType});
            return;
        }
        a(ABDetectPhase.ACTION_BEGIN);
        this.c.b(new ABActionResult());
        this.c.u().actionType = aBDetectType.getValue();
        e().addActionResult(this.c.u());
        this.c.c(5, new f0(aBDetectType, this.c.t(), this.c.k()));
        this.c.a(aBDetectType, true, true);
    }
}
