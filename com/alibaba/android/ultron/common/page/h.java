package com.alibaba.android.ultron.common.page;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bim;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ERROR_DISMISS = 2;
    public static final int TYPE_QUERY_PULL_REFRESH = 2;
    public static final int TYPE_QUERY_REQUEST = 1;

    /* renamed from: a  reason: collision with root package name */
    private i f2529a;
    private g b;
    private d c;

    static {
        kge.a(-1864241824);
    }

    public h(i iVar) {
        this.f2529a = iVar;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = new g();
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7fcb5a9", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    public void a(bim bimVar) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ca0c12", new Object[]{this, bimVar});
            return;
        }
        d dVar = this.c;
        if (dVar == null || (iVar = this.f2529a) == null) {
            return;
        }
        dVar.a(iVar, iVar.e(), 2, bimVar);
    }

    public void b(bim bimVar) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04d1293", new Object[]{this, bimVar});
            return;
        }
        d dVar = this.c;
        if (dVar == null || (iVar = this.f2529a) == null) {
            return;
        }
        dVar.a(iVar, iVar.e(), 1, bimVar);
    }

    public void a(int i) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        g gVar = this.b;
        if (gVar == null || (iVar = this.f2529a) == null) {
            return;
        }
        gVar.a(iVar, iVar.e(), i);
    }

    public void b(int i) {
        i iVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        g gVar = this.b;
        if (gVar == null || (iVar = this.f2529a) == null) {
            return;
        }
        gVar.b(iVar, iVar.e(), i);
    }
}
