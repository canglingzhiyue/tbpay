package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.ariver.app.api.App;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class MiniAppShopContentRender$PreloadCallback$onGetDataCenter$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $dataCenter;
    public final /* synthetic */ MiniAppShopContentRender this$0;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MiniAppShopContentRender f3881a;
        public final /* synthetic */ String b;

        public a(MiniAppShopContentRender miniAppShopContentRender, String str) {
            this.f3881a = miniAppShopContentRender;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            App a2 = this.f3881a.a();
            if (a2 == null) {
                return;
            }
            a2.putStringValue("shopDataCenter", this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender$PreloadCallback$onGetDataCenter$1(MiniAppShopContentRender miniAppShopContentRender, String str) {
        super(0);
        this.this$0 = miniAppShopContentRender;
        this.$dataCenter = str;
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
        a aVar = new a(this.this$0, this.$dataCenter);
        MiniAppShopContentRender miniAppShopContentRender = this.this$0;
        if (MiniAppShopContentRender.$ipChange) {
            aVar.run();
            return;
        }
        MiniAppShopContentRender miniAppShopContentRender2 = this.this$0;
        MiniAppShopContentRender.$ipChange.add(aVar);
    }
}
