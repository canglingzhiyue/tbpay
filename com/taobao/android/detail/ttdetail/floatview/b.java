package com.taobao.android.detail.ttdetail.floatview;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Trade;
import com.taobao.android.detail.ttdetail.floatview.b;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.w;
import com.taobao.taobao.R;
import tb.eyx;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "hintBanner";

    /* renamed from: a  reason: collision with root package name */
    private View f10646a;
    private LinearLayout b;
    private TextView c;
    private TextView d;
    private eyx e;

    /* renamed from: com.taobao.android.detail.ttdetail.floatview.b$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Trade.a f10647a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject d;

        public AnonymousClass1(Trade.a aVar, JSONObject jSONObject, String str) {
            this.f10647a = aVar;
            this.d = jSONObject;
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String e = this.f10647a.e();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                jSONObject.put("type", (Object) e);
                jSONObject.put("fields", (Object) this.d);
                b.a(b.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(jSONObject), new RuntimeAbilityParam[0]);
                return;
            }
            jSONObject.put("type", (Object) e);
            jSONObject.put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController$1$1
                {
                    put("url", (Object) b.AnonymousClass1.this.b);
                }
            });
            b.a(b.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(jSONObject), new RuntimeAbilityParam[0]);
            if (StringUtils.isEmpty(this.b)) {
                return;
            }
            b.a(b.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController$1$2
                {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.floatview.TTDHintBannerController$1$2.1
                        {
                            put("url", (Object) b.AnonymousClass1.this.b);
                        }
                    });
                }
            }), new RuntimeAbilityParam[0]);
        }
    }

    static {
        kge.a(-283622990);
        kge.a(332013631);
    }

    public static /* synthetic */ eyx a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("ecd79d6c", new Object[]{bVar}) : bVar.e;
    }

    public b(Context context, eyx eyxVar) {
        this.e = eyxVar;
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(context);
        if (a2 != null) {
            this.f10646a = a2.a(context, R.layout.tt_detail_hint_banner, null, true);
        } else {
            this.f10646a = LayoutInflater.from(context).inflate(R.layout.tt_detail_hint_banner, (ViewGroup) null);
        }
        this.b = (LinearLayout) this.f10646a.findViewById(R.id.ll_hint_banner);
        this.c = (TextView) this.f10646a.findViewById(R.id.tv_hint);
        this.d = (TextView) this.f10646a.findViewById(R.id.tv_button);
        this.b.setTag("hintBanner");
    }

    @Override // com.taobao.android.detail.ttdetail.floatview.g
    public void a(Trade.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe037ae", new Object[]{this, aVar});
            return;
        }
        String a2 = aVar.a();
        String b = aVar.b();
        if (StringUtils.isEmpty(a2)) {
            a2 = "";
        }
        if (!StringUtils.isEmpty(b)) {
            a2 = a2 + b;
        }
        if (StringUtils.isEmpty(a2)) {
            this.b.setVisibility(8);
            return;
        }
        this.b.setVisibility(0);
        this.c.setText(a2);
        if (!StringUtils.isEmpty(aVar.g())) {
            try {
                this.c.setTextColor(w.a(aVar.g()));
            } catch (Exception e) {
                i.a("hintBanner", "setupHintBanner " + e.toString());
            }
        }
        if (!StringUtils.isEmpty(aVar.c())) {
            try {
                this.b.setBackgroundColor(w.a(aVar.c()));
            } catch (Exception e2) {
                i.a("hintBanner", "setupHintBanner " + e2.toString());
            }
        }
        if (StringUtils.isEmpty(aVar.d())) {
            return;
        }
        this.c.setGravity(16);
        ((LinearLayout.LayoutParams) this.c.getLayoutParams()).setMargins(com.taobao.android.detail.ttdetail.utils.f.a(12.0f), 0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f), 0);
        this.d.setText(aVar.d());
        if (!StringUtils.isEmpty(aVar.h())) {
            try {
                this.d.setTextColor(w.a(aVar.h()));
            } catch (Exception e3) {
                i.a("hintBanner", "setupHintBanner " + e3.toString());
            }
        }
        this.d.setVisibility(0);
        this.d.setOnClickListener(new AnonymousClass1(aVar, aVar.i(), aVar.f()));
    }

    @Override // com.taobao.android.detail.ttdetail.floatview.g
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f10646a;
    }
}
