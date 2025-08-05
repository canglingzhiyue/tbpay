package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.BounceImageModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f11211a;
    private ImageView b;
    private TextView c;
    private Context d;
    private BounceImageModel e;

    static {
        kge.a(931252651);
        kge.a(865899874);
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

    public b(Context context) {
        this.d = context;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.BounceViewModel");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public f getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("10300d22", new Object[]{this});
        }
        this.f11211a = View.inflate(this.d, R.layout.x_detail_main_gallery_scroll_limit_tip, null);
        f fVar = new f(this.f11211a) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.b.1
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
        this.f11211a = fVar.a();
        this.b = (ImageView) this.f11211a.findViewById(R.id.detail_main_gallery_scroll_limit_tip_image);
        this.c = (TextView) this.f11211a.findViewById(R.id.detail_main_gallery_scroll_limit_tip_text);
        a();
    }

    public void a() {
        int color;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.setImageResource(R.drawable.detail_gallery_scroll_limit_arrow_black);
        if (this.e.parentModel.isPopupMode) {
            color = ContextCompat.getColor(this.d, R.color.detail_white);
        } else {
            color = ContextCompat.getColor(this.d, R.color.detail_bounce_view_text_black);
        }
        this.c.setTextColor(color);
        this.f11211a.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
            return;
        }
        View view = this.f11211a;
        if (view == null) {
            return;
        }
        ((ImageView) view.findViewById(R.id.detail_main_gallery_scroll_limit_tip_image)).setImageBitmap(null);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
        } else {
            this.e = (BounceImageModel) subItemModel;
        }
    }
}
