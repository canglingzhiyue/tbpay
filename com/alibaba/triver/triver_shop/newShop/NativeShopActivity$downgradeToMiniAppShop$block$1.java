package com.alibaba.triver.triver_shop.newShop;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class NativeShopActivity$downgradeToMiniAppShop$block$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$downgradeToMiniAppShop$block$1(NativeShopActivity nativeShopActivity) {
        super(0);
        this.this$0 = nativeShopActivity;
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
        } else if (this.this$0.isFinishing()) {
        } else {
            NativeShopActivity nativeShopActivity = this.this$0;
            if (NativeShopActivity.$ipChange) {
                return;
            }
            NativeShopActivity.d(this.this$0, true);
            NativeShopActivity nativeShopActivity2 = this.this$0;
            Uri uri = NativeShopActivity.$ipChange;
            if (uri == null) {
                this.this$0.finish();
                return;
            }
            Nav.from(this.this$0).toUri(uri);
            this.this$0.finish();
        }
    }
}
