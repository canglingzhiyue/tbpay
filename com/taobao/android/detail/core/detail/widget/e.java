package com.taobao.android.detail.core.detail.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.i;
import com.taobao.android.detail.core.standard.widget.a;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import tb.emu;
import tb.end;
import tb.iei;
import tb.iek;
import tb.igg;
import tb.igh;
import tb.iuy;
import tb.jwe;
import tb.kge;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BOTTOM_DX = "bottomDX";
    public static final String KEY_FLOAT_VIEW = "detail3FloatView";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f9679a;
    private Context b;
    private DXTemplateItem c;
    private com.taobao.android.detail.core.standard.widget.a d;
    private JSONObject e;
    private JSONObject f;

    static {
        kge.a(1801961008);
    }

    public static /* synthetic */ com.taobao.android.detail.core.standard.widget.a a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.core.standard.widget.a) ipChange.ipc$dispatch("538cdb5e", new Object[]{eVar}) : eVar.d;
    }

    public e(Context context, JSONObject jSONObject) {
        this.b = context;
        this.d = new com.taobao.android.detail.core.standard.widget.a(context);
        this.e = jSONObject;
        this.f9679a = new FrameLayout(context);
        emu.a("com.taobao.android.detail.core.detail.widget.TTBottomFloatViewHolder");
    }

    public static boolean a(end endVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e72af421", new Object[]{endVar})).booleanValue() : (endVar.f27459a == null || endVar.f27459a.f10055a == null || endVar.f27459a.f10055a.a() == null || endVar.f27459a.f10055a.a().getJSONObject("detail3FloatView") == null || endVar.f27459a.f10055a.a().getJSONObject("detail3FloatView").getJSONObject("bottomDX") == null) ? false : true;
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (((ViewGroup) this.f9679a.getParent()) == null || !s.a()) {
            return 0;
        }
        return iuy.d;
    }

    public void a(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363e3eb", new Object[]{this, frameLayout});
        } else if (((DetailCoreActivity) this.b).m() || this.e == null) {
        } else {
            String a2 = i.a("TTBottomFloat", BTags.MarketBanner);
            com.taobao.android.detail.core.utils.i.d(a2, "addView:" + JSON.toJSONString(this.e));
            this.c = iei.d(this.e.getJSONObject("template"));
            this.f = this.e.getJSONObject("data");
            if (this.f9679a.getParent() != null) {
                ((ViewGroup) this.f9679a.getParent()).removeView(this.f9679a);
            }
            frameLayout.addView(this.f9679a);
            int b = b();
            this.d.a(38447420286L, new iek());
            this.d.a(igh.DX_PARSER_LOCALDATE, new igh());
            this.d.a(igg.DX_PARSER_KVSTORAGEGETITEM, new igg());
            this.d.a(jwe.TOPICSUBSCRIBE, new jwe.a());
            this.d.a(this.c, this.f, false, 0, b != 0, b, new a.InterfaceC0381a() { // from class: com.taobao.android.detail.core.detail.widget.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                    } else if (!dXResult.b()) {
                        e.this.f9679a.addView(dXResult.f11780a);
                        e.a(e.this).a().b(dXResult.f11780a);
                    } else {
                        String a3 = i.a("TTBottomFloat", BTags.MarketBanner);
                        com.taobao.android.detail.core.utils.i.a(a3, "renderDX onRenderSuccess hasErrror:" + dXResult.a().toString());
                    }
                }

                @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
                public void a(DXTemplateItem dXTemplateItem, com.taobao.android.dinamicx.s sVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem, sVar});
                        return;
                    }
                    String a3 = i.a("TTBottomFloat", BTags.MarketBanner);
                    com.taobao.android.detail.core.utils.i.a(a3, "onRenderFailure:" + sVar.toString());
                }
            }, null);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f9679a.getParent() != null) {
            ((ViewGroup) this.f9679a.getParent()).removeView(this.f9679a);
        }
        this.f9679a.removeAllViews();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.standard.widget.a aVar = this.d;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }
}
