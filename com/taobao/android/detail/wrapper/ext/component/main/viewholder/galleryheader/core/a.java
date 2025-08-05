package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel;
import com.taobao.taobao.R;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f11209a;
    private Context b;

    static {
        kge.a(-1509708063);
        kge.a(865899874);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a3efa", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void setParentModelUtils(MultiMediaViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8913dfc5", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public a(Context context) {
        this.b = context;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.BlankViewModel");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public f getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("10300d22", new Object[]{this});
        }
        this.f11209a = View.inflate(this.b, R.layout.x_detail_sku_blank_view, null);
        f fVar = new f(this.f11209a) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.a.1
        };
        fVar.a(this);
        return fVar;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void reRenderViewHolder(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12778bb", new Object[]{this, fVar});
            return;
        }
        this.f11209a = fVar.a();
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f11209a.setLayoutParams(new RelativeLayout.LayoutParams(epo.b(55), -1));
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
            return;
        }
        View view = this.f11209a;
        if (view == null) {
            return;
        }
        ((ImageView) view.findViewById(R.id.detail_main_gallery_scroll_limit_tip_image)).setImageBitmap(null);
    }
}
