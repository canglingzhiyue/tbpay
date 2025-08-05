package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopDXEngine$downgradeToMiniAppShop$block$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDXEngine$downgradeToMiniAppShop$block$1(e eVar) {
        super(0);
        this.this$0 = eVar;
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
            return;
        }
        e eVar = this.this$0;
        if (e.$ipChange.isFinishing()) {
            return;
        }
        e eVar2 = this.this$0;
        if (e.$ipChange) {
            return;
        }
        e.a(this.this$0, true);
        e eVar3 = this.this$0;
        Intent intent = e.$ipChange.getIntent();
        Uri a2 = f.a(intent == null ? null : intent.getData());
        if (a2 == null) {
            e eVar4 = this.this$0;
            e.$ipChange.finish();
            return;
        }
        e eVar5 = this.this$0;
        Nav.from(e.$ipChange).toUri(a2);
        e eVar6 = this.this$0;
        e.$ipChange.finish();
    }
}
