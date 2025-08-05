package com.alibaba.triver.triver_shop.extension;

import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopCommonActivityLifeCycle$onDestroyed$1$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onDestroyed$1$1(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
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
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle = this.this$0;
        try {
            Result.a aVar = Result.Companion;
            ShopWrapWebView e = ShopCommonActivityLifeCycle.$ipChange.e();
            if (e != null) {
                e.destroy();
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }
}
