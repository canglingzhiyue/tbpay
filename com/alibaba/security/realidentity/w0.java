package com.alibaba.security.realidentity;

import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class w0 extends s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public w0(t0 t0Var) {
        super(t0Var);
    }

    public static /* synthetic */ Object ipc$super(w0 w0Var, String str, Object... objArr) {
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
        int i = message.what;
        if (i != 99) {
            if (i == 100 || i == 887) {
                b(message);
                a(this.c.y());
            } else if (i == 998) {
                a(this.c.y());
            } else if (i != 999 && i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        b(message);
                        a(this.c.o());
                    } else if (i == 3) {
                        b(message);
                        a(this.c.p());
                    } else if (i == 4) {
                        b(message);
                        a(this.c.l());
                    } else if (i != 5) {
                        return false;
                    } else {
                        b(message);
                        a(this.c.m());
                    }
                } else if (this.e.getBiometricsConfig().stepAdjust) {
                    this.c.b(2);
                } else {
                    t0 t0Var = this.c;
                    t0Var.b(4, t0Var.J());
                }
            }
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
        a(ABDetectPhase.INIT);
        HashMap hashMap = new HashMap();
        hashMap.put("detectType", e0.a(this.e.getBiometricsType()) ? "colorful" : "action");
        hashMap.put("actionType", b.a(this.c.n()));
        hashMap.put("maxRetryTimes", 6);
        o.b().a(9, (Map<String, Object>) hashMap);
    }
}
