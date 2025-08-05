package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.ariver.app.api.App;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.t;
import tb.ruk;

/* loaded from: classes3.dex */
public final class MiniAppShopContentRender$PreloadCallback$onGetShopLogoAndName$1 extends Lambda implements ruk<t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $shopLogo;
    public final /* synthetic */ String $shopName;
    public final /* synthetic */ MiniAppShopContentRender this$0;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MiniAppShopContentRender f3884a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public a(MiniAppShopContentRender miniAppShopContentRender, String str, String str2) {
            this.f3884a = miniAppShopContentRender;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            App a2 = this.f3884a.a();
            if (a2 != null) {
                a2.putStringValue("shopLogo", this.b);
            }
            App a3 = this.f3884a.a();
            if (a3 == null) {
                return;
            }
            a3.putStringValue("shopName", this.c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppShopContentRender$PreloadCallback$onGetShopLogoAndName$1(MiniAppShopContentRender miniAppShopContentRender, String str, String str2) {
        super(0);
        this.this$0 = miniAppShopContentRender;
        this.$shopLogo = str;
        this.$shopName = str2;
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
        a aVar = new a(this.this$0, this.$shopLogo, this.$shopName);
        MiniAppShopContentRender miniAppShopContentRender = this.this$0;
        if (MiniAppShopContentRender.$ipChange) {
            aVar.run();
            return;
        }
        MiniAppShopContentRender miniAppShopContentRender2 = this.this$0;
        MiniAppShopContentRender.$ipChange.add(aVar);
    }
}
