package tb;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.event.ext.f;
import com.alibaba.android.ultron.event.ext.g;
import com.alibaba.android.ultron.event.ext.k;
import com.alibaba.android.ultron.event.ext.l;
import com.alibaba.android.ultron.event.ext.m;
import com.alibaba.android.ultron.event.ext.n;
import com.alibaba.android.ultron.event.ext.o;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.android.ultron.event.ext.q;
import com.alibaba.android.ultron.event.ext.r;
import com.alibaba.android.ultron.event.ext.s;
import com.alibaba.android.ultron.event.ext.t;
import com.alibaba.android.ultron.event.ext.u;
import com.alibaba.android.ultron.event.ext.v;
import com.alibaba.android.ultron.event.i;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.ultron.vfw.viewholder.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.c;
import com.taobao.android.order.core.dinamicX.parser.TDApplyRichCssParser;
import com.taobao.android.order.core.dinamicX.parser.j;
import com.taobao.android.order.core.dinamicX.parser.o;
import com.taobao.android.order.core.dinamicX.view.DXBBOrderDatePickerViewWidgetNode;
import com.taobao.android.order.core.h;
import com.taobao.android.order.core.request.DataStatus;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.ParseResponseHelper;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.taobao.R;
import com.ut.share.utils.Constants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.boc;
import tb.bxb;
import tb.hxg;
import tb.hzr;
import tb.hzs;
import tb.iab;
import tb.xjy;
import tb.xpk;

/* loaded from: classes6.dex */
public class hzp implements bwv, hzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OrderConfigs b;
    public h c;
    public boolean d;
    public d f;
    public Context g;
    private hzk h;
    private hzm i;
    private com.taobao.android.ultron.datamodel.imp.b j;
    private c k;
    private boolean l;
    private boolean m;
    private bfy n;
    public String o;
    private fjv p;
    private final Map<Long, com.taobao.android.dinamicx.h> s;
    private final Map<Long, DXWidgetNode> t;
    private dnw u;
    private final Map<Long, fuf> v;

    /* renamed from: a  reason: collision with root package name */
    private final String f28855a = "NAME_SPACE_BABEL_ORDER";
    public long e = 0;
    private final Map<String, e> q = new HashMap();
    private final Map<String, com.alibaba.android.ultron.event.base.d> r = new HashMap();

    static {
        kge.a(2062764329);
        kge.a(1767603020);
        kge.a(204096453);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        }
    }

    public hzp() {
        this.r.put("request", new i().a("UNIT_TRADE"));
        this.r.put("toastV2", new n());
        this.r.put("alertV2", new com.alibaba.android.ultron.event.ext.a());
        this.r.put("alertWithOpenUrlV2", new bjv());
        this.r.put("refreshMtopV2", new bjy());
        this.r.put("closePageV2", new com.alibaba.android.ultron.event.ext.c());
        this.r.put("refreshPageV2", new k(new k.a() { // from class: tb.hzp.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.event.ext.k.a
            public void a(com.alibaba.android.ultron.event.base.e eVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
                } else {
                    hzp.this.a(eVar);
                }
            }
        }));
        this.r.put("updateAsyncStatusV2", new r());
        this.r.put("asyncRefreshV2", new bjw());
        this.r.put("updateComponentV2", new s());
        this.r.put("batchUpdateComponentV2", new iag());
        this.r.put("remoteUltronPopV2", new bka());
        this.r.put("alertWithRefreshMtopV2", new bju());
        this.r.put("mtopWithOpenUrlV2", new bjz());
        this.r.put("userTrackV2", new t());
        this.r.put("asyncUserTrackV2", new com.alibaba.android.ultron.event.ext.b());
        this.r.put("copyV2", new com.alibaba.android.ultron.event.ext.d());
        this.r.put("removeComponentV2", new l());
        this.r.put("sendMsgV2", new m());
        this.r.put("inSimpleConditionV2", new g());
        this.r.put("foldComponentV2", new ial());
        this.r.put("weexPopV2", new iat());
        this.r.put("addBagAgainV2", new iae());
        this.r.put("delOrderV2", new iai());
        this.r.put("openUrlV2", new ian());
        this.r.put(iam.SUBSCRIBER_ID, new iam());
        this.r.put(iap.SUBSCRIBER_ID, new iap());
        this.r.put(xpw.SUBSCRIBER_ID, new xpw());
        this.r.put("doBatchPayCheckV2", new iaj());
        this.r.put("addCartV2", new iaf());
        this.r.put(iah.TAG, new iah());
        this.r.put("receiveMsgV2", new iao());
        this.r.put("dismissPopV2", new u());
        this.r.put(v.SUBSCRIBER_ID, new v());
        this.r.put(iak.SUBSCRIBER_ID, new iak());
        this.r.put(ias.SUBSCRIBER_ID, new ias());
        this.r.put(iar.SUBSCRIBER_ID, new iar());
        this.r.put("ultronPopV2", new q().a(new f() { // from class: tb.hzp.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.event.ext.f
            public void a(d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a26c908d", new Object[]{this, dVar});
                    return;
                }
                dVar.d().b("refreshOrder", new p() { // from class: tb.hzp.4.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alibaba.android.ultron.event.ext.p
                    public void d(com.alibaba.android.ultron.event.base.e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
                        } else {
                            hzp.this.a(eVar);
                        }
                    }
                });
                hzp.this.a(dVar);
                hzp.a(hzp.this, dVar);
                hzp.b(hzp.this, dVar);
                for (String str : hzp.d(hzp.this).keySet()) {
                    dVar.a(str, (e) hzp.d(hzp.this).get(str));
                }
            }
        }));
        this.s = new HashMap();
        this.t = new HashMap();
        this.u = new dnw();
        this.v = new HashMap();
        this.t.put(Long.valueOf((long) com.taobao.android.megadesign.dx.view.a.DXMALOTTIEVIEW_MALOTTIEVIEW), new com.taobao.android.megadesign.dx.view.a());
        this.t.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.view.b.DX_PRICE_VIEW), new com.taobao.android.order.core.dinamicX.view.b());
        this.t.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.view.d.DX_WIDGET_ID), new com.taobao.android.order.core.dinamicX.view.d());
        DXWidgetNode dXWidgetNode = (DXWidgetNode) bwz.a("com.taobao.android.order.core.dinamicX.view.DXAMapViewWidgetNode");
        if (dXWidgetNode != null) {
            this.t.put(-8295092662641575934L, dXWidgetNode);
        }
        this.t.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.view.c.DXQRCODEIMAGEVIEW_QRCODEIMAGEVIEW), new com.taobao.android.order.core.dinamicX.view.c());
        this.t.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.view.a.DXMAPIMAGEVIEW_MAPIMAGEVIEW), new com.taobao.android.order.core.dinamicX.view.a());
        this.t.put(Long.valueOf((long) com.taobao.android.megadesign.dx.view.d.DXTBORDERSCROLLERLAYOUT_TBORDERSCROLLERLAYOUT), new com.taobao.android.order.core.dinamicX.view.f());
        this.t.put(Long.valueOf(com.taobao.android.megadesign.dx.view.c.Companion.a()), new com.taobao.android.megadesign.dx.view.c());
        this.t.put(Long.valueOf((long) com.taobao.android.megadesign.dx.view.b.DXORDERMARQUEETEXTVIEW_ORDERMARQUEETEXTVIEW), new com.taobao.android.megadesign.dx.view.b());
        this.t.put(Long.valueOf((long) DXBBOrderDatePickerViewWidgetNode.DXBBORDERDATEPICKERVIEW_BBORDERDATEPICKERVIEW), new DXBBOrderDatePickerViewWidgetNode());
        this.t.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.view.h.DXTBTRADETOUCHMASKLINEARLAYOUT_TBTRADETOUCHMASKLINEARLAYOUT), new com.taobao.android.order.core.dinamicX.view.h());
        this.s.put(Long.valueOf((long) hzt.DX_EVENT_CLOSE_ACTIVITY), new hzt());
        this.s.put(Long.valueOf((long) hzu.DX_EVENT_TABCHANGE), new hzu());
        this.v.put(Long.valueOf((long) TDApplyRichCssParser.DX_PARSER_ID), new TDApplyRichCssParser());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.r.DX_PARSER_ID), new com.taobao.android.order.core.dinamicX.parser.r());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.a.DX_PARSER_GETCURRENTINDEX), new com.taobao.android.order.core.dinamicX.parser.a());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.n.DX_PARSER_ULTRONLOCALDATA), new com.taobao.android.order.core.dinamicX.parser.n());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.q.MTOP_RETMSGDATA_PARSER), new com.taobao.android.order.core.dinamicX.parser.q());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.p.FORMAT_MTOPDATA_PARSER), new com.taobao.android.order.core.dinamicX.parser.p());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.k.DX_PARSER_STRTOJSONOBJECT), new com.taobao.android.order.core.dinamicX.parser.k());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.f.DX_PARSER_OBJECTTOJSONSTR), new com.taobao.android.order.core.dinamicX.parser.f());
        this.v.put(Long.valueOf((long) j.DX_PARSER_SPLITSTRING), new j());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.m.DX_PARSER_TOFLEXLAYOUTARRAY), new com.taobao.android.order.core.dinamicX.parser.m());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.g.DX_PARSER_ORDERNAVBARHEIGHT), new com.taobao.android.order.core.dinamicX.parser.g());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.c.DX_PARSER_GETMAPKEYLIST), new com.taobao.android.order.core.dinamicX.parser.c());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.b.DX_PARSER_GETINDEXBYID), new com.taobao.android.order.core.dinamicX.parser.b());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.h.DX_PARSER_ORDERURLENCODE), new com.taobao.android.order.core.dinamicX.parser.h());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.d.DX_PARSER_GETPAGEURL), new com.taobao.android.order.core.dinamicX.parser.d());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.i.DX_PARSER_RNOTIFICATIONSENABLED), new com.taobao.android.order.core.dinamicX.parser.i());
        this.v.put(Long.valueOf((long) o.DX_PARSER_ORDERISINTERNALNETWORK), new o());
        this.v.put(Long.valueOf((long) ihv.DX_PARSER_RESOLVE_WIDTH), new ihv());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.s.DX_GETIMAGEBIZINFO), new com.taobao.android.order.core.dinamicX.parser.s());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.e.DX_PARSER_GETSCREENHEIGHT), new com.taobao.android.order.core.dinamicX.parser.e());
        this.v.put(Long.valueOf((long) com.taobao.android.order.core.dinamicX.parser.u.DX_PARSER_PARAMINPAGEURL), new com.taobao.android.order.core.dinamicX.parser.u());
    }

    public static /* synthetic */ PageStatus a(com.taobao.android.ultron.datamodel.imp.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageStatus) ipChange.ipc$dispatch("ce72a8c6", new Object[]{bVar, new Boolean(z)}) : b(bVar, z);
    }

    public static /* synthetic */ void a(hzp hzpVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c593b", new Object[]{hzpVar, dVar});
        } else {
            hzpVar.d(dVar);
        }
    }

    public static /* synthetic */ boolean a(hzp hzpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ecf80c7e", new Object[]{hzpVar})).booleanValue() : hzpVar.l;
    }

    public static /* synthetic */ boolean a(hzp hzpVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a31ce9c3", new Object[]{hzpVar, mtopResponse})).booleanValue() : hzpVar.a(mtopResponse);
    }

    public static /* synthetic */ bfy b(hzp hzpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bfy) ipChange.ipc$dispatch("969a1d16", new Object[]{hzpVar}) : hzpVar.n;
    }

    public static /* synthetic */ void b(hzp hzpVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2ac1a", new Object[]{hzpVar, dVar});
        } else {
            hzpVar.b(dVar);
        }
    }

    public static /* synthetic */ boolean c(hzp hzpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c9fe1980", new Object[]{hzpVar})).booleanValue() : hzpVar.m;
    }

    public static /* synthetic */ Map d(hzp hzpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1828f372", new Object[]{hzpVar}) : hzpVar.q;
    }

    @Override // tb.bwv
    public d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2a3f050", new Object[]{this}) : this.f;
    }

    public h e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("107b5f1", new Object[]{this}) : this.c;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        hzy.a("UltronProxy", "buildContainer", "----");
        this.g = context;
        d dVar = this.f;
        if (dVar == null) {
            d(context);
        } else {
            dVar.a(context);
        }
    }

    public void d(Context context) {
        DXEngineConfig.a aVar;
        boc a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
            return;
        }
        g();
        UltronInstanceConfig a3 = new UltronInstanceConfig().a(this.b.e().getBizName()).a(2);
        a3.b(this.b.g());
        a3.a(this.b.h());
        if (this.b.e() == OrderConfigs.BizNameType.ORDER_LIST && ibl.c()) {
            a3.j(true);
        } else if (this.b.e() == OrderConfigs.BizNameType.ORDER_DETAIL && ibl.d()) {
            a3.j(true);
        }
        if (OrderConfigs.BizNameType.ORDER_LIST.equals(this.b.e())) {
            aVar = new DXEngineConfig.a(OrderConfigs.BizNameType.ORDER_LIST.getBizName());
            a2 = new boc.a().a(ibl.l()).b(ibl.m()).a(aVar).a();
            a3.h(ibl.k());
        } else {
            aVar = new DXEngineConfig.a(OrderConfigs.BizNameType.ORDER_DETAIL.getBizName());
            a2 = new boc.a().a(aVar).a();
        }
        if (dcn.a()) {
            aVar.a(true, true);
        }
        a3.a(a2);
        this.f = d.a(a3, context);
        if (this.f.q() != null) {
            this.f.q().b(false);
        }
        a(this.f);
        d(this.f);
        b(this.f);
        c(this.f);
        c();
        if (this.b.r() instanceof hzw) {
            ((hzw) this.b.r()).a(this.f.q());
        }
        this.l = ibl.a(this.b);
        if (this.l) {
            this.n = new bfy("ultronAsyncExposure", 3);
        }
        this.m = ibl.b(this.b);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a(hzs.UPDATEDXROOTHEIGHT, new hzs.a());
        }
    }

    @Override // tb.hzc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f.o();
        this.f.x().C();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.b.b().m());
        this.r.put("mtopV2", new com.alibaba.android.ultron.event.ext.h().a("UNIT_TRADE").b(hashMap));
        this.r.put("openUrl", new com.alibaba.android.ultron.event.ext.j(this.b));
    }

    @Override // tb.hzc
    public void a(Map<String, ViewGroup> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        RecyclerView recyclerView = (RecyclerView) map.get(OrderConfigs.RECYCLERVIEW);
        this.f.a((LinearLayout) map.get("top"), recyclerView, (LinearLayout) map.get("bottom"));
        ViewGroup viewGroup = map.get("foreground");
        if (viewGroup != null) {
            this.f.a(viewGroup);
        }
        ViewGroup viewGroup2 = map.get("background");
        if (viewGroup2 != null) {
            this.f.b(viewGroup2);
        }
        fjv fjvVar = this.p;
        if (fjvVar == null) {
            return;
        }
        fjvVar.a(recyclerView);
    }

    private void b(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc37326c", new Object[]{this, dVar});
        } else {
            dVar.a(new boe() { // from class: tb.hzp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.boe
                public void a(ViewGroup viewGroup, int i, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1fdad4c9", new Object[]{this, viewGroup, new Integer(i), map});
                    }
                }

                public static /* synthetic */ void a(AnonymousClass1 anonymousClass1, IDMComponent iDMComponent, Map map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("87218b7e", new Object[]{anonymousClass1, iDMComponent, map});
                    } else {
                        anonymousClass1.a(iDMComponent, map);
                    }
                }

                @Override // tb.boe
                public void a(com.alibaba.android.ultron.vfw.viewholder.h hVar, final IDMComponent iDMComponent, final Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fa110afe", new Object[]{this, hVar, iDMComponent, map});
                    } else if (hzp.a(hzp.this)) {
                        hzp.b(hzp.this).a(new Runnable() { // from class: tb.hzp.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AnonymousClass1.a(AnonymousClass1.this, iDMComponent, map);
                                }
                            }
                        });
                    } else if (hzp.c(hzp.this)) {
                        fxe.a(new Runnable() { // from class: tb.hzp.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    AnonymousClass1.a(AnonymousClass1.this, iDMComponent, map);
                                }
                            }
                        });
                    } else {
                        a(iDMComponent, map);
                    }
                }

                private void a(IDMComponent iDMComponent, Map<String, Object> map) {
                    Map<String, List<com.taobao.android.ultron.common.model.b>> eventMap;
                    List<com.taobao.android.ultron.common.model.b> list;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("be0a1e19", new Object[]{this, iDMComponent, map});
                    } else if (iDMComponent != null && (eventMap = iDMComponent.getEventMap()) != null && (list = eventMap.get("exposureItemV2")) != null) {
                        bki.a(dVar, "exposureItemV2", iDMComponent);
                        for (int i = 0; i < list.size(); i++) {
                            com.taobao.android.ultron.common.model.b bVar = list.get(i);
                            if (bVar != null) {
                                String type = bVar.getType();
                                if (!StringUtils.isEmpty(type)) {
                                    com.alibaba.android.ultron.event.base.e a2 = dVar.d().a().a(type);
                                    a2.a(iDMComponent);
                                    if (map != null) {
                                        a2.a((Map<? extends String, ? extends Object>) map);
                                    }
                                    a2.e("exposureItemV2");
                                    a2.a(bVar);
                                    UnifyLog.d("UltronProxy", "component exposure item:" + type + ", " + iDMComponent.getKey());
                                    dVar.d().a(a2);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            return;
        }
        dVar.o();
        this.f.x().C();
        hzk hzkVar = this.h;
        if (hzkVar == null) {
            return;
        }
        hzkVar.a();
    }

    private void c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1601d44b", new Object[]{this, dVar});
        } else {
            dVar.h().a(new jpk("postUltronEvent", dVar.h()) { // from class: tb.hzp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    if (str.hashCode() == -1507519932) {
                        super.a(objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // tb.jpk
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    } else {
                        super.a(obj);
                    }
                }
            });
        }
    }

    private void d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcc762a", new Object[]{this, dVar});
            return;
        }
        for (String str : this.r.keySet()) {
            dVar.d().b(str, this.r.get(str));
            if (this.r.get(str) instanceof p) {
                dVar.l().a().d().l().a(((p) this.r.get(str)).e(), new o.a(dVar, str));
                if (!"refreshPageV2".equals(str) && !"ultronPopV2".equals(str)) {
                    hvd.INSTANCE.a(str, "NAME_SPACE_BABEL_ORDER", (p) this.r.get(str));
                }
            }
        }
        boolean g = ibl.g();
        DinamicXEngine d = dVar.l().a().d();
        dmx a2 = dmy.a().b(d).a(d).a(d, dVar.d());
        if (g) {
            a2.a(dVar.d());
        } else {
            dVar.d().a(new com.alibaba.android.ultron.event.ext.e());
        }
        e(dVar);
        hzy.a("UltronProxy", "registerUltronEvents", "----");
    }

    private void e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89971809", new Object[]{this, dVar});
            return;
        }
        DinamicXEngine d = dVar.l().a().d();
        d.a("ultronAlertV2", new o.a(dVar, "alertV2"));
        d.a("ultronOpenURLV2", new o.a(dVar, "openUrlV2"));
        d.a("ultronRefreshPageV2", new o.a(dVar, "refreshPageV2"));
        d.a("ultronRefreshOrderDetailAndListV2", new o.a(dVar, "refreshPageV2"));
        d.a("ultronRefreshOrderListV2", new o.a(dVar, "refreshPageV2"));
        d.a("ultronRemoveComponentV2", new o.a(dVar, "removeComponentV2"));
        d.a("ultronUpdateComponentV2", new o.a(dVar, "updateComponentV2"));
        d.a("ultronClosePageV2", new o.a(dVar, "closePageV2"));
        d.a("ultronCloseWindowV2", new o.a(dVar, "closePageV2"));
        d.a("ultronDoBatchPayCheckV2", new o.a(dVar, "doBatchPayCheckV2"));
        d.a("ultronPopV2", new o.a(dVar, "ultronPopV2"));
        d.a("ultronPopupSelect", new o.a(dVar, "popupSelect"));
        d.a("ultronDismissUltronPopV2", new o.a(dVar, "dismissPopV2"));
        d.a("ultronUnionOrderConverterV2", new o.a(dVar, iar.SUBSCRIBER_ID));
        d.a("ultronOrderRequestV2", new hzr.a(this));
        d.a("ultronToastV2", new o.a(dVar, "toastV2"));
        d.a("ultronUpdateAsyncStatusV2", new o.a(dVar, "updateAsyncStatusV2"));
        d.a("ultronMoreClickV2", new o.a(dVar, iap.SUBSCRIBER_ID));
        d.a("ultronArrowMoreClick", new o.a(dVar, xpw.SUBSCRIBER_ID));
        d.a("ultronBatchUpdateComponentV2", new o.a(dVar, "batchUpdateComponentV2"));
        d.a("ultronSendMsgV2", new o.a(dVar, "sendMsgV2"));
        d.a("ultronReceiveMsgV2", new o.a(dVar, "receiveMsgV2"));
        d.a("ultronUserTrackV2", new o.a(dVar, "userTrackV2"));
        d.a("ultronAsyncUserTrackV2", new o.a(dVar, "asyncUserTrackV2"));
        d.a("ultronMtopV2", new o.a(dVar, "mtopV2"));
        d.a("ultronCartRefreshV2", new o.a(dVar, iah.TAG));
        d.a("ultronCopyV2", new o.a(dVar, "copyV2"));
        d.a("ultronLogisticsV2", new o.a(dVar, iam.SUBSCRIBER_ID));
        d.a("ultronFoldComponentV2", new o.a(dVar, "foldComponentV2"));
        d.a("ultronWeexPopV2", new o.a(dVar, "weexPopV2"));
        d.a("ultronInSimpleConditionV2", new o.a(dVar, "inSimpleConditionV2"));
        d.a("ultronTabChangeV2", new o.a(dVar, "tabChangeV2"));
        d.a("ultronImageLoadComplete", new hxg.a(this.b.q()));
        d.a("TradeOnStage", new xjy.a());
        d.a(v.SUBSCRIBER_ID, new o.a(dVar, v.SUBSCRIBER_ID));
        if (!spk.a("babelorder", "tbTradeJSTrackerReportRegister", true)) {
            return;
        }
        d.a("tbTradeJSTrackerReport", new xpk.a());
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26c908d", new Object[]{this, dVar});
            return;
        }
        for (Long l : this.t.keySet()) {
            dVar.a(l.longValue(), this.t.get(l));
            hvb.INSTANCE.a(String.valueOf(l), "NAME_SPACE_BABEL_ORDER", this.t.get(l));
        }
        for (Long l2 : this.s.keySet()) {
            dVar.a(l2.longValue(), this.s.get(l2));
            huz.INSTANCE.a(String.valueOf(l2), "NAME_SPACE_BABEL_ORDER", this.s.get(l2));
        }
        for (Long l3 : this.v.keySet()) {
            dVar.a(l3.longValue(), this.v.get(l3));
            hva.INSTANCE.a(String.valueOf(l3), "NAME_SPACE_BABEL_ORDER", this.v.get(l3));
        }
        hva.INSTANCE.a(String.valueOf((long) dnw.DX_PARSER_ULTRONGLOBALDATA), "NAME_SPACE_BABEL_ORDER", this.u);
        dVar.a(boi.DX_EVENT_HANDLEDINAMICXPAGEEVENT, new boi(dVar, this.b));
        dVar.a(bom.DX_EVENT_DXCUSTOMEVENT, new bom());
        if (ibl.s()) {
            this.p = new fjv();
            dVar.a(com.taobao.android.dinamicx.eventchain.f.DX_EVENT_EVENTCHAIN, this.p);
        }
        hzy.a("UltronProxy", "registerDX3Info", "----");
    }

    @Override // tb.hzc
    public jnl a(jnk jnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnl) ipChange.ipc$dispatch("4736d4ed", new Object[]{this, jnkVar});
        }
        d dVar = this.f;
        if (dVar != null && dVar.l() != null && this.f.l().a() != null && this.f.l().a().d() != null) {
            return new jnl(this.g, jnkVar, this.b.e().getBizName(), null, this.f.l().a().d());
        }
        return null;
    }

    @Override // tb.hzc
    public JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        d dVar = this.f;
        if (dVar != null) {
            return Util.b(str, dVar.x());
        }
        return null;
    }

    @Override // tb.hzc
    public com.taobao.android.ultron.common.model.a c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.a) ipChange.ipc$dispatch("a0744752", new Object[]{this, str});
        }
        d dVar = this.f;
        if (dVar != null) {
            return Util.c(str, dVar.x());
        }
        return null;
    }

    @Override // tb.hzc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f == null) {
        } else {
            hzy.a("UltronProxy", "rebuild", "----");
            this.f.a(i);
        }
    }

    @Override // tb.hzc
    public void a(Long l, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554e6d68", new Object[]{this, l, dXWidgetNode});
        } else if (this.f == null) {
        } else {
            hzy.a("UltronProxy", "registerDXView", l.toString(), "", null);
            this.f.a(l.longValue(), dXWidgetNode);
            this.t.put(l, dXWidgetNode);
        }
    }

    @Override // tb.hzc
    public void a(Long l, fuf fufVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829d1340", new Object[]{this, l, fufVar});
        } else if (this.f == null) {
        } else {
            hzy.a("UltronProxy", "registerDXParser", l.toString(), "", null);
            this.f.a(l.longValue(), fufVar);
            this.v.put(l, fufVar);
        }
    }

    @Override // tb.hzc
    public void a(String str, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8561f26", new Object[]{this, str, eVar});
        } else if (this.f == null) {
        } else {
            hzy.a("UltronProxy", "registerNativeViewHolder", str.toString(), "", null);
            this.f.a(str, eVar);
            this.q.put(str, eVar);
        }
    }

    @Override // tb.hzc
    public void a(String str, com.alibaba.android.ultron.event.base.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e1ac1a", new Object[]{this, str, dVar});
            return;
        }
        d dVar2 = this.f;
        if (dVar2 == null || dVar2.d() == null) {
            return;
        }
        hzy.a("UltronProxy", "registerEvent", str.toString(), "", null);
        this.f.d().b(str, dVar);
        if (dVar instanceof p) {
            p pVar = (p) dVar;
            this.f.d().b(pVar.e(), pVar);
            a(pVar.e(), new o.a(this.f, str));
        }
        this.r.put(str, dVar);
    }

    @Override // tb.hzc
    public void a(String str, dln dlnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2548edfc", new Object[]{this, str, dlnVar});
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            return;
        }
        dVar.l().a().d().l().a(str, dlnVar);
    }

    @Override // tb.hzc
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            return;
        }
        try {
            dVar.l().a().d().l().b().a(str, jSONObject);
        } catch (NullPointerException e) {
            hzy.a("UltronProxy", "postToAbilityMsgCenter", e);
        }
    }

    @Override // tb.hzc
    public void a(DXRootView dXRootView, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb8c227", new Object[]{this, dXRootView, jSONObject});
            return;
        }
        d dVar = this.f;
        if (dVar == null) {
            return;
        }
        try {
            dVar.l().a().d().a(dXRootView, (Object) jSONObject);
        } catch (NullPointerException e) {
            hzy.a("UltronProxy", "postMessageByDx", e);
        }
    }

    @Override // tb.hzc
    public void a(String str) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str) || (dVar = this.f) == null || dVar.x() == null) {
        } else {
            IDMComponent b2 = this.f.x().b(str);
            if (this.f.k() == null || this.f.k().f() == null || b2 == null) {
                return;
            }
            final int indexOf = this.f.k().f().indexOf(b2);
            final ViewGroup viewGroup = this.b.c().get(OrderConfigs.RECYCLERVIEW);
            if (indexOf == -1) {
                return;
            }
            viewGroup.post(new Runnable() { // from class: tb.hzp.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ((RecyclerView) viewGroup).smoothScrollToPosition(indexOf);
                    } catch (Exception e) {
                        iaa.a(hzp.this.f.a(), e.toString(), "SCROLL_BY_KEY_ERROR", (Map<String, String>) null);
                        hzy.a("UltronProxy", "SCROLL_BY_KEY_ERROR", e);
                    }
                }
            });
        }
    }

    @Override // tb.hzc
    public void a(JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627ef5b2", new Object[]{this, jSONObject, cVar});
        } else if (this.f == null) {
        } else {
            try {
                this.d = this.b.p();
                this.f.a(jSONObject, new bor(new a(this.b)));
                if (cVar == null) {
                    return;
                }
                cVar.onLoadSuccess(jSONObject, DataStatus.NORMAL_DATA, PageStatus.LAST_PAGE);
            } catch (Throwable th) {
                if (cVar == null) {
                    return;
                }
                cVar.onLoadError(th.toString(), null, DataStatus.ERROR_DATA, this.j == null ? PageStatus.FIRST_PAGE : PageStatus.NEXT_PAGE);
            }
        }
    }

    @Override // tb.hzc
    public void a(h hVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad81432d", new Object[]{this, hVar, cVar});
        } else if (hVar == null || this.f == null) {
        } else {
            hzy.a("UltronProxy", "loadData", hVar.b() + "-" + hVar.d(), "", "开始请求");
            this.c = hVar;
            this.k = cVar;
            this.c.a((iad) null);
            iab.a aVar = new iab.a(this.c.a());
            if (hVar.l() != null && hVar.l().get("tabCode") != null && hVar.l().get("tabCode").equals("reFund")) {
                a(null, null, new b(this, cVar), h(), aVar, true);
                return;
            }
            try {
                hVar.c(this.b.g());
                if (this.i == null) {
                    this.i = new hzm();
                }
                this.h = this.i.a(this.g, this.b.e(), hVar.b());
                String.valueOf(this.h instanceof hzn);
                a(this.h, null, new b(this, cVar), h(), aVar, false);
            } catch (Throwable th) {
                if (cVar == null) {
                    return;
                }
                cVar.onLoadError(th.toString(), null, DataStatus.ERROR_DATA, this.j == null ? PageStatus.FIRST_PAGE : PageStatus.NEXT_PAGE);
            }
        }
    }

    private bot h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bot) ipChange.ipc$dispatch("44de65d0", new Object[]{this});
        }
        if (ibl.f()) {
            return new bor(new a(this.b));
        }
        return new hzl(new a(this.b), this.b.a());
    }

    private String a(OrderConfigs.BizNameType bizNameType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce61075c", new Object[]{this, bizNameType});
        }
        if (bizNameType != OrderConfigs.BizNameType.ORDER_DETAIL) {
            return OrderBizCode.orderList;
        }
        h hVar = this.c;
        return (hVar == null || !hVar.s()) ? OrderBizCode.orderDetail : OrderBizCode.logisticsDetail;
    }

    public void a(hzk hzkVar, Object obj, joc jocVar, d.c cVar, iab.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9917ac2", new Object[]{this, hzkVar, obj, jocVar, cVar, aVar, new Boolean(z)});
            return;
        }
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(a(this.b.e()), jocVar, aVar, hzkVar, cVar, System.currentTimeMillis());
        Long.valueOf(System.currentTimeMillis());
        if (!z) {
            if (hzkVar == null) {
                throw new IllegalArgumentException("requesterclient can not be null");
            }
            if (bxd.a("loadOLCacheDelay", true) && this.b.p()) {
                this.f.x().a(true);
            }
            hzkVar.a(hzkVar.b(this.g, this.f.x(), this.c), obj, anonymousClass6);
            return;
        }
        com.taobao.android.ultron.datamodel.imp.b x = this.f.x();
        ParseResponseHelper parseResponseHelper = new ParseResponseHelper(x);
        Pair<JSONObject, org.json.JSONObject> a2 = a(this.b.s());
        a(a2);
        b(a2);
        if (a2 == null || a2.first == null || a2.second == null) {
            UnifyLog.d("UltronProxy.renderRequestData", "loadLocalRefundResponse failed");
            return;
        }
        parseResponseHelper.d(((JSONObject) a2.first).getJSONObject("data"));
        parseResponseHelper.a((JSONObject) a2.first);
        MtopResponse mtopResponse = new MtopResponse();
        mtopResponse.setDataJsonObject((org.json.JSONObject) a2.second);
        anonymousClass6.a(0, mtopResponse, (Object) null, x, (Map<String, ? extends Object>) null);
    }

    /* renamed from: tb.hzp$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass6 extends jnv {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ joc f28864a;
        public final /* synthetic */ iab.a b;
        public final /* synthetic */ hzk c;
        public final /* synthetic */ d.c d;
        public final /* synthetic */ String f;
        public final /* synthetic */ long g;
        public boolean h = false;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str, Object... objArr) {
            if (str.hashCode() == -955963047) {
                super.a((List) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public AnonymousClass6(String str, joc jocVar, iab.a aVar, hzk hzkVar, d.c cVar, long j) {
            this.f = str;
            this.f28864a = jocVar;
            this.b = aVar;
            this.c = hzkVar;
            this.d = cVar;
            this.g = j;
        }

        @Override // tb.joc
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            bxb.a(bxb.b.a(this.f, mtopResponse.getApi(), false).b(mtopResponse.getRetMsg()).a(gnq.a(mtopResponse)).a(1.0f));
            ria q = hzp.this.b.q();
            if (q != null) {
                q.a(true, false, "网络请求错误");
            }
            if (hzp.a(hzp.this, mtopResponse)) {
                mtopResponse.setRetCode(hzb.CODE_REDIRECT_302);
                mtopResponse.setRetMsg(hzb.CODE_REDIRECT_ERROR_MSG);
            }
            joc jocVar = this.f28864a;
            if (jocVar != null) {
                jocVar.a(i, mtopResponse, obj, z, (Map<String, ? extends Object>) map);
            }
            hzp.this.b.a("");
            String str = "onError-" + mtopResponse.getRetMsg();
        }

        @Override // tb.jnv
        public void a(List<JSONObject> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            super.a(list);
            if (!(this.c instanceof hzn) || !ibm.a(list, hzp.this.f.x())) {
                return;
            }
            if (!bxd.a("verifyViceResponse", true)) {
                hzp.this.f.d().a(hzp.this.f.x().b(), (Object) null);
                hzp.this.f.a(this.d);
                hzp.this.f.a(127);
                return;
            }
            jqh.a(new Runnable() { // from class: tb.hzp.6.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public int f28865a = 0;

                @Override // java.lang.Runnable
                public void run() {
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!AnonymousClass6.this.h && (i = this.f28865a) <= 4) {
                        this.f28865a = i + 1;
                        jqh.a(this, 20L);
                    } else {
                        hzp.this.f.d().a(hzp.this.f.x().b(), (Object) null);
                        hzp.this.f.a(AnonymousClass6.this.d);
                        hzp.this.f.a(127);
                        AnonymousClass6.this.h = false;
                    }
                }
            }, 0L);
        }

        @Override // tb.joc
        public void a(final int i, final MtopResponse mtopResponse, final Object obj, final jny jnyVar, final Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
            } else {
                jqh.a(new Runnable() { // from class: tb.hzp.6.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public int f28866a = 0;

                    @Override // java.lang.Runnable
                    public void run() {
                        int i2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if ((hzp.this instanceof hzf) && hzp.this.b.z() && hzp.this.b.v() && !hzp.this.b.w() && (i2 = this.f28866a) < 3) {
                            this.f28866a = i2 + 1;
                            jqh.a(this, 40L);
                        } else {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            anonymousClass6.h = true;
                            bxb.a(bxb.b.a(anonymousClass6.f, mtopResponse.getApi(), true).a(System.currentTimeMillis() - AnonymousClass6.this.g).b(AnonymousClass6.this.f).a(gnq.a(mtopResponse)).a(0.001f));
                            hzp.this.b.a("");
                            if (ibm.a(hzp.this.f.x())) {
                                mtopResponse.setRetCode("ReturnH5");
                                mtopResponse.setRetMsg(com.alibaba.ability.localization.b.a(R.string.order_biz_server_error));
                                AnonymousClass6.this.f28864a.a(i, mtopResponse, obj, false, map);
                                return;
                            }
                            hzp.this.f.d().a(hzp.this.f.x().b(), com.taobao.android.tbuprofen.adapter.e.EVENT_LOAD_SUCCESS);
                            ria q = hzp.this.b.q();
                            if (q != null) {
                                if (hzp.this.d) {
                                    q.d();
                                }
                                q.c().put("response_render_start_time", Long.valueOf(System.currentTimeMillis()));
                            }
                            hzp.this.f.a(AnonymousClass6.this.d);
                            hzp.this.b(hzp.this.g);
                            if (q != null) {
                                q.c().put("response_render_end_time", Long.valueOf(System.currentTimeMillis()));
                            }
                            if (AnonymousClass6.this.f28864a == null) {
                                return;
                            }
                            AnonymousClass6.this.f28864a.a(i, mtopResponse, obj, jnyVar, map);
                        }
                    }
                }, 0L);
            }
        }
    }

    private boolean a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab3bce31", new Object[]{this, mtopResponse})).booleanValue() : mtopResponse.getDataJsonObject() != null && hzb.CODE_REDIRECT_302.equals(mtopResponse.getDataJsonObject().optString("code")) && !StringUtils.isEmpty(mtopResponse.getDataJsonObject().optString(Constants.WEIBO_REDIRECTURL_KEY));
    }

    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (this.f == null) {
        } else {
            hzy.a("UltronProxy", "reload", "----");
            c cVar = this.k;
            if (cVar != null) {
                cVar.onReloadRequested(ibm.a(eVar));
            } else {
                a(this.c, cVar);
            }
        }
    }

    public com.taobao.android.ultron.datamodel.imp.b j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.ultron.datamodel.imp.b) ipChange.ipc$dispatch("408dab3b", new Object[]{this}) : this.j;
    }

    public void a(com.taobao.android.ultron.datamodel.imp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99a0b2", new Object[]{this, bVar});
        } else {
            this.j = bVar;
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements joc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<c> f28868a;
        private final WeakReference<hzp> b;

        static {
            kge.a(1079380997);
            kge.a(1921286467);
        }

        public b(hzp hzpVar, c cVar) {
            this.f28868a = new WeakReference<>(cVar);
            this.b = new WeakReference<>(hzpVar);
        }

        @Override // tb.joc
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            hzp hzpVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            c cVar = this.f28868a.get();
            if (cVar == null || (hzpVar = this.b.get()) == null) {
                return;
            }
            cVar.onLoadError("", mtopResponse, DataStatus.ERROR_DATA, hzpVar.j() == null ? PageStatus.FIRST_PAGE : PageStatus.NEXT_PAGE);
        }

        @Override // tb.joc
        public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
            hzp hzpVar;
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                return;
            }
            c cVar = this.f28868a.get();
            if (cVar == null || (hzpVar = this.b.get()) == null) {
                return;
            }
            if ((jnyVar instanceof com.taobao.android.ultron.datamodel.imp.b) && !hzg.a((com.taobao.android.ultron.datamodel.imp.b) jnyVar)) {
                z = hzh.a(jnyVar);
            }
            cVar.onLoadSuccess(mtopResponse, z ? DataStatus.EMPTY_DATA : DataStatus.NORMAL_DATA, hzp.a(hzpVar.j(), "1".equals(hzpVar.e().l().get("page"))));
            hzpVar.a((com.taobao.android.ultron.datamodel.imp.b) jnyVar);
        }
    }

    /* loaded from: classes6.dex */
    public static class a implements d.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<OrderConfigs> f28867a;

        static {
            kge.a(-1513586333);
            kge.a(-312919124);
        }

        public a(OrderConfigs orderConfigs) {
            this.f28867a = new WeakReference<>(orderConfigs);
        }

        @Override // com.alibaba.android.ultron.vfw.instance.d.c
        public void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
            } else if (bVar != null && list != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                for (IDMComponent iDMComponent : list) {
                    if (iDMComponent != null) {
                        JSONObject fields = iDMComponent.getFields();
                        if (!a(fields)) {
                            if (b(fields)) {
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(iDMComponent);
                            } else {
                                String b = com.taobao.android.ultron.datamodel.imp.f.b(iDMComponent);
                                if ("footer".equals(b)) {
                                    arrayList2.add(iDMComponent);
                                } else if ("header".equals(b)) {
                                    arrayList.add(iDMComponent);
                                } else if ("background".equalsIgnoreCase(b)) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(iDMComponent);
                                }
                            }
                        }
                    }
                    arrayList3.add(iDMComponent);
                }
                a(arrayList3.size());
                bnvVar.a(arrayList);
                bnvVar.e(arrayList2);
                bnvVar.b(arrayList3);
                bnvVar.f(arrayList4);
                bnvVar.g(arrayList5);
            }
        }

        private boolean a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
            }
            OrderConfigs orderConfigs = this.f28867a.get();
            return orderConfigs != null && orderConfigs.p() && jSONObject != null && jSONObject.containsKey("isAsyncComponent") && jSONObject.getBoolean("isAsyncComponent").booleanValue();
        }

        private void a(int i) {
            ria q;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            OrderConfigs orderConfigs = this.f28867a.get();
            if (orderConfigs == null) {
                return;
            }
            if (i > 0 && (q = orderConfigs.q()) != null) {
                q.a(i);
            }
            orderConfigs.b(false);
        }

        private boolean b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue() : jSONObject != null && jSONObject.containsKey("globalFloatFlag") && jSONObject.getBoolean("globalFloatFlag").booleanValue();
        }
    }

    @Override // tb.hzc
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        hzm hzmVar = this.i;
        if (hzmVar != null) {
            hzmVar.a();
            this.i = null;
        }
        if (this.f == null) {
            return;
        }
        hzy.a("UltronProxy", "destroy", "----");
        this.f.m();
    }

    private static PageStatus b(com.taobao.android.ultron.datamodel.imp.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStatus) ipChange.ipc$dispatch("95a1f4e5", new Object[]{bVar, new Boolean(z)});
        }
        if (z) {
            return PageStatus.FIRST_PAGE;
        }
        if (!hzg.a(bVar)) {
            return PageStatus.LAST_PAGE;
        }
        return PageStatus.NEXT_PAGE;
    }

    private Pair<JSONObject, org.json.JSONObject> a(boolean z) {
        InputStream proxy_open;
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e0c242b6", new Object[]{this, new Boolean(z)});
        }
        Context context = this.g;
        if (context == null) {
            UnifyLog.d("UltronProxy.loadLocalRefundResponse", "mContext is null");
            return null;
        }
        AssetManager assets = context.getAssets();
        if (assets == null) {
            UnifyLog.d("UltronProxy.loadLocalRefundResponse", "assetManager is null");
            return null;
        }
        try {
            if (z) {
                proxy_open = AssetsDelegate.proxy_open(assets, "folded_order_refund_response.json");
            } else {
                proxy_open = AssetsDelegate.proxy_open(assets, "order_refund_response.json");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = proxy_open.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            proxy_open.close();
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            if (com.alibaba.ability.localization.b.c()) {
                format = String.format(byteArrayOutputStream2, qpg.EN_titleConfig[0], qpg.EN_titleConfig[1], qpg.EN_titleConfig[2], qpg.EN_tabConfig[0], qpg.EN_tabConfig[1], qpg.EN_tabConfig[2], EnvironmentSwitcher.a() == 0 ? qpg.EN_REFUND_SEARCH_URL_ONLINE : qpg.EN_REFUND_SEARCH_URL_WAPA);
            } else {
                String str = "actionTitle";
                if (bxd.a("removePackageList", true)) {
                    str = "removeActionTitle";
                }
                format = this.b.y() ? String.format(byteArrayOutputStream2, qpg.CN_titleConfigV4[0], qpg.CN_titleConfigV4[1], qpg.CN_titleConfigV4[2], qpg.CN_tabConfigV4[0], qpg.CN_tabConfigV4[1], qpg.CN_tabConfigV4[2], qpg.CN_REFUND_SEARCH_URL, str) : String.format(byteArrayOutputStream2, qpg.CN_titleConfig[0], qpg.CN_titleConfig[1], qpg.CN_titleConfig[2], qpg.CN_tabConfig[0], qpg.CN_tabConfig[1], qpg.CN_tabConfig[2], qpg.CN_REFUND_SEARCH_URL, str);
            }
            return new Pair<>(JSONObject.parseObject(format), new org.json.JSONObject(format));
        } catch (Exception e) {
            UnifyLog.d("UltronProxy.loadLocalRefundResponse", e.toString());
            return null;
        }
    }

    private void a(Pair<JSONObject, org.json.JSONObject> pair) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a82db72", new Object[]{this, pair});
        } else if (pair == null || pair.first == null || pair.second == null) {
            UnifyLog.d("UltronProxy.setupRefundUrl", "pair is invalid");
        } else {
            try {
                if (!StringUtils.isEmpty(this.b.i())) {
                    str = this.b.i();
                } else {
                    str = EnvironmentSwitcher.a() == 0 ? "https://meta.m.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom" : "https://meta.wapa.taobao.com/app/mtb/refund-list/home?wh_weex=true&weex_mode=dom";
                }
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                if (this.e > 0) {
                    buildUpon.appendQueryParameter("jt_pt_navStartTime", String.valueOf(this.e));
                }
                ((JSONObject) pair.first).getJSONObject("container").getJSONArray("data").getJSONObject(2).put("url", (Object) buildUpon.build().toString());
            } catch (Exception e) {
                UnifyLog.d("UltronProxy.setupRefundUrl", e.toString());
            }
        }
    }

    private void b(Pair<JSONObject, org.json.JSONObject> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16846a51", new Object[]{this, pair});
        } else if (pair == null || pair.first == null || pair.second == null) {
            UnifyLog.d("UltronProxy.appendIsFromRefund", "pair is invalid");
        } else {
            try {
                JSONObject jSONObject = ((JSONObject) pair.first).getJSONObject("container").getJSONArray("data").getJSONObject(2);
                String string = jSONObject.getString("url");
                if (StringUtils.isEmpty(string)) {
                    UnifyLog.d("UltronProxy.appendIsFromRefund", "url isEmpty");
                    return;
                }
                Uri.Builder buildUpon = Uri.parse(string).buildUpon();
                buildUpon.appendQueryParameter("isFromWoTaoRefund", String.valueOf(this.b.j()));
                jSONObject.put("url", (Object) buildUpon.build().toString());
            } catch (Exception e) {
                UnifyLog.d("UltronProxy.appendIsFromRefund", e.toString());
            }
        }
    }
}
