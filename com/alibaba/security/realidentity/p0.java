package com.alibaba.security.realidentity;

import android.os.Message;
import com.alibaba.security.realidentity.algo.wrapper.entity.ABDetectPhase;
import com.alibaba.security.realidentity.algo.wrapper.entity.detector.ABDetectType;
import com.alibaba.security.realidentity.algo.wrapper.entity.result.ABActionResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class p0 extends s0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ABDetectType f3483a;

        public a(ABDetectType aBDetectType) {
            this.f3483a = aBDetectType;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f3483a == ABDetectType.DONE || !p0.this.c.G()) {
            } else {
                p0.this.c.b(4, this.f3483a);
            }
        }
    }

    public p0(t0 t0Var) {
        super(t0Var);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ABDetectType s = this.c.s();
        if (s == ABDetectType.DONE) {
            if (this.c.A()) {
                this.c.b(x0.k);
            } else {
                this.g.b(e2.P);
            }
        }
        this.c.z().postDelayed(new a(s), 100L);
    }

    public static /* synthetic */ Object ipc$super(p0 p0Var, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        if (message.what != 5) {
            return false;
        }
        a((c0) message.obj);
        return true;
    }

    private void a(c0 c0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26afe85", new Object[]{this, c0Var});
        } else if (d() != ABDetectPhase.ACTION_BEGIN) {
        } else {
            a(ABDetectPhase.ACTION_END);
            ABActionResult u = this.c.u();
            if (u != null) {
                u.ecResult = c0Var.b();
            }
            if (this.c.q() == null || this.f.a() == ABDetectType.BLINK || this.f.a() == ABDetectType.MOUTH || this.f.a() == ABDetectType.BLINK_STILL || this.f.a() == ABDetectType.MOUTH_STILL) {
                if (!this.c.O()) {
                    this.g.b(e2.P);
                    return;
                }
                this.c.M();
                this.c.N();
                this.c.a(c0Var);
            }
            this.c.c(6, new f0(this.c.s(), this.c.t(), this.c.k()));
            this.c.a(u);
            this.c.J();
            f();
        }
    }
}
