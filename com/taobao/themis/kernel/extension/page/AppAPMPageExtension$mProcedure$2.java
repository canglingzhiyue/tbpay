package com.taobao.themis.kernel.extension.page;

import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.qpm;
import tb.qqc;
import tb.ruk;

/* loaded from: classes9.dex */
public final class AppAPMPageExtension$mProcedure$2 extends Lambda implements ruk<com.taobao.monitor.procedure.g> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAPMPageExtension$mProcedure$2(a aVar) {
        super(0);
        this.this$0 = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.ruk
    /* renamed from: invoke */
    public final com.taobao.monitor.procedure.g mo2427invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.monitor.procedure.g) ipChange.ipc$dispatch("5267eb23", new Object[]{this});
        }
        Fragment fragment = null;
        if (qqc.a(this.this$0.d())) {
            if (this.this$0.d().b().q().isFragmentContainer()) {
                com.taobao.monitor.procedure.s sVar = com.taobao.monitor.procedure.s.f18233a;
                qpm f = this.this$0.d().f();
                if (f != null) {
                    fragment = f.getCurrentFragment();
                }
                return sVar.b(fragment);
            }
            qpm f2 = this.this$0.d().f();
            if ((f2 != null ? f2.getCurrentFragment() : null) != null) {
                com.taobao.monitor.procedure.s sVar2 = com.taobao.monitor.procedure.s.f18233a;
                qpm f3 = this.this$0.d().f();
                if (f3 != null) {
                    fragment = f3.getCurrentFragment();
                }
                return sVar2.b(fragment);
            }
            return com.taobao.monitor.procedure.s.f18233a.b(this.this$0.d().b().o());
        }
        com.taobao.monitor.procedure.s sVar3 = com.taobao.monitor.procedure.s.f18233a;
        qpm f4 = this.this$0.d().f();
        if (f4 != null) {
            fragment = f4.getCurrentFragment();
        }
        return sVar3.b(fragment);
    }
}
