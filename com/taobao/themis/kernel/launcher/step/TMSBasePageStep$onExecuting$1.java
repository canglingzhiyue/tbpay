package com.taobao.themis.kernel.launcher.step;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.e;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.qqa;
import tb.ruk;
import tb.suc;
import tb.thk;
import tb.xla;

/* loaded from: classes9.dex */
public final class TMSBasePageStep$onExecuting$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSBasePageStep$onExecuting$1(b bVar) {
        super(0);
        this.this$0 = bVar;
    }

    @Override // tb.ruk
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2427invoke() {
        mo2427invoke();
        return t.INSTANCE;
    }

    @Override // tb.ruk
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (this.this$0.f22538a == null) {
        } else {
            f mInstance = this.this$0.f22538a;
            q.b(mInstance, "mInstance");
            if (mInstance.s()) {
                return;
            }
            f mInstance2 = this.this$0.f22538a;
            q.b(mInstance2, "mInstance");
            mInstance2.D().a("firstPageStartCreate");
            f mInstance3 = this.this$0.f22538a;
            q.b(mInstance3, "mInstance");
            thk a2 = com.taobao.themis.kernel.utils.a.a(mInstance3);
            if (a2 != null) {
                a2.a("firstPageStartCreate");
            }
            f mInstance4 = this.this$0.f22538a;
            q.b(mInstance4, "mInstance");
            mInstance4.k().a("firstPageRenderStart");
            f mInstance5 = this.this$0.f22538a;
            q.b(mInstance5, "mInstance");
            thk a3 = com.taobao.themis.kernel.utils.a.a(mInstance5);
            if (a3 != null) {
                a3.a("engineInitStart");
            }
            ITMSPage f = this.this$0.f();
            if (f == null) {
                this.this$0.a(e.g);
                return;
            }
            if (n.bV()) {
                Object b = this.this$0.f22538a.b(suc.class);
                if (!(b instanceof xla)) {
                    b = null;
                }
                xla xlaVar = (xla) b;
                if (xlaVar != null) {
                    xlaVar.a(f);
                }
            }
            f mInstance6 = this.this$0.f22538a;
            q.b(mInstance6, "mInstance");
            mInstance6.k().a("firstPageCreated");
            f.a(new qqa.a() { // from class: com.taobao.themis.kernel.launcher.step.TMSBasePageStep$onExecuting$1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qqa.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        TMSBasePageStep$onExecuting$1.this.this$0.b.d();
                    }
                }

                @Override // tb.qqa.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    TMSBasePageStep$onExecuting$1.this.this$0.b.c();
                    f mInstance7 = TMSBasePageStep$onExecuting$1.this.this$0.f22538a;
                    q.b(mInstance7, "mInstance");
                    mInstance7.k().a("firstPageRenderSuccess");
                }
            });
            this.this$0.c();
        }
    }
}
