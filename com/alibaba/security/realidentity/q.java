package com.alibaba.security.realidentity;

import android.content.Context;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String g = "q";
    public u4 c;
    public RPBizConfig e;
    public boolean f;

    /* renamed from: a  reason: collision with root package name */
    public Context f3487a = null;
    public t0 b = null;
    public boolean d = false;

    public q(Context context, RPBizConfig rPBizConfig, u4 u4Var, i0 i0Var) {
        a(context, rPBizConfig, u4Var, i0Var);
    }

    private void a(Context context, RPBizConfig rPBizConfig, u4 u4Var, i0 i0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13cf2fd2", new Object[]{this, context, rPBizConfig, u4Var, i0Var});
            return;
        }
        this.f3487a = context;
        this.e = rPBizConfig;
        this.c = u4Var;
        this.b = new t0(context, this, rPBizConfig, u4Var, i0Var);
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[]{this}) : this.f3487a;
    }

    public RPBizConfig c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RPBizConfig) ipChange.ipc$dispatch("70aafe10", new Object[]{this}) : this.e;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.d) {
            g();
        }
        t0 t0Var = this.b;
        if (t0Var == null) {
            return;
        }
        t0Var.K();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d) {
        } else {
            if (!this.f) {
                a(TrackLog.createBioMonitorAlgoStartLog(a()));
                this.f = true;
            }
            this.b.L();
            this.d = true;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.d) {
        } else {
            if (!this.f) {
                a(TrackLog.createBioMonitorAlgoStartLog(a()));
                this.f = true;
            }
            this.b.P();
            this.d = true;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.d = false;
            this.b.S();
        }
    }

    public void a(byte[] bArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ecb514", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.d) {
        } else {
            this.b.a(bArr, i, i2, i3);
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detectType", e0.a(this.e.getBiometricsType()) ? "colorful" : "action");
        hashMap.put("wukongSwitch", String.valueOf(this.e.getDegradeConfig().isWukongEnabled));
        return b.a((Object) hashMap);
    }

    public void a(TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6099b195", new Object[]{this, trackLog});
        } else {
            this.c.a(this.e.getBasicsConfig().verifyToken, trackLog);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b.c(i);
        }
    }
}
