package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.kge;
import tb.kyu;
import tb.oqk;

/* loaded from: classes7.dex */
public class i extends oqk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<kyu> f17509a = new HashSet(8);

    static {
        kge.a(-1415293168);
    }

    public void a(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20ac4b1", new Object[]{this, kyuVar});
        } else if (kyuVar == null) {
        } else {
            this.f17509a.add(kyuVar);
        }
    }

    public void b(kyu kyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08dcb32", new Object[]{this, kyuVar});
        } else if (kyuVar == null) {
        } else {
            this.f17509a.remove(kyuVar);
        }
    }

    @Override // tb.oqk
    public void du_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e66375", new Object[]{this});
            return;
        }
        for (kyu kyuVar : this.f17509a) {
            kyuVar.c().h();
        }
    }

    @Override // tb.oqk
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (kyu kyuVar : this.f17509a) {
            kyuVar.c().m();
        }
    }

    @Override // tb.oqk
    public void dw_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5014b3", new Object[]{this});
            return;
        }
        for (kyu kyuVar : this.f17509a) {
            kyuVar.c().e();
        }
    }

    @Override // tb.oqk
    public void dS_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce19e57", new Object[]{this});
            return;
        }
        for (kyu kyuVar : this.f17509a) {
            kyuVar.c().f();
        }
    }

    @Override // tb.oqk
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        for (kyu kyuVar : this.f17509a) {
            kyuVar.c().n();
        }
    }

    @Override // tb.oqk
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (kyu kyuVar : this.f17509a) {
            kyuVar.c().c();
        }
    }

    @Override // tb.oqk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (kyu kyuVar : this.f17509a) {
            kyuVar.c().d();
        }
    }
}
