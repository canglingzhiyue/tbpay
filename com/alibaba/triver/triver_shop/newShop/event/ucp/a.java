package com.alibaba.triver.triver_shop.newShop.event.ucp;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.alibaba.triver.triver_shop.newShop.ext.h;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPReachViewOpenState;
import com.taobao.android.external.UCPReachViewState;
import com.taobao.android.external.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.i;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.ceg;
import tb.kge;

/* loaded from: classes3.dex */
public final class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0136a Companion;
    public static final String GROUP_NAME = "PageShopReachView";
    public static final String MATERIAL_ID_KEY = "materialNumId";

    /* renamed from: a  reason: collision with root package name */
    private final d f3841a;
    private final ConcurrentHashMap<String, JSONObject> b;
    private com.taobao.android.external.a c;

    static {
        kge.a(728008925);
        kge.a(-1527760929);
        Companion = new C0136a(null);
    }

    /* renamed from: com.alibaba.triver.triver_shop.newShop.event.ucp.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0136a {
        static {
            kge.a(-1000815643);
        }

        public /* synthetic */ C0136a(o oVar) {
            this();
        }

        private C0136a() {
        }
    }

    public a(d shopData) {
        q.d(shopData, "shopData");
        this.f3841a = shopData;
        this.b = new ConcurrentHashMap<>();
    }

    public final com.taobao.android.external.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.external.a) ipChange.ipc$dispatch("af8bbbe9", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.external.b
    public void registerStateSynchronizer(com.taobao.android.external.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a427a", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    @Override // com.taobao.android.external.b
    public boolean isEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue() : this.f3841a.B();
    }

    public final void a(JSONObject jSONObject) {
        Object m2371constructorimpl;
        String string;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!this.f3841a.B() || jSONObject == null) {
        } else {
            try {
                Result.a aVar = Result.Companion;
                JSONObject jSONObject3 = jSONObject.getJSONObject("data");
                if (jSONObject3 != null && (string = jSONObject3.getString(MATERIAL_ID_KEY)) != null && (jSONObject2 = this.b.get(string)) != null) {
                    String string2 = jSONObject3.getString("key");
                    String string3 = jSONObject3.getString("code");
                    Integer d = string3 == null ? null : n.d(string3);
                    if (d != null) {
                        int intValue = d.intValue();
                        UCPReachViewState uCPReachViewState = new UCPReachViewState();
                        uCPReachViewState.group = GROUP_NAME;
                        uCPReachViewState.key = string2;
                        uCPReachViewState.code = intValue;
                        uCPReachViewState.trackInfo = jSONObject2;
                        String string4 = jSONObject3.getString("msg");
                        if (string4 == null) {
                            string4 = "";
                        }
                        uCPReachViewState.msg = string4;
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("debugInfo");
                        if (jSONObject4 == null) {
                            jSONObject4 = new JSONObject();
                        }
                        uCPReachViewState.debugInfo = jSONObject4;
                        JSONObject jSONObject5 = jSONObject3.getJSONObject("bizInfo");
                        if (jSONObject5 == null) {
                            jSONObject5 = new JSONObject();
                        }
                        uCPReachViewState.bizInfo = jSONObject5;
                        com.taobao.android.external.a a2 = a();
                        if (a2 != null) {
                            a2.a(uCPReachViewState);
                        }
                    }
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

    @Override // com.taobao.android.external.b
    public UCPReachViewOpenState openReachView(JSONObject jSONObject, JSONObject jSONObject2) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCPReachViewOpenState) ipChange.ipc$dispatch("6afe6146", new Object[]{this, jSONObject, jSONObject2});
        }
        try {
            Result.a aVar = Result.Companion;
            String string = jSONObject == null ? null : jSONObject.getString(MATERIAL_ID_KEY);
            if (string != null && jSONObject2 != null) {
                this.b.put(string, jSONObject2);
            }
            a(com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("data", com.alibaba.triver.triver_shop.newShop.ext.d.a(j.a("key", "ShopReceiver"), j.a("code", 0), j.a(MATERIAL_ID_KEY, string)))));
            h.a(this.f3841a, jSONObject);
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl != null) {
            ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
        }
        return UCPReachViewOpenState.OPEN;
    }

    public final void b() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            for (Map.Entry<String, JSONObject> entry : this.b.entrySet()) {
                UCPReachViewState uCPReachViewState = new UCPReachViewState();
                uCPReachViewState.group = GROUP_NAME;
                uCPReachViewState.key = com.taobao.homepage.pop.ucp.b.KEY_TERMINAL;
                uCPReachViewState.code = 2;
                uCPReachViewState.trackInfo = entry.getValue();
                com.taobao.android.external.a a2 = a();
                if (a2 != null) {
                    a2.a(uCPReachViewState);
                }
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
