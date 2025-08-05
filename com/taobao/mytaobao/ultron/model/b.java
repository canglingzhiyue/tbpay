package com.taobao.mytaobao.ultron.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.mytaobao.newsetting.f;
import tb.kge;
import tb.mtp;
import tb.mxm;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHOW_SEC_SCREEN_LIVE_MODE = "showSecScreenLiveMode";
    public static final String KEY_SHOW_SEC_SCREEN_SHOP_MODE = "showSecScreenShopMode";

    /* renamed from: a  reason: collision with root package name */
    private boolean f18529a;
    private boolean b;

    static {
        kge.a(1823636640);
    }

    public static /* synthetic */ boolean b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6542e99", new Object[]{bVar})).booleanValue() : bVar.f18529a;
    }

    public static /* synthetic */ boolean c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("82f4599a", new Object[]{bVar})).booleanValue() : bVar.b;
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("103c0e5a", new Object[0]);
        }
        b bVar = new b();
        bVar.f18529a = f.a(f.SWITCH_SEC_LIVE, "true");
        bVar.b = f.a(f.SWITCH_SEC_SHOP, "true");
        return bVar;
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("6759ff39", new Object[0]);
        }
        b bVar = new b();
        bVar.f18529a = f.a("cache_showLive", "true");
        bVar.b = f.a("cache_showShop", "true");
        return bVar;
    }

    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69b40398", new Object[]{this, bVar})).booleanValue() : bVar != null && this.f18529a == bVar.f18529a && this.b == bVar.b;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.model.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    f.b("cache_showLive", b.b(b.this));
                    f.b("cache_showShop", b.c(b.this));
                }
            });
        }
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(mtp.b.b);
            f.a(f.KEY_SHOW_SEC_SCREEN_LIVE_SWITCH, jSONObject2.getBooleanValue(f.KEY_SHOW_SEC_SCREEN_LIVE_SWITCH));
            f.a(f.KEY_SHOW_SEC_SCREEN_SHOP_SWITCH, jSONObject2.getBooleanValue(f.KEY_SHOW_SEC_SCREEN_SHOP_SWITCH));
        } catch (Throwable th) {
            mxm.a("parse_json", "setSecScreenConfigToSettings", "二屏配置解析异常 " + th.getMessage());
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f18529a;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.b;
    }
}
