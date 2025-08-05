package tb;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.c;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

@AURAExtensionImpl(code = "alidetail.impl.render.component.lifecycle")
/* loaded from: classes4.dex */
public final class dxn implements ate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f27064a;
    private c b;
    private AURAGlobalData c;

    static {
        kge.a(656475187);
        kge.a(1643319480);
    }

    @Override // tb.ate
    public View a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c09f824a", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        return null;
    }

    @Override // tb.ate
    public boolean a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebad0c8", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        return false;
    }

    public dxn() {
        emu.a("com.taobao.android.detail.core.aura.extension.locator.AliDetailComponentLifeCycleExtension");
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        this.f27064a = qVar;
        this.b = new c();
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.c = aURAGlobalData;
        }
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        a(viewHolder, aURARenderComponent);
        ejh.a(this.c, this.f27064a, aURARenderComponent.key);
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else {
            ejh.b(this.c, this.f27064a, aURARenderComponent.key);
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        ejh j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.b.a();
        q qVar = this.f27064a;
        if (qVar == null || (j = ejh.j(qVar.e())) == null) {
            return;
        }
        j.b(this.f27064a.e());
    }

    private void a(RecyclerView.ViewHolder viewHolder, AURARenderComponent aURARenderComponent) {
        dxv dxvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8761d76", new Object[]{this, viewHolder, aURARenderComponent});
        } else if (viewHolder == null || viewHolder.itemView == null || aURARenderComponent == null || TextUtils.isEmpty(aURARenderComponent.key) || (dxvVar = (dxv) this.f27064a.a(dxv.INSTANCE_TAG, dxv.class)) == null) {
        } else {
            dxvVar.a(aURARenderComponent.key, viewHolder.itemView);
        }
    }

    @Override // tb.ate
    public void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2fb4c", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
            return;
        }
        try {
            if (!(view instanceof DXRootView)) {
                return;
            }
            DXTemplateItem a2 = asx.a(aURARenderComponentContainer);
            DXTemplateItem dxTemplateItem = ((DXRootView) view).getDxTemplateItem();
            if (a2 == null) {
                i.d(j.a("AliDetailComponentLifeCycleExtension"), "afterItemViewCreated originalTemplateItem null.");
            }
            if (dxTemplateItem == null) {
                i.d(j.a("AliDetailComponentLifeCycleExtension"), "afterItemViewCreated fetchTemplateItem null.");
            }
            if (a2 == null || dxTemplateItem == null || a2.g() == dxTemplateItem.g()) {
                return;
            }
            String a3 = j.a("AliDetailComponentLifeCycleExtension");
            i.d(a3, "afterItemViewCreated DX fetch后版本号不一致, originalTemplateItem version=" + a2.g() + ", fetchTemplateItem version=" + dxTemplateItem.g());
        } catch (Throwable th) {
            th.printStackTrace();
            String a4 = j.a("AliDetailComponentLifeCycleExtension");
            i.a(a4, "afterItemViewCreated error=" + Log.getStackTraceString(th));
        }
    }

    @Override // tb.ate
    public void b(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115e7a3", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else {
            this.b.a(aURARenderComponent.key, aURARenderComponent.data.fields, view, (Activity) this.f27064a.e());
        }
    }
}
