package com.alibaba.android.icart.core.data;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.android.icart.core.performance.cache.CartFirstPageCache;
import com.alibaba.android.nextrpc.request.AttachedResponse;
import com.alibaba.android.nextrpc.stream.internal.response.StreamRemoteMainResponse;
import com.alibaba.android.ultron.trade.data.request.DataInfo;
import com.alibaba.android.ultron.trade.data.request.PageInfo;
import com.alibaba.android.ultron.trade.presenter.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.cache.CacheManagerImpl;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.aae;
import tb.aat;
import tb.akg;
import tb.bby;
import tb.bbz;
import tb.bcb;
import tb.bch;
import tb.bci;
import tb.bck;
import tb.bcl;
import tb.bcm;
import tb.bcn;
import tb.bco;
import tb.bct;
import tb.bcv;
import tb.bdw;
import tb.bed;
import tb.beg;
import tb.bei;
import tb.bem;
import tb.beo;
import tb.bep;
import tb.bez;
import tb.bff;
import tb.bfw;
import tb.bmi;
import tb.bmz;
import tb.bnv;
import tb.ieu;
import tb.ift;
import tb.jnv;
import tb.jny;
import tb.joz;
import tb.jpo;
import tb.jqf;
import tb.jqg;
import tb.jqh;
import tb.jqi;
import tb.kge;
import tb.sxz;

/* loaded from: classes2.dex */
public class b extends bcb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_FILE_NAME = "cart_common";
    private static final ift e;
    private static boolean t;
    private bbz j;
    private d k;
    private Map<String, Boolean> l;
    private CartGlobal m;
    private Map<String, List<IDMComponent>> n;
    private List<bcb.a> o;
    private List<jnv> p;
    private DataBizContext q;
    private final bch<byte[]> r;
    private bck s;

    /* renamed from: com.alibaba.android.icart.core.data.b$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2301a = new int[RequestConfig.RequestType.values().length];

        static {
            try {
                f2301a[RequestConfig.RequestType.QUERY_CART_PAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2301a[RequestConfig.RequestType.QUERY_CART_NEXT_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2301a[RequestConfig.RequestType.UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ CartGlobal a(b bVar, CartGlobal cartGlobal) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartGlobal) ipChange.ipc$dispatch("9a140fe3", new Object[]{bVar, cartGlobal});
        }
        bVar.m = cartGlobal;
        return cartGlobal;
    }

    public static /* synthetic */ PageInfo a(b bVar, RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageInfo) ipChange.ipc$dispatch("b1613486", new Object[]{bVar, requestConfig}) : bVar.b(requestConfig);
    }

    public static /* synthetic */ bch a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bch) ipChange.ipc$dispatch("70385dec", new Object[]{bVar}) : bVar.r;
    }

    public static /* synthetic */ void a(b bVar, RequestConfig.RequestType requestType, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6844dbb3", new Object[]{bVar, requestType, jSONObject});
        } else {
            bVar.a(requestType, jSONObject);
        }
    }

    public static /* synthetic */ void a(b bVar, RequestConfig requestConfig, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2695a3a1", new Object[]{bVar, requestConfig, new Integer(i)});
        } else {
            bVar.a(requestConfig, i);
        }
    }

    public static /* synthetic */ void a(b bVar, PageInfo pageInfo, DataInfo dataInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f9c9ffc", new Object[]{bVar, pageInfo, dataInfo});
        } else {
            bVar.a(pageInfo, dataInfo);
        }
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0661f7d", new Object[]{bVar, jSONObject});
        } else {
            bVar.b(jSONObject);
        }
    }

    public static /* synthetic */ void a(b bVar, jny jnyVar, RequestConfig requestConfig, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22beb904", new Object[]{bVar, jnyVar, requestConfig, bArr});
        } else {
            bVar.a(jnyVar, requestConfig, bArr);
        }
    }

    public static /* synthetic */ void a(b bVar, jny jnyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1c7fb8", new Object[]{bVar, jnyVar, str});
        } else {
            bVar.a(jnyVar, str);
        }
    }

    public static /* synthetic */ void a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d460b61", new Object[]{bVar, new Boolean(z)});
        } else {
            bVar.b(z);
        }
    }

    public static /* synthetic */ boolean a(b bVar, com.taobao.android.ultron.datamodel.imp.b bVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e28166b", new Object[]{bVar, bVar2})).booleanValue() : bVar.a(bVar2);
    }

    public static /* synthetic */ com.alibaba.android.ultron.trade.presenter.c b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.trade.presenter.c) ipChange.ipc$dispatch("40ec2efc", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ bbz c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("f74e97db", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
        }
        t = z;
        return z;
    }

    public static /* synthetic */ DataBizContext d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataBizContext) ipChange.ipc$dispatch("d416573", new Object[]{bVar}) : bVar.q;
    }

    public static /* synthetic */ List e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ae41e318", new Object[]{bVar}) : bVar.p;
    }

    public static /* synthetic */ void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2434f0ae", new Object[]{bVar});
        } else {
            bVar.E();
        }
    }

    public static /* synthetic */ boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : t;
    }

    public static /* synthetic */ Context g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("65b3a205", new Object[]{bVar}) : bVar.f2675a;
    }

    public static /* synthetic */ Context h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2219e64", new Object[]{bVar}) : bVar.f2675a;
    }

    public static /* synthetic */ Context i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9e8f9ac3", new Object[]{bVar}) : bVar.f2675a;
    }

    public static /* synthetic */ bck j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bck) ipChange.ipc$dispatch("d01c6a12", new Object[]{bVar}) : bVar.s;
    }

    public static /* synthetic */ Context k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d76b9381", new Object[]{bVar}) : bVar.f2675a;
    }

    public static /* synthetic */ bmi l(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmi) ipChange.ipc$dispatch("5732cae0", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ bmi m(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmi) ipChange.ipc$dispatch("9abde8a1", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ bmi n(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmi) ipChange.ipc$dispatch("de490662", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ bmi o(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmi) ipChange.ipc$dispatch("21d42423", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ void p(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1710e64", new Object[]{bVar});
        } else {
            bVar.F();
        }
    }

    public static /* synthetic */ com.alibaba.android.ultron.trade.presenter.c q(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.trade.presenter.c) ipChange.ipc$dispatch("e860ba0b", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ com.alibaba.android.ultron.trade.presenter.c r(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.trade.presenter.c) ipChange.ipc$dispatch("d1687f0c", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ bmi s(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmi) ipChange.ipc$dispatch("30009b27", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ Context t(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("574972d8", new Object[]{bVar}) : bVar.f2675a;
    }

    static {
        kge.a(246198055);
        t = true;
        e = new ift();
    }

    public b(bbz bbzVar) {
        super(bbzVar);
        this.l = new HashMap();
        this.j = bbzVar;
        this.k = new d(this);
        this.n = new HashMap();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new DataBizContext();
        bci andRemoveDataCache = CartFirstPageCache.getAndRemoveDataCache();
        if (andRemoveDataCache == null) {
            this.r = new bci(this.f2675a);
        } else {
            this.r = andRemoveDataCache;
        }
        D();
        joz.a(e);
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.s = new bck(this);
        this.s.a(new bcn(this));
        this.s.a(new bcm(this));
        this.s.a(new bcl(this));
        this.s.a(new bco(this));
    }

    @Override // tb.bcb
    public void a(final RequestConfig requestConfig, final jnv jnvVar) {
        int l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c46c75", new Object[]{this, requestConfig, jnvVar});
            return;
        }
        final bff l2 = this.j.l();
        if (requestConfig == null) {
            return;
        }
        a(requestConfig);
        if (requestConfig.k()) {
            l = this.q.m();
        } else {
            l = this.q.l();
        }
        final int i = l;
        this.q.a(requestConfig.e());
        if (requestConfig.f()) {
            l2.a(1);
        }
        final bmz b = requestConfig.b();
        requestConfig.a(System.currentTimeMillis());
        final int n = bem.n(this);
        bct bctVar = new bct(jnvVar) { // from class: com.alibaba.android.icart.core.data.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private StreamRemoteMainResponse h;
            private final byte[] j;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 40303496) {
                    super.a((JSONObject) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            {
                this.j = b.a(b.this).b();
            }

            @Override // tb.bct, tb.jnv
            public boolean a(int i2, MtopResponse mtopResponse, Object obj) {
                jnv jnvVar2;
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("1f4c7080", new Object[]{this, new Integer(i2), mtopResponse, obj})).booleanValue() : b.b(b.this).m().isFinishing() || ((aat) b.c(b.this).S()).K() || i != b.d(b.this).m() || b.d(b.this).v() == b.d(b.this).m() || ((jnvVar2 = jnvVar) != null && jnvVar2.a(i2, mtopResponse, obj));
            }

            @Override // tb.bct, tb.joc
            public void a(int i2, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i2), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                bdw.a(b.c(b.this).O(), 2);
                b.a(b.this, true);
                for (jnv jnvVar2 : b.e(b.this)) {
                    jnvVar2.a(i2, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
                }
                if (requestConfig.b() != null) {
                    requestConfig.b().g();
                }
                jnv jnvVar3 = jnvVar;
                if (jnvVar3 != null) {
                    jnvVar3.a(i2, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
                }
                l2.b(1);
                if (requestConfig.i()) {
                    b.a(b.this, requestConfig.g() ? PageInfo.FIRST_PAGE : PageInfo.NEXT_PAGE, DataInfo.ERROR_DATA);
                } else if (requestConfig.j()) {
                    b.f(b.this);
                }
                bep.a(b.g(b.this), mtopResponse);
                akg.a(beo.b(mtopResponse), requestConfig, mtopResponse == null ? "error" : mtopResponse.getRetMsg(), false);
                b.c(b.this).x().p().g(false);
            }

            /* JADX WARN: Removed duplicated region for block: B:55:0x01f5  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x022f  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0235  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0246  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0287  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x02dc  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x033a  */
            @Override // tb.bct, tb.joc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void a(int r18, mtopsdk.mtop.domain.MtopResponse r19, java.lang.Object r20, tb.jny r21, java.util.Map<java.lang.String, ?> r22) {
                /*
                    Method dump skipped, instructions count: 893
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.icart.core.data.b.AnonymousClass1.a(int, mtopsdk.mtop.domain.MtopResponse, java.lang.Object, tb.jny, java.util.Map):void");
            }

            @Override // tb.bct, tb.jnv
            public boolean a(String str, List<AttachedResponse> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c1aa3527", new Object[]{this, str, list})).booleanValue();
                }
                if ((b.q(b.this).m() != null && b.r(b.this).m().isFinishing()) || list == null || list.isEmpty()) {
                    return false;
                }
                String reqId = list.get(0).getReqId();
                if (reqId != null && reqId.equals(str)) {
                    UnifyLog.b("DataManager", "requestId=" + str + ",attachedRequestId=" + reqId);
                    return true;
                }
                boolean z = bfw.a(reqId, b.d(b.this).j()) >= 0 && bfw.a(reqId, b.d(b.this).k()) >= 0;
                UnifyLog.b("DataManager", "attachedRequestId=" + reqId + ",mFirstPageRequestId=" + b.d(b.this).j() + ",currentRequestId=" + str + ",mUpdateRequestId=" + b.d(b.this).k() + ",verify=" + z);
                return z;
            }

            @Override // tb.bct, tb.jnv
            public void a(jny jnyVar, StreamRemoteMainResponse streamRemoteMainResponse, List<AttachedResponse> list) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("caa2cc62", new Object[]{this, jnyVar, streamRemoteMainResponse, list});
                    return;
                }
                this.h = streamRemoteMainResponse;
                if (!b.f() || !jqi.a("iCart", "preloadFirstPageItemPictures", true)) {
                    return;
                }
                b.c(false);
                com.alibaba.android.icart.core.performance.cache.b.a(jnyVar, b.c(b.this), requestConfig.g(), b.this.g(), streamRemoteMainResponse);
            }

            @Override // tb.bct, tb.jnv
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    return;
                }
                super.a(jSONObject);
                aae.a(b.c(b.this), jSONObject);
            }
        };
        RequestConfig.RequestType e2 = requestConfig.e();
        com.alibaba.android.icart.core.data.request.b a2 = bcv.a(this, e2);
        if (a2 == null) {
            return;
        }
        String s = this.j.s();
        StringBuilder sb = new StringBuilder();
        sb.append("发起请求:");
        sb.append(e2 == null ? "" : e2.name());
        jqg.b(s, sb.toString());
        String a3 = a2.a(requestConfig, bctVar);
        if (requestConfig.g()) {
            this.q.e(a3);
        } else if (!requestConfig.j()) {
        } else {
            this.q.f(a3);
        }
    }

    private boolean a(com.taobao.android.ultron.datamodel.imp.b bVar) {
        JSONObject d;
        JSONObject jSONObject;
        bez x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f99a0b6", new Object[]{this, bVar})).booleanValue();
        }
        com.taobao.android.ultron.datamodel.imp.c t2 = bVar.t();
        if (t2 != null && (d = t2.d()) != null && (jSONObject = d.getJSONObject(AURASubmitEvent.RPC_ENDPOINT)) != null && (x = this.j.x()) != null && x.p() != null) {
            return jqf.a(jSONObject);
        }
        return false;
    }

    private void a(RequestConfig requestConfig) {
        String str;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599879f7", new Object[]{this, requestConfig});
            return;
        }
        Map<String, String> d = requestConfig.d();
        if (d != null && Boolean.parseBoolean(d.get(RequestConfig.FIRST_PAGE_PRELOAD))) {
            return;
        }
        int i = AnonymousClass3.f2301a[requestConfig.e().ordinal()];
        if (i == 1) {
            str = "mtop.trade.query.bag";
        } else if (i == 2) {
            str = RequestConfig.RequestType.QUERY_CART_NEXT_PAGE.name();
            z = true;
        } else if (i != 3) {
            return;
        } else {
            str = "mtop.trade.update.bag";
        }
        jpo a2 = akg.a(this.f2675a, str);
        a2.a("apmClientBeforeNetworkLogicProcess", (String) null);
        if (!z) {
            return;
        }
        a2.b("isNextPage", "true");
    }

    @Override // tb.bcb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.q.b(str);
        }
    }

    @Override // tb.bcb
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            DataBizContext dataBizContext = this.q;
            dataBizContext.c(dataBizContext.h());
            this.q.c(false);
        } else {
            this.q.c(str);
            this.q.c(true);
        }
    }

    @Override // tb.bcb
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : TextUtils.isEmpty(this.q.g());
    }

    @Override // tb.bcb
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        String c = this.j.v().c(ieu.sQueryParamsKeyDefaultFilterItem);
        if ((str == null || str.isEmpty()) && c != null) {
            str = c;
        }
        this.q.c(str);
        this.q.d(str);
    }

    @Override // tb.bcb
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.q.g();
    }

    @Override // tb.bcb
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.q.h();
    }

    @Override // tb.bcb
    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.q.i();
    }

    @Override // tb.bcb
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.q.f();
    }

    @Override // com.alibaba.android.ultron.trade.presenter.a
    public void b(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f79045", new Object[]{this, bVar});
        } else if (this.h.contains(bVar)) {
        } else {
            this.h.add(bVar);
        }
    }

    @Override // com.alibaba.android.ultron.trade.presenter.a
    public void b(a.InterfaceC0095a interfaceC0095a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f71be6", new Object[]{this, interfaceC0095a});
        } else if (this.i.contains(interfaceC0095a)) {
        } else {
            this.i.add(interfaceC0095a);
        }
    }

    @Override // tb.bcb
    public void a(a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bcdec4", new Object[]{this, bVar});
        } else {
            this.h.remove(bVar);
        }
    }

    @Override // tb.bcb
    public void a(a.InterfaceC0095a interfaceC0095a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bc6a65", new Object[]{this, interfaceC0095a});
        } else {
            this.i.remove(interfaceC0095a);
        }
    }

    @Override // tb.bcb
    public void a(jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbb5de6", new Object[]{this, jnvVar});
        } else if (this.p.contains(jnvVar)) {
        } else {
            this.p.add(jnvVar);
        }
    }

    @Override // tb.bcb
    public void b(jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3e6467", new Object[]{this, jnvVar});
        } else if (!this.p.contains(jnvVar)) {
        } else {
            this.p.remove(jnvVar);
        }
    }

    @Override // tb.bcb
    public void a(bcb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4621955a", new Object[]{this, aVar});
        } else if (this.o.contains(aVar)) {
        } else {
            this.o.add(aVar);
        }
    }

    private void a(jny jnyVar, RequestConfig requestConfig, final byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e7c919", new Object[]{this, jnyVar, requestConfig, bArr});
        } else if (jnyVar.e() || !this.j.j() || !requestConfig.g()) {
        } else {
            jqh.a(new Runnable() { // from class: com.alibaba.android.icart.core.data.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        b.a(b.this).a((bch) bArr);
                        com.alibaba.android.icart.core.performance.cache.a.a(b.s(b.this), b.t(b.this));
                    } catch (Exception e2) {
                        bed.a("缓存首屏数据报错", e2.getMessage());
                    }
                }
            });
        }
    }

    @Override // tb.bcb
    public void a(sxz.a<byte[]> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abecbb66", new Object[]{this, aVar});
        } else {
            this.r.a(aVar);
        }
    }

    @Override // tb.bcb
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.r.c();
    }

    @Override // tb.bcb
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            Mtop.instance(Mtop.Id.INNER, this.f2675a).removeCacheBlock(new CacheManagerImpl(null).getBlockName(StringUtils.concatStr2LowerCase("mtop.trade.query.bag", AfcCustomSdk.SDK_VERSION)));
        }
    }

    @Override // tb.bcb
    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.k.b();
    }

    @Override // tb.bcb
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        Iterator<bcb.a> it = this.o.iterator();
        while (it.hasNext()) {
            it.next();
            j();
        }
        this.k.a();
        for (bcb.a aVar : this.o) {
            aVar.a(j());
        }
    }

    @Override // tb.bcb
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.k.a(z);
        }
    }

    @Override // tb.bcb
    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (this.l.get(str) != null) {
            return this.l.get(str).booleanValue();
        }
        return false;
    }

    @Override // tb.bcb
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (w() != null && w().f() != null) {
            String key = w().f().getKey();
            if (this.l.get(key) != null) {
                return this.l.get(key).booleanValue();
            }
        }
        return true;
    }

    @Override // tb.bcb
    public CartGlobal m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartGlobal) ipChange.ipc$dispatch("fab1d32c", new Object[]{this}) : this.m;
    }

    @Override // tb.bcb
    public bbz n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("730815f7", new Object[]{this}) : this.j;
    }

    @Override // tb.bcb
    public DataBizContext o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataBizContext) ipChange.ipc$dispatch("79bb3c2d", new Object[]{this}) : this.q;
    }

    @Override // tb.bcb
    public IDMComponent e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("8012fe3a", new Object[]{this, str});
        }
        List<IDMComponent> list = this.n.get(str);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override // tb.bcb
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        if (this.j.n().d()) {
            return d(this.q.f());
        }
        return l();
    }

    @Override // tb.bcb
    public List<IDMComponent> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc936ecf", new Object[]{this});
        }
        bby d = this.j.x().d();
        if (d == null) {
            return null;
        }
        return d.f();
    }

    @Override // tb.bcb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (!bem.c(this)) {
        } else {
            boolean b = bei.b(e("submit"));
            if (a() && b) {
                this.q.d(true);
            } else if ("repeatBuy".equals(b()) || b) {
            } else {
                this.q.d(false);
            }
        }
    }

    @Override // tb.bcb
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        RequestConfig.RequestType w = this.q.w();
        if (w != RequestConfig.RequestType.QUERY_CART_PAGE && w != RequestConfig.RequestType.QUERY_CART_NEXT_PAGE) {
            return;
        }
        DataBizContext dataBizContext = this.q;
        dataBizContext.a(dataBizContext.m());
    }

    @Override // tb.bcb
    public void a(Map<String, List<IDMComponent>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.n = map;
        }
    }

    @Override // tb.bcb
    public void a(IDMComponent iDMComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6484868", new Object[]{this, iDMComponent, new Boolean(z)});
        } else if (t() || iDMComponent == null) {
        } else {
            CheckHoldManager.a().a(iDMComponent.getFields(), z);
        }
    }

    @Override // tb.bcb
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else if (iDMComponent == null) {
        } else {
            com.taobao.android.ultron.datamodel.imp.b bVar = (com.taobao.android.ultron.datamodel.imp.b) this.c;
            bVar.o().remove(iDMComponent.getKey());
            bVar.u().remove(iDMComponent.getKey());
            if (t()) {
                return;
            }
            CheckHoldManager.a().b(iDMComponent.getFields());
        }
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        List<a.InterfaceC0095a> A = A();
        if (A == null) {
            return;
        }
        for (a.InterfaceC0095a interfaceC0095a : A) {
            if (interfaceC0095a != null) {
                interfaceC0095a.a();
            }
        }
    }

    private void a(PageInfo pageInfo, DataInfo dataInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29da491", new Object[]{this, pageInfo, dataInfo});
            return;
        }
        List<a.b> z = z();
        if (z == null) {
            return;
        }
        for (a.b bVar : z) {
            if (bVar != null) {
                bVar.a(pageInfo, dataInfo);
            }
        }
    }

    private PageInfo b(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("f797c930", new Object[]{this, requestConfig});
        }
        if (requestConfig.h() || requestConfig.g()) {
            return PageInfo.FIRST_PAGE;
        }
        if (!l()) {
            return PageInfo.LAST_PAGE;
        }
        return PageInfo.NEXT_PAGE;
    }

    private void a(jny jnyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59e84a0d", new Object[]{this, jnyVar, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.l.put(str, Boolean.valueOf(bei.a((com.taobao.android.ultron.datamodel.imp.b) jnyVar, str)));
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.m = CartGlobal.parseCartGlobal(jSONObject);
        }
    }

    @Override // tb.bcb
    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.j.v().k() || !this.j.v().i();
    }

    @Override // tb.bcb
    public bnv i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bnv) ipChange.ipc$dispatch("4c9007ac", new Object[]{this}) : this.q.F();
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else if (!bem.r(this)) {
        } else {
            bei.a(this.c);
            bei.a(this.c, this.j);
            this.j.x().b(4);
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        IDMComponent e2 = e("submit");
        if (e2 != null && e2.getFields().get(bei.KEY_IS_CALCULATING_STATE) != null) {
            bei.a(this.c);
        }
        if (!z) {
            return;
        }
        this.j.x().b(4);
    }

    private void a(RequestConfig requestConfig, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97737ec", new Object[]{this, requestConfig, new Integer(i)});
            return;
        }
        RequestConfig.RequestType e2 = requestConfig.e();
        if (RequestConfig.RequestType.LOAD_CACHE_DATA.equals(e2) || RequestConfig.RequestType.QUERY_CART_PAGE.equals(e2) || RequestConfig.RequestType.QUERY_CART_NEXT_PAGE.equals(e2)) {
            return;
        }
        int n = bem.n(this);
        Bundle bundle = new Bundle();
        String str = beg.c;
        if (i == n) {
            z = false;
        }
        bundle.putBoolean(str, z);
        bundle.putInt(beg.d, n);
        bundle.putString(beg.e, beg.i);
        bundle.putBoolean(beg.f, "cartSelect".equals(requestConfig.b() != null ? requestConfig.b().b() : null));
        beg.a(this.f2675a, bundle);
    }

    @Override // tb.bcb
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        this.s.a();
        this.j.l().b(5);
    }

    private void a(RequestConfig.RequestType requestType, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b316b7e", new Object[]{this, requestType, jSONObject});
        } else if (RequestConfig.RequestType.LOAD_CACHE_DATA == requestType && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("performanceStage")) != null && (jSONObject3 = jSONObject2.getJSONObject("commonArgs")) != null) {
            for (String str : jSONObject3.keySet()) {
                jpo.b(this.f2675a).b(str, String.valueOf(jSONObject3.get(str)));
            }
        }
    }
}
