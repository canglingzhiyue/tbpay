package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.a;
import com.alibaba.android.aura.service.render.widget.roundcornerlayout.UMFRoundCornerLayout;
import com.alibaba.android.umf.datamodel.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* loaded from: classes2.dex */
public final class brn extends brm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String e = brn.class.getSimpleName();
    private bd f;
    private asz g;
    private asy h;

    static {
        kge.a(-1361623965);
    }

    public static /* synthetic */ Object ipc$super(brn brnVar, String str, Object... objArr) {
        if (str.hashCode() == -1054399266) {
            super.a((b) objArr[0], (brk) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private asy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (asy) ipChange.ipc$dispatch("16b420d6", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new asy();
        }
        return this.h;
    }

    @Override // tb.brm, tb.brj
    public void a(b bVar, brk brkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12724de", new Object[]{this, bVar, brkVar});
            return;
        }
        super.a(bVar, brkVar);
        a(bVar);
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a362b69", new Object[]{this, bVar});
            return;
        }
        bd bdVar = (bd) bVar.a("dinamicXEngineRouter", (Class<Object>) bd.class);
        if (bdVar == null) {
            this.f = new bd(new DXEngineConfig.a(bVar.d()).b(2).a());
            if (bVar.c() instanceof Activity) {
                this.f.d().a((Activity) bVar.c());
            }
            bVar.a("dinamicXEngineRouter", this.f);
            return;
        }
        this.f = bdVar;
    }

    @Override // tb.brj
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        Context context = viewGroup.getContext();
        DXTemplateItem a2 = asx.a(aURARenderComponentContainer);
        if (a2 == null) {
            bqe.a().c(this.e, "createView#containerInfo is null");
            bsu.a(this.c, "DX_CREATE_EXCEPTION", "umf", "containerInfo invalid");
            return a(context);
        }
        DXResult<DXRootView> a3 = this.f.a(context, viewGroup, a2);
        if (a3 == null || a3.b() || a3.f11780a == null) {
            bqd a4 = bqe.a();
            String str = this.e;
            StringBuilder sb = new StringBuilder();
            sb.append("createView#error=");
            sb.append(a3 != null ? a3.a().toString() : null);
            a4.c(str, sb.toString());
            if (b().b(aURARenderComponentContainer)) {
                return a(viewGroup, aURARenderComponentContainer);
            }
            bsu.a(this.c, "DX_CREATE_EXCEPTION", "umf", "downgrade failure");
            return a(context);
        }
        UMFRoundCornerLayout uMFRoundCornerLayout = new UMFRoundCornerLayout(context);
        uMFRoundCornerLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        uMFRoundCornerLayout.setBackgroundColor(-1);
        a3.f11780a.setBackgroundColor(-1);
        uMFRoundCornerLayout.addView(a3.f11780a);
        return uMFRoundCornerLayout;
    }

    private View a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("876fa4a2", new Object[]{this, context});
        }
        if (this.g == null) {
            this.g = new asz();
        }
        return this.g.a(context);
    }

    private DXRootView b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f094636e", new Object[]{this, view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            DXRootView b = b(viewGroup.getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    @Override // tb.brj
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
            return;
        }
        DXRootView b = b(view);
        if (b != null) {
            int a2 = gbg.a();
            int b2 = gbg.b();
            JSONObject jSONObject = new JSONObject();
            AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
            if (aURARenderComponentData != null) {
                jSONObject.put("fields", JSONObject.toJSON(aURARenderComponentData.fields));
            }
            DXResult<DXRootView> a3 = this.f.a(this.d, jSONObject, b, a2, b2, brr.a(this.f26061a, aURARenderComponent));
            if (a3 == null || a3.b()) {
                bqd a4 = bqe.a();
                String str = this.e;
                a4.c(str, "renderView#renderTemplate error,DXResultError=" + a3.a());
                if (b().b(aURARenderComponentData.container)) {
                    if (this.b == null) {
                        return;
                    }
                    bqe.a().a(this.e, "renderView#downgrade refresh");
                    this.b.c();
                    return;
                }
                String str2 = this.c;
                bsu.a(str2, "DX_RENDER_DOWNGRADE_EXCEPTION", "umf", "downgrade failure,componentData=" + aURARenderComponentData);
                bqd a5 = bqe.a();
                String str3 = this.e;
                a5.c(str3, "renderView#already downgrade failed,view=" + view);
                return;
            }
            this.f.d().b(b);
            return;
        }
        bqd a6 = bqe.a();
        String str4 = this.e;
        a6.c(str4, "renderView#view type is not DXRootView, view=" + view);
        String str5 = this.c;
        bsu.a(str5, "DX_RENDER_WRONG_VIEW_TYPE_EXCEPTION", "umf", "render failure, view is not DXRootView,view=" + view + ",component=" + aURARenderComponent);
    }

    @Override // tb.brj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.f2133a;
    }

    @Override // tb.brj
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent});
        }
        String str = null;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null && aURARenderComponentData.container != null) {
            AURARenderComponentContainer aURARenderComponentContainer = aURARenderComponentData.container;
            str = aURARenderComponentContainer.containerType + "_" + aURARenderComponentContainer.name + "_" + aURARenderComponentContainer.version;
        }
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        bqe.a().c(this.e, "getItemViewType#failed to get itemViewType from component, use system time instead, component=" + aURARenderComponent);
        return valueOf;
    }
}
