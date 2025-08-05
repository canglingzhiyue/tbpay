package com.alibaba.triver.triver_shop.extension;

import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.manager.e;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopCommonActivityLifeCycle$onPaused$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $currentPauseTime;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onPaused$1(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle, long j) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
        this.$currentPauseTime = j;
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
        long j = this.$currentPauseTime;
        try {
            Result.a aVar = Result.Companion;
            if (!ShopCommonActivityLifeCycle.$ipChange) {
                ShopCommonActivityLifeCycle.$ipChange.c(g.KEY_SHOP_NAVI_END, Long.valueOf(j));
                ShopCommonActivityLifeCycle.$ipChange.c(g.KEY_FIRST_LEAVE_SHOP_TIME, Long.valueOf(j));
                if (!q.a((Object) ShopCommonActivityLifeCycle.$ipChange.as(), (Object) e.XSD_SHOP)) {
                    h.a(ShopCommonActivityLifeCycle.$ipChange);
                }
                ShopCommonActivityLifeCycle.a(shopCommonActivityLifeCycle, true);
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
