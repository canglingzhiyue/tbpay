package tb;

import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.wrapper.DMComponentWrapper;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel;

@AURAExtensionImpl(code = "alidetail.impl.render.component.creator.picgallery")
/* loaded from: classes5.dex */
public final class ezz extends atl implements atd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private fbu d;
    private aqs e;

    static {
        kge.a(2073915940);
        kge.a(1021924628);
    }

    public static /* synthetic */ Object ipc$super(ezz ezzVar, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.atc
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "picGallery";
    }

    @Override // tb.atc
    public String a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2c2912d", new Object[]{this, aURARenderComponent}) : "picGallery";
    }

    public ezz() {
        emu.a("com.taobao.android.detail.wrapper.aura.extension.AliDetailPicGalleryComponentExtension");
    }

    @Override // tb.atl, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            super.onCreate(qVar, fVar);
        }
    }

    @Override // tb.atl, tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
            return;
        }
        this.d = (fbu) aURAGlobalData.get("picGalleryViewHolder", fbu.class);
        if (this.d == null) {
            this.d = new fbu(this.b, false);
            aURAGlobalData.update("picGalleryViewHolder", this.d);
        }
        this.e = aqsVar;
    }

    @Override // tb.atc
    public View a(ViewGroup viewGroup, AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e8922edd", new Object[]{this, viewGroup, aURARenderComponentContainer});
        }
        View a2 = this.d.a((fbu) null, viewGroup);
        if (a2 != null) {
            return a2;
        }
        Space space = new Space(viewGroup.getContext());
        this.e.a(new b(1, dwq.AURA_MODULE_NAME, "picGalleryCreateEmptyView", "详情头图创建了一个空的视图"));
        return space;
    }

    @Override // tb.atc
    public void a(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebad0c4", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        } else {
            this.d.b((fbu) b(aURARenderComponent));
        }
    }

    private MultiMediaModel b(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiMediaModel) ipChange.ipc$dispatch("c88c5d50", new Object[]{this, aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = null;
        if (aURARenderComponentData == null) {
            return null;
        }
        DMComponentWrapper dMComponentWrapper = new DMComponentWrapper();
        if (aURARenderComponentData.fields == null) {
            dMComponentWrapper.setFields(null);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putAll(aURARenderComponentData.fields);
            dMComponentWrapper.setFields(jSONObject);
        }
        if (this.b instanceof DetailActivity) {
            bVar = ((DetailActivity) this.b).ac();
        }
        return new TBMultiMediaModel(dMComponentWrapper, bVar);
    }

    @Override // tb.atd
    public void a(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afd1cfd", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else if (viewHolder == null || !c(aURARenderComponent)) {
        } else {
            this.d.G_();
        }
    }

    @Override // tb.atd
    public void b(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6cf7dc", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
        } else if (viewHolder == null || !c(aURARenderComponent)) {
        } else {
            this.d.a(false, false);
        }
    }

    @Override // tb.atl, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.d.a();
        }
    }

    private boolean c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35b1c95", new Object[]{this, aURARenderComponent})).booleanValue() : (aURARenderComponent == null || aURARenderComponent.data == null || aURARenderComponent.data.container == null || aURARenderComponent.data.container.containerType == null || !StringUtils.equals(aURARenderComponent.data.container.containerType.toLowerCase(), "picGallery".toLowerCase())) ? false : true;
    }
}
