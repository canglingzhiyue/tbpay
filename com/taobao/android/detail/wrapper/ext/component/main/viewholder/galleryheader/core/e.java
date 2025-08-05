package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.ext.view.widget.base.MultiMediaPopupWindow;
import com.taobao.android.detail.core.event.basic.n;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import tb.dya;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class e implements j<n> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f11221a;
    private MultiMediaViewModel b;

    static {
        kge.a(-1675320909);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, nVar}) : a(nVar);
    }

    public e(DetailCoreActivity detailCoreActivity) {
        this.f11221a = detailCoreActivity;
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.PopMultiMediaSubscriber");
    }

    public i a(n nVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("e0edeeab", new Object[]{this, nVar});
        }
        dya y = this.f11221a.y();
        MultiMediaModel multiMediaModel = (MultiMediaModel) nVar.getParam();
        if (multiMediaModel.singlePopupMode) {
            this.b = new GalleryViewModelEx(this.f11221a);
            view = this.b.getViewHolder().a();
            this.b.bindModel(multiMediaModel);
        } else {
            ViewGroup viewGroup = (ViewGroup) multiMediaModel.popupParentView;
            if (viewGroup != null) {
                viewGroup.removeView(multiMediaModel.popupView);
            }
            view = multiMediaModel.popupView;
        }
        if (y.j == null) {
            y.j = new MultiMediaPopupWindow((Activity) this.f11221a);
        }
        y.j.popGallery(view, -1, -1, nVar.f9710a);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
