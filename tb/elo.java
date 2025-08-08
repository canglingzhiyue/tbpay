package tb;

import android.content.Context;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.AliSDetailMainGalleryLoadMoreExtension_InputField_overPullContainerLayout;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.i;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.a;
import com.taobao.android.detail.core.standard.video.d;
import com.taobao.android.detail.core.standard.widget.overpull.AURAOverPullContainerLayout;
import com.taobao.android.detail.core.utils.s;
import com.taobao.taobao.R;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.headerpic")
/* loaded from: classes4.dex */
public final class elo extends atl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private elq d;
    private TextView e;
    private TextView f;
    private AURAGlobalData g;
    private aqs h;
    private boolean i = true;

    static {
        kge.a(173129511);
    }

    public static /* synthetic */ Object ipc$super(elo eloVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        } else if (hashCode != 563256106) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (aqs) objArr[2]);
            return null;
        }
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "headerPic";
    }

    public elo() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.render.component.AliSDetailMainGalleryComponentExtension");
    }

    private elq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elq) ipChange.ipc$dispatch("1e677c72", new Object[]{this});
        }
        String a2 = a(this.c);
        if (StringUtils.isEmpty(a2) && baw.a()) {
            throw new IllegalArgumentException("必须在AURAUserContext中传入token,并且保证不为空");
        }
        if (this.d == null) {
            this.d = elr.a(this.b, a2, this.c.a());
        }
        return this.d;
    }

    private elt a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elt) ipChange.ipc$dispatch("41f8f38f", new Object[]{this, view, new Boolean(z)});
        }
        String a2 = a(this.c);
        Object a3 = ejd.a(view, elt.AURA_VIEW_TAG);
        if (a3 instanceof elt) {
            return (elt) a3;
        }
        elt a4 = elu.a(this.c, a2);
        ejd.a(view, elt.AURA_VIEW_TAG, a4);
        return a4;
    }

    @Override // tb.atl, tb.arl
    public void onCreate(final q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        if (eip.p) {
            eit.a(new Runnable() { // from class: tb.elo.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.d(qVar.e());
                    }
                }
            });
            com.taobao.android.detail.core.utils.i.c(a.a("AliStandardDetailPicGalleryComponentExtension"), "Spindle埋点异步enterIndustryPicGalleryUserTracker");
            return;
        }
        i.d(qVar.e());
        com.taobao.android.detail.core.utils.i.c(a.a("AliStandardDetailPicGalleryComponentExtension"), "Spindle埋点同步enterIndustryPicGalleryUserTracker");
    }

    private String a(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d9e75af", new Object[]{this, qVar}) : (String) qVar.a("token", String.class);
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        ejc.a(aURAGlobalData, "AliDetailPreItemId", String.class);
        ejc.a(aURAGlobalData, "AliDetailHasMainGalleryRendered", Boolean.class);
        this.g = aURAGlobalData;
        this.h = aqsVar;
        super.onDataChanged(aURAFlowData, aURAGlobalData, aqsVar);
        aURAGlobalData.update("AliDetailPicGalleryVideoManager", c().h());
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        int a2 = emh.a(viewGroup);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(a2, -2));
        return frameLayout;
    }

    private void a(Context context, AURAOverPullContainerLayout aURAOverPullContainerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d4b5a2a", new Object[]{this, context, aURAOverPullContainerLayout});
            return;
        }
        LayoutInflater from = LayoutInflater.from(context);
        View inflate = from.inflate(R.layout.standard_detail_enter_end_extra_view, (ViewGroup) aURAOverPullContainerLayout, false);
        this.e = (TextView) inflate.findViewById(R.id.enterEndExtraText);
        View inflate2 = from.inflate(R.layout.standard_detail_exit_end_extra_view, (ViewGroup) aURAOverPullContainerLayout, false);
        this.f = (TextView) inflate2.findViewById(R.id.exitEndExtraText);
        aURAOverPullContainerLayout.setEndExtraView(inflate, inflate2);
        aURAOverPullContainerLayout.setTriggerRangeParams(0.6f, bay.b() / 3);
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (!(view instanceof FrameLayout)) {
        } else {
            d();
            FrameLayout frameLayout = (FrameLayout) view;
            this.i = !s.b();
            if (elt.a(this.c)) {
                if (!this.i) {
                    return;
                }
                elt a2 = a(view, true);
                if (frameLayout.findViewById(R.id.tt_detail_header_contaner_view_id) == null) {
                    frameLayout.removeAllViews();
                    ViewGroup a3 = a2.a();
                    a3.setId(R.id.tt_detail_header_contaner_view_id);
                    frameLayout.addView(a3, new ViewGroup.LayoutParams(-1, -2));
                }
                a2.b();
                return;
            }
            if (frameLayout.findViewById(R.id.tt_detail_header_contaner_view_id) != null) {
                frameLayout.removeAllViews();
            }
            l();
            if (i()) {
                arc.a().a("AliStandardDetailPicGalleryComponentExtension", "renderView", "already render, just refresh");
                g();
                return;
            }
            if (frameLayout.getChildCount() > 0 && !(frameLayout.getChildAt(0) instanceof AURAOverPullContainerLayout)) {
                frameLayout.removeAllViews();
            }
            if (frameLayout.getChildCount() == 0) {
                Context context = view.getContext();
                context.setTheme(R.style.Theme_AppCompat_NoActionBar);
                com.taobao.android.detail.core.utils.i.c(a.a("AliStandardDetailPicGalleryComponentExtension"), "头图onCreate setTheme");
                AURAOverPullContainerLayout aURAOverPullContainerLayout = new AURAOverPullContainerLayout(context);
                aURAOverPullContainerLayout.setOrientation(0);
                aURAOverPullContainerLayout.setType(1);
                a(context, aURAOverPullContainerLayout);
                c().a(new AliSDetailMainGalleryLoadMoreExtension_InputField_overPullContainerLayout(aURAOverPullContainerLayout));
                frameLayout.addView(aURAOverPullContainerLayout, new ViewGroup.LayoutParams(-1, -1));
            }
            if (!j()) {
                k();
            }
            AURAOverPullContainerLayout aURAOverPullContainerLayout2 = (AURAOverPullContainerLayout) frameLayout.getChildAt(0);
            a(aURAOverPullContainerLayout2, aURARenderComponent);
            c().a(aURARenderComponent, aURAOverPullContainerLayout2, this.h);
            c().b(aURARenderComponent.protocol);
            e();
        }
    }

    private void d() {
        dya dyaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c == null || !(this.c.e() instanceof DetailCoreActivity) || (dyaVar = ((DetailCoreActivity) this.c.e()).b) == null || !dyaVar.c()) {
        } else {
            dyaVar.a(SystemClock.uptimeMillis());
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ejc.a(this.g, "AliDetailHasMainGalleryRendered", (Object) true);
        ejc.a(this.g, "AliDetailPreItemId", emf.a(this.c.e()));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        final RecyclerView h = h();
        if (h == null) {
            return;
        }
        h.scrollToPosition(0);
        h.post(new Runnable() { // from class: tb.elo.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    h.smoothScrollBy(1, 0);
                }
            }
        });
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        RecyclerView h = h();
        if (h == null) {
            return;
        }
        try {
            h.getAdapter().notifyDataSetChanged();
        } catch (Exception e) {
            ema.a("mainGalleryRefreshError", "刷新头图出错|" + e.getMessage(), this.h);
        }
    }

    private RecyclerView h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("4aa088f5", new Object[]{this});
        }
        View b = c().b();
        if (b instanceof RecyclerView) {
            return (RecyclerView) b;
        }
        return null;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        Boolean bool = (Boolean) ejc.b(this.g, "AliDetailHasMainGalleryRendered", Boolean.class);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private void a(View view, AURARenderComponent aURARenderComponent) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1d8d491", new Object[]{this, view, aURARenderComponent});
            return;
        }
        JSONObject b = b(aURARenderComponent);
        if (b == null || (jSONObject = b.getJSONObject("fields")) == null) {
            return;
        }
        Object obj = jSONObject.get("pullStyle");
        if (!(obj instanceof JSONObject)) {
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        if ("none".equalsIgnoreCase(jSONObject2.getString("position")) && (view instanceof AURAOverPullContainerLayout)) {
            ((AURAOverPullContainerLayout) view).setType(2);
        }
        String string = jSONObject2.getString("pullText");
        TextView textView = this.f;
        if (textView != null && string != null) {
            textView.setText(string);
        }
        String string2 = jSONObject2.getString("releaseText");
        TextView textView2 = this.e;
        if (textView2 == null || string2 == null) {
            return;
        }
        textView2.setText(string2);
    }

    private JSONObject b(AURARenderComponent aURARenderComponent) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f6ce8352", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (jSONObject = aURARenderComponent.protocol) == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject.getJSONObject("hierarchy")) == null || (jSONObject4 = jSONObject3.getJSONObject("structure")) == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject4.getJSONArray(aURARenderComponent.key);
        if (bau.a(jSONArray)) {
            return null;
        }
        String string = jSONArray.getString(0);
        if (!StringUtils.isEmpty(string)) {
            return jSONObject2.getJSONObject(string);
        }
        return null;
    }

    private boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        String str = (String) ejc.b(this.g, "AliDetailPreItemId", String.class);
        if (str != null) {
            return str.equalsIgnoreCase(emf.a(this.c.e()));
        }
        return true;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        d h = c().h();
        if (h != null) {
            h.d();
        }
        f();
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = aURARenderComponent.key;
        return StringUtils.isEmpty(str) ? "headerPic" : str;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        String a2 = a(this.c);
        elt a3 = elu.a(a2);
        if (a3 == null) {
            return;
        }
        a3.c();
        elu.b(a2);
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        elr.b(a(this.c));
        elq elqVar = this.d;
        if (elqVar != null) {
            elqVar.d();
            this.d = null;
        }
        l();
    }
}
