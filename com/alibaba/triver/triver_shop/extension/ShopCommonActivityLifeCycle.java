package com.alibaba.triver.triver_shop.extension;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.jsbridge.e;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.scene.TRWidgetJsPlugin;
import com.alibaba.triver.cannal_engine.scene.TRWidgetWVEmbedView;
import com.alibaba.triver.triver_shop.extension.accs.ShopAccsUpStreamData;
import com.alibaba.triver.triver_shop.extension.accs.a;
import com.alibaba.triver.triver_shop.jsapi.WVShopApiBridge;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.alibaba.triver.triver_shop.newShop.event.ucp.a;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.alibaba.triver.triver_shop.newShop.ext.l;
import com.alibaba.triver.triver_shop.preload.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.tao.Globals;
import kotlin.Result;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class ShopCommonActivityLifeCycle implements LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final d f3759a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final ShopBXBroadcastReceiver e;

    static {
        kge.a(1169514146);
        kge.a(2139684418);
    }

    public ShopCommonActivityLifeCycle(d shopDataParser) {
        q.d(shopDataParser, "shopDataParser");
        this.f3759a = shopDataParser;
        this.c = this.f3759a.t() || this.f3759a.s();
        this.d = this.f3759a.aZ();
        this.e = new ShopBXBroadcastReceiver(this.f3759a);
    }

    public static final /* synthetic */ void a(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43890dcc", new Object[]{shopCommonActivityLifeCycle, dVar});
        } else {
            shopCommonActivityLifeCycle.a(dVar);
        }
    }

    public static final /* synthetic */ void a(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2620c77f", new Object[]{shopCommonActivityLifeCycle, new Boolean(z)});
        } else {
            shopCommonActivityLifeCycle.b = z;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            ceg.Companion.b("start preload shop index webView on ac destroyed");
            b bVar = b.INSTANCE;
            Application application = Globals.getApplication();
            q.b(application, "getApplication()");
            bVar.a(application);
            com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopCommonActivityLifeCycle$onDestroyed$1$1(this));
            if (this.f3759a.B()) {
                this.f3759a.A().b();
                UCPManager.b(a.GROUP_NAME);
            }
            if (this.c && this.f3759a.C() != null) {
                com.alibaba.triver.triver_shop.extension.accs.a aVar2 = com.alibaba.triver.triver_shop.extension.accs.a.INSTANCE;
                a.InterfaceC0131a C = this.f3759a.C();
                q.a(C);
                aVar2.b(C);
            }
            LocalBroadcastManager.getInstance(this.f3759a.am()).unregisterReceiver(this.e);
            Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar3 = Result.Companion;
            Result.m2371constructorimpl(i.a(th));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPaused() {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47335f4", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.c && this.d) {
            com.alibaba.triver.triver_shop.extension.accs.a aVar = com.alibaba.triver.triver_shop.extension.accs.a.INSTANCE;
            ShopAccsUpStreamData.ChannelCode channelCode = ShopAccsUpStreamData.ChannelCode.onShopExit;
            Context am = this.f3759a.am();
            String str = "";
            if (am == null || (b = l.b(am)) == null) {
                b = str;
            }
            String U = this.f3759a.U();
            if (U == null) {
                U = str;
            }
            String T = this.f3759a.T();
            if (T != null) {
                str = T;
            }
            aVar.a(new ShopAccsUpStreamData(channelCode, b, U, str));
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopCommonActivityLifeCycle$onPaused$1(this, currentTimeMillis), 500L);
        if (!this.f3759a.F()) {
            return;
        }
        h.h(this.f3759a);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.b.a("accsTask", new ShopCommonActivityLifeCycle$onResume$1(this));
        }
    }

    private final void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8442f9", new Object[]{this, dVar});
        } else {
            LocalBroadcastManager.getInstance(dVar.am()).registerReceiver(this.e, new IntentFilter("BehaviX_shopBXInfo"));
        }
    }

    /* loaded from: classes3.dex */
    public static final class ShopBXBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final d f3760a;

        static {
            kge.a(-1132723902);
        }

        public ShopBXBroadcastReceiver(d shopData) {
            q.d(shopData, "shopData");
            this.f3760a = shopData;
        }

        public final d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("820aec79", new Object[]{this}) : this.f3760a;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object m2371constructorimpl;
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            q.d(context, "context");
            q.d(intent, "intent");
            try {
                Result.a aVar = Result.Companion;
                jSONObject = (JSONObject) intent.getSerializableExtra("feature");
                jSONObject2 = (JSONObject) intent.getSerializableExtra("event");
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            if (jSONObject != null && jSONObject2 != null) {
                JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("_msg_name", c.BX_TO_SHOP), j.a("_msg_type", c.BX_TO_SHOP), j.a("_msg_token", a().T()), j.a("_msg_source", c.MSG_SOURCE_PARENT), j.a("_msg_target", "*"), j.a("data", com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("feature", jSONObject), j.a("event", jSONObject2))));
                com.alibaba.triver.triver_shop.newShop.event.broadcast.d a3 = com.alibaba.triver.triver_shop.newShop.event.broadcast.d.a(a().am());
                if (a3 != null) {
                    a3.a(a2);
                }
                m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                if (m2374exceptionOrNullimpl == null) {
                    return;
                }
                ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreated() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff48d810", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            android.taobao.windvane.jsbridge.q.a("NShop", (Class<? extends e>) WVShopApiBridge.class);
            android.taobao.windvane.embed.a.a("widget", (Class<? extends BaseEmbedView>) TRWidgetWVEmbedView.class, true);
            android.taobao.windvane.jsbridge.q.a("triver-widget", (Class<? extends e>) TRWidgetJsPlugin.class);
            com.alibaba.triver.triver_shop.newShop.ext.b.a("logShopEnterUri", new ShopCommonActivityLifeCycle$onCreated$1$1(this));
            com.alibaba.triver.triver_shop.newShop.ext.b.a("shopExtraTask", new ShopCommonActivityLifeCycle$onCreated$1$2(this));
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
