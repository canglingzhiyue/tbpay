package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel;
import com.taobao.taobao.R;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f11223a;
    private ImageView b;
    private TextView c;
    private Context d;
    private BounceImageModel e;

    static {
        kge.a(-1652615615);
        kge.a(-1917972144);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a3efa", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void setParentModelUtils(MultiMediaViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8356acef", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
        }
    }

    public a(Context context) {
        this.d = context;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.BounceViewModel");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) ipChange.ipc$dispatch("852695bd", new Object[]{this});
        }
        this.f11223a = View.inflate(this.d, R.layout.x_detail_main_gallery_scroll_limit_tip, null);
        com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar = new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a(this.f11223a) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.a.1
        };
        aVar.a(this);
        return aVar;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void reRenderViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48afe97e", new Object[]{this, aVar});
            return;
        }
        this.f11223a = aVar.a();
        this.b = (ImageView) this.f11223a.findViewById(R.id.detail_main_gallery_scroll_limit_tip_image);
        this.c = (TextView) this.f11223a.findViewById(R.id.detail_main_gallery_scroll_limit_tip_text);
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
        this.f11223a.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        if (!this.e.hasPicGallaryOverScroll()) {
            return;
        }
        String mainPicText = this.e.getMainPicText();
        if (this.e.parentModel.isPopupMode) {
            mainPicText = this.e.getLightOffText();
        }
        if (TextUtils.isEmpty(mainPicText)) {
            return;
        }
        this.c.setText(mainPicText);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
            return;
        }
        View view = this.f11223a;
        if (view == null) {
            return;
        }
        ((ImageView) view.findViewById(R.id.detail_main_gallery_scroll_limit_tip_image)).setImageBitmap(null);
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
        } else {
            this.e = (BounceImageModel) subItemModel;
        }
    }

    public BounceImageModel b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BounceImageModel) ipChange.ipc$dispatch("61e4622b", new Object[]{this}) : this.e;
    }
}
