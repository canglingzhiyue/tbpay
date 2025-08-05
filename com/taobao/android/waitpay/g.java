package com.taobao.android.waitpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ali.adapt.api.AtlasServiceFinder;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.k;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.a;
import com.taobao.nestedscroll.recyclerview.ParentRecyclerView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.aqq;
import tb.arc;
import tb.ard;
import tb.avj;
import tb.avk;
import tb.awi;
import tb.azo;
import tb.dtl;
import tb.dtp;
import tb.dux;
import tb.icr;
import tb.icx;
import tb.idp;
import tb.jtf;
import tb.jtg;
import tb.jtp;
import tb.jtu;
import tb.jtw;
import tb.kge;

/* loaded from: classes6.dex */
public class g implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Activity b;
    private f d;
    private k e;
    private final ViewGroup f;
    private final ParentRecyclerView g;
    private final jtu h;

    /* renamed from: a */
    private final String f15831a = "TBWaitPayPresenter";
    private final avk c = new avk();

    static {
        kge.a(-938630894);
        kge.a(715617165);
    }

    public static /* synthetic */ Activity a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("1e878329", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ ViewGroup b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6061bd75", new Object[]{gVar}) : gVar.f;
    }

    public g(Activity activity, ViewGroup viewGroup) {
        this.b = activity;
        this.f = viewGroup;
        this.g = new ParentRecyclerView(this.b);
        this.h = new jtu(this.g, "order_detail");
        a(activity);
        a();
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.d = new f(new h(activity));
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            AtlasServiceFinder.getInstance().registerService(icx.a.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.aura.external.TBBuyExternalRPVerifyService");
        }
    }

    private void a(com.taobao.android.buy.internal.status.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c87798", new Object[]{this, fVar});
        } else {
            fVar.a(new com.taobao.android.buy.internal.status.g() { // from class: com.taobao.android.waitpay.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    g.this = this;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    if (str.hashCode() == 1936925467) {
                        return super.a((Activity) objArr[0]);
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.android.buy.internal.status.g
                public ViewGroup a(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (ViewGroup) ipChange2.ipc$dispatch("7373231b", new Object[]{this, activity});
                    }
                    ViewGroup viewGroup = (ViewGroup) g.a(g.this).findViewById(R.id.tb_wait_pay_detail_loading);
                    return viewGroup != null ? viewGroup : super.a(activity);
                }
            });
        }
    }

    private Map<String, Object> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        com.taobao.android.buy.internal.status.f fVar = new com.taobao.android.buy.internal.status.f(this.b);
        a(fVar);
        hashMap.put("userContextPageAuraConfig", this.d);
        hashMap.put(dtl.USERDATA_KEY_STATUS_MANAGER, fVar);
        Activity activity = this.b;
        hashMap.put("submit_callback", new jtp(activity, (com.taobao.android.purchase.aura.c) activity, this));
        hashMap.put(avk.USERDATA_KEY_ACTIVITY_RESULT, this.c);
        hashMap.put(dtp.PAGE_NAME, "Page_WaitpayDetail");
        hashMap.put("aliBuyDXConfig", new icr());
        hashMap.put(awi.USER_CONTEXT_KEY_DECRYPT, new idp());
        hashMap.put("userContextDateUpdate", this);
        hashMap.put("autoSize", Boolean.valueOf(com.taobao.android.purchase.aura.utils.i.a((Context) this.b)));
        ParentRecyclerView parentRecyclerView = this.g;
        if (parentRecyclerView != null) {
            hashMap.put(jtg.USER_CONTEXT_CONTAINER, parentRecyclerView);
        }
        jtu jtuVar = this.h;
        if (jtuVar != null) {
            hashMap.put(jtf.USER_CONTEXT_RECOMMEND, jtuVar);
        }
        hashMap.put("page_info", h());
        return hashMap;
    }

    private Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this});
        }
        Intent intent = this.b.getIntent();
        String stringExtra = intent.getStringExtra("openFrom");
        String stringExtra2 = intent.getStringExtra("pageType");
        Uri data = intent.getData();
        if (data != null) {
            stringExtra = TextUtils.isEmpty(stringExtra) ? data.getQueryParameter("openFrom") : null;
            stringExtra2 = TextUtils.isEmpty(stringExtra2) ? data.getQueryParameter("pageType") : null;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(stringExtra)) {
            hashMap.put("openFrom", stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            hashMap.put("pageType", stringExtra2);
        }
        return hashMap;
    }

    private k f() {
        IAURAPluginCenter[] d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("e52feab8", new Object[]{this});
        }
        if (this.e == null) {
            this.e = k.a(new q(this.b, e()));
            this.e.a("aura/aura_waitpay_detail_config.json");
            f fVar = this.d;
            if (fVar != null && (d = fVar.d()) != null) {
                this.e.a(d);
            }
            a(this.e);
        }
        return this.e;
    }

    private void a(k kVar) {
        try {
            kVar.a((IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURAAdamAndroidPluginCenter").newInstance());
        } catch (Throwable th) {
            th.printStackTrace();
            arc.a().b("registerPluginCenter AURAAdamAndroidPluginCenter failed");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.e == null) {
            this.e = f();
        }
        f fVar = this.d;
        if (fVar == null) {
            throw new NullPointerException("config is null!!");
        }
        this.e.a(a.DEFAULT_AURA_BUY_MAIN_FLOW, new AURANextRPCIO("nextrpc-TM2", fVar.a()), new aqq<AURARenderOutput>() { // from class: com.taobao.android.waitpay.TBWaitPayPresenter$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c<AURARenderOutput> cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                AURARenderOutput b = cVar.b();
                if (b instanceof AURARenderOutput) {
                    View view = b.getView();
                    try {
                        if (g.b(g.this) != null) {
                            g.b(g.this).removeAllViews();
                            g.b(g.this).addView(view);
                        }
                        jtw.a(null);
                        return;
                    } catch (Exception unused) {
                        arc.a().b("TBWaitPayPresenter: 失败，输出结果不是渲染view");
                        return;
                    }
                }
                arc.a().b("TBWaitPayPresenter: 失败，输出结果不是渲染view");
            }

            @Override // tb.aqq, tb.aqs
            public void a(b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                ard a2 = arc.a();
                a2.b("TBWaitPayPresenter: error = " + bVar);
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        g();
        if (this.f == null) {
            return;
        }
        c();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        k kVar = this.e;
        if (kVar == null) {
            return;
        }
        com.alibaba.android.aura.service.event.c.a(kVar, azo.EVENT_TYPE, new com.alibaba.android.aura.service.event.d());
    }

    @Override // com.taobao.android.waitpay.c
    public void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.e == null) {
        } else {
            avj.a(this.e, new AURAParseIO(new ArrayList<com.alibaba.android.aura.datamodel.parse.a>() { // from class: com.taobao.android.waitpay.TBWaitPayPresenter$3
                {
                    add(new com.alibaba.android.aura.datamodel.parse.a(jSONObject));
                }
            }));
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (this.e == null) {
        } else {
            com.alibaba.android.aura.service.event.d dVar = new com.alibaba.android.aura.service.event.d();
            dVar.a(jSONObject);
            com.alibaba.android.aura.service.event.c.a(this.e, str, dVar);
        }
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (i == 69) {
            if (i2 == 0) {
                this.b.finish();
            } else {
                c();
            }
        } else if (i == 4322) {
            dux.c(this.b);
            this.b.finish();
        } else {
            this.c.a(i, i2, intent);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        k kVar = this.e;
        if (kVar != null) {
            kVar.a();
        }
        jtu jtuVar = this.h;
        if (jtuVar == null) {
            return;
        }
        jtuVar.c();
    }
}
