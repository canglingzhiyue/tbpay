package com.taobao.android.lightbuy;

import android.app.Activity;
import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.message.module.LightBuyMUSModule;
import com.taobao.tao.alipay.export.PayPasswrdValidateBridge;
import tb.afa;
import tb.arc;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LIGHT_BUY = "LightBuyControl";

    /* renamed from: a  reason: collision with root package name */
    private final Context f13282a;
    private final afa b;
    private final com.taobao.android.lightbuy.performance.a c;

    static {
        kge.a(-712727295);
    }

    public a(Context context) {
        arc.a().b("LightBuyControl onInit", arc.a.a().b(KEY_LIGHT_BUY).a("info", "LightBuyControl onInit").b());
        this.f13282a = context;
        LightBuyMUSModule.registerModule();
        q.a(PayPasswrdValidateBridge.PLUGIN_NAME, (Class<? extends e>) PayPasswrdValidateBridge.class, true);
        this.b = afa.a();
        this.c = com.taobao.android.lightbuy.performance.a.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = this.f13282a;
        if (!(context instanceof Activity)) {
            return;
        }
        this.c.a((Activity) context);
    }

    public afa b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (afa) ipChange.ipc$dispatch("16b3ed21", new Object[]{this}) : this.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        arc.a().b("LightBuyControl onDestroy", arc.a.a().a("LightBuy/common").b(KEY_LIGHT_BUY).a("info", "LightBuyControl onDestroy").b());
        this.b.a(this.f13282a);
        com.taobao.android.lightbuy.performance.a.a().c();
    }
}
