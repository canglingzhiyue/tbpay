package com.taobao.android.detail.ttdetail.floatview;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.i;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.floatview.a;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.ac;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.Map;
import tb.eyx;
import tb.fin;
import tb.kge;
import tb.odg;

/* loaded from: classes4.dex */
public class a implements com.taobao.android.detail.ttdetail.communication.g<i> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String n = "https://img.alicdn.com/imgextra/i1/O1CN01999pXz1FcFkNNsP07_!!6000000000507-2-tps-88-88.png";
    private static final String o = "https://gw.alicdn.com/imgextra/i2/O1CN01lb3JAm1I3OTNwONVu_!!6000000000837-2-tps-88-88.png";

    /* renamed from: a  reason: collision with root package name */
    private Context f10643a;
    private eyx b;
    private LinearLayout c;
    private TUrlImageView d;
    private TUrlImageView e;
    private TUrlImageView f;
    private g g;
    private e h;
    private boolean i;
    private boolean j;
    private FrameLayout k;
    private f l;
    private h m;

    /* renamed from: com.taobao.android.detail.ttdetail.floatview.a$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Resource.c f10645a;
        public final /* synthetic */ String b;

        public AnonymousClass2(Resource.c cVar, String str) {
            this.f10645a = cVar;
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!StringUtils.equals(ac.a(this.f10645a), "openUrl") || StringUtils.isEmpty(this.b)) {
            } else {
                l.a(a.b(a.this), this.b);
                m.b(2101, "Page_Detail_Button-NPS", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController$2$1
                    {
                        put("url", (Object) a.AnonymousClass2.this.b);
                    }
                });
            }
        }
    }

    static {
        kge.a(-133767147);
        kge.a(-767194759);
    }

    public static /* synthetic */ eyx a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("57f2eaab", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ Context b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("879b76b0", new Object[]{aVar}) : aVar.f10643a;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public /* synthetic */ boolean receiveMessage(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, iVar})).booleanValue() : a(iVar);
    }

    public a(Context context, eyx eyxVar, FrameLayout frameLayout) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f10643a = context;
        this.b = eyxVar;
        this.k = frameLayout;
        this.c = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_floating_view, (ViewGroup) null);
        this.e = (TUrlImageView) this.c.findViewById(R.id.btnTalkGroup);
        this.e.setVisibility(8);
        this.f = (TUrlImageView) this.c.findViewById(R.id.btnNps);
        this.f.setVisibility(8);
        this.d = (TUrlImageView) this.c.findViewById(R.id.btnGoTop);
        this.d.setImageUrl(odg.o().a() ? o : n);
        this.d.setVisibility(8);
        if (odg.o().a()) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.d.getLayoutParams());
            layoutParams.setMargins(0, 0, com.taobao.android.detail.ttdetail.utils.f.a(8.0f), com.taobao.android.detail.ttdetail.utils.f.a(85.0f));
            this.d.setLayoutParams(layoutParams);
        }
        this.k.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10643a, i.class, this);
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.e("TTDetailPerTag", "TTDFloatController(): " + (currentTimeMillis2 - currentTimeMillis));
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        final Resource.c a2 = ac.a(this.b, ac.CODE_TALK_GROUP);
        if (a2 == null) {
            return;
        }
        this.e.setImageUrl(a2.a());
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.floatview.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                String a3 = ac.a(a2);
                Resource.b c = ac.c(a2);
                if (!"event".equals(a3) || c == null || c.b() == null) {
                    com.taobao.android.detail.ttdetail.utils.i.a("TTDFloatController", "onClick no event data. actionType:" + a3 + ", floatActionData:" + c);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) c.a());
                jSONObject.put("fields", (Object) c.b());
                a.a(a.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(jSONObject), new RuntimeAbilityParam[0]);
                com.taobao.android.detail.ttdetail.utils.i.a("TTDFloatController", "btnTalkGroup onClick event type:" + c.a() + ", fields:" + c.b());
                final String d = ac.d(a2);
                m.b(2101, "Page_Detail_Button-Discuss", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController$1$1
                    {
                        put("url", (Object) d);
                    }
                });
            }
        });
        this.i = true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Resource.c a2 = ac.a(this.b, ac.CODE_NPS);
        if (a2 == null) {
            return;
        }
        String a3 = a2.a();
        String b = ac.b(a2);
        this.f.setImageUrl(a3);
        this.f.setOnClickListener(new AnonymousClass2(a2, b));
        this.j = true;
    }

    private void e() {
        Trade.a hintBanner;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Trade trade = (Trade) this.b.a().a(Trade.class);
        if (trade == null || (hintBanner = trade.getHintBanner()) == null) {
            return;
        }
        if (this.g == null) {
            this.g = new b(this.f10643a, this.b);
        }
        this.g.a(hintBanner);
        h();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.c.findViewById(R.id.hint_banner);
        View a2 = this.g.a();
        if (viewGroup.indexOfChild(a2) >= 0) {
            return;
        }
        viewGroup.removeAllViews();
        if (a2 == null) {
            return;
        }
        viewGroup.addView(a2);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        JSONObject a2 = f.a(this.b);
        if (a2 == null || a2.isEmpty()) {
            ObserverFrameLayout observerFrameLayout = (ObserverFrameLayout) this.c.findViewById(R.id.bottom_float_dx);
            if (observerFrameLayout == null) {
                return;
            }
            observerFrameLayout.removeAllViews();
            return;
        }
        if (this.l == null) {
            this.l = new f(this.b);
        }
        com.taobao.android.detail.ttdetail.utils.i.a("TTDFloatController", "updateBottomFloatDX addToParent");
        this.l.a((ObserverFrameLayout) this.c.findViewById(R.id.bottom_float_dx), a2);
    }

    private void f() {
        JSONObject floatView;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (this.h == null) {
            this.h = new e(this.f10643a, this.b, this.k);
        }
        Resource resource = (Resource) this.b.a().a(Resource.class);
        if (resource == null || (floatView = resource.getFloatView()) == null || (jSONArray = floatView.getJSONArray("list")) == null || jSONArray.isEmpty()) {
            return;
        }
        this.h.a(this.m);
        this.h.a(jSONArray);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c();
        d();
        e();
        g();
        f();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.d.setVisibility(0);
            if (this.i) {
                this.e.setVisibility(0);
            }
            if (!this.j) {
                return;
            }
            this.f.setVisibility(0);
        } else {
            this.d.setVisibility(8);
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7931bad1", new Object[]{this, onClickListener});
        } else {
            this.d.setOnClickListener(onClickListener);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e eVar = this.h;
        if (eVar != null) {
            eVar.a();
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10643a, this);
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            Object obj = jSONObject.get(fin.EVENT_KEY);
            if (!(obj instanceof String)) {
                return;
            }
            final String str = (String) obj;
            final JSONObject jSONObject2 = new JSONObject((Map) jSONObject.get("params"));
            this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDFloatController$3
                {
                    put("type", (Object) str);
                    put("fields", (Object) jSONObject2);
                }
            }), new RuntimeAbilityParam[0]);
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDFloatController", "postEvent", th);
        }
    }

    public boolean a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a011e7c", new Object[]{this, iVar})).booleanValue();
        }
        com.taobao.android.detail.ttdetail.utils.i.a("TTDFloatController", "receiveMessage weex页面向native转发消息");
        a(iVar.bZ_());
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }
}
