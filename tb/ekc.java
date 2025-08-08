package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
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
import com.taobao.android.detail.core.standard.video.h;

@AURAExtensionImpl(code = "alidetail.impl.component.lifeCycle.picGalleryExpand")
/* loaded from: classes4.dex */
public final class ekc implements ate {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f27356a;
    private ejx b;

    static {
        kge.a(1779674566);
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

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    @Override // tb.ate
    public void a(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfe2fb4c", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
        }
    }

    @Override // tb.ate
    public boolean a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ebad0c8", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public ekc() {
        emu.a("com.taobao.android.detail.core.standard.mainpic.expand.PicGalleryExpandComponentLifecycleExtension");
    }

    @Override // tb.ate
    public void b(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9115e7a3", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else if (aURARenderComponent.data == null || aURARenderComponent.data.container == null || aURARenderComponent.data.container.containerType == null || !a(aURARenderComponent)) {
        } else {
            String str = aURARenderComponent.data.container.containerType;
            if (!"weex2".equalsIgnoreCase(str) && !eks.COMPONENT_TYPE.equalsIgnoreCase(str) && !h.COMPONENT_TYPE.equalsIgnoreCase(str)) {
                return;
            }
            a(view);
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.f27356a = (RecyclerView) aURAGlobalData.get("render_view", RecyclerView.class);
        this.b = (ejx) aURAGlobalData.get("AliDetailPicGalleryExpandEntrance", ejx.class);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (this.f27356a == null) {
        } else {
            view.getLayoutParams().height = this.f27356a.getHeight();
        }
    }

    private boolean a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca7f23d7", new Object[]{this, aURARenderComponent})).booleanValue();
        }
        AURARenderComponent aURARenderComponent2 = aURARenderComponent.parent;
        while (aURARenderComponent2 != null) {
            if (aURARenderComponent2.data == null || aURARenderComponent2.data.fields == null) {
                aURARenderComponent2 = aURARenderComponent2.parent;
            } else {
                Object obj = aURARenderComponent2.data.fields.get("locatorId");
                if ((obj instanceof String) && StringUtils.equals((CharSequence) obj, "mainPic4ARTrial")) {
                    return true;
                }
                aURARenderComponent2 = aURARenderComponent2.parent;
            }
        }
        return false;
    }
}
