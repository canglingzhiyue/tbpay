package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel;
import com.taobao.android.trade.event.f;

/* loaded from: classes5.dex */
public class fbn extends c<MultiMediaModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MultiMediaViewModel g;

    static {
        kge.a(1404241403);
    }

    public static /* synthetic */ Object ipc$super(fbn fbnVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 90991720) {
            super.a();
            return null;
        } else if (hashCode == 1545161960) {
            super.a(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 2121814399) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.G_();
            return null;
        }
    }

    public fbn(Context context, MultiMediaViewModel multiMediaViewModel) {
        super(context);
        this.g = null;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.AdaptMagicCubeToViewHolder");
        this.g = multiMediaViewModel;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup}) : this.g.getViewHolder().a();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(MultiMediaModel multiMediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5953b14", new Object[]{this, multiMediaModel});
        } else if (!(multiMediaModel instanceof TBMultiMediaModel)) {
        } else {
            this.g.bindModel(multiMediaModel);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        MultiMediaViewModel multiMediaViewModel = this.g;
        if (multiMediaViewModel == null) {
            return;
        }
        multiMediaViewModel.onDestroy();
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        super.a(z, z2);
        MultiMediaViewModel multiMediaViewModel = this.g;
        if (multiMediaViewModel != null) {
            multiMediaViewModel.onPause(z, z2);
        }
        if (!z) {
            return;
        }
        f.a(this.f9568a, new edh());
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c, com.taobao.android.detail.core.detail.kit.view.holder.a
    public void G_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e78517f", new Object[]{this});
            return;
        }
        super.G_();
        MultiMediaViewModel multiMediaViewModel = this.g;
        if (multiMediaViewModel == null) {
            return;
        }
        multiMediaViewModel.onResume();
    }
}
