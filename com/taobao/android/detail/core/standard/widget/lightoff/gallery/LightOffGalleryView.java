package com.taobao.android.detail.core.standard.widget.lightoff.gallery;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import com.taobao.android.detail.core.standard.widget.lightoff.vm.ILightOffViewModel;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class LightOffGalleryView extends ViewPager implements a<LightOffItemModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private b mAdapter;

    static {
        kge.a(1738342313);
        kge.a(1304955978);
    }

    public LightOffGalleryView(com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar) {
        this(aVar, null);
    }

    public LightOffGalleryView(com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar, AttributeSet attributeSet) {
        super(aVar.f9909a, attributeSet);
        init(aVar);
    }

    public void setItemListener(com.taobao.android.detail.core.standard.widget.lightoff.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a87e8", new Object[]{this, aVar});
        } else {
            this.mAdapter.a(aVar);
        }
    }

    private void init(com.taobao.android.detail.core.standard.widget.lightoff.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6d2407", new Object[]{this, aVar});
            return;
        }
        this.mAdapter = new b(aVar);
        setAdapter(this.mAdapter);
    }

    public void bindData(List<LightOffItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9573b7f", new Object[]{this, list});
            return;
        }
        this.mAdapter.a(list);
        this.mAdapter.notifyDataSetChanged();
    }

    public b getPageAdapter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("faae3615", new Object[]{this}) : this.mAdapter;
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.gallery.a
    public Drawable getCurrentViewSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("6aa2fde7", new Object[]{this});
        }
        View a2 = this.mAdapter.a();
        if (a2 == null) {
            return null;
        }
        Object tag = a2.getTag();
        if (!(tag instanceof ILightOffViewModel)) {
            return null;
        }
        return ((ILightOffViewModel) tag).createSnapshot();
    }

    @Override // com.taobao.android.detail.core.standard.widget.lightoff.gallery.a
    public boolean isCurrentViewAllowPull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("408f36e5", new Object[]{this})).booleanValue();
        }
        View a2 = this.mAdapter.a();
        if (a2 == null) {
            return false;
        }
        Object tag = a2.getTag();
        if (!(tag instanceof ILightOffViewModel)) {
            return false;
        }
        return ((ILightOffViewModel) tag).allowPull();
    }
}
