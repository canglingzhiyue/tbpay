package com.taobao.android.detail.wrapper.ultronengine.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.request.market.MarketBagPrice;
import com.taobao.android.detail.core.request.market.MarketBagPriceRequestClient;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Collections;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dzf;
import tb.edw;
import tb.eft;
import tb.emu;
import tb.emx;
import tb.eno;
import tb.epo;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class s extends com.alibaba.android.ultron.event.q implements com.taobao.android.trade.boost.request.mtop.a<MarketBagPrice> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIVISION_CODE = "divisionCode";
    public static final String DOWNGRADE = "downgrade";
    public static final String LOGIN_BTN_TITLE = "loginBtnTitle";
    public static final String SUBSCRIBER_ID = "querySMBagPrice";
    public static final String UNLOGIN_BTN_TITLE = "unloginBtnTitle";
    public static final String WRITE_BACK_ROUTES = "writebackRoutes";

    /* renamed from: a  reason: collision with root package name */
    private a f11458a = new a();
    private b b = new b();
    private boolean l = false;

    static {
        kge.a(987190872);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(s sVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d124eb", new Object[]{sVar});
        } else {
            sVar.e();
        }
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

    public s() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.QuerySMBagPriceUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            if (!this.l) {
                com.taobao.android.trade.event.f.a(eVar.a()).a(eno.a(edw.class), this.b);
                com.taobao.android.trade.event.f.a(eVar.a()).a(eno.a(eft.class), this.f11458a);
                this.l = true;
            }
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        JSONObject c = c();
        if (c == null || this.c == null || c.getBoolean("downgrade").booleanValue() || !epo.g().b()) {
            return;
        }
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) fpz.c(this.c.a());
        if (detailCoreActivity == null || detailCoreActivity.C() == null) {
            com.taobao.android.detail.core.utils.i.a("QuerySMBagPriceUltronSubscriber", "detailCoreActivity == null || detailCoreActivity.getNodeBundleWrapper() == null");
            return;
        }
        new MarketBagPriceRequestClient().execute(new com.taobao.android.detail.core.request.market.a(c.getString(DIVISION_CODE), detailCoreActivity.C().h()), this, epo.f());
        com.taobao.android.detail.core.utils.i.d("QuerySMBagPriceUltronSubscriber", "queryBagPrice");
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            f();
        }
    }

    public void a(MarketBagPrice marketBagPrice) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ed3f0c", new Object[]{this, marketBagPrice});
        } else if (marketBagPrice == null || marketBagPrice.model == null || TextUtils.isEmpty(marketBagPrice.model.price)) {
            JSONObject c = c();
            if (c == null) {
                return;
            }
            a(c.getString(UNLOGIN_BTN_TITLE), (String) null);
        } else {
            com.taobao.android.detail.core.utils.i.d("QuerySMBagPriceUltronSubscriber", "updateSMCartPriceSuccess");
            a(c().getString(LOGIN_BTN_TITLE), "¥" + marketBagPrice.model.price);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(c());
        JSONArray jSONArray = new JSONArray(2);
        JSONObject jSONObject2 = c().getJSONObject(WRITE_BACK_ROUTES);
        try {
            JSONObject jSONObject3 = new JSONObject(1);
            jSONObject3.put("sourcePath", (Object) "btnTitle");
            jSONObject3.put("targetPath", (Object) jSONObject2.getString("btnTitle"));
            jSONArray.add(jSONObject3);
            JSONObject jSONObject4 = new JSONObject(1);
            jSONObject4.put("sourcePath", (Object) "price");
            jSONObject4.put("targetPath", (Object) jSONObject2.getString("price"));
            jSONArray.add(jSONObject4);
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("QuerySMBagPriceUltronSubscriber", "dataMergeParams", th);
        }
        jSONObject.put("dataMergeParams", (Object) jSONArray);
        jSONObject.put("subType", "jhsRemind");
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("price", (Object) str2);
        jSONObject5.put("btnTitle", (Object) str);
        jSONObject5.putAll(c());
        jSONObject.put("payload", (Object) jSONObject5);
        com.alibaba.android.ultron.event.base.f d = this.c.h().d();
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a("adjustState");
        a2.a(this.c.d());
        a2.a(new DMEvent("adjustState", jSONObject, Collections.singletonList(this.c.d())));
        d.a(a2);
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else {
            f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        JSONObject c = c();
        DetailCoreActivity detailCoreActivity = null;
        if (c != null) {
            a(c.getString(UNLOGIN_BTN_TITLE), (String) null);
        }
        if (this.c != null) {
            detailCoreActivity = (DetailCoreActivity) fpz.c(this.c.a());
        }
        if (detailCoreActivity == null || detailCoreActivity.C() == null) {
            com.taobao.android.detail.core.utils.i.a("QuerySMBagPriceUltronSubscriber", "detailCoreActivity == null || detailCoreActivity.getNodeBundleWrapper() == null");
        } else {
            dzf.a(emx.c(this.d), detailCoreActivity.C().i());
        }
    }

    /* loaded from: classes5.dex */
    public class a implements com.taobao.android.trade.event.j<eft> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1132500054);
            kge.a(-1453870097);
        }

        private a() {
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ com.taobao.android.trade.event.i handleEvent(eft eftVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eftVar}) : a(eftVar);
        }

        public com.taobao.android.trade.event.i a(eft eftVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("128dd3ca", new Object[]{this, eftVar});
            }
            s.a(s.this);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }

    /* loaded from: classes5.dex */
    public class b implements com.taobao.android.trade.event.j<edw> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2082773569);
            kge.a(-1453870097);
        }

        private b() {
        }

        @Override // com.taobao.android.trade.event.j
        public /* synthetic */ com.taobao.android.trade.event.i handleEvent(edw edwVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, edwVar}) : a(edwVar);
        }

        public com.taobao.android.trade.event.i a(edw edwVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.trade.event.i) ipChange.ipc$dispatch("8ae0150f", new Object[]{this, edwVar});
            }
            s.a(s.this);
            return com.taobao.android.detail.core.event.a.SUCCESS;
        }

        @Override // com.taobao.android.trade.event.j
        public ThreadMode getThreadMode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
        }
    }
}
