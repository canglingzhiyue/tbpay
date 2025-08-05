package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.ali.adapt.api.AtlasServiceFinder;
import com.alibaba.android.aura.service.event.AURAEventKey;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.icart.core.data.b;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.e;
import com.alibaba.android.icart.core.event.l;
import com.alibaba.android.icart.core.widget.c;
import com.alibaba.android.ultron.trade.presenter.BaseViewManager;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bax;
import tb.idm;
import tb.igf;

/* loaded from: classes2.dex */
public class bbx extends bbz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CART_IMAGE_CODE = 32;
    public static final int REQUEST_ADD_ADDRESS = 50101;
    public static final int REQUEST_ALI_PAY_SERVICE = 50103;
    public static final int REQUEST_CHANGE_ADDRESS = 50102;
    public static bax.a f = null;
    public static final String sStreamNextRpcServiceName = "nextrpc-CARTS2";

    /* renamed from: a  reason: collision with root package name */
    public bff f25788a;
    public bez b;
    public bcb c;
    public bfb d;
    private final jog e;
    private bdp l;
    private Fragment m;
    private bdq n;
    private QueryParamsManager o;
    private bdo p;
    private final e q;
    private HandlerThread r;
    private Handler s;
    private boolean t;
    private adz u;
    private long v;
    private boolean w;
    private alu x;
    private String y;

    public static /* synthetic */ Object ipc$super(bbx bbxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 63286090:
                super.C();
                return null;
            case 64209611:
                super.D();
                return null;
            case 93762283:
                super.d();
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            case 416404924:
                return super.A();
            case 1427954150:
                super.a((a) objArr[0], (BaseViewManager) objArr[1]);
                return null;
            case 2045969029:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.bbz, com.alibaba.android.ultron.trade.presenter.c
    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : "iCart";
    }

    @Override // tb.bbz, com.alibaba.android.ultron.trade.presenter.b, com.alibaba.android.ultron.trade.presenter.c
    public /* synthetic */ a w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7b0d3f2", new Object[]{this}) : n();
    }

    static {
        kge.a(628648543);
        f = bax.a();
    }

    public bbx(Activity activity) {
        super(activity);
        bdw.a();
        a("iCart");
        this.c = b();
        this.d = new bfb(this);
        this.o = new QueryParamsManager(activity);
        this.l = new bdp(this);
        this.f25788a = new bff(this);
        this.p = new bdo(this);
        this.q = new e(this);
        if (!TextUtils.isEmpty(this.o.e())) {
            this.c.c(this.o.e());
        }
        this.r = new HandlerThread("CartPresenter");
        this.r.start();
        this.s = new Handler(this.r.getLooper());
        this.e = (jog) hoo.a((Class<? extends idl<Object>>) ips.class, true);
        if (this.e == null) {
            c(sStreamNextRpcServiceName);
        }
    }

    @Override // tb.bbz
    public void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
        } else {
            this.m = fragment;
        }
    }

    @Override // tb.bbz
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b != null) {
        } else {
            this.b = c();
            a(this.c, this.b);
        }
    }

    @Override // tb.bbz
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (!dcn.a()) {
        } else {
            DinamicXEngine w = this.b.w();
            if (w != null && w.b() != null) {
                if (z != this.t) {
                    gbg.b(true);
                    w.k();
                }
                w.b().a(z, z);
                this.t = z;
            }
            this.b.p().f(DXWidgetNode.DXMeasureSpec.a(h.a().a((Context) this.g), 1073741824));
        }
    }

    public bcb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("16b4565c", new Object[]{this}) : new b(this);
    }

    public bez c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bez) ipChange.ipc$dispatch("1e660625", new Object[]{this}) : new bez(this, aag.a(this.g, v().i()));
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        bez bezVar = this.b;
        if (bezVar != null) {
            bezVar.j();
        }
        if (this.r != null) {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    this.r.quitSafely();
                } else {
                    this.r.quit();
                }
            } catch (Exception unused) {
            }
        }
        bcb bcbVar = this.c;
        if (bcbVar != null) {
            bcbVar.u();
        }
        M();
        N();
        hoo.a();
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        try {
            AtlasServiceFinder.getInstance().registerService(bni.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.TBBuyNavProcessor");
        } catch (Exception e) {
            UnifyLog.d("CartPresenter", "initNavProcess failed:" + e.toString());
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public jog A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jog) ipChange.ipc$dispatch("18d1d5bc", new Object[]{this});
        }
        jog jogVar = this.e;
        return jogVar == null ? super.A() : jogVar;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public bnm q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnm) ipChange.ipc$dispatch("8a1d318d", new Object[]{this}) : (bnm) hoo.a((Class<? extends idl<Object>>) ipt.class, true);
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        igf.a aVar = (igf.a) hoo.a((Class<? extends idl<Object>>) igf.class, true);
        if (aVar == null) {
            super.C();
            return;
        }
        for (Map.Entry<String, com.taobao.android.dinamic.dinamic.h> entry : aVar.a().entrySet()) {
            this.b.a(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Long, ak> entry2 : aVar.b().entrySet()) {
            this.b.a(entry2.getKey().longValue(), entry2.getValue());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a(BundleLineComponent.COMPONENT_TAG, c.CREATOR);
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        idm.a aVar = (idm.a) hoo.a((Class<? extends idl<Object>>) idm.class, true);
        if (aVar == null) {
            super.f();
            for (Map.Entry<Long, fut> entry : idm.b().entrySet()) {
                this.b.a(entry.getKey().longValue(), entry.getValue());
            }
            return;
        }
        for (Map.Entry<Long, fut> entry2 : aVar.f28936a.entrySet()) {
            this.b.a(entry2.getKey().longValue(), entry2.getValue());
        }
        for (Map.Entry<String, fnl> entry3 : aVar.b.entrySet()) {
            this.b.a(entry3.getKey(), entry3.getValue());
        }
    }

    private void a(bez bezVar) {
        bob e;
        DinamicXEngine d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19796e1", new Object[]{this, bezVar});
            return;
        }
        bny p = bezVar.p();
        if (p == null || (e = p.e()) == null || (d = e.a().d()) == null) {
            return;
        }
        d.a(new bcw());
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void g() {
        Map map = (Map) hoo.a((Class<? extends idl<Object>>) ipp.class, true);
        if (map == null || map.isEmpty()) {
            super.g();
            Map<String, Class<? extends bmy>> a2 = l.a();
            if (a2 == null || a2.isEmpty()) {
                return;
            }
            try {
                for (Map.Entry<String, Class<? extends bmy>> entry : a2.entrySet()) {
                    this.k.b(entry.getKey(), entry.getValue().newInstance());
                }
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        Map map2 = (Map) map.get("ultron");
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                this.k.a((String) entry2.getKey(), (bmy) entry2.getValue());
            }
        }
        Map map3 = (Map) map.get("cart");
        if (map3 == null) {
            return;
        }
        for (Map.Entry entry3 : map3.entrySet()) {
            this.k.b((String) entry3.getKey(), (bmy) entry3.getValue());
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        Boolean bool = (Boolean) hoo.a((Class<? extends idl<Object>>) jmk.class, true);
        if (bool != null && bool.booleanValue()) {
            return;
        }
        super.D();
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void a(a aVar, BaseViewManager baseViewManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551cd9e6", new Object[]{this, aVar, baseViewManager});
            return;
        }
        super.a(aVar, baseViewManager);
        this.b.p().a((Class<Class>) bcb.class, (Class) this.c);
        this.b.p().a((Class<Class>) bbz.class, (Class) this);
        a(this.b);
        e();
        R();
    }

    @Override // tb.bbz
    public e h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("ed589e77", new Object[]{this}) : this.q;
    }

    @Override // tb.bbz
    public void a(jnv jnvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b111ae", new Object[]{this, jnvVar, new Boolean(z)});
        } else if (j()) {
            this.c.a(new RequestConfig().a(RequestConfig.RequestType.LOAD_CACHE_DATA).a(z ? bcr.ASYNC_BIZ : null).a(false), jnvVar);
        } else if (jnvVar == null) {
        } else {
            jnvVar.a(-2, (MtopResponse) null, (Object) null, false, (Map<String, ? extends Object>) null);
        }
    }

    @Override // tb.bbz
    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.o.i() && !this.o.k() && this.c.a() && !this.o.l();
    }

    @Override // tb.bbz
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(z, (Map<String, String>) null, (jnv) null);
        }
    }

    @Override // tb.bbz
    public void a(boolean z, Map<String, String> map, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ab7317", new Object[]{this, new Boolean(z), map, jnvVar});
        } else {
            this.c.a(new RequestConfig().a(RequestConfig.RequestType.QUERY_CART_PAGE).b(map).b(true).a(z), jnvVar);
        }
    }

    @Override // tb.bbz
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            a(true, (Map<String, String>) null, new jnv() { // from class: tb.bbx.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 525103232) {
                        return new Boolean(super.a(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]));
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    }
                }

                @Override // tb.jnv
                public boolean a(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("1f4c7080", new Object[]{this, new Integer(i), mtopResponse, obj})).booleanValue() : super.a(i, mtopResponse, obj);
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    } else {
                        ((RecyclerView) bbx.this.b.s()).scrollToPosition(0);
                    }
                }
            });
        }
    }

    @Override // tb.bbz
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            b(z, (Map<String, String>) null, (jnv) null);
        }
    }

    @Override // tb.bbz
    public void b(boolean z, Map<String, String> map, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afb5798", new Object[]{this, new Boolean(z), map, jnvVar});
            return;
        }
        RequestConfig a2 = new RequestConfig().a(RequestConfig.RequestType.QUERY_CART_NEXT_PAGE).b(map).d(map != null && "true".equals(map.get(RequestConfig.IS_PRE_LOADV2))).a(z);
        if (map == null || !"true".equals(map.get(RequestConfig.IS_POP_LAYER_FIRST_PAGE))) {
            z2 = false;
        }
        this.c.a(a2.c(z2), jnvVar);
    }

    @Override // tb.bbz
    public void a(IDMComponent iDMComponent, bmz bmzVar, boolean z, jnv jnvVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfac1121", new Object[]{this, iDMComponent, bmzVar, new Boolean(z), jnvVar, obj});
        } else {
            this.c.a(new RequestConfig().a(RequestConfig.RequestType.UPDATE).a(iDMComponent).a(bmzVar).a(z).a(obj), jnvVar);
        }
    }

    @Override // tb.bbz
    public void b(IDMComponent iDMComponent, bmz bmzVar, boolean z, jnv jnvVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5576da2", new Object[]{this, iDMComponent, bmzVar, new Boolean(z), jnvVar, obj});
        } else {
            this.c.a(new RequestConfig().a(RequestConfig.RequestType.UPDATE_STRUCTURE).a(iDMComponent).a(bmzVar).a(z).a(obj), jnvVar);
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbcbb03", new Object[]{this, jnyVar});
            return;
        }
        bmi x = this.c.x();
        if (jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b) {
            com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) jnyVar;
            z = bVar.N();
            if (x != null) {
                x.a(bVar);
            }
        }
        this.b.a(x, new brx().a(z).d(true).c(jqi.a("iCart", "skipItemRenderWhenDataNotChangedOfAttachResponse", true)).b(jqi.a("iCart", "enableRebuildWhenIdleOfAttachResponse", true)));
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (b(i, i2, intent)) {
        } else {
            super.a(i, i2, intent);
            bmz a2 = this.k.a();
            a2.a("requestCode", Integer.valueOf(i));
            a2.a("resultCode", Integer.valueOf(i2));
            a2.a("data", intent);
            a2.a("cart_activity_result");
            this.k.a(a2);
        }
    }

    @Override // tb.bbz
    public bff l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bff) ipChange.ipc$dispatch("63a4d7d1", new Object[]{this}) : this.f25788a;
    }

    @Override // tb.bbz, com.alibaba.android.ultron.trade.presenter.b, com.alibaba.android.ultron.trade.presenter.c
    public Activity m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("3792a4b4", new Object[]{this}) : this.g;
    }

    @Override // tb.bbz
    public bcb n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("730816d0", new Object[]{this}) : this.c;
    }

    @Override // tb.bbz
    public bdp o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bdp) ipChange.ipc$dispatch("7ab9c1a2", new Object[]{this}) : this.l;
    }

    @Override // tb.bbz
    public bdq p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdq) ipChange.ipc$dispatch("826b6720", new Object[]{this});
        }
        if (this.n == null) {
            this.n = new bdq(this);
        }
        return this.n;
    }

    @Override // tb.bbz
    public bfb r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfb) ipChange.ipc$dispatch("91ceb78f", new Object[]{this}) : this.d;
    }

    @Override // tb.bbz
    public Handler t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("643473eb", new Object[]{this}) : this.s;
    }

    @Override // tb.bbz
    public void a(adz adzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd4a6c1", new Object[]{this, adzVar});
        } else {
            this.u = adzVar;
        }
    }

    @Override // tb.bbz
    public adz S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (adz) ipChange.ipc$dispatch("a34b3815", new Object[]{this}) : this.u;
    }

    @Override // tb.bbz
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.v = j;
        }
    }

    @Override // tb.bbz
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    @Override // tb.bbz
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.y = str;
        }
    }

    @Override // tb.bbz
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        UnifyLog.d("CartPresenter", "handleLoginAction success");
        this.c.c("");
        this.c.o().e();
        if (this.m.isResumed()) {
            a(true);
        } else {
            this.c.o().i(true);
        }
    }

    @Override // tb.bbz
    public alu T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alu) ipChange.ipc$dispatch("aafcfae1", new Object[]{this});
        }
        if (this.x == null) {
            this.x = new alu(new alr("iCart", "cart").a((Context) this.g));
        }
        return this.x;
    }

    @Override // tb.bbz
    public bdo Q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bdo) ipChange.ipc$dispatch("93e86061", new Object[]{this}) : this.p;
    }

    @Override // com.alibaba.android.ultron.trade.presenter.b
    public void a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a050eeb6", new Object[]{this, iDMComponent, str});
        } else if (AURAEventKey.exposureItem.equals(str)) {
            ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
            if (extMap.get(bdo.EXPOSURE_ONCE_KEY) != null) {
                return;
            }
            extMap.put(bdo.EXPOSURE_ONCE_KEY, true);
            this.p.a(iDMComponent, str);
        } else {
            this.p.b(iDMComponent, str);
        }
    }

    @Override // tb.bbz
    public Fragment u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("9cc3dbde", new Object[]{this}) : this.m;
    }

    @Override // tb.bbz
    public QueryParamsManager v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryParamsManager) ipChange.ipc$dispatch("5c0445a6", new Object[]{this}) : this.o;
    }

    private boolean b(int i, int i2, Intent intent) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8edbcaca", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue();
        }
        if ((i == 101 || i == 102) && i2 == 10001) {
            this.c.o().i(true);
            bex.c(this, "Page_ShoppingCart_Notification", new String[0]);
            return true;
        } else if (50101 == i && i2 == -1) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            String string = extras.getString(com.taobao.android.purchase.core.address.c.K_DELIVERY_ID);
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            bcd.a().b(string);
            k();
            return true;
        } else {
            if (50102 == i && i2 == -1) {
                String stringExtra = intent.getStringExtra("data");
                if (!TextUtils.isEmpty(stringExtra) && (parseObject = JSONObject.parseObject(stringExtra)) != null && parseObject.containsKey(com.taobao.android.address.wrapper.c.K_DELIVERY_ID)) {
                    String string2 = parseObject.getString(com.taobao.android.address.wrapper.c.K_DELIVERY_ID);
                    if (TextUtils.isEmpty(string2)) {
                        return false;
                    }
                    bcd.a().b(string2);
                    k();
                    return true;
                }
            }
            return false;
        }
    }
}
