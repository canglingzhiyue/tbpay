package com.alibaba.triver.triver_shop.newShop;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.s;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopActivity$continueActivityOnCreate$4 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $containerRealStart;
    public final /* synthetic */ long $containerStart;
    public final /* synthetic */ Intent $targetIntent;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$continueActivityOnCreate$4(ShopActivity shopActivity, long j, long j2, Intent intent) {
        super(0);
        this.this$0 = shopActivity;
        this.$containerStart = j;
        this.$containerRealStart = j2;
        this.$targetIntent = intent;
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
        ShopActivity shopActivity = this.this$0;
        d dVar = ShopActivity.$ipChange;
        String str = null;
        if (dVar == null) {
            q.b("shopDataParser");
            throw null;
        }
        h.b(dVar);
        ShopActivity shopActivity2 = this.this$0;
        d dVar2 = ShopActivity.$ipChange;
        if (dVar2 == null) {
            q.b("shopDataParser");
            throw null;
        }
        dVar2.b("containerStart", Long.valueOf(this.$containerStart));
        ShopActivity shopActivity3 = this.this$0;
        d dVar3 = ShopActivity.$ipChange;
        if (dVar3 == null) {
            q.b("shopDataParser");
            throw null;
        }
        dVar3.b(g.KEY_CONTAINER_INIT_START, Long.valueOf(this.$containerRealStart));
        ShopActivity shopActivity4 = this.this$0;
        d dVar4 = ShopActivity.$ipChange;
        if (dVar4 == null) {
            q.b("shopDataParser");
            throw null;
        }
        dVar4.k(g.KEY_CONTAINER_FINISH);
        ShopActivity shopActivity5 = this.this$0;
        d dVar5 = ShopActivity.$ipChange;
        if (dVar5 == null) {
            q.b("shopDataParser");
            throw null;
        }
        Intent intent = this.$targetIntent;
        ShopActivity shopActivity6 = this.this$0;
        d dVar6 = ShopActivity.$ipChange;
        if (dVar6 == null) {
            q.b("shopDataParser");
            throw null;
        }
        h.a(dVar5, intent, dVar6.j());
        com.taobao.monitor.procedure.g b = s.f18233a.b(this.this$0);
        Uri data = this.$targetIntent.getData();
        if (data != null) {
            str = data.toString();
        }
        b.a(g.KEY_APM_SHOP_URL, str);
    }
}
