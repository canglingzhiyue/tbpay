package com.taobao.search.m3.image;

import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f19110a;
    private c b;
    private final View c;
    private final boolean d;

    static {
        kge.a(-684996812);
        kge.a(1001207257);
    }

    public e(View view, boolean z) {
        q.c(view, "view");
        this.c = view;
        this.d = z;
    }

    @Override // com.taobao.search.m3.image.d
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        d dVar = this.f19110a;
        if (dVar == null) {
            return;
        }
        dVar.m();
    }

    @Override // com.taobao.search.m3.image.d
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        d dVar = this.f19110a;
        if (dVar == null) {
            return;
        }
        dVar.n();
    }

    @Override // com.taobao.search.m3.image.d
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        d dVar = this.f19110a;
        if (dVar == null) {
            return;
        }
        dVar.o();
    }

    @Override // com.taobao.search.m3.image.d
    public void a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62777d7", new Object[]{this, cVar, new Boolean(z)});
        } else if (this.b == cVar) {
        } else {
            d dVar = this.f19110a;
            if (dVar != null) {
                dVar.n();
            }
            f fVar = null;
            this.f19110a = null;
            this.b = cVar;
            if (cVar == null) {
                return;
            }
            int b = cVar.b();
            if (b == 1) {
                fVar = new f(this.c, this.d, z);
            } else if (b == 2) {
                fVar = new j(this.c, this.d);
            } else if (b == 3) {
                fVar = new b(this.c, this.d, z);
            }
            if (fVar == null) {
                return;
            }
            this.f19110a = fVar;
            d dVar2 = this.f19110a;
            if (dVar2 != null) {
                dVar2.a(cVar, z);
            }
            this.c.requestLayout();
        }
    }

    @Override // com.taobao.search.m3.image.d
    public void a(Canvas cns) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, cns});
            return;
        }
        q.c(cns, "cns");
        d dVar = this.f19110a;
        if (dVar == null) {
            return;
        }
        dVar.a(cns);
    }
}
