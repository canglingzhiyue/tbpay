package com.alibaba.triver.triver_shop.newShop.view.provider;

import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class RemoteClassDelegateContentRender$remoteClassInitFailed$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteClassDelegateContentRender$remoteClassInitFailed$1(d dVar) {
        super(0);
        this.this$0 = dVar;
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
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        d dVar = this.this$0;
        try {
            Result.a aVar = Result.Companion;
            d.a(dVar, true);
            d.$ipChange.removeView(d.$ipChange);
            o.a(d.$ipChange, com.alibaba.triver.triver_shop.newShop.ext.h.b(d.$ipChange));
            com.alibaba.triver.triver_shop.newShop.data.d g = d.$ipChange.g();
            if (g != null) {
                g.b("ShopPageErrorByRemoteModuleLoadFailed", d.$ipChange.f());
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }
}
