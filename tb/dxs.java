package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.parse.a;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.d;
import com.taobao.android.detail.core.aura.presenter.b;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import tb.dxr;

/* loaded from: classes4.dex */
public final class dxs extends dxr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BOTTOM_BAR_PROTOCOL_DATA = "bottomBarProtocolData";
    public static final String KEY_BOTTOM_BAR_TRADE_NODE_DATA = "bottomBarTradeNodeData";
    public static final String TAG_HINT_BANNER = "hintBanner";
    private static final String d;
    private LinearLayout e;
    private LinearLayout f;
    private LinearLayout g;
    private TextView h;
    private TextView i;
    private AURAGlobalData j;
    private JSONObject k;
    private JSONObject l;
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private d p;

    public static /* synthetic */ Object ipc$super(dxs dxsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dxv c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dxv) ipChange.ipc$dispatch("1e6735ba", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ AURAGlobalData a(dxs dxsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURAGlobalData) ipChange.ipc$dispatch("746c402f", new Object[]{dxsVar}) : dxsVar.j;
    }

    public static /* synthetic */ AURAGlobalData a(dxs dxsVar, AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("e71dc883", new Object[]{dxsVar, aURAGlobalData});
        }
        dxsVar.j = aURAGlobalData;
        return aURAGlobalData;
    }

    public static /* synthetic */ boolean a(dxs dxsVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db31dddf", new Object[]{dxsVar, new Boolean(z)})).booleanValue();
        }
        dxsVar.o = z;
        return z;
    }

    public static /* synthetic */ d b(dxs dxsVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("a7c43879", new Object[]{dxsVar}) : dxsVar.p;
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : d;
    }

    @Override // tb.dxu
    public /* synthetic */ dxw e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dxw) ipChange.ipc$dispatch("2dca8097", new Object[]{this}) : c();
    }

    static {
        kge.a(1881440286);
        d = i.a(j.a("AliDetailAuraBottomBarPage"), BTags.BtBar);
    }

    public dxs(Activity activity, IAURAPluginCenter[] iAURAPluginCenterArr, dwj dwjVar) {
        this.f27069a = activity;
        this.c = iAURAPluginCenterArr;
        this.b = new b(activity);
        this.b.a(this.c);
        a(activity);
        HashMap hashMap = new HashMap();
        hashMap.put("detailAdapter", dwjVar);
        this.b.a(hashMap);
        b(activity);
        emu.a("com.taobao.android.detail.core.aura.page.AliDetailAuraBottomBarPage");
    }

    @Override // tb.dxu
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.e;
    }

    @Override // tb.dxr, tb.dxu
    public s a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("3c3eac55", new Object[]{this}) : this.b.g();
    }

    @Override // tb.dxu
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a(jSONObject, (aqq<? extends UMFBaseIO>) null);
        }
    }

    public void a(JSONObject jSONObject, final aqq<? extends UMFBaseIO> aqqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6113017", new Object[]{this, jSONObject, aqqVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.d(d, "buildPage start");
        if (jSONObject == null) {
            com.taobao.android.detail.core.utils.i.d(d, "buildPage protocolData null");
            eca.b(this.f27069a, null, "protocolData null", eca.TYPE_DETAIL_AURA);
            return;
        }
        this.l = jSONObject;
        this.k = jSONObject.getJSONObject(KEY_BOTTOM_BAR_PROTOCOL_DATA);
        JSONObject jSONObject2 = this.k;
        if (jSONObject2 == null) {
            com.taobao.android.detail.core.utils.i.d(d, "buildPage bottomBarProtocolData null");
            eca.b(this.f27069a, null, "bottomBarProtocolData null", eca.TYPE_DETAIL_AURA);
            return;
        }
        this.b.a("aura.workflow.bottomBar.build", new AURAParseIO(Collections.singletonList(new a(jSONObject2))), new dxr.a(this.f, new aqq() { // from class: tb.dxs.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 90991720) {
                    super.a();
                    return null;
                } else if (hashCode == 112764847) {
                    super.a((c) objArr[0]);
                    return null;
                } else if (hashCode != 744952192) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.a((com.alibaba.android.aura.b) objArr[0]);
                    return null;
                }
            }

            @Override // tb.aqq
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                super.a(cVar);
                dxs.a(dxs.this, cVar.c());
                dxs.b(dxs.this).a(dxs.a(dxs.this));
                aqq aqqVar2 = aqqVar;
                if (aqqVar2 != null) {
                    aqqVar2.a(cVar);
                }
                com.taobao.android.detail.core.utils.i.d(dxs.f(), "buildPage aura callback onNext");
            }

            @Override // tb.aqq, tb.aqs
            public void a(com.alibaba.android.aura.b bVar) {
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                super.a(bVar);
                aqq aqqVar2 = aqqVar;
                if (aqqVar2 != null) {
                    aqqVar2.a(bVar);
                }
                if (bVar != null) {
                    eca.b(dxs.this.f27069a, null, bVar.toString(), eca.TYPE_DETAIL_AURA);
                    if (god.g && "-1002".equals(bVar.a())) {
                        try {
                            dxs.a(dxs.this, true);
                            View view = (View) dxs.a(dxs.this).get("render_view", View.class);
                            if (view instanceof RecyclerView) {
                                RecyclerView recyclerView = (RecyclerView) view;
                                if (recyclerView.isComputingLayout()) {
                                    recyclerView.post(new Runnable() { // from class: tb.dxs.1.1
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // java.lang.Runnable
                                        public void run() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            } else {
                                                dxs.this.g();
                                            }
                                        }
                                    });
                                    z = true;
                                }
                            }
                            if (!z) {
                                dxs.this.g();
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                            String a2 = j.a(dxs.f());
                            com.taobao.android.detail.core.utils.i.a(a2, "buildPage#onError downgarde bottombar error=" + Log.getStackTraceString(th));
                        }
                    }
                }
                String f = dxs.f();
                com.taobao.android.detail.core.utils.i.d(f, "buildPage aura callback onError=" + bVar);
            }

            @Override // tb.aqq
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                super.a();
                aqq aqqVar2 = aqqVar;
                if (aqqVar2 != null) {
                    aqqVar2.a();
                }
                if (dxs.this.f27069a instanceof DetailCoreActivity) {
                    DetailCoreActivity detailCoreActivity = (DetailCoreActivity) dxs.this.f27069a;
                    if (detailCoreActivity.f9411a != null && detailCoreActivity.f9411a.n) {
                        dwl.a("99tmCartUpdate", com.taobao.android.detail.core.aura.source.a.WV_DATA_REQUEST_99_CART_UPDATE);
                    }
                }
                com.taobao.android.detail.core.utils.i.d(dxs.f(), "buildPage aura callback onCompleted");
            }
        }));
        com.taobao.android.detail.core.utils.i.d(d, "buildPage aura executeFlow end");
        Object obj = jSONObject.get(KEY_BOTTOM_BAR_TRADE_NODE_DATA);
        if (obj instanceof TradeNode) {
            a(((TradeNode) obj).hintBanner);
        }
        com.taobao.android.detail.core.utils.i.d(d, "buildPage end");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb A[Catch: Throwable -> 0x0181, TryCatch #0 {Throwable -> 0x0181, blocks: (B:6:0x001d, B:8:0x0047, B:10:0x004c, B:13:0x0052, B:15:0x006f, B:17:0x0078, B:19:0x007c, B:21:0x009c, B:22:0x00e5, B:24:0x00eb, B:26:0x0101, B:29:0x0112, B:31:0x0118, B:33:0x0133, B:35:0x017b), top: B:40:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dxs.g():void");
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!(this.f27069a instanceof DetailCoreActivity)) {
        } else {
            DetailCoreActivity detailCoreActivity = (DetailCoreActivity) this.f27069a;
            String i = detailCoreActivity.C().i();
            detailCoreActivity.b.a(i, com.taobao.android.detail.core.detail.controller.callback.d.b(i), "底部Bar渲染失败，降级H5");
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        com.alibaba.android.umf.datamodel.service.rule.a a2 = com.taobao.android.detail.core.aura.source.a.a(this.j, jSONObject);
        if (a2 == null) {
            return;
        }
        a(new UMFRuleIO(Arrays.asList(a2)));
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        com.alibaba.android.umf.datamodel.service.rule.a a2 = a(this.j, i);
        if (a2 == null) {
            return;
        }
        a(new UMFRuleIO(Arrays.asList(a2)));
    }

    public static com.alibaba.android.umf.datamodel.service.rule.a a(AURAGlobalData aURAGlobalData, int i) {
        List list;
        AURARenderComponent aURARenderComponent;
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("45da03c6", new Object[]{aURAGlobalData, new Integer(i)});
        }
        if (aURAGlobalData == null || (list = (List) aURAGlobalData.get("render_view_item_models", List.class)) == null) {
            return null;
        }
        for (Object obj : list) {
            if ((obj instanceof AURARenderComponent) && (aURARenderComponentData = (aURARenderComponent = (AURARenderComponent) obj).data) != null && aURARenderComponentData.fields != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("cartCount", String.valueOf(i));
                return bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent, hashMap);
            }
        }
        return null;
    }

    @Override // tb.dxu
    public void a(UMFRuleIO uMFRuleIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2724f84e", new Object[]{this, uMFRuleIO});
        } else if (uMFRuleIO == null) {
        } else {
            this.b.a("aura.workflow.adjustRules", uMFRuleIO, null);
        }
    }

    @Override // tb.dxu
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.b.d();
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.e = (LinearLayout) com.taobao.android.detail.core.async.d.b(context, R.layout.x_detail_vh_bottom_bar);
        this.f = (LinearLayout) this.e.findViewById(R.id.ll_bottom_bar_content);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams.height = -2;
        this.f.setLayoutParams(layoutParams);
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.e.setOrientation(1);
        this.e.setBackgroundColor(-1);
        this.g = (LinearLayout) this.e.findViewById(R.id.ll_hint_banner);
        this.h = (TextView) this.e.findViewById(R.id.tv_hint);
        this.i = (TextView) this.e.findViewById(R.id.tv_button);
        this.g.setTag("hintBanner");
    }

    private void a(final TradeNode.HintBanner hintBanner) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8151b", new Object[]{this, hintBanner});
        } else if (hintBanner == null) {
            this.g.setVisibility(8);
        } else {
            String str = hintBanner.text;
            String str2 = hintBanner.subText;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str + str2;
            }
            if (TextUtils.isEmpty(str)) {
                this.g.setVisibility(8);
                return;
            }
            this.g.setVisibility(0);
            this.h.setText(str);
            if (!TextUtils.isEmpty(hintBanner.bgColor)) {
                try {
                    this.g.setBackgroundColor(com.taobao.android.detail.core.utils.c.a(hintBanner.bgColor));
                } catch (Exception e) {
                    arc.a().c("AliDetailAuraBottomBarPage", "setupHintBanner", e.toString());
                }
            }
            if (TextUtils.isEmpty(hintBanner.buttonText)) {
                return;
            }
            this.h.setGravity(16);
            ((LinearLayout.LayoutParams) this.h.getLayoutParams()).setMargins(epo.i, 0, epo.h, 0);
            this.i.setText(hintBanner.buttonText);
            this.i.setVisibility(0);
            final String str3 = hintBanner.url;
            this.i.setOnClickListener(new View.OnClickListener() { // from class: tb.dxs.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    ActionModel actionModel = new ActionModel(new JSONObject());
                    actionModel.type = hintBanner.eventId;
                    if (!TextUtils.isEmpty(str3)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("url", (Object) str3);
                        actionModel.params = new JSONObject(jSONObject);
                    }
                    Event a2 = ehs.a(dxs.this.f27069a, actionModel, null, null, null);
                    if (a2 != null) {
                        f.a(dxs.this.f27069a).a(a2);
                    }
                    if (TStudioHelper.a().a(null, view, str3, false)) {
                        return;
                    }
                    f.a(dxs.this.f27069a, new enu(str3));
                }
            });
        }
    }

    public void b(Context context) {
        iyh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        this.p = new d(context, this);
        if (!(context instanceof com.taobao.android.detail.core.aura.observer.a) || (a2 = ((com.taobao.android.detail.core.aura.observer.a) context).a()) == null) {
            return;
        }
        a2.a(d.KEY_PRICE_MODEL, this.p);
    }
}
