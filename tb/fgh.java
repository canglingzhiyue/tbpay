package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.ultronengine.e;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.biz.GalleryViewModelEx;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class fgh extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private fbn e;
    private final Context f;

    static {
        kge.a(-873079129);
    }

    public fgh(bny bnyVar) {
        super(bnyVar);
        i.a("DetailController", "PicGallaryViewHolder");
        this.f = bnyVar.k();
        Context context = this.f;
        this.e = new fbn(context, new GalleryViewModelEx(context));
        emu.a("com.taobao.android.detail.wrapper.ultronengine.PicGallaryViewHolder");
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        i.a("DetailController", "onCreateView");
        return this.e.a((fbn) null, viewGroup);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.e.b(a(this.f, iDMComponent));
        }
    }

    private static MultiMediaModel a(Context context, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiMediaModel) ipChange.ipc$dispatch("3d69d44e", new Object[]{context, iDMComponent});
        }
        b bVar = null;
        if (context instanceof DetailActivity) {
            bVar = ((DetailActivity) context).ac();
        }
        i.a("DetailController", "getMultiMediaModel:" + JSON.toJSONString(bVar));
        return new TBMultiMediaModel(iDMComponent, bVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
        } else {
            this.e.G_();
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            this.e.a(z, z2);
        }
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.e.a();
        }
    }
}
