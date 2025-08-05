package com.taobao.android.detail.wrapper.aura.event;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.p;
import com.taobao.android.detail.core.request.market.MarketBagPrice;
import com.taobao.android.detail.core.request.market.MarketBagPriceRequestClient;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.j;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arv;
import tb.edw;
import tb.eft;
import tb.emu;
import tb.eno;
import tb.epo;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.querySMBagPrice")
/* loaded from: classes5.dex */
public final class d extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "querySMBagPrice";

    static {
        kge.a(931976556);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "querySMBagPrice";
    }

    public static /* synthetic */ void a(DetailCoreActivity detailCoreActivity, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8d5cef", new Object[]{detailCoreActivity, sVar, aURARenderComponent, jSONObject});
        } else {
            c(detailCoreActivity, sVar, aURARenderComponent, jSONObject);
        }
    }

    public d() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailQuerySMBagPriceEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (!(b().e() instanceof DetailCoreActivity) || b().b() == null || aURAEventIO.getEventModel().d() == null || aURAEventIO.getEventModel().c() == null) {
        } else {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) b().e();
            s b2 = b().b();
            AURARenderComponent d = aURAEventIO.getEventModel().d();
            JSONObject c2 = aURAEventIO.getEventModel().c();
            b(detailCoreActivity, b2, d, c2);
            c(detailCoreActivity, b2, d, c2);
            p.a(detailCoreActivity, "querySMBagPrice");
        }
    }

    private void b(DetailCoreActivity detailCoreActivity, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8116694e", new Object[]{this, detailCoreActivity, sVar, aURARenderComponent, jSONObject});
            return;
        }
        int a2 = eno.a(edw.class);
        if (!com.taobao.android.trade.event.f.a(detailCoreActivity).b(a2)) {
            com.taobao.android.trade.event.f.a(detailCoreActivity).a(a2, new c(detailCoreActivity, sVar, aURARenderComponent, jSONObject));
        }
        int a3 = eno.a(eft.class);
        if (com.taobao.android.trade.event.f.a(detailCoreActivity).b(a3)) {
            return;
        }
        com.taobao.android.trade.event.f.a(detailCoreActivity).a(a3, new a(detailCoreActivity, sVar, aURARenderComponent, jSONObject));
    }

    private static void c(DetailCoreActivity detailCoreActivity, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59f75ad", new Object[]{detailCoreActivity, sVar, aURARenderComponent, jSONObject});
            return;
        }
        Boolean bool = jSONObject.getBoolean("downgrade");
        if ((bool != null && bool.booleanValue()) || !epo.g().b() || (C = detailCoreActivity.C()) == null) {
            return;
        }
        new MarketBagPriceRequestClient().execute(new com.taobao.android.detail.core.request.market.a(jSONObject.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.DIVISION_CODE), C.h()), new b(sVar, aURARenderComponent, jSONObject), epo.f());
        i.d("AliDetailQuerySMBagPriceEvent", "queryBagPrice");
    }

    /* loaded from: classes5.dex */
    public static class c implements j<edw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DetailCoreActivity f11110a;
        public s b;
        public AURARenderComponent c;
        public JSONObject d;

        static {
            kge.a(570554923);
            kge.a(-1453870097);
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ com.taobao.android.trade.event.i handleEvent(edw edwVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edwVar}) : a(edwVar);
        }

        public c(DetailCoreActivity detailCoreActivity, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
            this.f11110a = detailCoreActivity;
            this.b = sVar;
            this.c = aURARenderComponent;
            this.d = jSONObject;
        }

        public com.taobao.android.trade.event.i a(edw edwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("8ae0150f", new Object[]{this, edwVar});
            }
            d.a(this.f11110a, this.b, this.c, this.d);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements j<eft> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DetailCoreActivity f11108a;
        public s b;
        public AURARenderComponent c;
        public JSONObject d;

        static {
            kge.a(-1050602872);
            kge.a(-1453870097);
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ com.taobao.android.trade.event.i handleEvent(eft eftVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eftVar}) : a(eftVar);
        }

        public a(DetailCoreActivity detailCoreActivity, s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
            this.f11108a = detailCoreActivity;
            this.b = sVar;
            this.c = aURARenderComponent;
            this.d = jSONObject;
        }

        public com.taobao.android.trade.event.i a(eft eftVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("128dd3ca", new Object[]{this, eftVar});
            }
            d.a(this.f11108a, this.b, this.c, this.d);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements com.taobao.android.trade.boost.request.mtop.a<MarketBagPrice> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public s f11109a;
        public AURARenderComponent b;
        public JSONObject c;

        static {
            kge.a(-1393587267);
            kge.a(1595456606);
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
            } else {
                a(mtopResponse);
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.c
        public /* synthetic */ void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            } else {
                a((MarketBagPrice) obj);
            }
        }

        public b(s sVar, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
            this.f11109a = sVar;
            this.b = aURARenderComponent;
            this.c = jSONObject;
        }

        public void a(MarketBagPrice marketBagPrice) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31ed3f0c", new Object[]{this, marketBagPrice});
            } else {
                b(marketBagPrice);
            }
        }

        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            } else {
                b(null);
            }
        }

        @Override // com.taobao.android.trade.boost.request.mtop.a
        public void onSystemFailure(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
            } else {
                b(null);
            }
        }

        private void b(MarketBagPrice marketBagPrice) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("daebacd", new Object[]{this, marketBagPrice});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(this.c);
            jSONObject.put("subType", "jhsRemind");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("beReplaced", (Object) "bottomBarVO");
            jSONObject2.put("toReplace", (Object) "fields");
            jSONObject.put("targetReplacement", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putAll(jSONObject);
            if (marketBagPrice == null || marketBagPrice.model == null || TextUtils.isEmpty(marketBagPrice.model.price)) {
                jSONObject3.put("price", "");
                jSONObject3.put("btnTitle", this.c.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.UNLOGIN_BTN_TITLE));
            } else {
                jSONObject3.put("price", "¥" + marketBagPrice.model.price);
                jSONObject3.put("btnTitle", this.c.getString(com.taobao.android.detail.wrapper.ultronengine.event.s.LOGIN_BTN_TITLE));
            }
            jSONObject.put("payload", (Object) jSONObject3);
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a(this.b);
            dVar.a("" + System.currentTimeMillis());
            dVar.a(jSONObject);
            com.alibaba.android.aura.service.event.c.a(this.f11109a, "adjustState", dVar);
        }
    }
}
